package javaPracticeProject;

import java.util.Scanner;

public class ShortName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter full name::::::");
		String DOTT=".";
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Input name is::::"+name);
		
		String surname_initial=name.substring(0,1).toUpperCase()+DOTT;
		System.out.println("surname_initial::::"+surname_initial);
		String[] nameSplits = name.split(" ");
		String name_Intial_cap=nameSplits[1].substring(0, 1).toUpperCase();
		System.out.println(":::final name::::::::::::"+surname_initial+name_Intial_cap+nameSplits[1].substring(1));
		
		

	}

}
