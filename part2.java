package Discrete_lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class part2 {

	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the universal");
		int l = in.nextInt();
		in.nextLine(); // Consume the newline character

		String[] universal = new String[l];
		System.out.println("Enter the elements of the universal");
		 String sin = in.nextLine().replaceAll("\\[|\\]","");
	    	 universal = sin.split(",");
	    	String []univ=new String[l];
	    	int c=0,f=0;
	    	for(int i=0;i<l;i++)
	    	{
	    		for(int j=0;j<c;j++)
	    		{
	    			if(universal[i].equals(univ[j]))
	    			{
	    				f=1;
	    				break;
	    			}
	    			
	    			
	    		}
	    		if(f==0)
	    		{
	    			univ[c++]=universal[i];
	    		}
	    		f=0;
	    		
	    	}
	  String []uni=new String[c];
	    	for(int i=0;i<c;i++)
	    	{
	    		uni[i]=univ[i];
	    	}
	
	 
		System.out.println("Enter the number of subsets");
		int s = in.nextInt();
		in.nextLine(); // Consume the newline character

		set[] subsets = new set[s];
		for (int i = 0; i < s; i++) {
		    subsets[i] = new set(uni);
		}

		for (int i = 0; i < s; i++) {
		    System.out.println("Enter the size of subset number " + (i + 1));
		    int ss = in.nextInt();
		    in.nextLine(); // Consume the newline character

		    System.out.println("Enter the elements of the subset");
		  
		    	 String sin1 = in.nextLine().replaceAll("\\[|\\]","");
		    	 String[] h = sin1.split(",");
		    	 for(int j=0;j<ss;j++)
		    	 {
		    		 subsets[i].addstring(h[j]);
		    	 }
		    
		}
		while(true)
		{
			System.out.println("choose an operation");
			System.out.println("1) Union of two sets");
			System.out.println("2) Intersection of two sets");
			System.out.println("3) Complement of a set");
			System.out.println("4)Difference between two sets");
			System.out.println("5)Cardinality of a set");
			System.out.println("6)Print a set");
			int choice=in.nextInt();
			if(choice==1)
			{
				System.out.println("enter the number of the sets");
				int x=in.nextInt();
				int y=in.nextInt();
				set u=subsets[x-1].union(subsets[y-1]);
				LinkedList<String> ll=u.get_elements();
				Object[] a=ll.toArray();
				  Collections.reverse(Arrays.asList(a)); 
			        System.out.println(Arrays.asList(a)); 
				
			}
			else if(choice==2)
			{
				System.out.println("enter the number of the sets");
				int x=in.nextInt();
				int y=in.nextInt();
				set u=subsets[x-1].intersection(subsets[y-1]);
				LinkedList<String> ll=u.get_elements();
				Object[] a=ll.toArray();
				  Collections.reverse(Arrays.asList(a)); 
			        System.out.println(Arrays.asList(a)); 
			}
			else if(choice==3)
			{
				System.out.println("enter the number of the set");
				int x=in.nextInt();
				set u=subsets[x-1].complement();
				LinkedList<String> ll=u.get_elements();
				Object[] a=ll.toArray();
				  Collections.reverse(Arrays.asList(a)); 
			        System.out.println(Arrays.asList(a)); 
			}
			else if(choice==4)
			{
				System.out.println("enter the number of the sets");
				int x=in.nextInt();
				int y=in.nextInt();
				set u=subsets[x-1].difference(subsets[y-1]);
				LinkedList<String> ll=u.get_elements();
				Object[] a=ll.toArray();
				  Collections.reverse(Arrays.asList(a)); 
			        System.out.println(Arrays.asList(a)); 
			}
			else if(choice==5)
			{
				System.out.println("enter the number of the set");
				int x=in.nextInt();
				long u=subsets[x-1].cardinality();
				System.out.println("The cardinality is "+u);
			}
			else
			{
				System.out.println("enter the number of the set");
				int x=in.nextInt();
				LinkedList<String> ll=subsets[x-1].get_elements();
				Object[] a=ll.toArray();
				  Collections.reverse(Arrays.asList(a)); 
			        System.out.println(Arrays.asList(a)); 
			}

		}
	
	}
}