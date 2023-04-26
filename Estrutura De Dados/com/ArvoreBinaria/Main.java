package com.ArvoreBinaria;

public class Main {
    public static void main(String[] args) {

        ArvoreBinaria<Integer> minhaArvoreBinaria = new ArvoreBinaria<>();

        minhaArvoreBinaria.inserir(5);
        minhaArvoreBinaria.inserir(8);
        minhaArvoreBinaria.inserir(1);

        minhaArvoreBinaria.exibirInOrdem();

        minhaArvoreBinaria.exibirPosOrdem();

        minhaArvoreBinaria.exibirPreOrdem();

    }
}
