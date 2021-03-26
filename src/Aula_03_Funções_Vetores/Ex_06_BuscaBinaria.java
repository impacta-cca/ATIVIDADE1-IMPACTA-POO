/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_03_Funções_Vetores;

import java.util.Scanner;

import static Aula_03_Funções_Vetores.Ex_01_Inverter.leInteiroPositivo;
import static Aula_03_Funções_Vetores.Ex_02_MaiorVetor.exibeVetor;
import static Aula_03_Funções_Vetores.Ex_02_MaiorVetor.leVetorAleatorio;
import static Aula_03_Funções_Vetores.Ex_05_BubbleSort.bubbleSort;

/**
 *
 * @author anacris
 */
public class Ex_06_BuscaBinaria {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        bubbleSort(v);
        exibeVetor(v);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite um número x que deseja buscar: ");
        int x = sc.nextInt();
        
        int resp = buscaBinaria(v,x);
        if(resp != -1){
            System.out.printf("\n%d está na posição %d", x, resp);
        } else{
            System.out.printf("\n%d NAO está no vetor",x);
        }
    }

    public static int buscaBinaria(int[] v, int x) {
        int ini = 0;
        int fim = v.length-1;
        while (ini <=fim){
            int meio = (ini+fim)/2;
            if(x == v[meio])
                return meio; //achou
            else { 
                    if (x < v[meio]){ //Primeira metade do vetor
                        fim = meio - 1;
                    } else {
                        ini = meio + 1;
                    }
            }
        }
        return -1; //não achou
    }
}
