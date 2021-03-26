/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_08_Colecao_Contas;

import Aula_08_Relacionamento.Bank;
import Aula_08_Relacionamento.BankAccount;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BankTest {
    
    @Test
    public void testeConstrutor() {
        Bank banco = new Bank();
        assertNotNull(banco);
    }
    @Test
    public void testeAddAccount() {
        Bank banco = new Bank();
        banco.addAccount(new BankAccount(123,"567","Marcos Roberto",500.0));
        assertEquals(1,banco.getLast());
        assertEquals(123,banco.getAccounts()[0].getAccountNumber());
    }
    @Test
    public void testeGetTotalBalance() {
        Bank banco = new Bank();
        banco.addAccount(new BankAccount(123,"567","Marcos Roberto",500.0));
        banco.addAccount(new BankAccount(145,"999","Maria Clara",480.0));
        banco.addAccount(new BankAccount(179,"555","Lucas Lima",120.0));
        assertEquals(3,banco.getLast());
        assertEquals(1100.00, banco.getTotalBalance(),0.001);
    }
    @Test
    public void testeFind() {
        Bank banco = new Bank();
        banco.addAccount(new BankAccount(123,"567","Marcos Roberto",500.0));
        banco.addAccount(new BankAccount(145,"999","Maria Clara",480.0));
        banco.addAccount(new BankAccount(179,"555","Lucas Lima",120.0));
        assertEquals(3,banco.getLast());
        assertEquals("Maria Clara", banco.find(145).getOwner());
    }
    @Test
    public void testeGetMaximum() {
        Bank banco = new Bank();
        banco.addAccount(new BankAccount(123,"567","Marcos Roberto",500.0));
        banco.addAccount(new BankAccount(145,"999","Maria Clara",480.0));
        banco.addAccount(new BankAccount(179,"555","Lucas Lima",120.0));
        assertEquals("Marcos Roberto", banco.getMaximum().getOwner());
    }
    @Test
    public void testeCount() {
        Bank banco = new Bank();
        banco.addAccount(new BankAccount(123,"567","Marcos Roberto",500.0));
        banco.addAccount(new BankAccount(145,"999","Maria Clara",480.0));
        banco.addAccount(new BankAccount(179,"555","Lucas Lima",120.0));
        assertEquals(2, banco.count(400.0));
    }
}
