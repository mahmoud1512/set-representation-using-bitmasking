package Discrete_lab1;

import java.util.Scanner;

public class part1 {
	  
	long getbit(long number,long position)
	{
		number=number>>position;
		return number&1;             //done;
	}
	long setbit(long number,long position)
	{
		long temp=1<<position;
		number=number|temp;
		return number;   //done
	}
	long clearbit(long number,long position)
	{
		long temp=1<<position;
		temp=~temp;
		number=number&temp;
		return number;           //done
	}
	long updatebit(long number,long position,boolean value)
	{
		if(value==true)
		{
			number=setbit(number,position);
		}
		else
		{
			number=clearbit(number,position);
		}
		return number;
	}
	public static void main(String[] args) {
              part1 x=new part1();
           while(true)
           {
        	   System.out.println("choose an operation");
               System.out.println("1-getbit");
               System.out.println("2-setbit");
               System.out.println("3-clearbit");
               System.out.println("4-updatebit");
               long num;
               Scanner in=new Scanner(System.in);
               num=in.nextLong();
               if(num==1)
               {
             	  System.out.println("enter a number and a position respectively");
             	  long number,position;
             	  number=in.nextLong();
             	  position=in.nextLong();
             	  System.out.println(x.getbit(number, position));
             }
               else if(num==2)
               {
             	  System.out.println("enter a number and a position respectively");
             	  long number,position;
             	  number=in.nextLong();
             	  position=in.nextLong();
             	  System.out.println(x.setbit(number, position));
               }
               else if(num==3)
               {
             	  System.out.println("enter a number and a position respectively");
             	  long number,position;
             	  number=in.nextLong();
             	  position=in.nextLong();
             	  System.out.println(x.clearbit(number, position));
               }
               else if(num==4)
               {
             	  System.out.println("enter a number and a position and a logic value respectively");
             	  long number,position;
             	  boolean value;
             	  number=in.nextLong();
             	  position=in.nextLong();
             	  value=in.nextBoolean();
             	  System.out.println(x.updatebit(number, position,value));
               }
               else
               {

             	  System.out.println("NOT SUPPORTED");
               }
           }
             
	}

}
