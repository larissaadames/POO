package Atividade02;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();

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
                listarPessoas();
            }
            else if (opcao == 3){
                buscaNome();
            }
            else if (opcao == 4){

            }
            else if (opcao == 5){
                removerPessoa();
            }
            else if (opcao == 6){
                sair();
            }
        }

    }

    static public void cadastrarPessoa(){

        Pessoa usuario = new Pessoa();


        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        usuario.nome = input.nextLine();
        System.out.println("Digite a sua idade:");
        usuario.idade = input.nextInt();
        System.out.println("Digite o seu telefone:");
        input.nextLine();
        usuario.telefone = input.nextLine();
        System.out.println("Digite o seu email:");
        usuario.email = input.nextLine();

        listaPessoas.add(usuario);

    }

    static public void listarPessoas(){
        listaPessoas.forEach(usuario -> System.out.println(usuario.nome));
    }
    static public void buscaNome(){
        Scanner input = new Scanner(System.in);
        System.out.println("Busca por nome: ");
        String busca = input.nextLine();

        boolean encontrado = false;

        for (Pessoa usuario : listaPessoas){
            if (usuario.nome.equalsIgnoreCase(busca)){
                System.out.println("Pessoa encontrada:");
                System.out.println(usuario);
                encontrado = true;
            }
        }
        if (encontrado == false){
            System.out.println("pessoa nao encontrada");
        }
    }
    static public void atualizarDados(){

    }
    static public void removerPessoa(){
        Scanner input = new Scanner(System.in);
        System.out.println("Busca para remover: ");
        String busca = input.nextLine();

        boolean removido = false;

        for (int i = 0; i < listaPessoas.size(); i++) {
            if (listaPessoas.get(i).nome.equalsIgnoreCase(busca)) {
                listaPessoas.remove(i); // tiramos a pessoa da lista
                System.out.println("Pessoa removida com sucesso!");
                removido = true;
                break;
            }
        }
        if (removido == false){
            System.out.println("pessoa nao encontrada");
        }
    }
    static public void sair(){
        System.out.println("Saindo do programa...");
        System.exit(0);
    }
}