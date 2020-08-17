package com.rehansqapoint.regeximpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REgexImpl {
    public static void main(String[] args) {

        //write the input string
        String str = "I placed an order, and i am acknowledged with the message as Transaction id             :785962 Generated";
        // write the pattern
        String ptrn = "Transaction id\\s*\\:[0-9]*";
        // compile the pattern
        Pattern pattern = Pattern.compile(ptrn);

        Matcher matcher=pattern.matcher(str);

        while(matcher.find()){
            System.out.println(matcher.group());
            break;
        }



    }
}
