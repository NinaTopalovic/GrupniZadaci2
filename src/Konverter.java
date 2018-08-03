
public class Konverter {
	
	// ponasanja
	
		public double kilogramiUFunte(double kilogrami) {
			double funte=kilogrami*2.20458554;
			return funte;
		}
		
		public double funteUKilograme(double funte) {
			double kilogrami=funte*0.4536;
			return kilogrami;
		}
		
		public double centimetriUInch(double cm) {
			double inch=cm*0.39;
			return inch;
		}
		
		public double inchUCentimetre(double inch) {
			double cm=inch*2.54;
			return cm;
		}
		
		public double celzijusUFarenhajt(double celzijus) {
			double farenhajt=celzijus*1.8+32.0;
			return farenhajt;
		}
		
		public double farenhajtUCelzijuse(double farenhajt) {
			double celzijus=(farenhajt+32.0)/1.8;
		    return celzijus;
		
		}

}
