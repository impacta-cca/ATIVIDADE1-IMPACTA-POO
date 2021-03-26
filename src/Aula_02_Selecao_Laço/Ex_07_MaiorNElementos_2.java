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
public class Ex_07_MaiorNElementos_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de números: ");
        int n = entrada.nextInt();
        
         //Laço com teste no final
         
        int cont=0; //inicialização
        int maior=0;
        
        do {
            System.out.println("Digite um número: ");
            int num = entrada.nextInt();
            if(cont == 0){
                maior = num;
            } else {
                if (num > maior){
                    maior = num;
                }
            }
            cont++; //cont = cont + 1; atualização
        } while (cont < n); //condição
        
        System.out.println("O maior numero  = " + maior);
    }
}
