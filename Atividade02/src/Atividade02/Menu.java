package Atividade02;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static ArrayList<Pessoa> listaPessoas = new ArrayList<>();

    static void main(String[] args) {
        menu();
    }

    static public void menu(){
        Scanner input = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 6 ){
            System.out.println("""
                    
                      1. Cadastrar nova pessoa
                      2. Listar todas as pessoas
                      3. Buscar pessoa por nome
                      4. Atualizar dados de uma pessoa
                      5. Remover pessoa pelo nome
                      6. Sair
                    """);

            System.out.println("Escolha uma opção: ");
            opcao = input.nextInt();


            switch (opcao){
                case 1:
                    cadastrarPessoa();
                break;
                case 2:
                    listarPessoas();
                break;
                case 3:
                    buscaNome();
                break;
                case 4:
                    atualizarDados();
                break;
                case 5:
                    removerPessoa();
                break;
                case 6:
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                break;
                default:
                    System.out.println("Opção inválida");
            }

        }

    }

    static public Pessoa perguntas(){

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
        return usuario;
    }

    static public void cadastrarPessoa(){
        Pessoa usuario = perguntas();
        listaPessoas.add(usuario);

    }

    static public void listarPessoas(){
        if(listaPessoas.isEmpty()){
            System.out.println("Lista vazia");
        }
        else{
        listaPessoas.forEach(usuario -> System.out.println(usuario.nome));
        }
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
        if (!encontrado){
            System.out.println("pessoa nao encontrada");
        }
    }
    static public void atualizarDados(){
        Scanner input = new Scanner(System.in);
        System.out.println("Busca por nome: ");
        String busca = input.nextLine();

        boolean atualizado = false;

        for (Pessoa usuario : listaPessoas){
            if (usuario.nome.equalsIgnoreCase(busca)){

                Pessoa atualizar = perguntas();

                atualizado = true;
            }
        }
        if (!atualizado){
            System.out.println("pessoa nao encontrada");
        }

    }
    static public void removerPessoa(){
        Scanner input = new Scanner(System.in);
        System.out.println("Busca para remover: ");
        String busca = input.nextLine();

        boolean removido = false;

        for (int i = 0; i < listaPessoas.size(); i++) {
            if (listaPessoas.get(i).nome.equalsIgnoreCase(busca)) {
                listaPessoas.remove(i);
                System.out.println("Pessoa removida com sucesso!");
                removido = true;
                break;
            }
        }
        if (!removido){
            System.out.println("pessoa nao encontrada");
        }
    }
}