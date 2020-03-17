import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {

    @Test
    void solution() {
        BinaryGap binaryGap = new BinaryGap();

        int n = 1041;
        assertEquals(5,binaryGap.solution(n));

        n=9;
        assertEquals(2,binaryGap.solution(n));

        n=529;
        assertEquals(4,binaryGap.solution(n));

        n=20;
        assertEquals(1,binaryGap.solution(n));

        n=15;
        assertEquals(0,binaryGap.solution(n));

        int nLarge=561892;
        assertEquals(3,binaryGap.solution(nLarge));




    }
}