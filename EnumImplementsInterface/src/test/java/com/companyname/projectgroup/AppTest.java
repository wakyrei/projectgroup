package com.companyname.projectgroup;

import com.companyname.EnumImplementInterface.EwalletEnum;
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
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        System.out.println(EwalletEnum.CX_COIN.getTransactionId());
        System.out.println(EwalletEnum.DIS_COIN.getTransactionId());
        System.out.println(EwalletEnum.NET_COIN.getTransactionId());
        assertTrue( true );
    }
}
