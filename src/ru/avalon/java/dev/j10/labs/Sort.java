package ru.avalon.java.dev.j10.labs;

/**
 * Абстрактное представление о сортировке.
 *
 * <p>
 * Сортировка (англ. sorting — классификация, упорядочение) — последовательное
 * расположение или разбиение на группы чего-либо в зависимости от выбранного
 * критерия.
 *
 * @see
 * <a href="https://ru.wikipedia.org/wiki/%D0%A1%D0%BE%D1%80%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%BA%D0%B0">Сортировка</a>
 */
public interface Sort {

    /**
     * Выполняет сортировку переданного массива.
     *
     * @param array массив, подлежащий сортировке
     */
    void sort(int[] array);

    static void changeItems(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
