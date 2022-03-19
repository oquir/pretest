package com.tdea.pretest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PretestApplicationTests {

    @Test
    void ispassworequals() {
        String dbPassword = "hola";
        String Password = "hola";

        boolean result = UserUtils.isPasswordEqual(dbPassword, Password);
        assertTrue(result);

    }
}
