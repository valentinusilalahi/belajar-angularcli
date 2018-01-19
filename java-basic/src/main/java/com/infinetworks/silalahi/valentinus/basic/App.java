package com.infinetworks.silalahi.valentinus.basic;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(valueOf(true));
    }
    
    public static Boolean valueOf(boolean b)
    {
    	return b ? Boolean.TRUE : Boolean.FALSE;
    }
}
