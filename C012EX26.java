package Etapa3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C012EX26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listaCPF = new ArrayList<>();
        List<String> listaEndereco = new ArrayList<>();

        // Preenchimento inicial das listas
        System.out.println("Digite os CPFs e endereços (Digite 'X' para encerrar):");
        while (true) {
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            if ("X".equalsIgnoreCase(cpf)) {
                break;
            }
            System.out.print("Endereço: ");
            String endereco = scanner.nextLine();
            listaCPF.add(cpf);
            listaEndereco.add(endereco);
        }

        // Pesquisa de CPF
        System.out.print("Digite um CPF para pesquisa: ");
        String cpfPesquisa = scanner.nextLine();
        int index = listaCPF.indexOf(cpfPesquisa);

        if (index != -1) {
            // CPF encontrado
            System.out.print("CPF encontrado. Deseja alterar o endereço (A) ou excluir o CPF/endereço (E)? ");
            String acao = scanner.nextLine();
            if ("A".equalsIgnoreCase(acao)) {
                System.out.print("Digite o novo endereço: ");
                String novoEndereco = scanner.nextLine();
                listaEndereco.set(index, novoEndereco);
                System.out.println("Endereço atualizado com sucesso.");
            } else if ("E".equalsIgnoreCase(acao)) {
                listaCPF.remove(index);
                listaEndereco.remove(index);
                System.out.println("CPF e endereço excluídos com sucesso.");
            }
        } else {
            System.out.print("CPF não encontrado. Deseja incluir um novo CPF e endereço? (S/N) ");
            String resposta = scanner.nextLine();
            if ("S".equalsIgnoreCase(resposta)) {
                System.out.print("Digite o novo CPF: ");
                String novoCpf = scanner.nextLine();
                System.out.print("Digite o novo endereço: ");
                String novoEndereco = scanner.nextLine();
                listaCPF.add(novoCpf);
                listaEndereco.add(novoEndereco);
                System.out.println("CPF e endereço adicionados com sucesso.");
            }
        }

        System.out.println("\nLista de CPFs e Endereços:");
        for (int i = 0; i < listaCPF.size(); i++) {
            System.out.println(listaCPF.get(i) + " - " + listaEndereco.get(i));
        }

        scanner.close();
    }
}