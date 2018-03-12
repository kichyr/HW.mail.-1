/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraySorts;

/**
 *
 * @author kichyr
 * @description Сортировка пузырьком, характер сортировки которой зависет от флага 
 */
public class SortOneDimensional {
    //flagofSort 1- по возрастанию, -1 по убыванию
    public static int sortArray(int[] a, int flagofSort){
        //счетчик операций
        int count = 0;
        for(int i = 0; i < a.length; i++)
            for(int j = i; j < a.length; j++){
                count++;
                if(flagofSort*a[j] < flagofSort*a[i]) {
                    int d = a[i];
                    a[i] = a[j];
                    a[j] = d; 
                }
            }
        return count;
    }
}