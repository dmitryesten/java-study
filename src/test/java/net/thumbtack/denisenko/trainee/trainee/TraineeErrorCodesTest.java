package net.thumbtack.denisenko.trainee.trainee;

import org.junit.Test;

import static org.junit.Assert.*;

public class TraineeErrorCodesTest {
    @Test
    public void getPrivateMessage() throws Exception {
        assertEquals("ERROR_NUMBER_IS_NOT_CORRECT", TraineeErrorCodes.ERROR_NUMBER_IS_NOT_CORRECT.name());
        assertEquals("ERROR_STRING_IS_NULL_OR_EMTRY", TraineeErrorCodes.ERROR_STRING_IS_NULL_OR_EMTRY.name());
    }
}