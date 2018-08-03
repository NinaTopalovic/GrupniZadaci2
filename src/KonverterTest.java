import java.util.Scanner;

public class KonverterTest {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		Konverter konverter=new Konverter();
		
		System.out.println("Na raspolaganju imate sljedece konverzije: ");
		System.out.println("1. Iz kilograma u funte");
		System.out.println("2. Iz funta u kilograme");
		System.out.println("3. Iz centimetara u inche");
		System.out.println("4. Iz incha u centimetre");
		System.out.println("5. Iz celzijusa u farenhajte");
		System.out.println("6. Iz farenhajta u celzijuse");
	    System.out.println("Koju konverziju zelite izvrsiti: ");
	    
        int zeljenaKonverzija=unos.nextInt();	
        
        switch(zeljenaKonverzija) {
        
        case 1: {
        	System.out.println("Izabrali ste konverziju iz kilograma u funte.");
        	System.out.print("Unesite kilograme: ");
        	double a=unos.nextDouble();
        	while(a<0) {
        		System.out.println("Kilogrami moraji biti veci od 0!");
        		System.out.print("Ponovo unesite kilograme: ");
        		a=unos.nextDouble();
        	}
        	
        	double rezultat=konverter.kilogramiUFunte(a);
        	System.out.println("Rezultat: " + rezultat);
        } break;
        
        case 2: {
        	System.out.println("Izabrali ste konverziju iz funta u kilograme.");
        	System.out.print("Unesite funte: ");
        	double a=unos.nextDouble();
        	while(a<0) {
        		System.out.println("Funte moraji biti veci od 0!");
        		System.out.print("Ponovo unesite funte: ");
        		a=unos.nextDouble();
        	}
        	
        	double rezultat=konverter.funteUKilograme(a);
        	System.out.println("Rezultat: " + rezultat);
        } break;
        
        case 3: {
        	System.out.println("Izabrali ste konverziju iz centimetara u inche.");
        	System.out.print("Unesite centimetre: ");
        	double a=unos.nextDouble();
        	while(a<0) {
        		System.out.println("Centimetri moraji biti veci od 0!");
        		System.out.print("Ponovo unesite centimetre: ");
        		a=unos.nextDouble();
        	}
        	
        	double rezultat=konverter.centimetriUInch(a);
        	System.out.println("Rezultat: " + rezultat);
        } break;
        
        case 4: {
        	System.out.println("Izabrali ste konverziju iz incha u centimetre.");
        	System.out.print("Unesite inche: ");
        	double a=unos.nextDouble();
        	while(a<0) {
        		System.out.println("Inchi moraji biti veci od 0!");
        		System.out.print("Ponovo unesite inche: ");
        		a=unos.nextDouble();
        	}
        	
        	double rezultat=konverter.inchUCentimetre(a);
        	System.out.println("Rezultat: " + rezultat);
        } break;
        
        case 5: {
        	System.out.println("Izabrali ste konverziju iz celzijusa u farenhajte.");
        	System.out.print("Unesite celzijuse: ");
        	double a=unos.nextDouble();
        	
        	
        	double rezultat=konverter.celzijusUFarenhajt(a);
        	System.out.println("Rezultat: " + rezultat);
        } break;
        
        case 6: {
        	System.out.println("Izabrali ste konverziju iz farenhajta u celzijuse.");
        	System.out.print("Unesite farenhajte: ");
        	double a=unos.nextDouble();
        	
        	double rezultat=konverter.farenhajtUCelzijuse(a);
        	System.out.println("Rezultat: " + rezultat);
        } break;
        
        default: System.out.println("Izabrali ste nepostojecu konverziju!!");
        }

	}


	}


