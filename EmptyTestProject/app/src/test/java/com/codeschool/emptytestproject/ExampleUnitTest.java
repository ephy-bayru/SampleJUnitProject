package com.codeschool.emptytestproject;

import android.util.Log;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testDetailActivityClassExists() throws Exception {
        Object object = null;
        try {
            Class<?> aClass = Class.forName("com.codeschool.emptytestproject.DetailActivity");
            Constructor<?> constructor = aClass.getConstructor();
            object = constructor.newInstance();
        } catch (ClassNotFoundException e) {
            Log.e("ExampleUnitTest", e.getMessage());
        }

        assertNotEquals(object, null);
    }

    @Test
    public void testDetailActivityAdditionMethodExists() throws Exception {
        Class<?> aClass = null;
        Method aMethod = null;
        try {
            aClass = Class.forName("com.codeschool.emptytestproject.DetailActivity");
        } catch (ClassNotFoundException e) {
            Log.e("ExampleUnitTest", e.getException().getMessage());
        }

        if (aClass == null) {
            assertNotEquals(aClass, null);
            return;
        }
        else {
            try {
                Class[] args = new Class[2];
                args[0] = Integer.TYPE; // TYPE used instead of .class for primitives (I think)
                args[1] = Integer.TYPE;
                aMethod = aClass.getMethod("add", args);

            } catch (NoSuchMethodException e) {
                Log.e("ExampleUnitTest", e.getMessage());
            }

            assertNotEquals(aMethod, null);
        }
    }
}