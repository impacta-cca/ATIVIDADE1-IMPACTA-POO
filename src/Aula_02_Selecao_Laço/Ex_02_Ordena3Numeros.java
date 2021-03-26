/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_02_Selecao_Laço;

import java.util.Scanner;

/**
 *
 * @author anacris
 */
public class Ex_02_Ordena3Numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro n1: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite um número inteiro n2: ");
        int n2 = entrada.nextInt();
        System.out.println("Digite um número inteiro n3: ");
        int n3 = entrada.nextInt();
        int aux;
        
        //Colocar o menor de todos em n1
        if(n1 >= n2 || n1 >= n3){
            if (n2 < n3){
                //Trocar n1 com n2
                aux = n1;
                n1 = n2;
                n2 = aux;
            } else {
                //Trocar n1 com n3
                aux = n1;
                n1 = n3;
                n3 = aux;
            }
        }
        //Intermediário em n2 e maior de todos em n3
        if (n2 > n3){
            //Trocar n2 com n3
                aux = n2;
                n2 = n3;
                n3 = aux;
        }
        System.out.printf("%d  %d  %d", n1,n2,n3);
    }
}
