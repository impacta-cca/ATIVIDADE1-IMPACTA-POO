/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_04_Matrizes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author anacris
 */
public class Ex_01_Leitura_Escrita {
    public static void main(String[] args) throws IOException {
        /*
        int lin = leInteiroPositivo();
        int col = leInteiroPositivo();
        int m[][] = leMatrizAleatorio(lin,col);*
        */
        int m[][] = leMatrizArquivo("entrada.txt");
        exibeMatriz(m);
    }

    public static int[][] leMatrizAleatorio(int lin, int col) {
        int m[][] = new int[lin][col];
        
        for (int i=0; i < m.length; i++)
            for (int j=0; j < m[0].length; j++)
               m[i][j] = (int) (Math.random()*100); //números aleatórios entre 0 e 99
        
        return m;
    }
    
    public static void exibeMatriz(int m[][]) {
        for (int i=0; i < m.length; i++){
            for (int j=0; j< m[0].length; j++)
                System.out.print (m[i][j] + " ");
            System.out.println();
        }
    }
    public static int[][] leMatrizArquivo(String file) 
            throws FileNotFoundException, IOException {
        BufferedReader entrada = new BufferedReader(new FileReader(file));
        
        //dimensão da matriz
        String linha = entrada.readLine(); //leitura da linha
        String linhas[] = linha.split(" "); //quebrou a linha
        
        int lin = Integer.parseInt(linhas[0]);
        int col = Integer.parseInt(linhas[1]);
        
        int m[][] = new int[lin][col];
        
        for (int i=0; i < lin; i++){
            linha = entrada.readLine();
            linhas = linha.split(" ");
            for (int j=0; j < col; j++)
               m[i][j] = Integer.parseInt(linhas[j]);
        }
        //fecha o arquivo lógico de entrada
        entrada.close();
        
        return m;
    }
}
