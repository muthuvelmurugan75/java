package com.Murugan.www;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		TreeMap tm = new TreeMap(); 
		tm.put("a", "raja");
		tm.put("d", "raj");
		tm.put("c", "rajaa");
		System.out.println(tm);
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		System.out.println(tm.ceilingKey("c"));
		System.out.println(tm.floorKey("c"));
		System.out.println(tm.descendingMap());
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm.pollLastEntry());
		
	}

	}


