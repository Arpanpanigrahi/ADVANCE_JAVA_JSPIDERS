package jdbc_02;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		System.out.println("1) ADD CAR");
		System.out.println("2) VIEW CAR");
		System.out.println("3) UPDATE CAR");
		System.out.println("4) DELETE CAR");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		int c = sc.nextInt();
		CarCRUD crud = new CarCRUD();
		switch(c) {
		
		case 1:{
			System.out.println("Enter car name");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter the price");
			double price = sc.nextDouble();
			System.out.println("Enter color");
			sc.nextLine();
			String color = sc.nextLine();
			
			boolean res = crud.saveCar(name, price, color);
			if(res) {
				System.out.println("car data saved successfully");
			} else {
				System.out.println("something went wrong");
			}
		}break;
		
		case 2:{
			crud.viewCar();
		}break;
		}
	}
}

	