package com.practiceprograms.www;





public class ThreadTest extends Thread
{
  public void run()
  {
    try
    {
      // Displaying the thread that is running
      System.out.println ("Thread " +
                Thread.currentThread().getId() +
                " is running");
 
    }
    catch (Exception e)
    {
      // Throwing an exception
      System.out.println ("Exception is caught");
    }
  }

 


  public static void main(String[] args)
  {
    int n = 8;
    for (int i=0; i<n; i++)
    {
      ThreadTest object = new ThreadTest();
      
      object.start();
    }}}