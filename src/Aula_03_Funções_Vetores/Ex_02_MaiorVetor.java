/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_03_Funções_Vetores;

import java.util.Scanner;

import static Aula_03_Funções_Vetores.Ex_01_Inverter.leInteiroPositivo;

/**
 *
 * @author anacris
 */
public class Ex_02_MaiorVetor {
    public static void main(String[] args) {
        //dimensão do vetor
        int n = leInteiroPositivo();
        //declarar o vetor e chama função para preencher
        //int v[] = leVetor(n);
        int v[] = leVetorAleatorio(n);
        //mostra o vetor
        exibeVetor(v);
        System.out.println("O maior elemento do vetor = " + maiorVetor(v));
    }

    public static int[] leVetor(int n) {
        int v[] = new int[n];
        Scanner sc = new Scanner(System.in);
        
        for (int i=0; i < v.length; i++){
            System.out.print ("v[" +i+"] = ");
            v[i] = sc.nextInt();
        }
        return v;
    }
    public static int[] leVetorAleatorio(int n) {
        int v[] = new int[n];
        
        for (int i=0; i < v.length; i++){
            v[i] = (int) (Math.random()*100); //números aleatórios entre 0 e 99
        }
        return v;
    }
    
    public static void exibeVetor(int v[]) {
        for (int i=0; i < v.length; i++){
            System.out.print (v[i] + " ");     
        }  
    }

    public static int maiorVetor(int[] v) {
        int maior = v[0];
        
        for(int i=1; i < v.length; i++){
            if(v[i] > maior){
                maior = v[i];
            }
        }
        return maior;   
    }
    
}
