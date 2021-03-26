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
public class Ex_09_Inverter {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        
        //Validação do dado de entrada
        do {
            System.out.println("Digite um número inteiro e positivo: ");
            n = entrada.nextInt();
        } while (n <=0);
        
        //Resolver o problema
        int n_inv = 0;
        while (n > 0){
            int resto = n % 10;
            n_inv = n_inv * 10 + resto;
            n = n / 10; //atualização  n /= 10;
        }
        System.out.println("O numero invertido = " + n_inv);
    }
}
