package com.apps.jsonhp.helloworld;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class MainActivityTest {

    MainActivity ma;

    @Before
    public void setUp() throws Exception {
        ma = new MainActivity();
    }

    @Test
    public void testSumar() throws Exception {
        assertEquals(ma.sumar(2,2), 4,0);
    }

}