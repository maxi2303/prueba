package clase2;

import java.util.Scanner;

public class GuiaIf {

	public static void Ejercicio3(){
		int edad;
		System.out.println("ingrese edad");
		Scanner s= new Scanner(System.in);
		edad=Integer.parseInt(s.nextLine());
		if (edad<=18)
		{System.out.println("es menor de edad");
		}
		else
		{System.out.println("es mayor de edad");
		}
		}	

		
// */ejercicio4 /*

	public static void ejercicio4 (){
		
		int edad;
		
		System.out.println("ingrese edad");
		
		Scanner s = new Scanner(System.in);
		
		edad=Integer.parseInt(s.nextLine());
		
		if (edad>=13 && edad<=17)
		{ 
			System.out.println("son adolecentes");
		}
		else
		{
		    System.out.println("no son adolecentes");
		}
	}

// */ejercicio5/*
	
	public static void ejercicio5(){
		
		int edad;
		
		System.out.println("ingrese edad");
		
		Scanner s=new Scanner(System.in);
		
		edad=Integer.parseInt(s.nextLine());
		
		if (edad>=13 || edad<=17)
		{
			System.out.println("no son adolecentes");
		
		}
			
			
	}
	    
			// */ejercicio6/*


    public static void ejercicio6(){
		
		int edad;
		
		System.out.println("ingrese edad");
		
		Scanner s=new Scanner(System.in);
		
		edad=Integer.parseInt(s.nextLine());
		
		if (edad>=18) 
		   {
			
			System.out.println("es mayor de edad");
			
			}
		else
		{
			if (edad<13)
	
			{
				System.out.println("es menor");
			}
			else
			{
				System.out.println("son adolecentes");
			}
		}
}
		
}


