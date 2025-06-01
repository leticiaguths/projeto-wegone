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
            try (Scanner leia = new Scanner (System.in)) {
                System.out.println("\nSelect your language: \n");
                System.out.println("1- English \n2- Français \n3- Deutsch \n4- Português \n5- Español ");
                String idioma = leia.nextLine();
                System.out.println();
                System.out.println("==============================================================================");
                System.out.println();
                
                if(idioma.equals("1") || idioma.equalsIgnoreCase("English")) {
                    Ingles english = new Ingles();
                    english.ingles();
                    
                }else if(idioma.equals("2") || idioma.equalsIgnoreCase("Français")) {
                    Frances francais = new Frances();
                    francais.frances();
                    
                }else if(idioma.equals("3") || idioma.equalsIgnoreCase("Deutsch")) {
                    Alemao deutsch = new Alemao();
                    deutsch.alemao();
                    
                }else if(idioma.equals("4") || idioma.equalsIgnoreCase("Português")) {
                    Portugues portugues = new Portugues();
                    portugues.portugues();
                    
                }else if(idioma.equals("5") || idioma.equalsIgnoreCase("Español")) {
                    Espanhol espanol = new Espanhol();
                    espanol.espanhol();
                }
            }
	}
}