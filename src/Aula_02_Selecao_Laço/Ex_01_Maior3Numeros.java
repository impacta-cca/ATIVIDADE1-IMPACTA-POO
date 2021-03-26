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
public class Ex_01_Maior3Numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro n1: ");
        int n1 = entrada.nextInt();
        System.out.println("Digite um número inteiro n2: ");
        int n2 = entrada.nextInt();
        System.out.println("Digite um número inteiro n3: ");
        int n3 = entrada.nextInt();
        int maior;
        
        if(n1 >= n2 && n1 >= n3){
            maior = n1;
        } else{
            if (n2 >= n3){
                maior = n2;
            } else {
                maior = n3;
            }   
        }
        System.out.println("O maior é = " + maior);
        
    }
}
