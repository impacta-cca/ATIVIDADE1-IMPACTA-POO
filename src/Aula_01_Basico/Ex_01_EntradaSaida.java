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
public class Ex_01_EntradaSaida {
    public static void main(String[] args) {
        //Cria Scanner para obter dados de entrada a partir de janela de comando
        Scanner entrada = new Scanner(System.in);
        
        int idade;
        double peso;
        String nome;
        char opcao;
        boolean resp;
        
        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt(); //lê o inteiro para idade
        
        System.out.println("A idade = " + (idade + 5));
        
        System.out.print("Digite o seu peso: ");
        peso = entrada.nextDouble(); //lê o número real para peso
        
        System.out.println("O seu peso = " + peso);
        
        entrada = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        nome = entrada.nextLine(); //lê uma String para nome
        System.out.println("O seu nome = " + nome);
        System.out.println("A primeira letra do nome = " + nome.charAt(0));
        System.out.println("A última letra do nome = " + nome.charAt(nome.length()-1));
        
        entrada = new Scanner(System.in);
        System.out.print("Digite a sua opção [a/b]: ");
        opcao = entrada.nextLine().charAt(0);
        System.out.println("A sua opcao = " + opcao);
        
        opcao = 'b';
        System.out.println("A sua opcao = " + opcao);
        
        resp = true;  //resp = True; erro
    
    }
}
