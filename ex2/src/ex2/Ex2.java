/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Random;

/**
 *
 * @author kichyr
 */
public class Ex2 {
public static void main(String[] args) {
        int[] a = new int[7];
        Random rand = new Random();
        //рандомное заполнение + вывод исходного
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100)*2;
            System.err.print(a[i]+" ");
        }
        System.err.println("");
        //
        for (int i = 0; i < a.length; i++) {
            // если на неч. позиции умнож на предидущий
            if(i % 2 == 1)
                a[i] *= a[i-1]; 
        }
        // вывод
        for (int i = 0; i < a.length; i++) {
            System.err.print(a[i]+" "); 
        }
    }
    
}
