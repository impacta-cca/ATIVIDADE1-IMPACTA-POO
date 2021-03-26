/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_08_Relacionamento;

/**
 *
 * @author anacris
 */
public class BankAccount {

    private int accountNumber;
    private String password;
    private String owner;
    private double balance;

    public BankAccount(int accountNumber, String password, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.password = password;
        this.owner = owner;
        this.balance = balance;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
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
        return "BankAccount{" + "accountNumber=" + accountNumber +
                ", password=" + password + ", owner=" + owner + 
                ", balance=" + balance + '}';
    }

    
}
