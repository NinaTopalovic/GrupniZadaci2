import java.util.Arrays;

public class Niz {
	
	// ponasanja
	
	public int najmanjiBroj(int[] niz) {
		int duzina=niz.length;
		int min=niz[0];
		for(int i=0; i<duzina; i++) {
			if(niz[i]<min) {
				min=niz[i];
			}
		}
		return min;
	}
	
	public int najveciBroj(int[] niz) {
		int duzina=niz.length;
		int max=niz[0];
		for(int i=0; i<duzina; i++) {
			if(niz[i]>max) {
				max=niz[i];
			}
		}
		return max;
	}
	
	public int zbirBrojeva(int[] niz) {
		int duzina=niz.length;
		int suma=0;
		for(int i=0; i<duzina; i++) {
			suma+=niz[i];
		}
		return suma;
	}
	
	public double prosjekBrojeva(int[] niz) {
		int duzina=niz.length;
		int suma=0;
		for(int i=0; i<duzina; i++) {
			suma+=niz[i];
		}
		double prosjek=suma/duzina;
		return prosjek;
	}
	
	public void unikatniBrojevi(int[] niz) {
		int duzina=niz.length;
	
		int brojac=0;
		for(int i=0; i<duzina; i++) {
			for(int j=0; j<duzina; j++) {
				if(niz[i]==niz[j]) {
					brojac++;
				}
			}
				if(brojac==1) {
					System.out.print(niz[i] + " ");
				}
				brojac=0;
			
			
			
		}
	}
	
	public int[] sortiraniNiz(int[] niz) {
		Arrays.sort(niz);
		return niz;
		
	}

}
