package Main;

import InputOutput.Input;
import InputOutput.Printer;
import ArraySorts.SortTwoDimensional;
import java.util.Random;
/**
 * @author kichyr
 * @task Дан двумерный массив, необходимо вывести двумерный массив у которого четные строки отсортированы по возрастанию, а нечетные по убыванию.
 * Так же в консоль необходимо вывести количество итераций, которое было потрачено при сортировке.
 */
public class Main {
    public static void main(String[] args) {
        Input filler = new Input();
        Printer printer = new Printer();
        
        // Создаем массив и заполняем случайными числами
        int[][] a = new int[7][7];
        filler.fillTwoDimensionalByRandom(a);
        Printer.print2Dimensional(a);
        
        //Сортируем его по нашему правилу
        SortTwoDimensional.SortByMyRool(a);
        //
        Printer.print2Dimensional(a);
    }
}
