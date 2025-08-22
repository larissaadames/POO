package Atividade01;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Atividade01 {
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o tamanho: ");
        int tamanho = input.nextInt();

        System.out.println("Tamanho: " + tamanho);

        ArrayList<Integer> lista = gerarLista(tamanho, gerador);

        System.out.println(lista);

        for (int i : lista) {
            if (i % 3 == 0) {
                System.out.println(i + " esse numero é modulo de 3");
            } else if (i % 2 == 0) {
                System.out.println(i + " esse numero é par");
            } else {
                System.out.println(i + " esse numero é impar");
            }
        }
    }

    public static ArrayList<Integer> gerarLista(int tamanho, Random gerador) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < tamanho; i++) {
            lista.add(gerador.nextInt());
        }
        return lista;
    }
}
