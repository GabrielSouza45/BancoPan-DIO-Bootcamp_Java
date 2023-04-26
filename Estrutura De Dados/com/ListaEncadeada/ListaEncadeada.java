package com.ListaEncadeada;

public class ListaEncadeada<T> {

    No<T> refEntrada;

    public ListaEncadeada() {
        this.refEntrada = null;
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {

        validaIndice(index);

        No<T> noAuxiliar = refEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T remove(int index){
        No<T> noPivor = this.getNo(index);
        if (index == 0){
            refEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAtetior = getNo(index -1);
        noAtetior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) {
            refEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = refEntrada;
        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
    }

    public int size() {
        int tamanhoLista = 0;
        No<T> refAuxiliar = refEntrada;

        while (true) {
            if (refAuxiliar != null) {
                tamanhoLista++;
                if (refAuxiliar.getProximoNo() != null) {
                    refAuxiliar = refAuxiliar.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    private void validaIndice(int index) {
        if (index >= size()) {
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " esta lista vai somente até o índice " + ultimoIndice);
        }
    }

    public boolean isEmpty() {
        return refEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = refEntrada;
        for(int i = 0; i < this.size(); i++){
            strRetorno += "[No{" + "conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return strRetorno;
    }

}
