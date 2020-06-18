package techfios_workbench_progs;
import java.util.*;
import java.util.Scanner;
/*
 * Author: Shayesta Wassay
 * date:JUne 16,2020
 * This program ges a number from the user and checks 500 random number 
 * to find the number equal or less to the user input
 */
public class Find_Rnd {

public static void main(String[] args) {

			Scanner Readme = new Scanner(System.in);
			System.out.println("Enter a number between 1 to 500");
		int num;
		int i_rnd;	
		int sm_num=0;
			num=Readme.nextInt();
			
			int x=1;
			sm_num=num;
//			System.out.println("input"+num);
//			System.out.println("basket"+sm_num);
			
			for (x=1;x<=500;x++){
			
				Random rn = new Random();
				int end=600;
				i_rnd = rn.nextInt(end);
				System.out.println("Random no.="+i_rnd);
				
		if (i_rnd <= num) {
		  if (i_rnd < sm_num) {
				sm_num=i_rnd;
			System.out.println("smallest"+sm_num);}
		  		  			}		
			}
	System.out.println("smallest no.="+ sm_num);
					
			}}
			
