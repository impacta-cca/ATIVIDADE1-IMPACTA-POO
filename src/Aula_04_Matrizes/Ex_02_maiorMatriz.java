/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_Matrizes;

import static Aula_03_Funções_Vetores.Ex_01_Inverter.leInteiroPositivo;
import static Aula_04_Matrizes.Ex_01_Leitura_Escrita.exibeMatriz;
import static Aula_04_Matrizes.Ex_01_Leitura_Escrita.leMatrizAleatorio;

/**
 *
 * @author anacris
 */
public class Ex_02_maiorMatriz {
    public static void main(String[] args) {
        int lin = leInteiroPositivo();
        int col = leInteiroPositivo();
        int m[][] = leMatrizAleatorio(lin,col);
        exibeMatriz(m);
        System.out.println("O maior elemento da matriz = " + maiorMatriz(m));
    }
    public static int maiorMatriz(int m[][]){
        int maior = m[0][0];
        
        for(int i=0; i < m.length; i++){
            for (int j=0; j < m[0].length; j++){
                if(m[i][j] > maior){
                    maior = m[i][j];
                }
            }
        }
        return maior;  
    }
}
