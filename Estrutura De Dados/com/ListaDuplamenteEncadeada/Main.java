package com.ListaDuplamenteEncadeada;

public class Main{
    public static void main(String[] args) {

        ListaDuplamenteEncadeada<String> minhaListaEncadeada = new ListaDuplamenteEncadeada<>();

        minhaListaEncadeada.add("c1");
        minhaListaEncadeada.add("c2");
        minhaListaEncadeada.add("c3");
        minhaListaEncadeada.add("c4");
        minhaListaEncadeada.add("c5");
        minhaListaEncadeada.add("c6");
        minhaListaEncadeada.add("c7");

        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.remove(4);
        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.add(4, "cNovo");
        System.out.println(minhaListaEncadeada);

        System.out.println(minhaListaEncadeada.size());

        System.out.println(minhaListaEncadeada.get(4));

        System.out.println(minhaListaEncadeada);
        minhaListaEncadeada.alterar(4, "valorAlterado");
        System.out.println(minhaListaEncadeada);

    }
}
