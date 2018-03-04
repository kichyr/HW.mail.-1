/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firsttest;

import java.util.Scanner;

/**
 *
 * @author kichyr
 */
public class FirstTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        int a[] = {1,3,6};
        for(int i =0 ; i < a.length; i++) {
            if(a[i]%3 == 0)
                System.err.println(a[i]);
        }
    }
    
}
