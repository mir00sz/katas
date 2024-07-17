import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BooleanNullChecks {

    @Test
    void booleanNullCheck() {
        Boolean b = null;

        assertTrue(Boolean.TRUE ==b);
    }
}
