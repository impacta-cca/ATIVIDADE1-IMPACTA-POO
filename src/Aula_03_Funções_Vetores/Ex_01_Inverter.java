/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_03_Funções_Vetores;

import java.util.Scanner;

/**
 *
 * @author anacris
 */
public class Ex_01_Inverter {
    public static void main(String[] args) {
        int num = leInteiroPositivo();
        int num_inv = inverterNumero(num);  
        System.out.println("O numero invertido = " + num_inv);
    }
    
    public static int leInteiroPositivo(){
        Scanner entrada = new Scanner(System.in);
        int n;
        //Validação do dado de entrada
        do {
            System.out.println("Digite um número inteiro e positivo: ");
            n = entrada.nextInt();
        } while (n <=0);
        
        return n;
    }

    public static int inverterNumero(int n) {
        int n_inv = 0;
        while (n > 0){
            int resto = n % 10;
            n_inv = n_inv * 10 + resto;
            n = n / 10; //atualização  n /= 10;
        }
        return n_inv;
    }
}
