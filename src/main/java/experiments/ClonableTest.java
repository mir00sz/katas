package experiments;

public class ClonableTest implements Cloneable {
    private int testIntVal1 = 1;
    private float testFloatVal = 1_000;

    public ClonableTest cloneMe() throws CloneNotSupportedException {
        return (ClonableTest) super.clone();
    }

    public int getTestIntVal1() {
        return testIntVal1;
    }

    public void setTestIntVal1(int testIntVal1) {
        this.testIntVal1 = testIntVal1;
    }

    public float getTestFloatVal() {
        return testFloatVal;
    }

    public void setTestFloatVal(float testFloatVal) {
        this.testFloatVal = testFloatVal;
    }
}
