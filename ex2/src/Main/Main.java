/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import InputOutput.FillerArrayByRandom;
import InputOutput.OutputArray;
import java.util.Random;

/**
 *
 * @author kichyr
 * @task Создайте массив целых чисел (размер 7 элементов), заполните его только четными числами, а затем каждый второй элемент умножьте на предыдущий
 */
public class Main {
public static void main(String[] args) {
        int[] a = new int[7];
        Random rand = new Random();
        FillerArrayByRandom fillerArr = new FillerArrayByRandom();
        OutputArray outerArr = new OutputArray();
        //рандомное заполнение четными
        fillerArr.fillArrayWithMod(a, 2);
        outerArr.printOneDimensionArray(a);
        System.err.println("");
        //
        for (int i = 0; i < a.length; i++) {
            // если на неч. позиции умнож на предидущий
            if(i % 2 == 1)
                a[i] *= a[i-1]; 
        }
        // вывод
        outerArr.printOneDimensionArray(a);
    }
    
}
