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
public class BankAccount_AC2 {

    private int accountNumber;
    private String password;
    private String owner;
    private double balance;

    public BankAccount_AC2(int accountNumber, String owner,double balance) throws Exception {
        this.accountNumber = accountNumber;
        this.password = makePassword();
        this.owner = checkName(owner);
        this.balance = balance;
    }
    
    public static String checkName(String name) {
        try{
        if(name.matches("[a-zA-Z ]+"))
            return name;
        }
        catch(Exception e){
            System.out.println("Nome inválido, deve conter apenas caracteres\n");
        }
        return null;
    }
    
    public static String makePassword(){
        StringBuilder str = new StringBuilder();
        
        for(int i=0; i < 3; i++)
            str.append(randomLetter());
        
        for(int i=0; i < 4; i++)
            str.append(randomDigit());
        
        return str.toString();
    }
    public static String randomLetter(){
        String alfabeto = "abcdefghijklmnopqrstuvxz";
        int num = (int)(Math.random()*alfabeto.length());
        char c = alfabeto.charAt(num);
        return String.valueOf(c);
    }
    public static String randomDigit(){
        int num = (int)(Math.random()*10);
        return String.valueOf(num);
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
