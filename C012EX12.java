package Etapa3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C012EX12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int notas[] = new int[8];
        String nome[] = new String[8];
        int maiorNota = Integer.MIN_VALUE;
        List<String> alunosMaiorNota = new ArrayList<>();

        for (int aux=0; aux<8; aux++){
            System.out.println("Informe o nome do aluno" +(aux+1) + ": ");
            nome[aux] = teclado.nextLine();
            System.out.println("Informe a nota do aluno" +(aux +1) + ": ");
            notas[aux] = Integer.parseInt(teclado.nextLine());
            if (notas[aux] > maiorNota) {
                maiorNota = notas[aux];
                alunosMaiorNota.clear();
                alunosMaiorNota.add(nome[aux]);
            } else if (notas[aux] == maiorNota) {
                alunosMaiorNota.add(nome[aux]);
            }
        }
        System.out.println("Alunos com a maior nota: " + String.join(", ", alunosMaiorNota));
    }
}
