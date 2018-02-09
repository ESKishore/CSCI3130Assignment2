package com.example.saikishoreeppalagudem.pwdtester;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Created by saikishoreeppalagudem on 2018-02-09.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityEspressoTest {
@Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

@Test
    public void testTypeText(){
    //Test method to check whether text is being typed in the text box properly
        onView(withId(R.id.editText)).perform(typeText("RandomText"));
        closeSoftKeyboard();
        onView(withId(R.id.editText)).check(matches(withText("RandomText")));
    }

    @Test
    public void testBtnClick(){
        //Test method to check whether button is functioning properly
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("Weak")));
    }
}
