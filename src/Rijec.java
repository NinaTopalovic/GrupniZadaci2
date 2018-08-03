
public class Rijec {
	
	//ponasanja
	
		public int duzinaStringa(String rijec) {
			int duzina=rijec.length();
			return duzina;
		}

		public void parniIndeksi(String rijec) {
			for(int i=0; i<rijec.length(); i++) {
				if(i%2==0) {
					System.out.println(rijec.charAt(i));
				}
			}
		}
		
		public void neparniIndeksi(String rijec) {
			for(int i=0; i<rijec.length(); i++) {
				if(i%2!=0) {
					System.out.println(rijec.charAt(i));
				}
			}
		
		}
		
		public int velikaSlova(String rijec) {
			int brojac=0;
			for(int i=0; i<rijec.length(); i++) {
				if(rijec.charAt(i)>=65 && rijec.charAt(i)<=90) {
					brojac++;
				}
			}
			return brojac;
		}
		
		public int malaSlova(String rijec) {
			int brojac=0;
			for(int i=0; i<rijec.length(); i++) {
				if(rijec.charAt(i)>=97 && rijec.charAt(i)<=122) {
					brojac++;
				}
			}
			return brojac;
		}
		
		public int nisuSlova(String rijec) {
			int brojac=0;
			for(int i=0; i<rijec.length(); i++) {
				if((rijec.charAt(i)<97 || rijec.charAt(i)>122) && (rijec.charAt(i)<65 || rijec.charAt(i)>90) && rijec.charAt(i)!=32) {
					brojac++;
				}
			}
			return brojac;
			
		}

}
