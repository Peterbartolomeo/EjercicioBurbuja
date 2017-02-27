import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Lista a = new Lista();
		
		Scanner teclado = new Scanner (System.in);

		System.out.println ("Numero de numeros aleatorios: ");
		Integer rango = teclado.nextInt();

		System.out.println(rango);
		
		for(int num=0;num<=rango;num++){
			int aux =(int) (Math.random()*100+1);
			a.insertarFinal(aux);
		}
	
		a.imprimirDatos();
		
		long time_start, time_end;
		time_start = System.currentTimeMillis();
		a.ordenarBurbuja();
		time_end = System.currentTimeMillis();
		
		
		
		System.out.println("\n");
		a.imprimirDatos();
		System.out.println("\n");
		System.out.println("El ordenamiento duro\n"+ ( time_end - time_start ) +" milliseconds");
		
		
		
		
	}

}
