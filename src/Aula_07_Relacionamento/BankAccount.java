/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_07_Relacionamento;

/**
 *
 * @author anacris
 */
public class BankAccount {
    
    private int accountNumber;
    private String password;
    private String owner;
    private double balance;
    private String tipo;
     
    public BankAccount(int accountNumber, double balance){
        //chama outro construtor dessa classe com 2 parâmetros
        this(accountNumber, null, null, balance,"CONTA-CORRENTE"); 
    }

    public BankAccount(int accountNumber, String password, String owner, 
            double balance, String tipo) {
        this.accountNumber = accountNumber;
        if(password == null){
            this.password = "123"; //Cria uma senha padrão
        }
        else {
            this.password = password;
        }
        if(owner == null){
            this.owner = " Nome não-informado!"; //Cria um nome padrão
        }
        else {
            this.owner = owner;
        }
        this.balance = balance;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
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
