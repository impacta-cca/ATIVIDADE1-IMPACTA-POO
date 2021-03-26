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
public class Ex_senha {
    public static void main(String[] args) {
        
        String password = "axZ4356";
        String pattern = "[a-zA-Z]{3}[0-9]{4}";
        
        System.out.println(password.matches(pattern));
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(password);
        System.out.println(m.matches());
    }    
}
