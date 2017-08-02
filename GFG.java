package com.Contacts.www;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
 
public class GFG
{
    public static void main(String[] args)
    {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
 
        Integer[] arr = new Integer[al.size()];
        arr = al.toArray(arr);
 
        for (Integer x : arr)
            System.out.print(x + " ");
    }
}