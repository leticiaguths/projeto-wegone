package projeto;

import java.util.Scanner;

public class Alemao {
	
	Scanner lesen = new Scanner(System.in);
	
	int suchId, findeBearbeitung = 0;
	String menü = null, suchName = null, löschen, bearbeitung, bearbeiten, suchMethode;
	static String []nameDe = new String[100]; 
	static String []handbuch = new String[100]; 
	static String []richtlinie = new String[100];
	int id = 10;
	
	public void alemao() {
		
		Fixos.fixosAlemao();
		
		System.out.println("===================== Willkommen auf der WegOne-Website! ====================="); 
		System.out.println(); 
		System.out.println("Hier lernen Sie unsere Projekte kennen, erfahren mehr über unsere innovativen \nLösungen und entdecken, wie wir Ideen in Technologie verwandeln."); 
		System.out.println(); 

		do {

			System.out.println("=============================================================================="); 
			System.out.println(); 

			System.out.println("==================== Wählen Sie, was Sie jetzt tun möchten ===================\n"); 
			System.out.println("1- Eine Richtlinie registrieren; \n2- Eine Richtlinie suchen; \n3- Eine Richtlinie bearbeiten; \n4- Eine Richtlinie löschen; \n5- Sprache ändern; \n6- Beenden;");
			menü = lesen.nextLine();

			System.out.println(); 
			System.out.println("=============================================================================="); 
			
			//REGISTRIEREN-------------------------------------------------------------------------------------------------------------

			boolean wiederholt = false;
			String geschrieben;
			if (menü.equalsIgnoreCase("registrieren") || menü.equals("1")) {

			    System.out.println("\n================== Wählen Sie den gewünschten Richtlinientyp =================");
			    System.out.println();
			    System.out.println("1- Bedienungsanleitung;\n2- Sicherheitsverfahren;\n3- Wartung und Reparaturen;\n4- Tests und Diagnosen;\n5- Verhaltenskodex und sektorale Abläufe;");
			    richtlinie[id] = lesen.nextLine(); 
			    System.out.println();
			    
			  //BEDIENUNGSANLEITUNG-------------------------------------------------------------------------------------------------------------

			    if (richtlinie[id].equalsIgnoreCase("Bedienungsanleitung") || richtlinie[id].equals("1")) {

			        System.out.println("====================== Wählen Sie die Registrieroption =======================\n");
			        System.out.println("1- Nur in der aktuellen Sprache (Deutsch); \n2- In allen Sprachen der Website;");
			        int registrierMethode = lesen.nextInt();
			        lesen.nextLine();
			        System.out.println();

			        if (richtlinie[id].equalsIgnoreCase("1")) {
			            richtlinie[id] = "Bedienungsanleitung";
			        }

			        for (int a = 0; a < nameDe.length; a++) {
			            if (nameDe[a] == null) {

			                System.out.println("==============================================================================");
			                System.out.println();
			                System.out.println("Geben Sie den Namen der Richtlinie ein:");
			                geschrieben = lesen.nextLine();
			                System.out.println();

			                while (geschrieben.trim().isEmpty()) {
			                    System.out.println("Ungültig. Bitte erneut eingeben:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();
			                }

			                nameDe[a] = geschrieben;
			                String anzeigen = geschrieben;

			                System.out.println("==============================================================================");
			                System.out.println();

			                if (registrierMethode == 2) {

			                	System.out.println("Geben Sie den Namen der Richtlinie auf Englisch ein:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben.trim().isEmpty()) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben = lesen.nextLine();
			                        System.out.println();
			                    }

			                    Ingles.name[a] = geschrieben;
			                    
			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    System.out.println("Geben Sie den Namen der Richtlinie auf Portugiesisch ein:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben.trim().isEmpty()) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben = lesen.nextLine();
			                        System.out.println();
			                    }

			                    Portugues.nome[a] = geschrieben;

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    System.out.println("Geben Sie den Namen der Richtlinie auf Spanisch ein:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben.trim().isEmpty()) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben = lesen.nextLine();
			                        System.out.println();
			                    }

			                    Espanhol.nombre[a] = geschrieben;

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    System.out.println("Geben Sie den Namen der Richtlinie auf Französisch ein:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben.trim().isEmpty()) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Frances.nom[a] = geschrieben;
			                }

			                System.out.println("Geben Sie die Richtlinie ein:");
			                String geschrieben1 = lesen.nextLine();
			                System.out.println();

			                while (geschrieben1.trim().isEmpty() || wiederholt) {
			                    System.out.println("Ungültig. Bitte erneut eingeben:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();
			                }

			                System.out.println("==============================================================================");
			                System.out.println();
			                handbuch[a] = geschrieben1;

			                if (registrierMethode == 2) {
			                	
			                	System.out.println("Geben Sie die Richtlinie auf Englisch ein:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben1.trim().isEmpty() || wiederholt) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben1 = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Ingles.manualEn[a] = geschrieben1;

			                    System.out.println("Geben Sie die Richtlinie auf Portugiesisch ein:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben1.trim().isEmpty() || wiederholt) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben1 = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Portugues.manualPt[a] = geschrieben1;

			                    System.out.println("Geben Sie die Richtlinie auf Spanisch ein:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben1.trim().isEmpty() || wiederholt) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben1 = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Espanhol.manualEs[a] = geschrieben1;

			                    System.out.println("Geben Sie die Richtlinie auf Französisch ein:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben1.trim().isEmpty() || wiederholt) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben1 = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Frances.manuelFr[a] = geschrieben1;
			                }

			                richtlinie[a] = "Bedienungsanleitung";

			                System.out.println("               Die Richtlinie '" + anzeigen + "' wurde registriert!");
			                System.out.println();

			                break;
			            }
			        }
			        
			      //SICHERHEITSVERFAHREN-------------------------------------------------------------------------------------------------------------
					
				}else if(richtlinie[id].equalsIgnoreCase("Sicherheitsverfahren") || richtlinie[id].equals("2")) {
					
			        System.out.println("====================== Wählen Sie die Registrieroption =======================\n");
			        System.out.println("1- Nur in der aktuellen Sprache (Deutsch); \n2- In allen Sprachen der Website;");
			        int registrierMethode = lesen.nextInt();
			        lesen.nextLine();
			        System.out.println();

			        if (richtlinie[id].equalsIgnoreCase("2")) {
			            richtlinie[id] = "Sicherheitsverfahren";
			        }

			        for (int b = 0; b < nameDe.length; b++) {
			            if (nameDe[b] == null) {

			                System.out.println("==============================================================================");
			                System.out.println();
			                System.out.println("Geben Sie den Namen der Richtlinie ein:");
			                geschrieben = lesen.nextLine();
			                System.out.println();

			                while (geschrieben.trim().isEmpty()) {
			                    System.out.println("Ungültig. Bitte erneut eingeben:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();
			                }

			                nameDe[b] = geschrieben;
			                String anzeigen = geschrieben;

			                System.out.println("==============================================================================");
			                System.out.println();

			                if (registrierMethode == 2) {

			                	System.out.println("Geben Sie den Namen der Richtlinie auf Englisch ein:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben.trim().isEmpty()) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben = lesen.nextLine();
			                        System.out.println();
			                    }

			                    Ingles.name[b] = geschrieben;
			                    
			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    System.out.println("Geben Sie den Namen der Richtlinie auf Portugiesisch ein:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben.trim().isEmpty()) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben = lesen.nextLine();
			                        System.out.println();
			                    }

			                    Portugues.nome[b] = geschrieben;

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    System.out.println("Geben Sie den Namen der Richtlinie auf Spanisch ein:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben.trim().isEmpty()) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben = lesen.nextLine();
			                        System.out.println();
			                    }

			                    Espanhol.nombre[b] = geschrieben;

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    System.out.println("Geben Sie den Namen der Richtlinie auf Französisch ein:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben.trim().isEmpty()) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Frances.nom[b] = geschrieben;
			                }

			                System.out.println("Geben Sie die Richtlinie ein:");
			                String geschrieben1 = lesen.nextLine();
			                System.out.println();

			                while (geschrieben1.trim().isEmpty() || wiederholt) {
			                    System.out.println("Ungültig. Bitte erneut eingeben:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();
			                }

			                System.out.println("==============================================================================");
			                System.out.println();
			                handbuch[b] = geschrieben1;

			                if (registrierMethode == 2) {
			                	
			                	System.out.println("Geben Sie die Richtlinie auf Englisch ein:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben1.trim().isEmpty() || wiederholt) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben1 = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Ingles.manualEn[b] = geschrieben1;

			                    System.out.println("Geben Sie die Richtlinie auf Portugiesisch ein:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben1.trim().isEmpty() || wiederholt) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben1 = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Portugues.manualPt[b] = geschrieben1;

			                    System.out.println("Geben Sie die Richtlinie auf Spanisch ein:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben1.trim().isEmpty() || wiederholt) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben1 = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Espanhol.manualEs[b] = geschrieben1;

			                    System.out.println("Geben Sie die Richtlinie auf Französisch ein:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben1.trim().isEmpty() || wiederholt) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben1 = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Frances.manuelFr[b] = geschrieben1;
			                }

			                richtlinie[b] = "Sicherheitsverfahren";

			                System.out.println("               Die Richtlinie '" + anzeigen + "' wurde registriert!");
			                System.out.println();

			                break;
			            }
			        }
					
				//WARTUNG UND REPARATUREN-------------------------------------------------------------------------------------------------------------
					
				}else if(richtlinie[id].equalsIgnoreCase("Wartung und Reparaturen") || richtlinie[id].equals("3")) {
					
			        System.out.println("====================== Wählen Sie die Registrieroption =======================\n");
			        System.out.println("1- Nur in der aktuellen Sprache (Deutsch); \n2- In allen Sprachen der Website;");
			        int registrierMethode = lesen.nextInt();
			        lesen.nextLine();
			        System.out.println();

			        if (richtlinie[id].equalsIgnoreCase("3")) {
			            richtlinie[id] = "Wartung und Reparaturen";
			        }

			        for (int c = 0; c < nameDe.length; c++) {
			            if (nameDe[c] == null) {

			                System.out.println("==============================================================================");
			                System.out.println();
			                System.out.println("Geben Sie den Namen der Richtlinie ein:");
			                geschrieben = lesen.nextLine();
			                System.out.println();

			                while (geschrieben.trim().isEmpty()) {
			                    System.out.println("Ungültig. Bitte erneut eingeben:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();
			                }

			                nameDe[c] = geschrieben;
			                String anzeigen = geschrieben;

			                System.out.println("==============================================================================");
			                System.out.println();

			                if (registrierMethode == 2) {

			                	System.out.println("Geben Sie den Namen der Richtlinie auf Englisch ein:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben.trim().isEmpty()) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben = lesen.nextLine();
			                        System.out.println();
			                    }

			                    Ingles.name[c] = geschrieben;
			                    
			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    System.out.println("Geben Sie den Namen der Richtlinie auf Portugiesisch ein:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben.trim().isEmpty()) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben = lesen.nextLine();
			                        System.out.println();
			                    }

			                    Portugues.nome[c] = geschrieben;

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    System.out.println("Geben Sie den Namen der Richtlinie auf Spanisch ein:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben.trim().isEmpty()) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben = lesen.nextLine();
			                        System.out.println();
			                    }

			                    Espanhol.nombre[c] = geschrieben;

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    System.out.println("Geben Sie den Namen der Richtlinie auf Französisch ein:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben.trim().isEmpty()) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Frances.nom[c] = geschrieben;
			                }

			                System.out.println("Geben Sie die Richtlinie ein:");
			                String geschrieben1 = lesen.nextLine();
			                System.out.println();

			                while (geschrieben1.trim().isEmpty() || wiederholt) {
			                    System.out.println("Ungültig. Bitte erneut eingeben:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();
			                }

			                System.out.println("==============================================================================");
			                System.out.println();
			                handbuch[c] = geschrieben1;

			                if (registrierMethode == 2) {
			                	
			                	System.out.println("Geben Sie die Richtlinie auf Englisch ein:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben1.trim().isEmpty() || wiederholt) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben1 = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Ingles.manualEn[c] = geschrieben1;

			                    System.out.println("Geben Sie die Richtlinie auf Portugiesisch ein:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben1.trim().isEmpty() || wiederholt) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben1 = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Portugues.manualPt[c] = geschrieben1;

			                    System.out.println("Geben Sie die Richtlinie auf Spanisch ein:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben1.trim().isEmpty() || wiederholt) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben1 = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Espanhol.manualEs[c] = geschrieben1;

			                    System.out.println("Geben Sie die Richtlinie auf Französisch ein:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben1.trim().isEmpty() || wiederholt) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben1 = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Frances.manuelFr[c] = geschrieben1;
			                }

			                richtlinie[c] = "Wartung und Reparaturen";

			                System.out.println("               Die Richtlinie '" + anzeigen + "' wurde registriert!");
			                System.out.println();

			                break;
			            }
			        }
					
				//TESTS UND DIAGNOSEN-------------------------------------------------------------------------------------------------------------
					
				}else if(richtlinie[id].equalsIgnoreCase("Tests und Diagnosen") || richtlinie[id].equals("4")) {
					
			        System.out.println("====================== Wählen Sie die Registrieroption =======================\n");
			        System.out.println("1- Nur in der aktuellen Sprache (Deutsch); \n2- In allen Sprachen der Website;");
			        int registrierMethode = lesen.nextInt();
			        lesen.nextLine();
			        System.out.println();

			        if (richtlinie[id].equalsIgnoreCase("4")) {
			            richtlinie[id] = "Tests und Diagnosen";
			        }

			        for (int d = 0; d < nameDe.length; d++) {
			            if (nameDe[d] == null) {

			                System.out.println("==============================================================================");
			                System.out.println();
			                System.out.println("Geben Sie den Namen der Richtlinie ein:");
			                geschrieben = lesen.nextLine();
			                System.out.println();

			                while (geschrieben.trim().isEmpty()) {
			                    System.out.println("Ungültig. Bitte erneut eingeben:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();
			                }

			                nameDe[d] = geschrieben;
			                String anzeigen = geschrieben;

			                System.out.println("==============================================================================");
			                System.out.println();

			                if (registrierMethode == 2) {

			                	System.out.println("Geben Sie den Namen der Richtlinie auf Englisch ein:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben.trim().isEmpty()) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben = lesen.nextLine();
			                        System.out.println();
			                    }

			                    Ingles.name[d] = geschrieben;
			                    
			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    System.out.println("Geben Sie den Namen der Richtlinie auf Portugiesisch ein:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben.trim().isEmpty()) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben = lesen.nextLine();
			                        System.out.println();
			                    }

			                    Portugues.nome[d] = geschrieben;

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    System.out.println("Geben Sie den Namen der Richtlinie auf Spanisch ein:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben.trim().isEmpty()) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben = lesen.nextLine();
			                        System.out.println();
			                    }

			                    Espanhol.nombre[d] = geschrieben;

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    System.out.println("Geben Sie den Namen der Richtlinie auf Französisch ein:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben.trim().isEmpty()) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Frances.nom[d] = geschrieben;
			                }

			                System.out.println("Geben Sie die Richtlinie ein:");
			                String geschrieben1 = lesen.nextLine();
			                System.out.println();

			                while (geschrieben1.trim().isEmpty() || wiederholt) {
			                    System.out.println("Ungültig. Bitte erneut eingeben:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();
			                }

			                System.out.println("==============================================================================");
			                System.out.println();
			                handbuch[d] = geschrieben1;

			                if (registrierMethode == 2) {
			                	
			                	System.out.println("Geben Sie die Richtlinie auf Englisch ein:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben1.trim().isEmpty() || wiederholt) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben1 = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Ingles.manualEn[d] = geschrieben1;

			                    System.out.println("Geben Sie die Richtlinie auf Portugiesisch ein:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben1.trim().isEmpty() || wiederholt) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben1 = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Portugues.manualPt[d] = geschrieben1;

			                    System.out.println("Geben Sie die Richtlinie auf Spanisch ein:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben1.trim().isEmpty() || wiederholt) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben1 = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Espanhol.manualEs[d] = geschrieben1;

			                    System.out.println("Geben Sie die Richtlinie auf Französisch ein:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben1.trim().isEmpty() || wiederholt) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben1 = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Frances.manuelFr[d] = geschrieben1;
			                }

			                richtlinie[d] = "Tests und Diagnosen";

			                System.out.println("               Die Richtlinie '" + anzeigen + "' wurde registriert!");
			                System.out.println();

			                break;
			            }
			        }
					
				//VERHALTENSKODEX UND SEKTORABLE ABLÄUFE-------------------------------------------------------------------------------------------------------------
					
				}else if(richtlinie[id].equalsIgnoreCase("Verhaltenskodex und sektorale Abläufe") || richtlinie[id].equals("5")) {
					
			        System.out.println("====================== Wählen Sie die Registrieroption =======================\n");
			        System.out.println("1- Nur in der aktuellen Sprache (Deutsch); \n2- In allen Sprachen der Website;");
			        int registrierMethode = lesen.nextInt();
			        lesen.nextLine();
			        System.out.println();

			        if (richtlinie[id].equalsIgnoreCase("5")) {
			            richtlinie[id] = "Verhaltenskodex und sektorale Abläufe";
			        }

			        for (int e = 0; e < nameDe.length; e++) {
			            if (nameDe[e] == null) {

			                System.out.println("==============================================================================");
			                System.out.println();
			                System.out.println("Geben Sie den Namen der Richtlinie ein:");
			                geschrieben = lesen.nextLine();
			                System.out.println();

			                while (geschrieben.trim().isEmpty()) {
			                    System.out.println("Ungültig. Bitte erneut eingeben:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();
			                }

			                nameDe[e] = geschrieben;
			                String anzeigen = geschrieben;

			                System.out.println("==============================================================================");
			                System.out.println();

			                if (registrierMethode == 2) {

			                	System.out.println("Geben Sie den Namen der Richtlinie auf Englisch ein:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben.trim().isEmpty()) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben = lesen.nextLine();
			                        System.out.println();
			                    }

			                    Ingles.name[e] = geschrieben;
			                    
			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    System.out.println("Geben Sie den Namen der Richtlinie auf Portugiesisch ein:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben.trim().isEmpty()) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben = lesen.nextLine();
			                        System.out.println();
			                    }

			                    Portugues.nome[e] = geschrieben;

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    System.out.println("Geben Sie den Namen der Richtlinie auf Spanisch ein:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben.trim().isEmpty()) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben = lesen.nextLine();
			                        System.out.println();
			                    }

			                    Espanhol.nombre[e] = geschrieben;

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    System.out.println("Geben Sie den Namen der Richtlinie auf Französisch ein:");
			                    geschrieben = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben.trim().isEmpty()) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Frances.nom[e] = geschrieben;
			                }

			                System.out.println("Geben Sie die Richtlinie ein:");
			                String geschrieben1 = lesen.nextLine();
			                System.out.println();

			                while (geschrieben1.trim().isEmpty() || wiederholt) {
			                    System.out.println("Ungültig. Bitte erneut eingeben:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();
			                }

			                System.out.println("==============================================================================");
			                System.out.println();
			                handbuch[e] = geschrieben1;

			                if (registrierMethode == 2) {
			                	
			                	System.out.println("Geben Sie die Richtlinie auf Englisch ein:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben1.trim().isEmpty() || wiederholt) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben1 = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Ingles.manualEn[e] = geschrieben1;

			                    System.out.println("Geben Sie die Richtlinie auf Portugiesisch ein:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben1.trim().isEmpty() || wiederholt) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben1 = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Portugues.manualPt[e] = geschrieben1;

			                    System.out.println("Geben Sie die Richtlinie auf Spanisch ein:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben1.trim().isEmpty() || wiederholt) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben1 = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Espanhol.manualEs[e] = geschrieben1;

			                    System.out.println("Geben Sie die Richtlinie auf Französisch ein:");
			                    geschrieben1 = lesen.nextLine();
			                    System.out.println();

			                    while (geschrieben1.trim().isEmpty() || wiederholt) {
			                        System.out.println("Ungültig. Bitte erneut eingeben:");
			                        geschrieben1 = lesen.nextLine();
			                        System.out.println();
			                    }

			                    System.out.println("==============================================================================");
			                    System.out.println();
			                    Frances.manuelFr[e] = geschrieben1;
			                }

			                richtlinie[e] = "Verhaltenskodex und sektorale Abläufe";

			                System.out.println("               Die Richtlinie '" + anzeigen + "' wurde registriert!");
			                System.out.println();

			                break;
			            }
			        }
				} id++;
				
				//SUCHEN-------------------------------------------------------------------------------------------------------------
				
		    }else if(menü.equalsIgnoreCase("Suchen") || menü.equals("2")) {
		    	
		    	System.out.println();
		    	System.out.println("===================== Wählen Sie die Suchmethode aus =========================\n");
		    	System.out.println("1- Name; \n2- ID; ");
		    	suchMethode = lesen.nextLine();
		    	System.out.println();
		    	System.out.println("==============================================================================");

		    	boolean gefunden = false;

		    	if (suchMethode.equalsIgnoreCase("name") || suchMethode.equalsIgnoreCase("1")) {
		    	    System.out.println();
		    	    System.out.println("Geben Sie den Namen der gewünschten Richtlinie ein:");
		    	    suchName = lesen.nextLine();
		    	    System.out.println();

		    	    int anzahl = 0;
		    	    for(int f = 0; f < nameDe.length; f++) {
		    	        if(nameDe[f] != null && nameDe[f].equalsIgnoreCase(suchName)) {
		    	            anzahl++;

		    	            if(anzahl == 1) {
		    	                System.out.println("==============================================================================");
		    	                System.out.println();
		    	                System.out.println("        Die Richtlinie '" + suchName + "' wurde bereits registriert!");
		    	                System.out.println();
		    	                System.out.println("==============================================================================");
		    	                System.out.println("\n=========================== Registrierte Richtlinie ==========================");
		    	                System.out.println();
		    	                System.out.println("-- Name der Richtlinie: " + nameDe[f]);
		    	                System.out.println("-- ID der Richtlinie: " + (f + 1));
		    	                System.out.println("-- Typ der Richtlinie: " + richtlinie[f]);

		    	                if(handbuch[f] != null) {
		    	                    System.out.println("-- Richtlinie: " + handbuch[f]);
		    	                    System.out.println();
		    	                }

		    	                gefunden = true;

		    	            } else {
		    	                System.out.println("==============================================================================");
		    	                System.out.println("\n=========================== Registrierte Richtlinie ==========================");
		    	                System.out.println();
		    	                System.out.println("-- Name der Richtlinie: " + nameDe[f]);
		    	                System.out.println("-- ID der Richtlinie: " + (f + 1));
		    	                System.out.println("-- Typ der Richtlinie: " + richtlinie[f]);

		    	                if(handbuch[f] != null) {
		    	                    System.out.println("-- Richtlinie: " + handbuch[f]);
		    	                }
		    	                System.out.println();

		    	                gefunden = true;
		    	            }
		    	        }
		    	    }

		    	    if(!gefunden) {
		    	        System.out.println("==============================================================================");
		    	        System.out.println();
		    	        System.out.println("        Die Richtlinie '" + suchName + "' ist nicht registriert!");
		    	        System.out.println();
		    	    }

		    	} else if (suchMethode.equalsIgnoreCase("id") || suchMethode.equalsIgnoreCase("2")) {
		    	    System.out.println();
		    	    System.out.println("Geben Sie die ID der gewünschten Richtlinie ein:");
		    	    suchId = lesen.nextInt();
		    	    lesen.nextLine();
		    	    System.out.println();

		    	    for(int f = 0; f < nameDe.length; f++) {
		    	        if(suchId == (f + 1) && richtlinie[f] != null && !richtlinie[f].isEmpty()) {
		    	            System.out.println("==============================================================================");
		    	            System.out.println();
		    	            System.out.println("        Die Richtlinie mit der ID '" + suchId + "' wurde bereits registriert!");
		    	            System.out.println();
		    	            System.out.println("==============================================================================");
		    	            System.out.println("\n=========================== Registrierte Richtlinie ==========================");
		    	            System.out.println();
		    	            System.out.println("-- Name der Richtlinie: " + nameDe[f]);
		    	            System.out.println("-- ID der Richtlinie: " + (f + 1));
		    	            System.out.println("-- Typ der Richtlinie: " + richtlinie[f]);

		    	            if(handbuch[f] != null) {
		    	                System.out.println("-- Richtlinie: " + handbuch[f]);
		    	            }
		    	            System.out.println();

		    	            gefunden = true;
		    	        }
		    	    }

		    	    if(!gefunden) {
		    	        System.out.println("==============================================================================");
		    	        System.out.println();
		    	        System.out.println("        Die Richtlinie mit der ID '" + suchId + "' ist nicht registriert!");
		    	        System.out.println();
		    	    }
		    	}

			
		        //BEARBEITEN-------------------------------------------------------------------------------------------------------------

		    }else if(menü.equals("Bearbeiten") || menü.equals("3") ) {
		    	
		    	System.out.println();
		    	System.out.println("===================== Wählen Sie die Bearbeitungsmethode =====================\n");
		    	System.out.println("1- Name; \n2- ID; ");
		    	suchMethode = lesen.nextLine();
		    	System.out.println();
    	        System.out.println("==============================================================================");

		    	if (suchMethode.equals("1") || suchMethode.equalsIgnoreCase("Name")) {
		    	    System.out.println();
		    	    System.out.println("**Hinweis: Wenn mehrere Richtlinien denselben Namen haben, werden alle zur \nBearbeitung angefordert.\n\n**Tipp: Sie können das Feld leer lassen, um diejenigen zu behalten, \ndie Sie nicht ändern möchten, wie zuvor.\n\nGeben Sie den Namen der gewünschten Richtlinie ein: ");
		    	    bearbeitung = lesen.nextLine();
		    	    System.out.println();

		    	    for (int h = 0; h < nameDe.length; h++) {
		    	        if (nameDe[h] != null && nameDe[h].equalsIgnoreCase(bearbeitung)) {

		    	            System.out.println("======================== Was möchten Sie bearbeiten? =========================\n");
		    	            System.out.println("1- Name; \n2- Typ; \n3- Richtlinie; \n4- Alle; ");
		    	            bearbeiten = lesen.nextLine();
		    	            String eingabe;
		    	            System.out.println();
			    	        System.out.println("==============================================================================");

		    	            if (bearbeiten.equalsIgnoreCase("Name") || bearbeiten.equalsIgnoreCase("1")) {
		    	                System.out.println();
		    	                System.out.println("Geben Sie den neuen Namen der Richtlinie (für ID '" + (h + 1) + "') ein: ");
		    	                eingabe = lesen.nextLine();
		    	                System.out.println();

		    	                if (eingabe.trim().isEmpty()) {
		    	                    break;
		    	                } else {
		    	                    nameDe[h] = eingabe;
		    	                }

				    	        System.out.println("==============================================================================");
		    	                System.out.println();
		    	                System.out.println("Die Richtlinie '" + bearbeitung + "' wurde in '" + nameDe[h] + "' geändert!");
		    	                System.out.println();

		    	            } else if (bearbeiten.equalsIgnoreCase("Typ") || bearbeiten.equalsIgnoreCase("2")) {
		    	                System.out.println("\n============= Wählen Sie den neuen Typ der Richtlinie (ID '" + (h + 1) + "') ==============\n");
		    	                System.out.println("1- Bedienungsanleitung;\n2- Sicherheitsverfahren;\n3- Wartung und Reparaturen;\n4- Tests und Diagnosen;\n5- Verhaltenskodex und sektorale Abläufe;");
		    	                eingabe = lesen.nextLine();
		    	                System.out.println();

		    	                if (eingabe.trim().isEmpty()) {
		    	                    break;
		    	                } else if (eingabe.equalsIgnoreCase("1") || eingabe.equalsIgnoreCase("Bedienungsanleitung")) {
		    	                    richtlinie[h] = "Bedienungsanleitung";
		    	                } else if (eingabe.equalsIgnoreCase("2") || eingabe.equalsIgnoreCase("Sicherheitsverfahren")) {
		    	                    richtlinie[h] = "Sicherheitsverfahren";
		    	                } else if (eingabe.equalsIgnoreCase("3") || eingabe.equalsIgnoreCase("Wartung und Reparaturen")) {
		    	                    richtlinie[h] = "Wartung und Reparaturen";
		    	                } else if (eingabe.equalsIgnoreCase("4") || eingabe.equalsIgnoreCase("Tests und Diagnosen")) {
		    	                    richtlinie[h] = "Tests und Diagnosen";
		    	                } else if (eingabe.equalsIgnoreCase("5") || eingabe.equalsIgnoreCase("Verhaltenskodex und sektorale Abläufe")) {
		    	                    richtlinie[h] = "Verhaltenskodex und sektorale Abläufe";
		    	                }

				    	        System.out.println("==============================================================================");
		    	                System.out.println();
		    	                System.out.println("Die Richtlinie '" + bearbeitung + "' wurde geändert!");
		    	                System.out.println();

		    	            } else if (bearbeiten.equalsIgnoreCase("Richtlinie") || bearbeiten.equalsIgnoreCase("3")) {
		    	                System.out.println();
		    	                System.out.println("Geben Sie die neue Richtlinie (für ID '" + (h + 1) + "') ein: ");
		    	                eingabe = lesen.nextLine();
		    	                System.out.println();

		    	                if (eingabe.trim().isEmpty()) {
		    	                    break;
		    	                } else {
		    	                    handbuch[h] = eingabe;
		    	                }

				    	        System.out.println("==============================================================================");
		    	                System.out.println();
		    	                System.out.println("Die Richtlinie '" + bearbeitung + "' wurde geändert!");
		    	                System.out.println();

		    	            } else if (bearbeiten.equalsIgnoreCase("Alle") || bearbeiten.equalsIgnoreCase("4")) {
		    	                System.out.println();
		    	                System.out.println("Geben Sie den neuen Namen der Richtlinie (für ID '" + (h + 1) + "') ein: ");
		    	                eingabe = lesen.nextLine();

		    	                if (eingabe.trim().isEmpty()) {
		    	                    break;
		    	                } else {
		    	                    nameDe[h] = eingabe;
		    	                }

		    	                System.out.println("\n============= Wählen Sie den neuen Typ der Richtlinie (ID '" + (h + 1) + "') ==============\n");
		    	                System.out.println("1- Bedienungsanleitung;\n2- Sicherheitsverfahren;\n3- Wartung und Reparaturen;\n4- Tests und Diagnosen;\n5- Verhaltenskodex und sektorale Abläufe;");
		    	                eingabe = lesen.nextLine();
		    	                System.out.println();

		    	                if (eingabe.trim().isEmpty()) {
		    	                    break;
		    	                } else if (eingabe.equalsIgnoreCase("1") || eingabe.equalsIgnoreCase("Bedienungsanleitung")) {
		    	                    richtlinie[h] = "Bedienungsanleitung";
		    	                } else if (eingabe.equalsIgnoreCase("2") || eingabe.equalsIgnoreCase("Sicherheitsverfahren")) {
		    	                    richtlinie[h] = "Sicherheitsverfahren";
		    	                } else if (eingabe.equalsIgnoreCase("3") || eingabe.equalsIgnoreCase("Wartung und Reparaturen")) {
		    	                    richtlinie[h] = "Wartung und Reparaturen";
		    	                } else if (eingabe.equalsIgnoreCase("4") || eingabe.equalsIgnoreCase("Tests und Diagnosen")) {
		    	                    richtlinie[h] = "Tests und Diagnosen";
		    	                } else if (eingabe.equalsIgnoreCase("5") || eingabe.equalsIgnoreCase("Verhaltenskodex und sektorale Abläufe")) {
		    	                    richtlinie[h] = "Verhaltenskodex und sektorale Abläufe";
		    	                }
		    	                
		    	                
			                    System.out.println("=============================================================================="); 
		    	                System.out.println();
		    	                System.out.println("Geben Sie die neue Richtlinie (für ID '" + (h + 1) + "') ein: ");
		    	                eingabe = lesen.nextLine();
		    	                System.out.println();

		    	                if (eingabe.trim().isEmpty()) {
		    	                    break;
		    	                } else {
		    	                    handbuch[h] = eingabe;
		    	                }

				    	        System.out.println("==============================================================================");
		    	                System.out.println();
		    	                System.out.println("Die Richtlinie '" + bearbeitung + "' wurde in '" + nameDe[h] + "' geändert!");
		    	                System.out.println();
		    	            }
		    	        }
		    	    }

		    	} else if (suchMethode.equals("2") || suchMethode.equalsIgnoreCase("ID")) {
		    	    System.out.println();
		    	    System.out.println("Geben Sie die ID der gewünschten Richtlinie ein: ");
		    	    findeBearbeitung = lesen.nextInt();
		    	    lesen.nextLine();
		    	    System.out.println();

		    	    for (int h = 0; h < nameDe.length; h++) {
		    	        if (findeBearbeitung == (h + 1) && richtlinie[h] != null && !richtlinie[h].isEmpty()) {

		    	            System.out.println("======================== Was möchten Sie bearbeiten? =========================\n");
		    	            System.out.println("1- Name; \n2- Typ; \n3- Richtlinie; \n4- Alle; ");
		    	            bearbeiten = lesen.nextLine();
		    	            String eingabe;
		    	            System.out.println();
			    	        System.out.println("==============================================================================");

		    	            if (bearbeiten.equalsIgnoreCase("Name") || bearbeiten.equalsIgnoreCase("1")) {
		    	                System.out.println();
		    	                System.out.println("Geben Sie den neuen Namen der Richtlinie (für ID '" + (h + 1) + "') ein: ");
		    	                eingabe = lesen.nextLine();
		    	                System.out.println();

		    	                if (eingabe.trim().isEmpty()) {
		    	                    break;
		    	                } else {
		    	                    nameDe[h] = eingabe;
		    	                }

				    	        System.out.println("==============================================================================");
		    	                System.out.println();
		    	                System.out.println("Die Richtlinie '" + bearbeitung + "' wurde in '" + nameDe[h] + "' geändert!");
		    	                System.out.println();

		    	            } else if (bearbeiten.equalsIgnoreCase("Typ") || bearbeiten.equalsIgnoreCase("2")) {
		    	                System.out.println("\n============= Wählen Sie den neuen Typ der Richtlinie (ID '" + (h + 1) + "') ===============\n");
		    	                System.out.println("1- Bedienungsanleitung;\n2- Sicherheitsverfahren;\n3- Wartung und Reparaturen;\n4- Tests und Diagnosen;\n5- Verhaltenskodex und sektorale Abläufe;");
		    	                eingabe = lesen.nextLine();
		    	                System.out.println();

		    	                if (eingabe.trim().isEmpty()) {
		    	                    break;
		    	                } else if (eingabe.equalsIgnoreCase("1") || eingabe.equalsIgnoreCase("Bedienungsanleitung")) {
		    	                    richtlinie[h] = "Bedienungsanleitung";
		    	                } else if (eingabe.equalsIgnoreCase("2") || eingabe.equalsIgnoreCase("Sicherheitsverfahren")) {
		    	                    richtlinie[h] = "Sicherheitsverfahren";
		    	                } else if (eingabe.equalsIgnoreCase("3") || eingabe.equalsIgnoreCase("Wartung und Reparaturen")) {
		    	                    richtlinie[h] = "Wartung und Reparaturen";
		    	                } else if (eingabe.equalsIgnoreCase("4") || eingabe.equalsIgnoreCase("Tests und Diagnosen")) {
		    	                    richtlinie[h] = "Tests und Diagnosen";
		    	                } else if (eingabe.equalsIgnoreCase("5") || eingabe.equalsIgnoreCase("Verhaltenskodex und sektorale Abläufe")) {
		    	                    richtlinie[h] = "Verhaltenskodex und sektorale Abläufe";
		    	                }

				    	        System.out.println("==============================================================================");
		    	                System.out.println();
		    	                System.out.println("Die Richtlinie '" + bearbeitung + "' wurde geändert!");
		    	                System.out.println();

		    	            } else if (bearbeiten.equalsIgnoreCase("Richtlinie") || bearbeiten.equalsIgnoreCase("3")) {
		    	                System.out.println();
		    	                System.out.println("Geben Sie die neue Richtlinie (für ID '" + (h + 1) + "') ein: ");
		    	                eingabe = lesen.nextLine();
		    	                System.out.println();

		    	                if (eingabe.trim().isEmpty()) {
		    	                    break;
		    	                } else {
		    	                    handbuch[h] = eingabe;
		    	                }

				    	        System.out.println("==============================================================================");
		    	                System.out.println();
		    	                System.out.println("Die Richtlinie '" + bearbeitung + "' wurde geändert!");
		    	                System.out.println();

		    	            } else if (bearbeiten.equalsIgnoreCase("Alle") || bearbeiten.equalsIgnoreCase("4")) {
		    	                System.out.println();
		    	                System.out.println("Geben Sie den neuen Namen der Richtlinie (für ID '" + (h + 1) + "') ein: ");
		    	                eingabe = lesen.nextLine();

		    	                if (eingabe.trim().isEmpty()) {
		    	                    break;
		    	                } else {
		    	                    nameDe[h] = eingabe;
		    	                }

		    	                System.out.println("\n============= Wählen Sie den neuen Typ der Richtlinie (ID '" + (h + 1) + "') ==============\n");
		    	                System.out.println("1- Bedienungsanleitung;\n2- Sicherheitsverfahren;\n3- Wartung und Reparaturen;\n4- Tests und Diagnosen;\n5- Verhaltenskodex und sektorale Abläufe;");
		    	                eingabe = lesen.nextLine();
		    	                System.out.println();

		    	                if (eingabe.trim().isEmpty()) {
		    	                    break;
		    	                } else if (eingabe.equalsIgnoreCase("1") || eingabe.equalsIgnoreCase("Bedienungsanleitung")) {
		    	                    richtlinie[h] = "Bedienungsanleitung";
		    	                } else if (eingabe.equalsIgnoreCase("2") || eingabe.equalsIgnoreCase("Sicherheitsverfahren")) {
		    	                    richtlinie[h] = "Sicherheitsverfahren";
		    	                } else if (eingabe.equalsIgnoreCase("3") || eingabe.equalsIgnoreCase("Wartung und Reparaturen")) {
		    	                    richtlinie[h] = "Wartung und Reparaturen";
		    	                } else if (eingabe.equalsIgnoreCase("4") || eingabe.equalsIgnoreCase("Tests und Diagnosen")) {
		    	                    richtlinie[h] = "Tests und Diagnosen";
		    	                } else if (eingabe.equalsIgnoreCase("5") || eingabe.equalsIgnoreCase("Verhaltenskodex und sektorale Abläufe")) {
		    	                    richtlinie[h] = "Verhaltenskodex und sektorale Abläufe";
		    	                }

				    	        System.out.println("==============================================================================");
		    	                System.out.println();
		    	                System.out.println("Geben Sie die neue Richtlinie (für ID '" + (h + 1) + "') ein: ");
		    	                eingabe = lesen.nextLine();
		    	                System.out.println();

		    	                if (eingabe.trim().isEmpty()) {
		    	                    break;
		    	                } else {
		    	                    handbuch[h] = eingabe;
		    	                }

				    	        System.out.println("==============================================================================");
		    	                System.out.println();
		    	                System.out.println("Die Richtlinie '" + bearbeitung + "' wurde in '" + nameDe[h] + "' geändert!");
		    	                System.out.println();
		    	            }
		    	        }
		    	    }
		    	}
		         
		        //LÖSCHEN-------------------------------------------------------------------------------------------------------------

		    }else if(menü.equals("löschen") || menü.equals("4")) {
		    	
		    	System.out.println();
		    	System.out.println("======================== Wählen Sie die Löschmethode =========================\n");
		    	System.out.println("1- Name; \n2- ID; ");
		    	String löschMethode = lesen.nextLine();
		    	System.out.println();
    	        System.out.println("==============================================================================");

		    	if (löschMethode.equalsIgnoreCase("name") || löschMethode.equalsIgnoreCase("1")) {

		    	    System.out.println();
		    	    System.out.println("**Hinweis: Wenn mehrere Richtlinien denselben Namen haben, werden alle \ngelöscht. \n\n**Tipp: Sie können die ID als Löschmethode wählen, um dies zu vermeiden. \n\nGeben Sie den Namen der gewünschten Richtlinie ein: ");
		    	    löschen = lesen.nextLine();
		    	    System.out.println();

		    	    boolean entfernt = false;
		    	    int g = 0;

		    	    while (g < id) {

		    	        if (nameDe[g] != null && nameDe[g].equalsIgnoreCase(löschen)) {
		    	            for (int p = g; p < id - 1; p++) {
		    	                nameDe[p] = nameDe[p + 1];
		    	                handbuch[p] = handbuch[p + 1];
		    	                richtlinie[p] = richtlinie[p + 1];
		    	            }

		    	            nameDe[id - 1] = null;
		    	            handbuch[id - 1] = null;
		    	            richtlinie[id - 1] = null;
		    	            id--;
		    	            entfernt = true;

		    	        } else {
		    	            g++;
		    	        }

		    	    }

		    	    if (entfernt) {
		    	        System.out.println("==============================================================================");
		    	        System.out.println();
		    	        System.out.println("    Alle Richtlinien mit dem Namen '" + löschen + "' wurden gelöscht.");
		    	        System.out.println();

		    	    } else {
		    	        System.out.println("==============================================================================");
		    	        System.out.println();
		    	        System.out.println("    Die Richtlinie '" + löschen + "' wurde nicht gefunden und daher nicht gelöscht.");
		    	        System.out.println();
		    	    }

		    	} else if (löschMethode.equalsIgnoreCase("id") || löschMethode.equalsIgnoreCase("2")) {

		    	    System.out.println();
		    	    System.out.println("Geben Sie die ID der gewünschten Richtlinie ein: ");
		    	    int löschId = lesen.nextInt();
		    	    lesen.nextLine(); 
		    	    System.out.println();

		    	    int index = löschId - 1;

		    	    if (index >= 0 && index < id && nameDe[index] != null) {
		    	        for (int p = index; p < id - 1; p++) {
		    	            nameDe[p] = nameDe[p + 1];
		    	            handbuch[p] = handbuch[p + 1];
		    	            richtlinie[p] = richtlinie[p + 1];
		    	        }

		    	        nameDe[id - 1] = null;
		    	        handbuch[id - 1] = null;
		    	        richtlinie[id - 1] = null;
		    	        id--;

		    	        System.out.println("==============================================================================");
		    	        System.out.println();
		    	        System.out.println("              Die Richtlinie mit der ID '" + löschId + "' wurde gelöscht.");
		    	        System.out.println();

		    	    } else {
		    	        System.out.println("==============================================================================");
		    	        System.out.println();
		    	        System.out.println("    Die Richtlinie mit der ID '" + löschId + "' wurde nicht gefunden und daher nicht gelöscht.");
		    	        System.out.println();
		    	    }
		    	}

		                
		        //SPRACHE ÄNDERN-------------------------------------------------------------------------------------------------------------

		    } else if(menü.equalsIgnoreCase("Sprache ändern") || menü.equals("5")) {
		    	Sincronizar.sincronizarIdiomas();
		    	PaginaInicial.showMenu();
		    	break;
		    	
		        //BEENDEN-------------------------------------------------------------------------------------------------------------
		    	
		    } else if (menü.equalsIgnoreCase("Beenden") || menü.equals("6")) {
		    	System.out.println("\nVielen Dank für die Nutzung von WegOne! \nBesuchen Sie uns bald wieder.\n");
    	        System.out.println("==============================================================================");
		    }
			
			}while(!menü.equals("6") && !menü.equalsIgnoreCase("Beenden"));
			
			lesen.close();
		}	
}