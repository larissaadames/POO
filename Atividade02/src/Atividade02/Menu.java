package Atividade02;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
      menu();
    }

    static public void menu(){
        Scanner input = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 6 ){
            System.out.println("\n" +
                    "  1. Cadastrar nova pessoa\n" +
                    "  2. Listar todas as pessoas\n" +
                    "  3. Buscar pessoa por nome\n" +
                    "  4. Atualizar dados de uma pessoa\n" +
                    "  5. Remover pessoa pelo nome\n" +
                    "  6. Sair\n");

            System.out.println("Escolha uma opção: ");
            opcao = input.nextInt();

            if (opcao == 1){
                cadastrarPessoa();
            }
            else if (opcao == 2){
                listaPessoas();
            }
            else if (opcao == 3){

            }
            else if (opcao == 4){

            }
            else if (opcao == 5){

            }
            else if (opcao == 6){

            }
        }

    }

    static public void cadastrarPessoa(){

        Pessoa pessoa = new Pessoa();

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        pessoa.nome = input.nextLine();
        System.out.println("Digite a sua idade:");
        int idade = input.nextInt();
        System.out.println("Digite o seu telefone:");
        input.nextLine();
        String telefone = input.nextLine();
        System.out.println("Digite o seu email:");
        String email = input.nextLine();
    }

    static public void listaPessoas(){
        System.out.println();
    }
}