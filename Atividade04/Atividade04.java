package Atividade04;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        Scanner input = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 6 ){
            System.out.println("""
                    
                      1. Cadastrar 
                      2. Sacar
                      3. Depositar
                      4. Extrato
                      5. Alterar informacoes cadastrais 
                      6. Sair
                    """);

            System.out.println("Escolha uma opção: ");
            opcao = input.nextInt();

            switch (opcao){
                case 1:
                    cadastrar();
                    break;
                case 2:
                    sacar();
                    break;
                case 3:
                    depositar();
                    break;
                case 4:
                    extrato();
                    break;
                case 5:
                    alterarCadastro();
                case 6:
                    System.out.println("Saindo");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    public static void cadastrar(){
        Cliente c = new Cliente();
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        c.setNome(input.next());
        System.out.println("Digite a sua idade: ");
        c.setIdade(input.nextInt());
        System.out.println("Digite seu cpf: ");
        c.setCPF(input.next());
        System.out.println("Digite seu telefone: ");
        c.setTelefone(input.next());
        System.out.println("Digite seu email: ");
        c.setEmail(input.next());

    }
    public static void sacar() {

    }
    public static void depositar(){}

    public static void extrato(){}

    public static void alterarCadastro(){}

}
