package Etapa3;

import java.util.ArrayList;
import java.util.Scanner;

public class C012EX27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cpfs = new ArrayList<>();
        ArrayList<String> enderecos = new ArrayList<>();
        String cpf, endereco, cpfBusca, opcao, novoEndereco, opcaoIncluir;

        do {
            System.out.print("Digite o CPF (ou 'X' para encerrar): ");
            cpf = scanner.nextLine();
            if (!cpf.equalsIgnoreCase("X")) {
                System.out.print("Digite o endereço: ");
                endereco = scanner.nextLine();
                cpfs.add(cpf);
                enderecos.add(endereco);
            }
        } while (!cpf.equalsIgnoreCase("X"));

        System.out.print("Digite o CPF que deseja buscar: ");
        cpfBusca = scanner.nextLine();
        int index = cpfs.indexOf(cpfBusca);

        if (index != -1) {
            System.out.println("CPF encontrado. Deseja alterar o endereço (a) ou excluir o CPF/endereço (e)?");
            opcao = scanner.nextLine();
            if (opcao.equalsIgnoreCase("a")) {
                System.out.print("Digite o novo endereço: ");
                novoEndereco = scanner.nextLine();
                enderecos.set(index, novoEndereco);
            } else if (opcao.equalsIgnoreCase("e")) {
                cpfs.remove(index);
                enderecos.remove(index);
            }
        } else {
            System.out.println("CPF não encontrado. Deseja incluir o CPF com um novo endereço (s/n)?");
            opcaoIncluir = scanner.nextLine();
            if (opcaoIncluir.equalsIgnoreCase("s")) {
                System.out.print("Digite o endereço: ");
                novoEndereco = scanner.nextLine();
                cpfs.add(cpfBusca);
                enderecos.add(novoEndereco);
            }
        }

        System.out.println("\nLista de CPFs e endereços:");
        for (int aux = 0; aux < cpfs.size(); aux++) {
            System.out.printf("%s - %s%n", cpfs.get(aux), enderecos.get(aux));
        }

        scanner.close();
    }
}