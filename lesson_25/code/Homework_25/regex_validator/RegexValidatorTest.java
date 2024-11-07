package Homework_25.regex_validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegexValidatorTest {
    @Test
    public  void testValidCreditCard(){
        assertTrue(RegexValidator.isValidCreditCard("12345678"));
        assertTrue(RegexValidator.isValidCreditCard("123456789354667"));
        assertFalse(RegexValidator.isValidCreditCard("1234"));
        assertFalse(RegexValidator.isValidCreditCard("1324356768799886756556757585575"));
    }

    @Test

    public void testValidDateDDMMYYYY() {
        assertTrue(RegexValidator.isValidDateDDMMYYYY("31.12.2000"));
        assertTrue(RegexValidator.isValidDateDDMMYYYY("01.01.2024"));
        assertFalse(RegexValidator.isValidDateDDMMYYYY("32.11.2020"));
        assertFalse(RegexValidator.isValidDateDDMMYYYY("11-11-2020"));
    }

    @Test
    public void testValidPhoneNumber(){
        assertTrue(RegexValidator.isValidPhoneNumber("+99(99)9999-9999"));
        assertFalse(RegexValidator.isValidPhoneNumber("99(99)9999-9999"));
        assertFalse(RegexValidator.isValidPhoneNumber("+99(99)99999-9999"));
        assertFalse(RegexValidator.isValidPhoneNumber("+99(999)9999-9999"));
    }
// //   @Test
//    public void testValidNumberLessThan255(){
//        assertTrue(RegexValidator.isValidNumberLessThan255("0"));
//        assertTrue(RegexValidator.isValidNumberLessThan255("255"));
//        assertFalse(RegexValidator.isValidNumberLessThan255("257"));
//        assertFalse(RegexValidator.isValidNumberLessThan255("-1"));
//    }
//

}
