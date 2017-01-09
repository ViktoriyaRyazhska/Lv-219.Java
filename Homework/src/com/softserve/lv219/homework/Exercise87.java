package com.softserve.lv219.homework;
import java.util.*;
public class Exercise87 implements Executable {
   @Override
   public void execute(){
	   Scanner sc=new Scanner(System.in);
	   int n,m;
	   n=sc.nextInt();
	   m=sc.nextInt();
	   if(Integer.toString(n).length()<m){
		   System.out.print("Wrong input!");
		   return;
	   }
	   int sum=0;
	   for(int i=0;i<m;++i){
		   sum+=n%10;
		   n/=10;
	   }
	   sc.close();
	   System.out.println("The result is:");
	   System.out.println(sum);
	   
   }
}
