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
public class Ex_08_MaiorNElementos_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de números: ");
        int n = entrada.nextInt();
        
         //Laço com for, variável de controle
         
        int maior=0;
   
        for(int cont=0; cont < n; cont++){
            System.out.println("Digite um número: ");
            int num = entrada.nextInt();
            if(cont == 0){
                maior = num;
            } else {
                if (num > maior){
                    maior = num;
                }
            }
        } 
        
        System.out.println("O maior numero  = " + maior);
    }
}
