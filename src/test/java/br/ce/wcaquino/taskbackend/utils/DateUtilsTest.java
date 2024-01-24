package br.ce.wcaquino.taskbackend.utils;

import java.time.LocalDate;
import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;

public class DateUtilsTest extends TestCase {


    public void testPresentDate() {
        boolean equalOrFutureDate = DateUtils.isEqualOrFutureDate(LocalDate.now());
        Assertions.assertTrue(equalOrFutureDate);
    }

    public void testFutureDate() {
        LocalDate futureDate = LocalDate.now().plusDays(1);
        boolean equalOrFutureDate = DateUtils.isEqualOrFutureDate(futureDate);
        Assertions.assertTrue(equalOrFutureDate);
    }

    public void testPastDate() {
        LocalDate futureDate = LocalDate.now().minusDays(1);
        boolean equalOrFutureDate = DateUtils.isEqualOrFutureDate(futureDate);
        Assertions.assertFalse(equalOrFutureDate);
    }



}