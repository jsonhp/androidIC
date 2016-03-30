package com.apps.jsonhp.helloworld;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jeisson_herrera on 30/03/16.
 */
public class MainActivityTest extends TestCase{

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