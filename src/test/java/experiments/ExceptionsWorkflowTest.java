package experiments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionsWorkflowTest {

    @Test
    void letsThrowAnException() {
        ExceptionsWorkflow exceptionsWorkflow = new ExceptionsWorkflow();
        exceptionsWorkflow.letsThrowAnException();
    }
}