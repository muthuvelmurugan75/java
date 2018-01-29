package tricky;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.PriorityQueue;

import javax.sound.sampled.*;

public class QueueProgram {
public static void main(String[] args) {
	PriorityQueue pq=new PriorityQueue();
	
	for(int i=0;i<=10;i++){
			pq.offer(i);
	}
	System.out.println(pq);

	System.out.println(pq.poll());
	System.out.println(pq);
}		 
			
		}
			
			
			
		
		


