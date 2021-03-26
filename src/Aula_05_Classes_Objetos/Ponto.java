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
public class Ponto {
    int x;
    int y;

    public Ponto() {
        x = 0;
        y = 0;
    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public boolean igual(Ponto p){
        return (this.x == p.x && this.y == p.y);
    }
    
    public void transladar(int dx, int dy){
        this.x = this.x + dx;
        this.y = this.y + dy;
    }
    
    public double distancia(Ponto p){
        double dx = (this.x - p.x);
        double dy = (this.y - p.y);
        double d = Math.sqrt(dx*dx + dy*dy);
        return d;
    }
    @Override
    public String toString() {
        return "Ponto: (" + "x=" + x + ", y=" + y + ')';
    }
    
    
    
}
