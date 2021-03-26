/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_05_Classes_Objetos;

/**
 *
 * @author anacris
 */
public class testaPonto {
    public static void main(String[] args) {
        Ponto p1 = new Ponto();
        System.out.println(p1.toString());
        System.out.println(p1.x);
        System.out.println(p1.y);
        p1.setX(2);
        p1.setY(4);
        System.out.println(p1);
        
        Ponto p2 = new Ponto(5,10);
        System.out.println(p2);
        System.out.println(p2.x);
        System.out.println(p2.y);
        
        System.out.println(p1.igual(p2));
        p1.transladar(3,7);
        System.out.println(p1);
        
        p1.setX(1);
        p1.setY(1);
        p2.setX(4);
        p2.setY(3);
        System.out.println(p1.distancia(p2));
        
    }
}
