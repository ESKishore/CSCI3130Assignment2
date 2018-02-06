package com.example.saikishoreeppalagudem.pwdtester;

import java.util.regex.Pattern;

/**
 * Created by saikishoreeppalagudem on 2018-02-05.
 */

public class Validator {

    public static boolean validatePassword(String pwd){
       boolean notPassword = false, pwdRegexBool = false;
       //Checks whether the password is not password and returns true if case is satisfied
       if (pwd != "password") {
            notPassword = true;

        }

        //Checks whether the length of the password is 8 characters at least and has one capital letter,
        // one small letter and one special character
        if (pwd.matches("^(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$") == true){
            pwdRegexBool = true;

        }
        return notPassword && pwdRegexBool;

    }

}
