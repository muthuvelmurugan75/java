package com.work.www;
public class ShHtRs
{
 public static void main(String args[]) throws Exception
 {
 // Create Runtime object
 Runtime r=Runtime.getRuntime();

 // Shutdown system
 r.exec("shutdown -s");

 // Restart system
 r.exec("shutdown -r");

 // Shutdown after specific time (here 60 seconds)
 r.exec("shutdown -s -t 60");

 // Restart after specific time (here 60 seconds)
 r.exec("shutdown -r -t 60");

 }
}