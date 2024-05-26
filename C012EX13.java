package Etapa3;

import java.util.Scanner;

public class C012EX13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];
        int posicao = 0;

        // Ler os nomes das pessoas na fila
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o nome da pessoa " + (i + 1) + " na fila: ");
            nomes[i] = scanner.nextLine();
        }

        // Ler o nome para pesquisa
        System.out.println("Informe o nome da pessoa para pesquisa: ");
        String nomePesquisa = scanner.nextLine();

        // Pesquisar o nome no array
        for (int i = 0; i < 10; i++) {
            if (nomes[i].equals(nomePesquisa)) {
                posicao = i + 1;
                break;
            }
        }

        // Imprimir a posição da pessoa na fila ou uma mensagem se a pessoa não estiver na fila
        if (posicao == 0) {
            System.out.println("O(A) " + nomePesquisa + " não está na fila.");
        } else {
            System.out.println("A pessoa " + nomePesquisa + " está na posição " + posicao + " da fila.");
        }
    }
}