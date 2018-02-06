package com.example.saikishoreeppalagudem.pwdtester;

/**
 * Created by saikishoreeppalagudem on 2018-02-05.
 */

public class Validator {

    public static boolean validatePassword(String pwd){
       boolean notPassword = false, pwdLen = false;
        if ((pwd != "password") && (pwd.length()>8)) {
            notPassword = true;
            pwdLen = true;
        }
        return notPassword && pwdLen;

    }

}
