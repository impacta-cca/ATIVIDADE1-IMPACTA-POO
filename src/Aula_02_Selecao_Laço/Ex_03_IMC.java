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
public class Ex_03_IMC {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o peso: ");
        float peso = entrada.nextFloat();
        System.out.println("Digite a altura: ");
        float altura = entrada.nextFloat();
        
        float imc = peso/(altura*altura);
        System.out.println("IMC = "+imc);
        
        if(imc < 18.5){
            System.out.println("Abaixo do peso");
        } else {
            if(imc < 25.0) {
                System.out.println("Peso normal");
            } else {
                if (imc < 30.0){
                    System.out.println("Sobrepeso");
                } else 
                    System.out.println("Obesidade");
            }
        }
    }
}
