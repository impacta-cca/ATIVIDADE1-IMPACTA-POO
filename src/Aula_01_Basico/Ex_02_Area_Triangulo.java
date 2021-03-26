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
public class Ex_02_Area_Triangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a base: ");
        double base = entrada.nextDouble();
        
        System.out.println("Digite a altura: "); //vírgula
        double altura = entrada.nextDouble();
        
        double area = base * altura;
        
        System.out.println("A area do triangulo = " + area); //ponto
        System.out.printf("A area do triangulo =  %f\n", area); //vírgula
        System.out.printf("A area do triangulo =  %.2f", area);
    }
}
