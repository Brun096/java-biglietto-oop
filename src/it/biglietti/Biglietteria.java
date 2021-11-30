package it.biglietti;
//room 3
import java.util.Scanner;

public class Biglietteria {
public static void main(String[]args) {
	
	Scanner scan=new Scanner(System.in);
	
	int eta;
	int km;
	
	
	
	do{
		
		System.out.print("Inserisci la tua età: ");
		eta = scan.nextInt();
		
	}while(eta>112 || eta<0);
	
		
	do{
		System.out.print("inserisci i kilometri: ");
		km = scan.nextInt();
	}while(km<0);
	
	
	
	
	
	try {
		Biglietto biglietto = new Biglietto(eta, km);
	System.out.println(biglietto.calcolaPrezzo());
	}catch(Exception e) {
		System.out.println(e);
	}
	


	
	
	scan.close();
}
}
