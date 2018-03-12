/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import java.util.Random;

/**
 *
 * @author kichyr
 * @description Различный ввод, в нашем случае рандомное заполнение
 */
public class Input {
    public void fillTwoDimensionalByRandom(int a[][]){
        Random rand = new Random();
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++)
                a[i][j] = rand.nextInt(20);
        }
    }
}