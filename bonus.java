package Discrete_lab1;

import java.util.Scanner;

public class bonus {
    public void findUnique(int[] nums) {
        int x = 0;
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            x = x ^ nums[i];
        }
        int rightmost_set_bit = x & (-x);
        int n1 = 0, n2 = 0;

        for (int i = 0; i < l; i++) {
            if ((rightmost_set_bit & nums[i]) != 0) {
                n1 = n1 ^ nums[i];
            } else {
                n2 = n2 ^ nums[i];
            }
        }
        System.out.println("The two unique numbers are " + n1 + " and " + n2);
    }

    public static void main(String[] args) {
        bonus x = new bonus();
         Scanner scan= new Scanner(System.in);
         System.out.println("enter size of array");
         int l=scan.nextInt();
         System.out.println("enter the elements");
         int []nums=new int[l];
         for(int i=0;i<l;i++)
         {
        	 nums[i]=scan.nextInt();
         }
         x.findUnique(nums);
        
    }
}
