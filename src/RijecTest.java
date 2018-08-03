import java.util.Scanner;

public class RijecTest {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		Rijec rijec=new Rijec();
		
		System.out.println("Unesite neki string!");
		String korisnikovUnos=unos.nextLine();
		System.out.println();
		System.out.println("Koju operaciju zelite da izvrsite?");
		System.out.println();
		System.out.println("1. Duzina Stringa");
		System.out.println("2. Karakteri na parnim pozicijama");
		System.out.println("3. Karakteri na neparnim pozicijama");
		System.out.println("4. Broj veliki slova");
		System.out.println("5. Broj malih slova");
        System.out.println("6. Broj karaktera koji nisu slova");
        System.out.println("7. Izlaz iz aplikacije");
        System.out.println();
        
        for(int i=0; i<1000; i++) {
        	System.out.println("Birajte: ");
        
        int zeljenaOperacija=unos.nextInt();
        
        switch(zeljenaOperacija) {
        
        case 1: {
        	
        	int duzina=rijec.duzinaStringa(korisnikovUnos);
        	System.out.println("Duzina stringa je: " + duzina);
        } break;
        case 2: {
        	
        	rijec.parniIndeksi(korisnikovUnos);
        	
        } break;
        case 3: {
        	
        	rijec.neparniIndeksi(korisnikovUnos);
        	
        } break;
        case 4: {
        	
        	int velikaSlova=rijec.velikaSlova(korisnikovUnos);
        	System.out.println("Broj velikih slova je: " + velikaSlova);
        } break;
        case 5: {
        	
        	int malaSlova=rijec.malaSlova(korisnikovUnos);
        	System.out.println("Broj malih slova je: " + malaSlova);
        } break;
        case 6: {
        	
        	int nisuSlova=rijec.nisuSlova(korisnikovUnos);
        	System.out.println("Broj karaktera koja nisu slova je: " + nisuSlova);
        } break;
        case 7: {
        	System.out.println("HVALA STO STE KORISTILI NASU APLIKACIJU!");
        } break;
        
        default: {
        	System.out.println("Izabrali ste pogresnu opciju!");
        	System.out.print("Izaberite opet: " );
        	zeljenaOperacija=unos.nextInt();
        	
        	 
            switch(zeljenaOperacija) {
            
            case 1: {
            	
            	int duzina=rijec.duzinaStringa(korisnikovUnos);
            	System.out.println("Duzina stringa je: " + duzina);
            } break;
            case 2: {
            	
            	rijec.parniIndeksi(korisnikovUnos);
            	
            } break;
            case 3: {
            	
            	rijec.neparniIndeksi(korisnikovUnos);
            	
            } break;
            case 4: {
            	
            	int velikaSlova=rijec.velikaSlova(korisnikovUnos);
            	System.out.println("Broj velikih slova je: " + velikaSlova);
            } break;
            case 5: {
            	
            	int malaSlova=rijec.malaSlova(korisnikovUnos);
            	System.out.println("Broj malih slova je: " + malaSlova);
            } break;
            case 6: {
            	
            	int nisuSlova=rijec.nisuSlova(korisnikovUnos);
            	System.out.println("Broj karaktera koja nisu slova je: " + nisuSlova);
            } break;
            case 7: {
            	System.out.println("HVALA STO STE KORISTILI NASU APLIKACIJU!");
            } break;
         }
		}
       }
        if(zeljenaOperacija==7) {
        	break;
        }
        }
}
}

