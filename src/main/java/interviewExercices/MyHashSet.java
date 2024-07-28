package interviewExercices;

import java.util.Arrays;

public class MyHashSet {

    private static final int SIZE = 1000001;
    private final int[] ARRAY = new int[SIZE];

    public MyHashSet() {
        Arrays.fill(ARRAY, -1);
        System.out.println("length: " + ARRAY.length);

    }

    public void add(int key) {
        ARRAY[key]=key;
    }

    public void remove(int key) {
        ARRAY[key] = -1;
    }

    public boolean contains(int key) {
        if (ARRAY[key] >= 0) {
            return true;
        }
        return false;
    }



}
