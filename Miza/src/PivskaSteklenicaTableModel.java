/*
	
	Ime datoteke: 		PivskaSteklenicaTableModel.java
	Avtor: 				Nejc Kotnik
				
*/

import javax.swing.table.*;

public class PivskaSteklenicaTableModel extends DefaultTableModel {
	
	// Konstruktor
	public PivskaSteklenicaTableModel() {
		
		// Kličemo konstruktor nadrazreda
		super();
		
		// V tabelo dodamo stolpce
		addColumn("Znamka");
		addColumn("Stopnja Alkohola");
		
		// Dodamo naslov vrstice
		// Ustvarimo statičen seznam objektov
		Object[] vrstica = new Object[] {"Znamka test", "Stopnja test"};
		
		// Dodamo vrstico v tabelo
		addRow(vrstica);
	}
	
	// Metoda, ki doda pivsko steklenico na seznam in v tabelo
	// Vhodni parametri: ps - PivskaSteklenica
	// Potek/opis: doda steklenico na seznam - v tabelo 
	// Vrne vrednost: /
	public void addPivskaSteklenica(PivskaSteklenica ps) {
		
		// Ustvarimo statičen seznam objektov
		Object[] vrstica = new Object[] {ps.getZnamkaKolicina(), ps.getStopnjaAlkohola()};
		
		// Dodamo vrstico v tabelo
		addRow(vrstica);
		
	}
	
}