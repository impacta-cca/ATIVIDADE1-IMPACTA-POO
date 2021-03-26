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
public class RetanguloTest {
    
    @Test
    public void testeConstrutor() {
          Retangulo r = new Retangulo(5,10,20,30);
          assertEquals (5.0,r.getX(),0.0001);
    }

    @Test
    public void testeArea() {
          Retangulo r = new Retangulo(5,10,20,30);
          assertEquals (600, r.area(),0.001);
    }

    @Test
    public void testeTransladar() {
          Retangulo r = new Retangulo(5,10,20,30);
          r.transladar(10,10);
          assertEquals (15, r.getX(), 0.1);
          assertEquals (20, r.getY(), 0.1);
    }
    
}

