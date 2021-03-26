/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_Projeto_Classes;

import java.util.Scanner;

/**
 *
 * @author anacris
 */
public class testaBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount contas[] = new BankAccount[5];
        
        for( int i=0; i< contas.length; i++){
            System.out.printf("Digite o nome do cliente da conta[%d]\n", (i+1));
            String nome = sc.nextLine();
            sc = new Scanner(System.in);
            System.out.printf("Digite o saldo da conta[%d]\n", (i+1));
            double saldo = sc.nextDouble();
            contas[i] = new BankAccount(nome,saldo);
            sc = new Scanner(System.in);
        }
        
        System.out.println(BankAccount.getLastAccountNumber());
        mostrarInfo(contas);
    }
    public static void mostrarInfo(BankAccount[] contas) { 
        System.out.println("\nContas de todos os clientes:"); 
        for (int i=0; i<contas.length; i++) {
            System.out.println("[" + i + "]" + contas[i].toString()); 
        }
        System.out.println(""); 
    }

}
