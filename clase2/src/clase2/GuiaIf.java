package clase2;

import java.util.Scanner;

public class GuiaIf {

	public static void Ejercicio1(){
		int edad;
		System.out.println("ingrese edad");
		Scanner s= new Scanner(System.in);
		edad=Integer.parseInt(s.nextLine());
		if (edad<=18)
		{System.out.println("es menor de edad");
		}
		else
		{
			System.out.println("es mayor de edad");
		}
		}
		
// */ejercicio2 /*

	public static void ejercicio2 (){
		
		int edad;
		
		System.out.println("ingrese edad");
		
		Scanner s = new Scanner(System.in);
		
		edad=Integer.parseInt(s.nextLine());
		
		if (edad>13)	
		{
			System.out.println("niños");
		}
		
		if (edad>=17)
		{
			System.out.println("adultos");
		}
		else 
		{
			System.out.println("son adolecentes");
		}
	}






}