package ex5;

import java.util.Random;

public class Ex5 {
    public static void main(String[] args) {
        // Создаем массив и заполняем случайными числами
        Random rand = new Random();
        int[][] a = new int[7][7];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++)
                a[i][j] = rand.nextInt(20);
        }
        
        
        Printer.print2Dimensional(a);
        //Сортируем его по нашему правилу
        Sort_Two_Dimensional.SortByMyRool(a);
        //
        Printer.print2Dimensional(a);
    }
}
