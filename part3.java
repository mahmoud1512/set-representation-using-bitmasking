package Discrete_lab1;

import java.util.Scanner;

public class part3 {
     int nonrepeated_num(int []nums)
     {
    	 int l=nums.length;
    	 int number=0;
    	 for(int i=0;i<l;i++)
    	 {
    		 number=number^nums[i];
    	 }
    	 
		return number;
    	 
     }
     long bits(long number)
     {
    	 long count=0;
    	 int i=0;
    	 part1 h=new part1();
    	 while(number!=0)
    	 {
    		 count=count+h.getbit(number, 0);
    		 number=number>>1;
    	     
    	 }
    	 return count;
     }
	public static void main(String[] args) {
		
		part3 sol=new part3();
		while(true)
		{
			System.out.println("1-find the unique element in array");
			System.out.println("2-find the number of 1 bits in a number");
			Scanner in=new Scanner(System.in);
			int choose=in.nextInt();
			if(choose==1)
			{
				System.out.println("enter the array length");
				int l=in.nextInt();
				int[] nums=new int[l];
				System.out.println("enter the array elements");
				for(int i=0;i<l;i++)
				{
					nums[i]=in.nextInt();
				}
				
				System.out.println("the unique number is= " );
				System.out.print(sol.nonrepeated_num(nums));
				System.out.println("");
				
			}
			else if(choose==2)
			{
				System.out.println("enter an unsigned int");
				int num;
				num=in.nextInt();
				System.out.println("number of 1 bits = ");
				System.out.println(sol.bits(num));
				
			}
			
		}
		
	}

}
