package com.company;

import java.io.IOException;
import java.text.ParseException;

public class ExceptionTesting {

    public void exceptionTest () throws ParseException, IOException {

        //throw new IOException();
        throw new ParseException("Parse Error in class", 2);

    }

}