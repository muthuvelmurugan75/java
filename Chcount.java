package com.Contacts.www;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Chcount {
public static void main(String[] args) {
	

	String str = "muthu";
	int[] counts = new int[(int) Character.MAX_VALUE];
	// If you are certain you will only have ASCII characters, I would use `new int[256]` instead

	for (int i = 0; i < str.length(); i++) {
	    char charAt = str.charAt(i);
	    counts[(int) charAt]++;
	}

	System.out.println(Arrays.toString(counts));
	for (int i = 0; i < counts.length; i++) {
	    if (counts[i] > 0)
	        System.out.println("Number of " + (char) i + ": " + counts[i]);
	}}
}
