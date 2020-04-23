package ru.avalon.java.dev.j10.labs;

import java.util.Random;
import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;

public class Application {
    
    public static void main(String[] args) {
        int[] array = new int[20];  // задание 0.

        FibonacciInitializer fibonacciInitializer = new FibonacciInitializer();
        fibonacciInitializer.initialize(array);  // задание 1.

        int sum = getSum(array);  // задание 2.

        System.out.println(sum); // вывод результата задания 2.

        RandomInitializer randomInitialiser = new RandomInitializer();
        randomInitialiser.initialize(array); //выполнение задания 3.
      
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array); //выполение задания 4.
     
        randomInitialiser.initialize(array); //выполнение задания 5.
        
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array); //выполнение задания 6.

        /*
	     * TODO(Студент): Выполнить действия над массивом чисел
	     *
	     * 0. Инициализировать переменную array массивом из 20 целых чисел.
	     *
	     * 1. Проинициализировать массив значениями
	     *    последовательности чисел Фибоначчи.
	     *
	     * 2. Найти сумму элементов массива.
	     *
	     * 3. Проинициализировать массив последовательностью
	     *    случайных чисел в диапазоне от -50 до 50.
	     *
	     * 4. Отсортировать массив с использованием
	     *    пузырьковой сортировки.
	     *
         * 5. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 6. Отсортировать массив с использованием
         *    сортировки выбором.
         *
         * 7. Проинициализировать массив последовательностью
         *    случайных чисел в диапазоне от -50 до 50.
         *
         * 8. Отсортировать массив с использованием
         *    сортировки Шелла.
         */
    }

    public static int getSum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

}
