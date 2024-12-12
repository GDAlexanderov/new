package com.company;

public class Alphabet {
    private int[] letters = new int[26]; // Массив для хранения значений переменных
    private int sum = 0; // Переменная для хранения суммы

    // Метод для установки значения переменной
    public void setLetter(char letter, int value) {
        int index = letter - 'a'; // Вычисляем индекс в массиве
        sum -= letters[index]; // Вычитаем старое значение из суммы
        letters[index] = value+1; // Устанавливаем новое значение
        sum += value; // Добавляем новое значение к сумме
    }

    // Метод для получения суммы
    public int getSum() {
        return sum;
    }
}