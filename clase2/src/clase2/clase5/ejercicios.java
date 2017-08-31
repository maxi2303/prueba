package clase5;

import java.util.Scanner;

public class ejercicios {

	public static void ejercicio1() {
		
		// TODO Auto-generated method stub


		int i=1;
		
		while (i<=10)
		{
			
			System.out.println(i);
			i=i+1;
		}
	}
	


// */ejercicio2/*


public static void ejercicio2(){
	
	
	
	int i=10;
	
	while (i>=1)
		
	{
			System.out.println(i);
			i=i-1;
}
	
	
}

// */ejercicio3/*
public static void ejercicio3(){
	
	String clave;
	
	Scanner s=new Scanner(System.in);
	

	System.out.println("ingrese la clave");
	clave=s.nextLine();
	
	
	
	while ( !clave.equals("utn750") ){
		System.out.println("ingrese nuevamente la clave");
		clave=s.nextLine();
	}
	
	{	
		System.out.println("entro");
		clave=s.nextLine();
	}
}

// */ejercicio4/*


public static void ejercicio4(){

	int num;
	
	Scanner s= new Scanner(System.in);
	
	System.out.println("ingrese un numero del 1 al 9");
	num=Integer.parseInt(s.nextLine());
	
	while( (num>=1) && (num<=9)){
		System.out.println("ingreso valido");
         num=Integer.parseInt(s.nextLine());

	}
	{
System.out.println("ingrese nuevamente ");
	}
}

// */ejercicio5/*

public static void ejercicio5(){
	
	String  sexo;	

 Scanner s= new Scanner (System.in);
 
 while((sexo.equals("f")) ||(sexo.equals("m")){
	 System.out.println("femenino");
 }
 
 

}
}