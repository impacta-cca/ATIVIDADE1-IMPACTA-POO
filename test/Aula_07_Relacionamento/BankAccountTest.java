/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_07_Relacionamento;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author anacris
 */
public class BankAccountTest {
    @Test
    public void testeConstrutor2Parâmtros() {
          BankAccount c1 = new BankAccount(445,500.00);
          assertEquals (500.0,c1.getBalance(),0.0001);
          assertEquals (445, c1.getAccountNumber());
          assertEquals (" Nome não-informado!", c1.getOwner());
          assertEquals ("123", c1.getPassword());
          assertEquals ("CONTA-CORRENTE", c1.getTipo());
    }
    @Test
    public void testeConstrutor5Parametros() {
          BankAccount c = new BankAccount(445,"999","Renato Oliveira",500.00,"POUPANÇA");
          assertEquals (500.0,c.getBalance(),0.0001);
          assertEquals (445, c.getAccountNumber());
          assertEquals ("Renato Oliveira", c.getOwner());
          assertEquals ("999", c.getPassword()); 
          assertEquals ("POUPANÇA", c.getTipo());
    }
}
