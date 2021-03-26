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
public class Ex_03_ContaX {
    public static void main(String[] args) {
        int n = leInteiroPositivo();
        int v[] = leVetorAleatorio(n);
        exibeVetor(v);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite um número x que deseja buscar: ");
        int x = sc.nextInt();
        
        System.out.println(x + " aparece " + contaX(v,x) + " vezes no vetor.");
        System.out.printf("%d aparece %d vezes no vetor.", x, contaX(v,x));
        
        
    }

    public static int contaX(int[] v, int x) {
        int cont = 0;
        for(int i=0; i < v.length; i++){
            if(v[i] == x){
                cont++;
            }
        }
        return cont;
    }
}
