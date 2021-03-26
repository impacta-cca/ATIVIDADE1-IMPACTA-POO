/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_03_Funções_Vetores;

import static Aula_03_Funções_Vetores.Ex_01_Inverter.leInteiroPositivo;
import static Aula_03_Funções_Vetores.Ex_02_MaiorVetor.exibeVetor;
import static Aula_03_Funções_Vetores.Ex_02_MaiorVetor.leVetorAleatorio;

/**
 *
 * @author anacris
 */
public class Ex_05_BubbleSort {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        bubbleSort(v);
        System.out.println("\nVetor ordenado: ");
        exibeVetor(v);
    }
    public static void bubbleSort(int v[]){
        for(int i=0; i< v.length-1; i++){ //(n-1) vezes
            for(int j=0; j<v.length-1-i; j++){ //Comparar 2 a 2 e trocar, se necessário
                if(v[j]>v[j+1]){
                    /*Troca
                    int aux = v[j];
                    v[j] = v[j+1];
                    v[j+1] = aux;
                    */
                   troca(v, j, j+1); 
                }
            }
            
        }
    }
    public static void troca(int v[],int a,int b){
        int aux;
        aux = v[a];
        v[a] = v[b];
        v[b] = aux;
    }
}
