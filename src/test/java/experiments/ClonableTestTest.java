package experiments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClonableTestTest {

    @Test
    public void testClone() throws CloneNotSupportedException {
        ClonableTest clonableTest = new ClonableTest();
        ClonableTest clonableTest1 = clonableTest.cloneMe();

        assertEquals(clonableTest.getTestFloatVal(), clonableTest1.getTestFloatVal());
        assertEquals(clonableTest.getTestIntVal1(), clonableTest1.getTestIntVal1());

        clonableTest.setTestFloatVal(3);
        assertNotEquals(clonableTest.getTestFloatVal(), clonableTest1.getTestFloatVal());
    }

}