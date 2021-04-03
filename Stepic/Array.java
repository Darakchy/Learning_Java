package Stepic;

import java.util.Arrays;

public class Array {
    public int size;
    public int[] data;

    public void add(int element) {
        size++;
        int[] tepm = new int[size];
        for (int i = 0; i < size - 1; i++) {
            tepm[i] = data[i];
        }
        tepm[size - 1] = element;
        data = tepm;
    }

    @Override
    public String toString() {
        return "Array: " + size + ", " + Arrays.toString(data);
    }

    public static void main(String[] args) {
        Array array = new Array();
        array.add(5);
        System.out.println(array);
    }
}

