/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_05_Classes_Objetos;

import java.awt.*;

/**
 *
 * @author anacris
 */
public class Ex_01_testaRetangulo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        System.out.println(r1.height);
        System.out.println(r1.getHeight());
        
        Rectangle r2 = new Rectangle(5,10,20,30);
        System.out.println(r2);
        System.out.println(r2.height);
        System.out.println(r2.getHeight());
        
        Rectangle r3 = new Rectangle(20,30);
        System.out.println(r3);
        System.out.println(r3.height);
        System.out.println(r3.getHeight());
        
        /*
        r3.translate(5, 15);
        System.out.println(r3);
        */
        //Verifica se há ou não intersecção entre r2 e r3
        System.out.println(r2.intersects(r3));
        
        //Retorna o retângulo da intersecção de r2 e r3
        Rectangle r4 = r2.intersection(r3);
        System.out.println(r4);
        
        Rectangle r5 = new Rectangle(new Point(3,8),new Dimension(10,20));
        System.out.println(r5);
        
        Rectangle r6 = new Rectangle(new Dimension(15,25));
        System.out.println(r6);
        
    }
}
