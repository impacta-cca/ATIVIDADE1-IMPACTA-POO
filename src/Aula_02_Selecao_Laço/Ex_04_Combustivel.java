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
public class Ex_04_Combustivel {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o tipo de combustivel: ");
        System.out.println("A: álcool, D: diesel, G: gasolina: ");
        char tipo = entrada.nextLine().charAt(0);
        System.out.println("Digite a qtd de litros: ");
        float qtd = entrada.nextFloat();
        
        switch (tipo){
            case 'A':
            case 'a':
                System.out.printf("\nTotal de álcool = %.2f",qtd*1.7997);
                break;
            case 'D':
            case 'd':
                System.out.printf("\nTotal de diesel = %.2f",qtd*0.9798);
                break;
            case 'G':
            case 'g':
                System.out.printf("\nTotal de gasolina = %.2f",qtd*2.1009);
                break;
            default:
                System.out.println("Opçãp inválida");
        }
    }
}
