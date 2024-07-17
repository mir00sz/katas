package experiments;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * I want to test performance of comparator and comparable
 */
class PhoneNumberTest {

    @Test
    public void comparePerformance() {

        int numberOfTestElements = 10000;
        List<PhoneNumber> pnlist1 = createRandomPhoneNumbers(numberOfTestElements);

        Instant start = Instant.now();
        Collections.sort(pnlist1);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println("Sorting with Comparable: " + timeElapsed);


        start = Instant.now();
        pnlist1.sort(PhoneNumber::compareToWithComparator);
        finish = Instant.now();
        timeElapsed = Duration.between(start, finish).toMillis();
        System.out.println("sorting with comparator: " + timeElapsed);
    }

    private List<PhoneNumber> createRandomPhoneNumbers(int numberOfTestElements) {
        List<PhoneNumber> phoneNumbers = new ArrayList<>();

        for (int i = 0; i < numberOfTestElements; i++) {
            int areaCode = new Random().nextInt(1000);
            int prefix = new Random().nextInt(1000);
            int lineNum = new Random().nextInt(1000);
            PhoneNumber pn = new PhoneNumber(areaCode, prefix, lineNum);
            phoneNumbers.add(pn);
        }
        return phoneNumbers;
    }

}