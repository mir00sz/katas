package experiments;

import java.util.Comparator;

/**
 * experiment over compareTo and Comparators
 */
public class PhoneNumber implements Comparable<PhoneNumber>{
    private int areaCode;
    private int prefix;
    private int lineNUm;
    private static final Comparator<PhoneNumber> COMPARATOR = Comparator
            .comparingInt(PhoneNumber::getAreaCode)
            .thenComparingInt(PhoneNumber::getPrefix)
            .thenComparingInt(PhoneNumber::getLineNUm);


    public PhoneNumber(int areaCode, int prefix, int lineNUm) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.lineNUm = lineNUm;
    }

    public int compareToWithComparator(PhoneNumber pn) {
        return COMPARATOR.compare(this, pn);
    }

    public static int dummyInt() {
        return 0;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public int getPrefix() {
        return prefix;
    }

    public void setPrefix(int prefix) {
        this.prefix = prefix;
    }

    public int getLineNUm() {
        return lineNUm;
    }

    public void setLineNUm(int lineNUm) {
        this.lineNUm = lineNUm;
    }

    @Override
    public int compareTo(PhoneNumber o) {
        int result = Integer.compare(areaCode, areaCode);
        if (result==0) {
            result = Integer.compare(prefix, o.getPrefix());

            if(result==0) {
                result = Integer.compare(lineNUm, o.getLineNUm());
            }
        }

        return result;
    }
}
