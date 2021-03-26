/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06_Projeto_Classes;

/**
 *
 * @author anacris
 */
public class Retangulo {
    private double x;
    private double y;
    private double largura;
    private double altura;

    public Retangulo(double x, double y, double largura, double altura) {
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public double area() {
        return this.largura * this.altura;
    }

    void transladar(int dx, int dy) {
       this.x = this.x + dx;
       this.y = this.y + dy;
    }
  
}
