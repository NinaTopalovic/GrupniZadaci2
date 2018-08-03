import java.util.Scanner;

public class NizTest {

	public static void main(String[] args) {
		
		Scanner unos=new Scanner(System.in);
		Niz a=new Niz();
		
		System.out.println("Unesite neki niz brojeva..");
		System.out.print("Prvo unesite duzinu Vaseg niza: ");
        int duzina=unos.nextInt();
        while(duzina<=0) {
        	System.out.println("Duzina niza mora biti veca od 0!");
        	System.out.print("Ponovo unesite duzinu niza.. Ovaj put vecu od 0: ");
        	duzina=unos.nextInt();
        }
        int[] niz=new int[duzina];
        
        for(int i=0; i<duzina; i++) {
        	System.out.print(i+1 + ". clan niza je: ");
        	int clan=unos.nextInt();
        	niz[i]=clan;
        }
        
        for(int i=0; i<duzina; i++) {
        	System.out.print(niz[i] + " ");
        }
        System.out.println();
        
        System.out.println("Ovo su operacije koje mozete izvrsiti nad ovim nizom: ");
        System.out.println();
        System.out.println("1. Naci najmanji clan niza");
        System.out.println("2. Naci najveci clan niza");
        System.out.println("3. Naci zbir svih clanova niza");
        System.out.println("4. Naci prosjek svih clanova niza");
        System.out.println("5. Naci unikatne clanove niza");
        System.out.println("6. Sortirati niz");
        System.out.println("7. Izlaz iz aplikacije");
        System.out.println();
       
        for(int i=0; i<1000; i++) {
        	System.out.println("Birajte: ");
       
        	int korisnik=unos.nextInt();
        	
        	switch(korisnik) {
        	
        	case 1: {
        		System.out.println("Izabrali ste da nadjemo najmanji clan niza!");
        		int min=a.najmanjiBroj(niz);
        		System.out.println("Najmanji clan Vaseg niza je: " + min);
        	} break;
        	case 2: {
        		System.out.println("Izabrali ste da nadjemo najveci clan niza!");
        		int max=a.najveciBroj(niz);
        		System.out.println("Najveci clan Vaseg niza je: " + max);
        	} break;
        	case 3: {
        		System.out.println("Izabrali ste da izracunamo zbir clanova niza!");
        		int suma=a.zbirBrojeva(niz);
        		System.out.println("Zbir clanova Vaseg niza je: " + suma);
        	} break;
        	case 4: {
        		System.out.println("Izabrali ste da nadjemo prosjek clanova niza!");
        		double max=a.prosjekBrojeva(niz);
        		System.out.println("Prosjek clanova Vaseg niza je: " + max);
        	} break;
        	case 5: {
        		System.out.println("Izabrali ste da nadjemo unikatne clanove niza!");
        		System.out.println("Unikatni clanovi Vaseg niza su ");
        		a.unikatniBrojevi(niz);
        		System.out.println();
        	} break;
        	case 6: {
        		System.out.println("Izabrali ste da sortiramo niz!");
        		int[] noviNiz=a.sortiraniNiz(niz);
        		System.out.println("Vas niz sortiran: " );
        		for(int j=0; j<noviNiz.length; j++) {
        			System.out.print(noviNiz[j] + " ");
        		}
        	} break;
        	case 7: {
        		System.out.println("HVALA STO STE KORISTILI NASU APLIKACIJU");
        	} break;
        	default: {
        		System.out.println("Izabrali ste pogresnu opciju!");
        		System.out.print("Pokusajte opet: ");
        		korisnik=unos.nextInt();
        		
        		switch(korisnik) {
            	
            	case 1: {
            		System.out.println("Izabrali ste da nadjemo najmanji clan niza!");
            		int min=a.najmanjiBroj(niz);
            		System.out.println("Najmanji clan Vaseg niza je: " + min);
            	} break;
            	case 2: {
            		System.out.println("Izabrali ste da nadjemo najveci clan niza!");
            		int max=a.najveciBroj(niz);
            		System.out.println("Najveci clan Vaseg niza je: " + max);
            	} break;
            	case 3: {
            		System.out.println("Izabrali ste da izracunamo zbir clanova niza!");
            		int suma=a.zbirBrojeva(niz);
            		System.out.println("Zbir clanova Vaseg niza je: " + suma);
            	} break;
            	case 4: {
            		System.out.println("Izabrali ste da nadjemo prosjek clanova niza!");
            		double max=a.prosjekBrojeva(niz);
            		System.out.println("Prosjek clanova Vaseg niza je: " + max);
            	} break;
            	case 5: {
            		System.out.println("Izabrali ste da nadjemo unikatne clanove niza!");
            		System.out.println("Unikatni clanovi Vaseg niza su ");
            		a.unikatniBrojevi(niz);
            		System.out.println();
            	} break;
            	case 6: {
            		System.out.println("Izabrali ste da sortiramo niz!");
            		int[] noviNiz=a.sortiraniNiz(niz);
            		System.out.println("Vas niz sortiran: " + noviNiz);
            	} break;
            	case 7: {
            		System.out.println("HVALA STO STE KORISTILI NASU APLIKACIJU");
            	} break;
        	}
        		
        		
        	}
        }
        	if(korisnik==7) {
    			break;
    		}
        
	}

}
}
