package assignment2;

import java.util.Scanner;
public class assignment2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//forloop
		for (int i=0; i<1;i++) {
			System.out.print("Customer name: ");
			String name = in.next();
			System.out.print("Age customer: ");
			int age = in.nextInt();
			System.out.print("Gender customer: ");
			String gender = in.next();
			System.out.print("Phone customer:");
			String phone = in.next();
			System.out.println();
		
			System.out.print("Product of cake:1. ");
			String cake1 = in.next();
			System.out.print("Product of cake:2. ");
			String cake2 = in.next();
			System.out.print("Product of cake:3. ");
			String cake3 = in.next();
			System.out.println();
		
			System.out.print("Price of a "+cake1+ " cake:RM ");
			int pcake1 = in.nextInt();
			System.out.print("Price of a "+cake2+ " cake:RM ");
			int pcake2 = in.nextInt();
			System.out.print("Price of a "+cake3+ " cake:RM ");
			int pcake3 = in.nextInt();
			System.out.println();
		
			System.out.print("Quantity of "+cake1+ " cake:");
			int qcake1 = in.nextInt();
			System.out.print("Quantity of "+cake2+ " cake:");
			int qcake2 = in.nextInt();
			System.out.print("Quantity of "+cake3+ " cake:");
			int qcake3 = in.nextInt();
			System.out.println();
		
	
		double sum, dis, paid;
		sum = (pcake1*qcake1)+(pcake2*qcake2)+(pcake3*qcake3);
		
		if(sum>0 && sum<=200) {
			System.out.println("Total price: RM"+sum);
			System.out.println("No discount given.");
			System.out.println("Total paid: RM"+sum);
		}else if (sum > 200 && sum <=400) {//if sum more than 200 got 10% discount
			paid = sum * 90/100;
			dis = sum - paid;
			System.out.println("Total price: RM"+sum);
			System.out.println("Total discount given: RM"+dis);
			System.out.println("Total paid: RM"+paid);
		}else if (sum > 400 && sum <=600) {//if sum more than 400 got 20% discount
			paid = sum * 80/100;
			dis = sum - paid;
			System.out.println("Total price: RM"+sum);
			System.out.println("Total discount given: RM"+dis);
			System.out.println("Total paid: RM"+paid);
		}else if (sum > 600) {//if sum more than 600 got 30% discount
			paid = sum * 70/100;
			dis = sum - paid;
			System.out.println("Total price: RM"+sum);
			System.out.println("Total discount given: RM"+dis);
			System.out.println("Total paid: RM"+paid);
		}
		
		}
		System.out.println("-------------------------------------");
		//while loop
		int j=0;
		while(j<1) {
			System.out.print("2. Customer name: ");
			String name = in.next();
			System.out.print("Age customer: ");
			int age = in.nextInt();
			System.out.print("Gender customer: ");
			String gender = in.next();
			System.out.print("Phone customer:");
			String phone = in.next();
			System.out.println();
		
			System.out.print("Product of cake:1. ");
			String cake1 = in.next();
			System.out.print("Product of cake:2. ");
			String cake2 = in.next();
			System.out.print("Product of cake:3. ");
			String cake3 = in.next();
			System.out.println();
		
			System.out.print("Price of a "+cake1+ " cake:RM ");
			int pcake1 = in.nextInt();
			System.out.print("Price of a "+cake2+ " cake:RM ");
			int pcake2 = in.nextInt();
			System.out.print("Price of a "+cake3+ " cake:RM ");
			int pcake3 = in.nextInt();
			System.out.println();
		
			System.out.print("Quantity of "+cake1+ " cake:");
			int qcake1 = in.nextInt();
			System.out.print("Quantity of "+cake2+ " cake:");
			int qcake2 = in.nextInt();
			System.out.print("Quantity of "+cake3+ " cake:");
			int qcake3 = in.nextInt();
			System.out.println();
		
	
		double sum, dis, paid;
		sum = (pcake1*qcake1)+(pcake2*qcake2)+(pcake3*qcake3);
		
		if(sum>0 && sum<=200) {
			System.out.println("Total price: RM"+sum);
			System.out.println("No discount given.");
			System.out.println("Total paid: RM"+sum);
		}else if (sum > 200 && sum <=400) {//if sum more than 200 got 10% discount
			paid = sum * 90/100;
			dis = sum - paid;
			System.out.println("Total price: RM"+sum);
			System.out.println("Total discount given: RM"+dis);
			System.out.println("Total paid: RM"+paid);
		}else if (sum > 400 && sum <=600) {//if sum more than 400 got 20% discount
			paid = sum * 80/100;
			dis = sum - paid;
			System.out.println("Total price: RM"+sum);
			System.out.println("Total discount given: RM"+dis);
			System.out.println("Total paid: RM"+paid);
		}else if (sum > 600) {//if sum more than 600 got 30% discount
			paid = sum * 70/100;
			dis = sum - paid;
			System.out.println("Total price: RM"+sum);
			System.out.println("Total discount given: RM"+dis);
			System.out.println("Total paid: RM"+paid);
		} 
			j++;
	
		}
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println();
		
		//do while loop
		int k=0;
		do {
			System.out.print("3. Customer name: ");
			String name = in.next();
			System.out.print("Age customer: ");
			int age = in.nextInt();
			System.out.print("Gender customer: ");
			String gender = in.next();
			System.out.print("Phone customer:");
			String phone = in.next();
			System.out.println();
		
			System.out.print("Product of cake:1. ");
			String cake1 = in.next();
			System.out.print("Product of cake:2. ");
			String cake2 = in.next();
			System.out.print("Product of cake:3. ");
			String cake3 = in.next();
			System.out.println();
		
			System.out.print("Price of a "+cake1+ " cake:RM ");
			int pcake1 = in.nextInt();
			System.out.print("Price of a "+cake2+ " cake:RM ");
			int pcake2 = in.nextInt();
			System.out.print("Price of a "+cake3+ " cake:RM ");
			int pcake3 = in.nextInt();
			System.out.println();
		
			System.out.print("Quantity of "+cake1+ " cake:");
			int qcake1 = in.nextInt();
			System.out.print("Quantity of "+cake2+ " cake:");
			int qcake2 = in.nextInt();
			System.out.print("Quantity of "+cake3+ " cake:");
			int qcake3 = in.nextInt();
			System.out.println();
		
	
		double sum, dis, paid;
		sum = (pcake1*qcake1)+(pcake2*qcake2)+(pcake3*qcake3);
		
		if(sum>0 && sum<=200) {
			System.out.println("Total price: RM"+sum);
			System.out.println("No discount given.");
			System.out.println("Total paid: RM"+sum);
		}else if (sum > 200 && sum <=400) {//if sum more than 200 got 10% discount
			paid = sum * 90/100;
			dis = sum - paid;
			System.out.println("Total price: RM"+sum);
			System.out.println("Total discount given: RM"+dis);
			System.out.println("Total paid: RM"+paid);
		}else if (sum > 400 && sum <=600) {//if sum more than 400 got 20% discount
			paid = sum * 80/100;
			dis = sum - paid;
			System.out.println("Total price: RM"+sum);
			System.out.println("Total discount given: RM"+dis);
			System.out.println("Total paid: RM"+paid);
		}else if (sum > 600) {//if sum more than 600 got 30% discount
			paid = sum * 70/100;
			dis = sum - paid;
			System.out.println("Total price: RM"+sum);
			System.out.println("Total discount given: RM"+dis);
			System.out.println("Total paid: RM"+paid);
		} 
		k++;
		
		}while(k<1);
	
	
	}
}
