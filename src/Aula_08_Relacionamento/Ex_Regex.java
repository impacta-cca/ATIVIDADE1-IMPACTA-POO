/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_08_Relacionamento;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author anacris
 */
public class Ex_Regex {
    public static void main(String[] args) {
        
        //Usando a função matches() da classe String
        String str = "asa";
        boolean b = str.matches("[a-z]+");
        System.out.println(b);
        
        //Usando classes Pattern e Matcher e tem 3 formas:
        //1a. forma
        Pattern p = Pattern.compile("[a-z]+");
        Matcher m = p.matcher(str);
        boolean b1 = m.matches();
        System.out.println(b1);
        
        //2a. forma
        boolean b2 = Pattern.compile("[a-z]+").matcher(str).matches();
        System.out.println(b2);
        
        //3a. forma
        boolean b3 = Pattern.matches("[a-z]+", str);
        System.out.println(b3);
        
    }
}
