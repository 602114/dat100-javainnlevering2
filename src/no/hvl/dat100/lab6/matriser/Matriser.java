package no.hvl.dat100.lab6.matriser;

public class Matriser {
	
public static void main(String[] args) {
		// Tabellene:
		int [][] tabell = {
				{1, 3, 5, 7, 9},
				{2, 4, 6, 8, 10},
				{3, 7, 11, 15, 19}
		};
		
		
		int [][] tabellUlik = {
				{1, 5, 3, 7, 9},
				{2, 4, 6, 8, 10},
				{3, 7, 11, 15, 19}
		};
		
		int [][] tabellRom = {
				{62, 63, 64, 65, 66},
				{67, 68, 69, 70, 71},
		};
		
		// Skriver ut oppgavene:
		System.out.println("---Skriver ut en matrise---");	
		skrivUt(tabellRom);
		
		System.out.println("\n---Skriver ut en matrise som streng---");
		tilStreng(tabell);
		
		System.out.println("\n---Multipliserer alle tall i matrisen med en parameter---");
		skaler(2, tabell);
		
		System.out.println("\n---Ser om to matriser er like---");
		erLik(tabell, tabell); 
		
		System.out.println("\n---Ser om to matriser er like---");
		erLik(tabell, tabellUlik); 
	}

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for (int[] rad: matrise) {
			for (int hm: rad) {
				System.out.println(hm);
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
	String ut = "";
		
		for (int i = 0; i < matrise.length; i++) {
			int[] rad = matrise[i];
	
			for (int j = 0; j < rad.length; j++) {
				ut += "" + matrise[i][j] + " ";
			}
			
			ut += "\n";
		}
		
		System.out.println(ut);
		return ut;	
	}

	// c) 
	public static int[][] skaler(int tall, int[][] matrise) {
		int sum = 0;
		for (int i = 0; i < matrise.length; i++) {
			int[] rad = matrise[i];

			for (int j = 0; j < rad.length; j++) {
				sum = matrise[i][j];
				sum *= tall;
				System.out.println(sum);	
			}
			
			System.out.println();
		}
		
		return null;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		int lengde = 0;
		boolean omLik = true;
		int h = 0;
		
		// Sjekker først om de har lik lengde
		if (a.length > b.length) {
			omLik = false;
			
		} else if (a.length < b.length) {
			omLik = false;
		} else
		lengde = a.length;
			
		// Sjekker om tallene i matrisen er like
		while (h < lengde && omLik == true) {	
			for (int i = 0; i < lengde; i++) {
				
				for (int j = 0; j < lengde; j++) {
					int talla = a[i][j];
					int tallb = b[i][j];
	
						if (talla != tallb) {
							omLik = false;
						} else 
						h++;
				}
			}
		}
		
		System.out.println(omLik);
		return omLik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
