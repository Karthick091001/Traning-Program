package org.eg1;
import java.util.Scanner;

public class WhileEg {
	public static void main(String[] args) {    
		// TODO Auto-generated method stub    
		Scanner k=new Scanner(System.in); 
		System.out.println("Enter the Number:");
			int i=k.nextInt();
			k.close();
		while(i<=10) {    
		System.out.println(i);    
		i = i + 2;    
		}    
		}    
		}    

