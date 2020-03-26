package calculadorapagamentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculadoraFolhaMensal {

    public static void main(String[] args) {
        System.out.println("----------- Aplicação calculo folha mensal       -----------\n\n");
        int opcao = 0;
        List<Funcionario> funcionarioList = new ArrayList<>();
        while (opcao != 9) {
            imprimeMenu();
            opcao = lerInteiro();
            if (opcao == 1) {
                // Cadastra Engenheiro
//
//				Engenheiro eng = new ();
                System.out.println("Nome: ");
                String nome = lerString();
                System.out.println("CPF: ");
                String cpf = lerString();
                System.out.println("Salário: ");
                double salario = lerDouble();
                Engenheiro engenheiro = new Engenheiro(nome, cpf, salario);
                funcionarioList.add(engenheiro);

            } else if (opcao == 2) {
                // Cadastra Programador

                System.out.println("Nome: ");
                String nome = lerString();
                System.out.println("CPF: ");
                String cpf = lerString();
                System.out.println("Salário: ");
                double salario = lerDouble();
                System.out.println("Certificações: ");
                int certificacoes = lerInteiro();
                Programador programador = new Programador(nome, cpf, salario, certificacoes);
                funcionarioList.add(programador);
            } else if (opcao == 3) {
                // Cadastra Gerente

                System.out.println("Nome: ");
                String nome = lerString();
                System.out.println("CPF: ");
                String cpf = lerString();
                System.out.println("Salário: ");
                double salario = lerDouble();
                System.out.println("Lucro do último ano: ");
                double lucro = lerDouble();
                Gerente gerente = new Gerente(nome, cpf, salario, lucro);
                funcionarioList.add(gerente);
            } else {
                System.out.println("----------- Opção invalida               -----------");
            }
        }
        // Calculo da folha mensal
        double totalDespesas = 0;
        for (Funcionario f : funcionarioList) {
            totalDespesas += f.getRemuneracaoMensal();
        }


    }

    private static int lerInteiro() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static String lerString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private static double lerDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static void imprimeMenu() {
        System.out.println("----------- 1 - Cadastro Engenheiro              -----------");
        System.out.println("----------- 2 - Cadastro Programador             -----------");
        System.out.println("----------- 3 - Cadastro Gerente                 -----------");
        System.out.println("----------- 9 - Calcular e imprimir folha mensal -----------");
    }
}