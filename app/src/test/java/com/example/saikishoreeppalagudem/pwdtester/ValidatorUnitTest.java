package com.example.saikishoreeppalagudem.pwdtester;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by saikishoreeppalagudem on 2018-02-05.
 */

public class ValidatorUnitTest {

    public String password;
    @Test
    public void PwdIsOK(){
        Validator v = new Validator();
        Boolean a;

        //To check whether the Validator class is functioning as desired.
        //I've passed a password string "Text1234$$" to check the functionality.
        if (v.validatePassword("Text1234$$") == true)
        {
            a = true;
        }
        else
        {
            a = false;
        }
        assertTrue("True" , a);
    }
}
