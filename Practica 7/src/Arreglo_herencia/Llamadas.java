package Arreglo_herencia;

import java.util.Scanner;

public class Llamadas{
	
	public static void llamadas(String[] args) {
		int opcion=0;
		String bird = new String();
		String bird2 = new String();
		Ataque brd[] = new Ataque[3];
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("\nPajaros\n1) Negro \n2) Azul \n3) Rojo \n4) Salir ");
			opcion=sc.nextInt();
			switch(opcion)
			{
				case 1:
					bird="(Grande)";
					bird2 = "Bomb";
					brd[0]= new Ataque(bird,bird2);
					brd[0].especiales();
					break;
				case 2:
					bird="(Chico)";
					bird2="Hielo";
					brd[1]= new Ataque(bird,bird2);
					brd[1].especiales();
					break;
				case 3:
					bird="(Mediano)";
					bird2="Super";
					brd[2] = new Ataque(bird,bird2);
					brd[2].especiales();
					break;
				case 4:
					System.out.println("¡¡¡Gracias por utilizar este programa!!!");
					break;
				default:
					break;
			}
		}while(opcion!=4);
	}
	
}
