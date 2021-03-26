/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_08_Relacionamento;
import java.util.*;
import  java.io.*;

/**
 *
 * @author anacris
 */
public class Bank {
    private BankAccount accounts[]; //vetor de contas
    private int last; //último indice da conta inserida
    
    public Bank(){
        accounts = new BankAccount[100]; //criando um banco com, 
              //no máximo, 100 contas
        last = 0;     
    }

    public Bank(String arquivo){
        accounts = new BankAccount[100]; //criando um banco com,
        //no máximo, 100 contas
        last = 0;

        try {
            // Abre arquivo
            BufferedReader r = new BufferedReader(new FileReader(arquivo));
            // se o arquivo pode ser aberto
            if(r != null) {
                // Quantidade de dados a serem lidos
                String linha = r.readLine();
                int tamanho = Integer.parseInt(linha);
                for(int i = 0;i<tamanho;i++){
                    String[] Dados = r.readLine().split("#");
                    this.addAccount(new BankAccount(Integer.parseInt(Dados[0]),Dados[1],Dados[2],Double.parseDouble(Dados[3])));
                }

            }
        }catch (Exception e){
            System.exit(-1);
        }
    }




    public void addAccount(BankAccount bankAccount) {
       //Insere uma conta no vetor de contas
       if(last < 99)
           accounts[last]= bankAccount;
           last++;
    }

    public BankAccount[] getAccounts() {
        return accounts;
    }

    public int getLast() {
        return last;
    }

    //Calcular o saldo total de toas as contas inseridas no banco
    public double getTotalBalance() {
       double soma=0.0;
       for(int i=0; i < last; i++)
           soma = soma + accounts[i].getBalance();
       return soma;
    }
    
    //Devolve a conta vinculada a um número dado
    public BankAccount find(int accountNumber) {
        for(int i=0; i < last; i++)
            if(accounts[i].getAccountNumber() == accountNumber)
                return accounts[i]; //Achei
        return null;//Não achei
    }
    //Devolve a conta com o maior saldo
    public BankAccount getMaximum() {
        if(last == 0)
            return null;
        BankAccount maior = accounts[0];
        for(int i=1; i < last; i++)
            if(accounts[i].getBalance() > maior.getBalance())
                maior = accounts[i]; 
        return maior;
    }
    //Devolve o número de contas com saldo igual ou superior a um limite
    public int count(double limit){
        int cont=0;
        for(int i=0; i < last; i++)
            if(accounts[i].getBalance() >= limit)
                cont++; 
        return cont;
    }

    public List<String[]> lerArquivo() {
        List<String[]> armazenar = new ArrayList<String[]>();
        try {
            // Abre arquivo
            BufferedReader r = new BufferedReader(new FileReader("D:/git/Grupo/ATIVIDADE1-IMPACTA-POO/src/Aula_08_Relacionamento/entrada.txt"));
            // se o arquivo pode ser aberto
            if(r != null) {
                // Quantidade de dados a serem lidos
                String linha = r.readLine();
                int tamanho = Integer.parseInt(linha);

                for(int i = 0;i<tamanho;i++){
                    String[] Dados = r.readLine().split("#");
                    armazenar.add(Dados);
                    this.addAccount(new BankAccount(Integer.parseInt(Dados[0]),Dados[1],Dados[2],Double.parseDouble(Dados[3])));
                }

            }
            }catch (Exception e){
            System.exit(-1);
        }
        return armazenar;
    }




}
