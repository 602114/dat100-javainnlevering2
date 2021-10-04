package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	
public static void main(String[] args) {
		
	int [] E = {1, 2, 4};
		int [] Random = {31, 40, 42, 158, 169, 260, 358, 377, 386, 443};
		int [] Pluss = {3, 5, 7, 8, 13, 14, 20};
		int tall = 440;
		
		
		System.out.println("---Innhold i tabellen---"); // For å se resultatet lettere i consollen
		skrivUt(Random);
		
		System.out.println("\n---Streng---");
		tilStreng(Random);
		
		System.out.println("\n---Summen av tabellen---");
		summer(E);
		
		System.out.println("\n---Finnes tallet---");
		finnesTall(Random, tall);
		
		System.out.println("\n---Posisjon i tabell---");
		System.out.println(posisjonTall(Random, tall));
		
		System.out.println("\n---Reverserer tabellen---");
		reverser(Pluss);
		
		System.out.println("\n---Ser om tabellen er sortert---");
		erSortert(Random);
		
		System.out.println("\n\n---Setter sammen to tabeller---"); // Vetsje hvorfor jeg trenger to \n'er her for å få et mellomrom
		settSammen(Random, Pluss);
	}

	// a)
	public static void skrivUt(int[] tabell) {
		
		for (int tall: tabell) {
			System.out.println(tall);
		}
		
		return;
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String ut = "";
		
		for (int i = 0; i < tabell.length; i++) {
			int tall = tabell[i];
			
			if (i == tabell.length - 1) {
				ut += tall + "";	
			} else 
			ut += "" + tall + ", ";
		}
		
		System.out.println("[" + ut + "]");
		return ut;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		int i = 0;
		
		for (i = 0; i < tabell.length; i++) {
			int tall = tabell[i];
			sum += tall;
		}
		System.out.println(sum);
		
		sum = 0;
		int j = 0;
		while (j < tabell.length) {
			int tall = tabell[j];
			sum += tall;
			j++;
		}
		System.out.println(sum);
		
		sum = 0;
		for (int tall2: tabell) {
			// tall + tall;
			sum += tall2;
		}
		System.out.println(sum);
		
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean riktig = false;
		int i = 0;
		
		while (i < tabell.length && !riktig) { 
			if (tabell[i] == tall) {
				riktig = true;
				System.out.println(riktig + ": Dette tallet finnes i denne tabellen");
			} else
			i++;
			
		}
		
		if (!riktig) {
			System.out.println(riktig + ": Dette tallet finnes ikke i denne tabellen");
		}
		
		return riktig;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		  int i = 0;
	        for (i = 0; i < tabell.length; i++) {
	            if (tabell[i] == tall) {
	                return i;
	            } 
	        }
	        
	        // while (i < tabell.length) else  i++;
	        return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		/*
		
		for (int i = tabell.length - 1; i >= 0; i--) {
			int [] rev = {tabell[i]};
			
			for (int innhold: rev) {
				System.out.println(innhold);
			}
		} 
		return null;
		*/
		
		int lengde = tabell.length;
		int [] rev = new int[lengde];
		
		for (int i = tabell.length - 1; i >= 0; i--) {
			for (int j = 0; j < lengde; j++) {
				rev[j] = tabell[i];
				i--;
			}
		} 
		
		for (int innhold: rev) {
				System.out.println(innhold);
			}
		
		return rev;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sortert = true;
		int i = 1;
		
		while (sortert && i < tabell.length) {
			if (tabell[i] < tabell[i - 1]) {
				sortert = false;
				
			} else
			i++;
		}
		
		System.out.print(sortert);
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int lengde = tabell1.length + tabell2.length;
		int [] nyTabell = new int[lengde];
		
		for (int i = 0; i < tabell1.length; i++) {
			nyTabell[i] = tabell1[i];
		}
		
		for (int j = 0; j < tabell2.length; j++) {
			nyTabell[tabell1.length + j] = tabell2[j];
		}
		
		for (int innhold: nyTabell) {
			System.out.println(innhold);
		}
		
		return nyTabell;
	}
}
