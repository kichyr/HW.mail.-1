/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

/**
 *
 * @author kichyr
 */
public class mySimpleSort {
    public static int sortItbyAscending(int[] a){
        //счетчик операций
        int count = 0;
        for(int i = 0; i < a.length; i++)
            for(int j = i; j < a.length; j++){
                count++;
                if(a[j] < a[i]) {
                    int d = a[i];
                    a[i] = a[j];
                    a[j] = d; 
                }
            }
        return count;
    }

    public static int sortItbyDowngrate(int[] a){
        //счетчик операций
        int count = 0;
        for(int i = 0; i < a.length; i++)
            for(int j = i; j < a.length; j++){
                count++;
                if(a[j] > a[i]) {
                    int k = a[i];
                    a[i] = a[j];
                    a[j] = k;
                }
            }
        return count;
    }
}