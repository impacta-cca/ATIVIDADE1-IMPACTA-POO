/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_03_Funções_Vetores;

import static Aula_03_Funções_Vetores.Ex_01_Inverter.leInteiroPositivo;
import static Aula_03_Funções_Vetores.Ex_02_MaiorVetor.exibeVetor;
import static Aula_03_Funções_Vetores.Ex_02_MaiorVetor.leVetorAleatorio;
import static Aula_03_Funções_Vetores.Ex_04_BuscaLinear.buscaLinear;

/**
 *
 * @author anacris
 */
public class Ex_07_Inters2Vetores {
    public static void main(String[] args) {
        int n1 = leInteiroPositivo();
        int v1[] = leVetorAleatorio(n1);
        exibeVetor(v1);
        
        int n2 = leInteiroPositivo();
        int v2[] = leVetorAleatorio(n2);
        exibeVetor(v2);
        
        int inter[] = new int[n1];
        int k = inter2Vetores(inter,v1,v2);
        
        System.out.println("\nA interseccão dos 2 vetores: ");
        exibeVetorTam(inter,k); 
    }
    public static int inter2Vetores(int inter[], int v1[], int v2[]){
        int k = 0;
        
        //Percorrer o vetor v1
        for( int i=0; i < v1.length; i++){
            //Verificar se um elemento está no vetor v2
            if(buscaLinear(v2, v1[i]) != -1) {
                inter[k] = v1[i];
                k++;
            }
        }
        return k;
    }
    
    public static void exibeVetorTam(int v[], int n) {
        for (int i=0; i < n; i++){
            System.out.print (v[i] + " ");     
        }  
    }
}
