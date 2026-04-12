package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer implementuje podstawową logikę wyliczanki
 * w oparciu o strukturę danych zachowującą się jak stos o stałym rozmiarze.
 */
public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int EMPTY = -1;
    private static final int MAX_SIZE = 11;
    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY;

    /**
     * Zwraca aktualny indeks wskazujący na wierzchołek stosu wyliczanki.
     * @return wartość zmiennej total, gdzie -1 oznacza pustą wyliczankę.
     */
    public int getTotal() {
        return total;
    }

    /**
     * Dodaje nową liczbę do wyliczanki (na wierzchołek stosu),
     * o ile struktura nie jest w pełni zapełniona.
     * @param in liczba całkowita do dodania.
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy wyliczanka jest pusta.
     * @return true, jeśli wyliczanka jest pusta, w przeciwnym razie false.
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     * Sprawdza, czy wyliczanka jest pełna.
     * @return true, jeśli wylicznaka jest pełna, w przeciwnym razie false.
     */
    public boolean isFull() {
        return total == MAX_SIZE;
    }

    /**
     * Zwraca wartość znajdującą się na wierzchołku wyliczanki bez jej usuwania.
     * @return liczba na wierzchołku wyliczanki, lub wartość EMPTY (-1), jeśli wyliczanka jest pusta.
     */
    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    /**
     * Zwraca wartość znajdującą się na wierzchołku wyliczanki i usuwa ją ze struktury.
     * @return liczba zdjęta z wierzchołka wyliczanki, lub wartość EMPTY (-1), jeśli wyliczanka jest pusta.
     */
    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

    /**
     * Zwraca tablicę przechowującą elementy wyliczanki.
     * @return tablica liczb całkowitych reprezentująca wewnętrzny stan wyliczanki.
     */
    public int[] getNumbers() {
        return numbers;
    }
}
