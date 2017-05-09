package com.practiceprograms.www;
public class ReentrantExample extends Reentrant{  
public static void main(String args[]){  
final ReentrantExample re=new ReentrantExample();  
  
Thread t1=new Thread(){  
public void run(){  
 re.m();  //calling method of Reentrant class  
}  
};  
t1.start();  
}}  