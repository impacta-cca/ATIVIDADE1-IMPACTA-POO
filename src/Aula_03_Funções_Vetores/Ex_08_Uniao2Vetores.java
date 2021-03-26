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
import static Aula_03_Funções_Vetores.Ex_07_Inters2Vetores.exibeVetorTam;

/**
 *
 * @author anacris
 */
public class Ex_08_Uniao2Vetores {
    public static void main(String[] args) {
        int n1 = leInteiroPositivo();
        int v1[] = leVetorAleatorio(n1);
        exibeVetor(v1);
        
        int n2 = leInteiroPositivo();
        int v2[] = leVetorAleatorio(n2);
        exibeVetor(v2);
        
        int uni[] = new int[n1+n2];
        int k = uniao2Vetores(uni,v1,v2);
        
        System.out.println("\nA união dos 2 vetores: ");
        exibeVetorTam(uni,k); 
    }
    public static int uniao2Vetores(int uni[], int v1[], int v2[]){
        int k = 0;
        for(int i=0; i<v1.length; i++){
            uni[k]= v1[i];
            k++;
        }
        
        //Percorrer o vetor v2
        for( int i=0; i < v2.length; i++){
            //Verificar se um elemento está no vetor v1
            if(buscaLinear(v1, v2[i]) == -1) {
                uni[k] = v2[i];
                k++;
            }
        }
        return k;
    }
}
