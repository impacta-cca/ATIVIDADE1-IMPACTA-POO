/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_Projeto_Classes;

/**
 *
 * @author anacris
 */
public class BankAccount {
   
    private static int lastAccountNumber = 1000;
    //Próximo número utilizado da conta
    
    private String owner;
    private int accountNumber;
    private double balance;
     
    //Criar uma conta com saldo igual 0.0
    public BankAccount(String owner){
        //chama outro construtor dessa classe com 2 parâmetros
        this(owner,0.0); 
    }

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.accountNumber = lastAccountNumber++;
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }
    
    public static int getLastAccountNumber() {
        return lastAccountNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
  
    /**
     * Deposita dinheiro nesta conta
     * (Pós-condição: getBalance() >= 0.0)
     * @param amount: a quantia de dinheiro a depositar
     * (Pré-condição: amount >=0)
     */
    public void deposit(double amount){
        //Evitar efeitos colaterais
        double newBalance = balance + amount;
        balance = newBalance;
    }
   
    void withDraw(double amount) {
        //Evitar efeitos colaterais
        double newBalance = balance - amount;
         balance = newBalance;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "owner=" + owner + ", accountNumber=" + 
                accountNumber + ", balance=" + balance + '}';
    }

    
    
}
