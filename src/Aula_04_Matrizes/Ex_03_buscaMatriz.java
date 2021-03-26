/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_Matrizes;

import java.io.IOException;
import java.util.Scanner;

import static Aula_04_Matrizes.Ex_01_Leitura_Escrita.exibeMatriz;
import static Aula_04_Matrizes.Ex_01_Leitura_Escrita.leMatrizArquivo;

/**
 *
 * @author anacris
 */
public class Ex_03_buscaMatriz {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int m[][] = leMatrizArquivo("entrada.txt");
        exibeMatriz(m);
        System.out.println("Qual elemento deseja buscar: ");
        int x = sc.nextInt();
        int ind[] = buscaLinearMatriz(m,x);
        if(ind[0]==-1 && ind[1]==-1){
            System.out.println(x + " NAO está na matriz.");
        } else{
            System.out.println(x + " está na linha " + ind[0] +
                    " e coluna " + ind[1]);
        }
    }
    
    public static int[] buscaLinearMatriz(int[][] m, int x) {
        int indice[] = new int[2];
        indice[0] = -1;
        indice[1] = -1;
        for (int i=0; i < m.length; i++){
            for (int j=0; j < m[0].length; j++){
                if(m[i][j] == x){
                     indice[0] = i;
                     indice[1] = j;
                }
            }
        }
        return indice;
    }
}
