package projeto;
import java.util.Scanner;

public class PaginaInicial {
	
	public static void main(String[] args) {
		System.out.println("==============================================================================");
		System.out.println();
		System.out.println("                               Welcome to WegOne                              ");
		System.out.println();
		System.out.println("==============================================================================");
		showMenu();
	}
	
	public static void showMenu() {
		Scanner leia = new Scanner (System.in);

		System.out.println("\nSelect your language: \n");
		System.out.println("1- English  \n2- French 🇫🇷\n3- German 🇩🇪\n4- Portuguese 🇧🇷\n5- Spanish 🇪🇸");
		String idioma = leia.nextLine();
		System.out.println();
		System.out.println("==============================================================================");
		System.out.println();

		if(idioma.equals("1") || idioma.equalsIgnoreCase("english")) {
			Ingles english = new Ingles();
			english.ingles();
			
		}else if(idioma.equals("2") || idioma.equalsIgnoreCase("french")) {
			Frances francais = new Frances();
			francais.frances();
			
		}else if(idioma.equals("3") || idioma.equalsIgnoreCase("german")) {
			Alemao deutsch = new Alemao();
			deutsch.alemao();
	
		}else if(idioma.equals("4") || idioma.equalsIgnoreCase("portuguese")) {
			Portugues portugues = new Portugues();
			portugues.portugues();
			
		}else if(idioma.equals("5") || idioma.equalsIgnoreCase("spanish")) {
			Espanhol espanol = new Espanhol();
			espanol.espanhol();
		}
		
		leia.close();
	}
}