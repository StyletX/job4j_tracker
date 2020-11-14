package ru.job4j.max;

public class Reduce {
    private int[] array;

    public void to(int[] array2) {
        array = array2;
    }

    public void print() {
        for (int index : array) {
            System.out.println(index);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}