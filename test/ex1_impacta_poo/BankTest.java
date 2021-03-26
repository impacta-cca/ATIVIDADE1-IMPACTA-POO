/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1_impacta_poo;

import Aula_08_Relacionamento.Bank;
import Aula_08_Relacionamento.BankAccount;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    /*
    *   Número de contas
    *   Número da Conta 1#Senha da Conta 1#Proprietário da Conta 1#saldo da Conta1
    *   Número da Conta 2#Senha da Conta 2#Proprietário da Conta 2#saldo da Conta2
    *   ...
    *   Número da Conta N#Senha da Conta N#Proprietário da Conta N#saldo da ContaN
    */
    public void testeAddAccountcomLerEntrada() {
        Bank banco = new Bank();
        List<String[]> printar = banco.lerArquivo();

        System.out.println(Arrays.toString(printar.get(0)));
        System.out.println(Arrays.toString(printar.get(1)));
        System.out.println(Arrays.toString(printar.get(2)));
        assertEquals(3,banco.getLast());
    }
    @Test
    public void testeiniciarcomparametro(){
        String caminho = "D:/git/Grupo/ATIVIDADE1-IMPACTA-POO/src/Aula_08_Relacionamento/entrada.txt";
        Bank bancocomArquivo = new Bank(caminho);

        for(int i = 0;i<3;i++) {
            System.out.println(bancocomArquivo.getAccounts()[i].toString());
        }


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
