package org.create;
import java.util.Scanner;

public class Copppy {
public static void main(String args[]) {
	int k[]= {1,2,8,10,5,22,11,6,18,17};
	Scanner Sc=new Scanner(System.in);
	System.out.println("enter the number to check");
	int l=Sc.nextInt();
	boolean v=false;
	for(int b=0;b<k.length;b++) {
		if(l==k[b])
			 v=true;
	}
	System.out.println(v);
	
}		
}



