package com.epam.hotelbooking.service.util;

import com.epam.hotelbooking.service.exception.ValidatorException;

public final class Validator {

    public static void validateNumber(int number) throws ValidatorException {
        if (number <= 0) {
            throw new ValidatorException();
        }
    }

}