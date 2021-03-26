/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_Matrizes;

import java.util.Scanner;

/**
 *
 * @author anacris
 */
public class BancoAppV1 {
    public static void main(String[] args) {
        String nomes[] = {"Marcos", "Júlia", "João", "Roberto", "Janaína"};
        double saldos[][] = {{1000.00, 2500.00},
                             { 250.00, 1500.00},
                             {2500.00,  750.00},
                             {3000.00,   50.00},
                             {4500.00, 3200.00} };
        
        Scanner sc = new Scanner(System.in);
        boolean sair = false;
        while(!sair){
            System.out.println("Escolha uma operação: ");
            System.out.println("(1) Mostrar saldos de todas as contas");
            System.out.println("(2) Sacar");
            System.out.println("(3) Depositar");
            System.out.println("(4) Sair");
            System.out.print("Opção inválida!");
            int escolha = sc.nextInt();
            switch(escolha){
                case 1:
                    mostraSaldos(nomes,saldos);
                    break;
                case 2:
                    interacaoSacar(saldos);
                    break;
                case 3:
                    //interacaoDepositar(saldos);
                    break;
                case 4:
                    sair = true;
                    break;
                default:
                    System.out.print("Opção inválida!");
            }
            System.out.println();
           
        }
        System.out.println("Fim do Programa");

    }
    
    public static void mostraSaldos(String nomes[], double saldos[][]){
        System.out.println("Saldos de todos os clientes");
        for (int i=0; i < nomes.length; i++){
            String msg = i + ") " + nomes[i]+ ": ";
            msg += saldos[i][0] + " (conta corrente) e ";
            msg += saldos[i][1] + " (poupança)";
            System.out.println(msg);
        }
        System.out.println();
    }
    
    public static void depositar(double saldos[][],double valor, 
                                        int cliente, int tipoConta){
        saldos[cliente][tipoConta] += valor;
    }
    
    public static void sacar(double saldos[][],double valor, 
                                        int cliente, int tipoConta){
        saldos[cliente][tipoConta] -= valor;
    }
    
    public static void interacaoSacar(double saldos[][]){
        Scanner sc = new Scanner(System.in);
        boolean clienteValido = false;
        int cliente = -1;
        
        while(!clienteValido){
            System.out.println("O saque será efetuado na conta de qual cliente? (0 a " 
                    + (saldos.length-1) + "): ");
            cliente = sc.nextInt();
            if(cliente >=0 && cliente < saldos.length)
                clienteValido = true;
            else 
                System.out.println("Índice do cliente inválido!");
        }
        boolean contaValida = false;
        int tipoConta = -1;
        while(!contaValida){
            System.out.println("Em qual conta será efetuado o saque? "
                    + "(0 - conta corrente; 1 - poupança): ");
            tipoConta = sc.nextInt();
            if(tipoConta == 0 || tipoConta == 1)
                contaValida = true;
            else 
                System.out.println("Valor inválido!");
        }
        System.out.println("Qual o valor do saque? ");
        double saque = sc.nextDouble();
        sacar(saldos,saque,cliente,tipoConta);  
    }
}
