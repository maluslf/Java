package Etapa2;

import javax.swing.*;

public class CO11EX05 {
    public static void main(String[] args) {
        int mensalidade = 0, somaAlunos = 0, mediaMensalidade = 0, somaMensalidade = 0, somaIngles = 0, somaFrances = 0, somaEspanhol = 0;

        String nomeAluno, idioma;
        do {
            nomeAluno = JOptionPane.showInputDialog(null, "Informe o seu nome ou escreva FIM para finalizar o programa:",
                    "ESCOLA DE IDIOMAS", JOptionPane.QUESTION_MESSAGE);
            if ("FIM".equals(nomeAluno))
                break;

            idioma = (String) JOptionPane.showInputDialog(null, "Escolha o idioma desejado:",
                    "ESCOLA DE IDIOMAS", JOptionPane.DEFAULT_OPTION,
                    null, new String[]{"Inglês", "Francês", "Espanhol"}, null);

            if ("Inglês".equals(idioma)) {
                mensalidade = 100;
                somaIngles++;
            } else if ("Francês".equals(idioma)) {
                mensalidade = 150;
                somaFrances++;
            } else if ("Espanhol".equals(idioma)) {
                mensalidade = 120;
                somaEspanhol++;
            } else {
                System.out.println("Opção de idioma inválida.");
                continue;

            }
            System.out.println("Nome do aluno é " + nomeAluno + " e a mensalidade é de " + mensalidade + " reais");

            somaAlunos++;
            somaMensalidade += mensalidade;

        } while (true);

        if (somaAlunos > 0) {
            mediaMensalidade = somaMensalidade / somaAlunos;
            System.out.println("A quantidade de alunos matriculados na turma de inglês é de " + somaIngles);
            System.out.println("A mensalidade média da escola foi de " + mediaMensalidade + " reais");

            int totalIngles = somaIngles * 100;
            int totalFrances = somaFrances * 150;
            int totalEspanhol = somaEspanhol * 120;

            System.out.println("O valor total das mensalidades por opção foi de:");
            System.out.println("Inglês: " + totalIngles + " reais");
            System.out.println("Francês: " + totalFrances + " reais");
            System.out.println("Espanhol: " + totalEspanhol + " reais");
        } else {
            System.out.println("Nenhum aluno matriculado. Encerrando o programa.");
        }
    }
    }



