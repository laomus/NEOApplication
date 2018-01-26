package com.neo.app.NeoApp;

import com.neo.service.impl.NeoServiceTest;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
    	
        super( testName );
        System.out.println(" 1ist of nearest asteroids:");
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
    	return new TestSuite(NeoServiceTest.class);
       
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	System.out.println("2 ist of nearest asteroids:");
        assertTrue( true );
    }
}
