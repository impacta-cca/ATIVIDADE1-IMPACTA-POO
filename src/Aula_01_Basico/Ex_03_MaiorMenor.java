/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_01_Basico;

import java.util.Scanner;

/**
 *
 * @author anacris
 */
public class Ex_03_MaiorMenor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite n1: ");
        double n1 = entrada.nextDouble();
        
        System.out.println("Digite n2: "); 
        double n2 = entrada.nextDouble();
        
        if (n1 <= n2) {
            System.out.println("O menor = " + n1);
            System.out.println("O maior = " + n2);
        }
        else {
            System.out.println("O menor = " + n2);
            System.out.println("O maior = " + n1);
        }
    }
}
