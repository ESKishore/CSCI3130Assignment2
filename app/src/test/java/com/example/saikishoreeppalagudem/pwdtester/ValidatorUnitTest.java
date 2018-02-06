package com.example.saikishoreeppalagudem.pwdtester;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by saikishoreeppalagudem on 2018-02-05.
 */

public class ValidatorUnitTest {
    @Test
    public void PwdIsOK(){
        Boolean a;
        MainActivity mainActivity = new MainActivity();
        if (Validator.validatePassword("kishore123") == true)
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
