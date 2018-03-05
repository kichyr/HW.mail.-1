/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;



/**
 *
 * @author kichyr
 */
public class Ex6 {
    public static void main(String[] args) {
        
        String s = "kekek";
        System.err.println(Reverser.reverseByStack(s));
        if(s.equals(Reverser.reverseByStack(s)))
            System.err.println("it`s polindrom");
        else
            System.err.println("No");
    }
    
}
