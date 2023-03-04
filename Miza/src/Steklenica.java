/*
	Ime datoteke: 		Steklenica.java
	Avtor: 				Nejc Kotnik
*/

	/**
	 * Deklariramo javni razred Steklenica
	 * @author Nejc Kotnik
	 *
	 */
	public class Steklenica {
		
		/**
		 * Deklariramo statično lastnost material
		 */
		public static final String material = "Steklo";
		
		// Deklariramo zasebne lastnosti razreda steklenica
		private int kolicinaVsebine;
		private String vrstaVsebine;
		private boolean jeOdprta;
		private int kapaciteta;
		
		/**
		 * Definiramo javni konstruktor, ki ustvari nov objekt tipa Steklenica
		 */
		public Steklenica() {
			
			// Inicializiramo lastnosti objekta
			kolicinaVsebine = 0;
			vrstaVsebine = "";
			jeOdprta = false;
			kapaciteta = 0;
			
			System.out.println("Ustvarjam nov objekt tipa Steklenica");
		}
		
		/**
		 * Javni konstruktor
		 * @param k - kapaciteta steklenice
		 * Ustvari nov objekt tipa steklenica
		 */
		public Steklenica(int k) {
			
			// Inicializiramo lastnosti objekta
			kolicinaVsebine = 0;
			vrstaVsebine = "";
			jeOdprta = false;
			kapaciteta = k;
			
			System.out.println("Ustvarjam nov objekt tipa Steklenica s kapaciteto " + k);
		}
		
		/**
		 * Javna metoda za polnjenje steklenice
		 * @param k - količina vsebine
		 * @param v - vrsta vsebine
		 * @return količina vsebine po polnjenju
		 * @throws Exception vrže izjemo, če je steklenica zaprta
		 * Prišteje natočeno količino in doda vrsto vsebine
		 */
		public int napolni(int k, String v) throws Exception {
			
			System.out.println("Steklenico polnim z " + v);
			System.out.println("Količina vsebine pred polnjenjem: " + kolicinaVsebine);
			
			// Če je steklenica odprta, poskusi napolniti
			if(jeOdprta) {
				
				// Prištejemo količino vsebine
				kolicinaVsebine = kolicinaVsebine + k;
			
				// Dodamo vrsto vsebine
				vrstaVsebine = vrstaVsebine + v;
			
				System.out.println("Količina vsebine po polnjenju: " + kolicinaVsebine);	
				
			}
			else {
				
				// Vržemo izjemo za neuspešno polnjenje
				throw new Exception("Steklenica je zaprta!");
			}
			// Vrnemo količino vsebine
			return kolicinaVsebine;
		}
		
		/**
		 * Javna metoda za odpiranje steklenice
		 * @return true - polnjenje uspešno, false - polnjenje ni uspešno
		 */
		public boolean odpri() {
			
			// Če je steklenica že odprta
			if(jeOdprta) {
				
				// Vrnemo false
				return false;
				
			}
			// Če je zaprta
			else {
				
				// Odpremo steklenico
				jeOdprta = true;
				// Vrnemo true
				return true;
			}
		}
		
		/**
		 * Javna metoda za zapiranje steklenice
		 * @return true - polnjenje uspešno, false - polnjenje ni uspešno
		 */
		public boolean zapri() {
			
			// Če je steklenica že zaprta
			if(!jeOdprta) {
				
				// Vrnemo true
				return true;
				
			}
			// Če je odprta
			else {
				
				// Zapremo steklenico
				jeOdprta = false;
				// Vrnemo true
				return true;
			}
		
		}
		
		/**
		 * Javna metoda vrne količino vsebine
		 * @return količina vsebine
		 */
		public int getKolicinaVsebine() {
			return kolicinaVsebine;
		}
		
}