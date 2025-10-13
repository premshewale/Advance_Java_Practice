package com.day.two;

import java.util.Scanner;

public class MenuDrivenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test=1;
		while(test == 1){
			
			
		System.out.println("1-for select \t 2-for update\t 3-for Insert\t"
					+ " 4-for Delete");
			System.out.println("5-for exit;");
			 Scanner scanner = new Scanner(System.in);
			 System.out.println("Enter a Number for opration");
			 int inputInt =scanner.nextInt();
			MenuDrivenSelect sc= new MenuDrivenSelect();
			int query =inputInt;
			
				
			switch (inputInt) {
			case 1:
				MenuDrivenSelect sct =new MenuDrivenSelect();
				sct.select();
				break;
			case 2:
				MenuDrivenUpdate up = new MenuDrivenUpdate();
				up.update();
				break;
			case 3:
				MenuDrivenInsert in = new MenuDrivenInsert();
				in.insert();
				break;
			case 4:
				MenuDrivenDelete de = new MenuDrivenDelete();
				de.delete();
				break;
			case 5:
				test=0;
				break;
			default:
				System.out.println("Enter Valid Number");
				break;
			}}
	}}


