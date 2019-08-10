package day2.java;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	         For loop for String Array
		String Car[]= {"Suzuki","Ford","Honda","BMW"};
		System.out.println("Number of Cars:" +Car.length);
		for(int i=0;i<Car.length;i++)
		{
		System.out.println(" Cars Name: " +Car[i]);
//			For Each for String Array
	}
		for (String CarName : Car) {
			System.out.println(CarName);
			
		}
	}

}
