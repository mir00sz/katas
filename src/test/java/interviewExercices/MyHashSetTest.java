package interviewExercices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashSetTest {


    @Test
    void shouldAddMax() {
        MyHashSet set = new MyHashSet();
        set.add(1000000);
        assertTrue(set.contains(1000000));
    }
}