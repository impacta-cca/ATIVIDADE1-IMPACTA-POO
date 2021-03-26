/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_Projeto_Classes;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author anacris
 */
public class BankAccountTest {
    @Test
    public void testeConstrutorPadrão() {
          BankAccount c1 = new BankAccount("Ana Maria");
          assertEquals (0.0,c1.getBalance(),0.0001);
          assertEquals (1000, c1.getAccountNumber());
          BankAccount c2 = new BankAccount("Renato Ribeiro");
          assertEquals (1001, c2.getAccountNumber());
    }
    /*
    @Test
    public void testeConstrutorNaoPadrão() {
          BankAccount c = new BankAccount(500.00);
          assertEquals (500.0,c.getBalance(),0.0001);
    }
    @Test
    public void testeDeposit(){
        BankAccount c = new BankAccount(500.00);
        c.deposit(200.00);
        assertEquals (700.0,c.getBalance(),0.0001);
    }
    @Test
    public void testeWithDraw(){
        BankAccount c = new BankAccount(500.00);
        c.withDraw(150.00);
        assertEquals (350.0,c.getBalance(),0.0001);
    }
*/

}
