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
        MainActivity mainActivity = new MainActivity();
        password = mainActivity.pwd;
        if (v.validatePassword(password) == true)
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
