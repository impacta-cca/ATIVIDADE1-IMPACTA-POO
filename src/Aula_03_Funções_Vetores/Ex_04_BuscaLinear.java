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

/**
 *
 * @author anacris
 */
public class Ex_04_BuscaLinear {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite um número x que deseja buscar: ");
        int x = sc.nextInt();
        
        int resp = buscaLinear(v,x);
        if(resp != -1){
            System.out.printf("\n%d está na posição %d", x, resp);
        } else{
            System.out.printf("\n%d NAO está no vetor",x);
        }
    }

    public static int buscaLinear(int[] v, int x) {
        for (int i=0; i < v.length; i++){
            if(v[i] == x)
                return i; //achei
        }
        return -1; //não achou
    }
}
