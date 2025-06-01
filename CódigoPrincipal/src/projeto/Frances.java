package projeto;

import java.util.Scanner;

public class Frances {
	
	Scanner lire = new Scanner(System.in);

	int rechercherId = 0, trouverEdition = 0;
	String menu = null, rechercherNom = null, supprimer, edition, modifier, methodeRecherche;
	static String []nom = new String[100];
	static String []manuelFr = new String[100];
	static String []directive = new String[100];
	int id = 10;
	
	public void frances() {
		
		Fixos.fixosFrances();

		System.out.println("======================= Bienvenue sur le site WegOne ! ======================="); 
		System.out.println(); 
		System.out.println("Ici, vous découvrirez nos projets, apprendrez nos solutions innovantes \net verrez comment nous transformons les idées en technologie.");
		System.out.println(); 

		do {

			System.out.println("=============================================================================="); 
			System.out.println(); 

			System.out.println("=============== Sélectionnez ce que vous voulez faire maintenant =============\n"); 
			System.out.println("1- Enregistrer une directive; \n2- Rechercher une directive; \n3- Modifier une directive; \n4- Supprimer une directive; \n5- Changer la langue; \n6- Quitter;"); 
			menu = lire.nextLine();

			System.out.println(); 
			System.out.println("=============================================================================="); 

		//ENREGISTRER-------------------------------------------------------------------------------------------------------------

		boolean répété = false;
		String écrit;
		if(menu.equalsIgnoreCase("enregistrer") || menu.equals("1")) {

		    System.out.println("\n================= Sélectionnez le type de directive souhaité =================");
		    System.out.println();
		    System.out.println("1- Manuel d'utilisation;\n2- Procédure de sécurité;\n3- Maintenance et réparations;\n4- Tests et diagnostics;\n5- Code de conduite et opérations sectorielles;");
		    directive[id] = lire.nextLine();
		    System.out.println();
			
		  //MANUEL D'UTILISATION-------------------------------------------------------------------------------------------------------------

		    if(directive[id].equalsIgnoreCase("Manuel d'utilisation") || directive[id].equals("1")) {

		        System.out.println("=================== Sélectionnez l'option d'enregistrement ===================\n");
		        System.out.println("1- Seulement dans la langue actuelle (français); \n2- Dans toutes les langues du site;");
		        int methodeEnregistrement = lire.nextInt();
		        lire.nextLine();
		        System.out.println();

		        if(directive[id].equalsIgnoreCase("1")) {
		            directive[id] = "Manuel d'utilisation";
		        }

		        for(int a = 0; a < nom.length; a++) {
		            if(nom[a] == null) {

		                System.out.println("=============================================================================="); 
		                System.out.println();
		                System.out.println("Tapez le nom de la directive : ");
		                écrit = lire.nextLine();
		                System.out.println();

		                while(écrit.trim().isEmpty()) {
		                    System.out.println("Invalide. Réessayez : ");
		                    écrit = lire.nextLine();
		                    System.out.println();
		                }

		                nom[a] = écrit;
		                String afficher = écrit;
		                System.out.println("==============================================================================");
		                System.out.println();

		                if (methodeEnregistrement == 2){

		                    System.out.println("Tapez le nom de la directive en portugais : ");
		                    écrit = lire.nextLine();
		                    System.out.println();

		                    while(écrit.trim().isEmpty()) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit = lire.nextLine();
		                        System.out.println();
		                    }

		                    Portugues.nome[a] = écrit;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    System.out.println("Tapez le nom de la directive en espagnol : ");
		                    écrit = lire.nextLine();
		                    System.out.println();

		                    while(écrit.trim().isEmpty()) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit = lire.nextLine();
		                        System.out.println();
		                    }

		                    Espanhol.nombre[a] = écrit;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    System.out.println("Tapez le nom de la directive en allemand : ");
		                    écrit = lire.nextLine();
		                    System.out.println();

		                    while(écrit.trim().isEmpty()) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit = lire.nextLine();
		                        System.out.println();
		                    }

		                    Alemao.nameDe[a] = écrit;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    System.out.println("Tapez le nom de la directive en anglais : ");
		                    écrit = lire.nextLine();
		                    System.out.println();

		                    while(écrit.trim().isEmpty()) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit = lire.nextLine();
		                        System.out.println();
		                    }

		                    Ingles.name[a] = écrit;
		                    System.out.println("==============================================================================");
		                    System.out.println();
		                }

		                System.out.println("Tapez la directive : ");
		                String écrit1 = lire.nextLine();
		                System.out.println();

		                while(écrit1.trim().isEmpty() || répété) {
		                    System.out.println("Invalide. Réessayez : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();
		                }

		                System.out.println("==============================================================================");
		                System.out.println();
		                manuelFr[a] = écrit1;

		                if (methodeEnregistrement == 2){

		                    System.out.println("Tapez la directive en portugais : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();

		                    while(écrit1.trim().isEmpty() || répété) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit1 = lire.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Portugues.manualPt[a] = écrit1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Tapez la directive en espagnol : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();

		                    while(écrit1.trim().isEmpty() || répété) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit1 = lire.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Espanhol.manualEs[a] = écrit1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Tapez la directive en allemand : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();

		                    while(écrit1.trim().isEmpty() || répété) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit1 = lire.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Alemao.handbuch[a] = écrit1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Tapez la directive en anglais : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();

		                    while(écrit1.trim().isEmpty() || répété) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit1 = lire.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Ingles.manualEn[a] = écrit1;
		                }

		                directive[a] = "Manuel d'utilisation";

		                System.out.println("               La directive '" + afficher + "' a été enregistrée !");
		                System.out.println();

		                break;
		            }
		        }
				
			//PROCEDURE DE SECURITE-------------------------------------------------------------------------------------------------------------
				
			}else if(directive[id].equalsIgnoreCase("Procédure de sécurité") || directive[id].equals("2")) {
				
		        System.out.println("=================== Sélectionnez l'option d'enregistrement ===================\n");
		        System.out.println("1- Seulement dans la langue actuelle (français); \n2- Dans toutes les langues du site;");
		        int methodeEnregistrement = lire.nextInt();
		        lire.nextLine();
		        System.out.println();

		        if(directive[id].equalsIgnoreCase("2")) {
		            directive[id] = "Procédure de sécurité";
		        }

		        for(int b = 0; b < nom.length; b++) {
		            if(nom[b] == null) {

		                System.out.println("=============================================================================="); 
		                System.out.println();
		                System.out.println("Tapez le nom de la directive : ");
		                écrit = lire.nextLine();
		                System.out.println();

		                while(écrit.trim().isEmpty()) {
		                    System.out.println("Invalide. Réessayez : ");
		                    écrit = lire.nextLine();
		                    System.out.println();
		                }

		                nom[b] = écrit;
		                String afficher = écrit;
		                System.out.println("==============================================================================");
		                System.out.println();

		                if (methodeEnregistrement == 2){

		                    System.out.println("Tapez le nom de la directive en portugais : ");
		                    écrit = lire.nextLine();
		                    System.out.println();

		                    while(écrit.trim().isEmpty()) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit = lire.nextLine();
		                        System.out.println();
		                    }

		                    Portugues.nome[b] = écrit;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    System.out.println("Tapez le nom de la directive en espagnol : ");
		                    écrit = lire.nextLine();
		                    System.out.println();

		                    while(écrit.trim().isEmpty()) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit = lire.nextLine();
		                        System.out.println();
		                    }

		                    Espanhol.nombre[b] = écrit;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    System.out.println("Tapez le nom de la directive en allemand : ");
		                    écrit = lire.nextLine();
		                    System.out.println();

		                    while(écrit.trim().isEmpty()) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit = lire.nextLine();
		                        System.out.println();
		                    }

		                    Alemao.nameDe[b] = écrit;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    System.out.println("Tapez le nom de la directive en anglais : ");
		                    écrit = lire.nextLine();
		                    System.out.println();

		                    while(écrit.trim().isEmpty()) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit = lire.nextLine();
		                        System.out.println();
		                    }

		                    Ingles.name[b] = écrit;
		                    System.out.println("==============================================================================");
		                    System.out.println();
		                }

		                System.out.println("Tapez la directive : ");
		                String écrit1 = lire.nextLine();
		                System.out.println();

		                while(écrit1.trim().isEmpty() || répété) {
		                    System.out.println("Invalide. Réessayez : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();
		                }

		                System.out.println("==============================================================================");
		                System.out.println();
		                manuelFr[b] = écrit1;

		                if (methodeEnregistrement == 2){

		                    System.out.println("Tapez la directive en portugais : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();

		                    while(écrit1.trim().isEmpty() || répété) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit1 = lire.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Portugues.manualPt[b] = écrit1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Tapez la directive en espagnol : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();

		                    while(écrit1.trim().isEmpty() || répété) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit1 = lire.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Espanhol.manualEs[b] = écrit1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Tapez la directive en allemand : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();

		                    while(écrit1.trim().isEmpty() || répété) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit1 = lire.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Alemao.handbuch[b] = écrit1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Tapez la directive en anglais : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();

		                    while(écrit1.trim().isEmpty() || répété) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit1 = lire.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Ingles.manualEn[b] = écrit1;
		                }

		                directive[b] = "Procédure de sécurité";

		                System.out.println("               La directive '" + afficher + "' a été enregistrée !");
		                System.out.println();

		                break;
		            }
		        }
				
			//MAINTENANCE ET REPARATIONS-------------------------------------------------------------------------------------------------------------
				
			}else if(directive[id].equalsIgnoreCase("Maintenance et réparations") || directive[id].equals("3")) {
				
		        System.out.println("=================== Sélectionnez l'option d'enregistrement ===================\n");
		        System.out.println("1- Seulement dans la langue actuelle (français); \n2- Dans toutes les langues du site;");
		        int methodeEnregistrement = lire.nextInt();
		        lire.nextLine();
		        System.out.println();

		        if(directive[id].equalsIgnoreCase("3")) {
		            directive[id] = "Maintenance et réparations";
		        }

		        for(int c = 0; c < nom.length; c++) {
		            if(nom[c] == null) {

		                System.out.println("==============================================================================");
		                System.out.println();
		                System.out.println("Tapez le nom de la directive : ");
		                écrit = lire.nextLine();
		                System.out.println();

		                while(écrit.trim().isEmpty()) {
		                    System.out.println("Invalide. Réessayez : ");
		                    écrit = lire.nextLine();
		                    System.out.println();
		                }

		                nom[c] = écrit;
		                String afficher = écrit;
		                System.out.println("==============================================================================");
		                System.out.println();

		                if (methodeEnregistrement == 2){

		                    System.out.println("Tapez le nom de la directive en portugais : ");
		                    écrit = lire.nextLine();
		                    System.out.println();

		                    while(écrit.trim().isEmpty()) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit = lire.nextLine();
		                        System.out.println();
		                    }

		                    Portugues.nome[c] = écrit;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    System.out.println("Tapez le nom de la directive en espagnol : ");
		                    écrit = lire.nextLine();
		                    System.out.println();

		                    while(écrit.trim().isEmpty()) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit = lire.nextLine();
		                        System.out.println();
		                    }

		                    Espanhol.nombre[c] = écrit;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    System.out.println("Tapez le nom de la directive en allemand : ");
		                    écrit = lire.nextLine();
		                    System.out.println();

		                    while(écrit.trim().isEmpty()) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit = lire.nextLine();
		                        System.out.println();
		                    }

		                    Alemao.nameDe[c] = écrit;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    System.out.println("Tapez le nom de la directive en anglais : ");
		                    écrit = lire.nextLine();
		                    System.out.println();

		                    while(écrit.trim().isEmpty()) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit = lire.nextLine();
		                        System.out.println();
		                    }

		                    Ingles.name[c] = écrit;
		                    System.out.println("==============================================================================");
		                    System.out.println();
		                }

		                System.out.println("Tapez la directive : ");
		                String écrit1 = lire.nextLine();
		                System.out.println();

		                while(écrit1.trim().isEmpty() || répété) {
		                    System.out.println("Invalide. Réessayez : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();
		                }

		                System.out.println("==============================================================================");
		                System.out.println();
		                manuelFr[c] = écrit1;

		                if (methodeEnregistrement == 2){

		                    System.out.println("Tapez la directive en portugais : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();

		                    while(écrit1.trim().isEmpty() || répété) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit1 = lire.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Portugues.manualPt[c] = écrit1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Tapez la directive en espagnol : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();

		                    while(écrit1.trim().isEmpty() || répété) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit1 = lire.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Espanhol.manualEs[c] = écrit1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Tapez la directive en allemand : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();

		                    while(écrit1.trim().isEmpty() || répété) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit1 = lire.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Alemao.handbuch[c] = écrit1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Tapez la directive en anglais : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();

		                    while(écrit1.trim().isEmpty() || répété) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit1 = lire.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Ingles.manualEn[c] = écrit1;
		                }

		                directive[c] = "Maintenance et réparations";

		                System.out.println("               La directive '" + afficher + "' a été enregistrée !");
		                System.out.println();

		                break;
		            }
		        }
				
			//TESTS ET DIAGNOSTICS-------------------------------------------------------------------------------------------------------------
				
			}else if(directive[id].equalsIgnoreCase("Tests et diagnostics") || directive[id].equals("4")) {
				
		        System.out.println("=================== Sélectionnez l'option d'enregistrement ===================\n");
		        System.out.println("1- Seulement dans la langue actuelle (français); \n2- Dans toutes les langues du site;");
		        int methodeEnregistrement = lire.nextInt();
		        lire.nextLine();
		        System.out.println();

		        if(directive[id].equalsIgnoreCase("4")) {
		            directive[id] = "Tests et diagnostics";
		        }

		        for(int d = 0; d < nom.length; d++) {
		            if(nom[d] == null) {

		                System.out.println("==============================================================================");
		                System.out.println();
		                System.out.println("Tapez le nom de la directive : ");
		                écrit = lire.nextLine();
		                System.out.println();

		                while(écrit.trim().isEmpty()) {
		                    System.out.println("Invalide. Réessayez : ");
		                    écrit = lire.nextLine();
		                    System.out.println();
		                }

		                nom[d] = écrit;
		                String afficher = écrit;
		                System.out.println("==============================================================================");
		                System.out.println();

		                if (methodeEnregistrement == 2){

		                    System.out.println("Tapez le nom de la directive en portugais : ");
		                    écrit = lire.nextLine();
		                    System.out.println();

		                    while(écrit.trim().isEmpty()) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit = lire.nextLine();
		                        System.out.println();
		                    }

		                    Portugues.nome[d] = écrit;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    System.out.println("Tapez le nom de la directive en espagnol : ");
		                    écrit = lire.nextLine();
		                    System.out.println();

		                    while(écrit.trim().isEmpty()) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit = lire.nextLine();
		                        System.out.println();
		                    }

		                    Espanhol.nombre[d] = écrit;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    System.out.println("Tapez le nom de la directive en allemand : ");
		                    écrit = lire.nextLine();
		                    System.out.println();

		                    while(écrit.trim().isEmpty()) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit = lire.nextLine();
		                        System.out.println();
		                    }

		                    Alemao.nameDe[d] = écrit;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    System.out.println("Tapez le nom de la directive en anglais : ");
		                    écrit = lire.nextLine();
		                    System.out.println();

		                    while(écrit.trim().isEmpty()) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit = lire.nextLine();
		                        System.out.println();
		                    }

		                    Ingles.name[d] = écrit;
		                    System.out.println("==============================================================================");
		                    System.out.println();
		                }

		                System.out.println("Tapez la directive : ");
		                String écrit1 = lire.nextLine();
		                System.out.println();

		                while(écrit1.trim().isEmpty() || répété) {
		                    System.out.println("Invalide. Réessayez : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();
		                }

		                System.out.println("==============================================================================");
		                System.out.println();
		                manuelFr[d] = écrit1;

		                if (methodeEnregistrement == 2){

		                    System.out.println("Tapez la directive en portugais : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();

		                    while(écrit1.trim().isEmpty() || répété) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit1 = lire.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Portugues.manualPt[d] = écrit1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Tapez la directive en espagnol : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();

		                    while(écrit1.trim().isEmpty() || répété) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit1 = lire.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Espanhol.manualEs[d] = écrit1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Tapez la directive en allemand : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();

		                    while(écrit1.trim().isEmpty() || répété) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit1 = lire.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Alemao.handbuch[d] = écrit1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Tapez la directive en anglais : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();

		                    while(écrit1.trim().isEmpty() || répété) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit1 = lire.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Ingles.manualEn[d] = écrit1;
		                }

		                directive[d] = "Tests et diagnostics";

		                System.out.println("               La directive '" + afficher + "' a été enregistrée !");
		                System.out.println();

		                break;
		            }
		        }
				
			//CODE DE CONDUITE ET OPERATIONS SECTORIELLES-------------------------------------------------------------------------------------------------------------
				
			}else if(directive[id].equalsIgnoreCase("Code de conduite et opérations sectorielles") || directive[id].equals("5")) {
				
		        System.out.println("=================== Sélectionnez l'option d'enregistrement ===================\n");
		        System.out.println("1- Seulement dans la langue actuelle (français); \n2- Dans toutes les langues du site;");
		        int methodeEnregistrement = lire.nextInt();
		        lire.nextLine();
		        System.out.println();

		        if(directive[id].equalsIgnoreCase("5")) {
		            directive[id] = "Code de conduite et opérations sectorielles";
		        }

		        for(int e = 0; e < nom.length; e++) {
		            if(nom[e] == null) {

		                System.out.println("=============================================================================="); 
		                System.out.println();
		                System.out.println("Tapez le nom de la directive : ");
		                écrit = lire.nextLine();
		                System.out.println();

		                while(écrit.trim().isEmpty()) {
		                    System.out.println("Invalide. Réessayez : ");
		                    écrit = lire.nextLine();
		                    System.out.println();
		                }

		                nom[e] = écrit;
		                String afficher = écrit;
		                System.out.println("==============================================================================");
		                System.out.println();

		                if (methodeEnregistrement == 2){

		                    System.out.println("Tapez le nom de la directive en portugais : ");
		                    écrit = lire.nextLine();
		                    System.out.println();

		                    while(écrit.trim().isEmpty()) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit = lire.nextLine();
		                        System.out.println();
		                    }

		                    Portugues.nome[e] = écrit;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    System.out.println("Tapez le nom de la directive en espagnol : ");
		                    écrit = lire.nextLine();
		                    System.out.println();

		                    while(écrit.trim().isEmpty()) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit = lire.nextLine();
		                        System.out.println();
		                    }

		                    Espanhol.nombre[e] = écrit;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    System.out.println("Tapez le nom de la directive en allemand : ");
		                    écrit = lire.nextLine();
		                    System.out.println();

		                    while(écrit.trim().isEmpty()) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit = lire.nextLine();
		                        System.out.println();
		                    }

		                    Alemao.nameDe[e] = écrit;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    System.out.println("Tapez le nom de la directive en anglais : ");
		                    écrit = lire.nextLine();
		                    System.out.println();

		                    while(écrit.trim().isEmpty()) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit = lire.nextLine();
		                        System.out.println();
		                    }

		                    Ingles.name[e] = écrit;
		                    System.out.println("==============================================================================");
		                    System.out.println();
		                }

		                System.out.println("Tapez la directive : ");
		                String écrit1 = lire.nextLine();
		                System.out.println();

		                while(écrit1.trim().isEmpty() || répété) {
		                    System.out.println("Invalide. Réessayez : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();
		                }

		                System.out.println("==============================================================================");
		                System.out.println();
		                manuelFr[e] = écrit1;

		                if (methodeEnregistrement == 2){

		                    System.out.println("Tapez la directive en portugais : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();

		                    while(écrit1.trim().isEmpty() || répété) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit1 = lire.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Portugues.manualPt[e] = écrit1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Tapez la directive en espagnol : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();

		                    while(écrit1.trim().isEmpty() || répété) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit1 = lire.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Espanhol.manualEs[e] = écrit1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Tapez la directive en allemand : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();

		                    while(écrit1.trim().isEmpty() || répété) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit1 = lire.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Alemao.handbuch[e] = écrit1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Tapez la directive en anglais : ");
		                    écrit1 = lire.nextLine();
		                    System.out.println();

		                    while(écrit1.trim().isEmpty() || répété) {
		                        System.out.println("Invalide. Réessayez : ");
		                        écrit1 = lire.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Ingles.manualEn[e] = écrit1;
		                }

		                directive[e] = "Code de conduite et opérations sectorielles";

		                System.out.println("               La directive '" + afficher + "' a été enregistrée !");
		                System.out.println();

		                break;
		            }
		        }
			} id++;
			
			//RECHERCHE-------------------------------------------------------------------------------------------------------------

		} else if(menu.equalsIgnoreCase("Rechercher") || menu.equals("2")) {

		    System.out.println();
		    System.out.println("==================== Sélectionnez la méthode de recherche ====================\n");
		    System.out.println("1- Nom ; \n2- Id ; ");
		    methodeRecherche = lire.nextLine();
		    System.out.println();
		    System.out.println("=============================================================================="); 

		    boolean trouvé = false;

		    if (methodeRecherche.equalsIgnoreCase("nom") || methodeRecherche.equalsIgnoreCase("1")) {
		        System.out.println();
		        System.out.println("Tapez le nom de la directive recherchée : ");
		        rechercherNom = lire.nextLine();
		        System.out.println();

		        int compteur = 0;
		        for(int f = 0; f < nom.length; f++) {
		            if(nom[f] != null && nom[f].equalsIgnoreCase(rechercherNom)) {
		                compteur++;

		                if(compteur == 1) {

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    System.out.println("             La directive '" + rechercherNom + "' est déjà enregistrée !");
		                    System.out.println();
		                    System.out.println("=============================================================================="); 
		                    System.out.println("\n=========================== Directive Enregistrée ============================");

		                    System.out.println();
		                    System.out.println("-- Nom de la directive : " + nom[f]);
		                    System.out.println("-- Id de la directive : " + (f + 1));
		                    System.out.println("-- Type de la directive : " + directive[f]);

		                    if(manuelFr[f] != null) {
		                        System.out.println("-- Directive : " + manuelFr[f]);
		                        System.out.println();
		                    }

		                    trouvé = true;

		                } else {
		                    System.out.println("=============================================================================="); 
		                    System.out.println("\n=========================== Directive Enregistrée ============================");

		                    System.out.println();
		                    System.out.println("-- Nom de la directive : " + nom[f]);
		                    System.out.println("-- Id de la directive : " + (f + 1));
		                    System.out.println("-- Type de la directive : " + directive[f]);

		                    if(manuelFr[f] != null) {
		                        System.out.println("-- Directive : " + manuelFr[f]);
		                    }
		                    System.out.println();

		                    trouvé = true;
		                }

		            }
		        }

		        if(!trouvé) {
		            System.out.println("=============================================================================="); 
		            System.out.println();
		            System.out.println("             La directive '" + rechercherNom + "' n'est pas enregistrée !");
		            System.out.println();
		        }

		    } else if (methodeRecherche.equalsIgnoreCase("id") || methodeRecherche.equalsIgnoreCase("2")) {
		        System.out.println();
		        System.out.println("Tapez l'ID de la directive recherchée : ");
		        rechercherId = lire.nextInt();
		        lire.nextLine();
		        System.out.println();

		        for(int f = 0; f < nom.length; f++) {
		            if(rechercherId == (f + 1) && directive[f] != null && !directive[f].isEmpty()) {

		                System.out.println("==============================================================================");
		                System.out.println();
		                System.out.println("             La directive '" + rechercherId + "' est déjà enregistrée !");
		                System.out.println();
		                System.out.println("=============================================================================="); 
		                System.out.println("\n=========================== Directive Enregistrée ============================");

		                System.out.println();
		                System.out.println("-- Nom de la directive : " + nom[f]);
		                System.out.println("-- Id de la directive : " + (f + 1));
		                System.out.println("-- Type de la directive : " + directive[f]);

		                if(manuelFr[f] != null) {
		                    System.out.println("-- Directive : " + manuelFr[f]);
		                }
		                System.out.println();

		                trouvé = true;

		            }
		        }
		        if(!trouvé) {
		            System.out.println("=============================================================================="); 
		            System.out.println();
		            System.out.println("             La directive '" + rechercherId + "' n'est pas enregistrée !");
		            System.out.println();
		        }
		    }
		
		  //MODIFIER-------------------------------------------------------------------------------------------------------------

		} else if(menu.equals("modifier") || menu.equals("3") ) {

		    System.out.println();
		    System.out.println("=================== Sélectionnez la méthode de modification ==================\n");
		    System.out.println("1- Nom; \n2- ID; ");
		    String methodeModifier = lire.nextLine();
		    System.out.println();
		    System.out.println("=============================================================================="); 

		    if (methodeModifier.equals("1") || methodeModifier.equalsIgnoreCase("Nom")) {
		        System.out.println();
		        System.out.println("**Remarque : Si plusieurs directives ont des noms identiques, toutes seront \ndemandées pour modification. \n\n**Astuce : Vous pouvez laisser vide pour conserver celles que vous ne \nsouhaitez pas modifier, comme auparavant. \n\nTapez le nom de la directive souhaitée: ");
		        edition = lire.nextLine();
		        System.out.println();

		        for(int h = 0; h < nom.length; h++) {
		            if(nom[h] != null && nom[h].equalsIgnoreCase(edition)) {

		                System.out.println("================ Sélectionnez ce que vous souhaitez modifier =================\n");
		                System.out.println("1- Nom; \n2- Type; \n3- Directive; \n4- Tout; ");
		                modifier = lire.nextLine();
		                String ec;
		                System.out.println();
		                System.out.println("=============================================================================="); 

		                if(modifier.equalsIgnoreCase("Nom") || modifier.equalsIgnoreCase("1")) {

		                    System.out.println();
		                    System.out.println("Tapez le nouveau nom de la directive (ID '" + (h + 1) + "') : ");
		                    ec = lire.nextLine();
		                    System.out.println();

		                    if (ec.trim().isEmpty()){
		                        break;
		                    } else {
		                        nom[h] = ec;
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    System.out.println("         La directive '" + edition + "' a été modifiée en '" + nom[h] + "' !");
		                    System.out.println();

		                } else if(modifier.equalsIgnoreCase("type") || modifier.equalsIgnoreCase("2")) {

		                    System.out.println("\n============ Sélectionnez le nouveau type de directive (ID '" + (h + 1) + "') =============\n");
		                    System.out.println("1- Manuel d’exploitation;\n2- Procédure de sécurité;\n3- Maintenance et réparations;\n4- Tests et diagnostics;\n5- Code de conduite et opérations sectorielles;");
		                    ec = lire.nextLine();
		                    System.out.println();

		                    if (ec.trim().isEmpty()){
		                        break;
		                    } else if(ec.equalsIgnoreCase("1") || ec.equalsIgnoreCase("Manuel d’exploitation")) {
		                        directive[h] = "Manuel d’exploitation";
		                    } else if(ec.equalsIgnoreCase("2") || ec.equalsIgnoreCase("Procédure de sécurité")) {
		                        directive[h] = "Procédure de sécurité";
		                    } else if(ec.equalsIgnoreCase("3") || ec.equalsIgnoreCase("Maintenance et réparations")) {
		                        directive[h] = "Maintenance et réparations";
		                    } else if(ec.equalsIgnoreCase("4") || ec.equalsIgnoreCase("Tests et diagnostics")) {
		                        directive[h] = "Tests et diagnostics";
		                    } else if(ec.equalsIgnoreCase("5") || ec.equalsIgnoreCase("Code de conduite et opérations sectorielles")) {
		                        directive[h] = "Code de conduite et opérations sectorielles";
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    System.out.println("               La directive '" + edition + "' a été modifiée !");
		                    System.out.println();

		                } else if(modifier.equalsIgnoreCase("directive") || modifier.equalsIgnoreCase("3")) {
		                    System.out.println();
		                    System.out.println("Tapez la nouvelle directive (ID '" + (h + 1) + "') : ");
		                    ec = lire.nextLine();
		                    System.out.println();

		                    if (ec.trim().isEmpty()){
		                        break;
		                    } else {
		                        manuelFr[h] = ec;
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    System.out.println("               La directive '" + edition + "' a été modifiée !");
		                    System.out.println();

		                } else if(modifier.equalsIgnoreCase("tout") || modifier.equalsIgnoreCase("4")) {

		                    System.out.println();
		                    System.out.println("Tapez le nouveau nom de la directive (ID '" + (h + 1) + "') : ");
		                    ec = lire.nextLine();

		                    if (ec.trim().isEmpty()){
		                        break;
		                    } else {
		                        nom[h] = ec;
		                    }

		                    System.out.println("\n============ Sélectionnez le nouveau type de directive (ID '" + (h + 1) + "') =============\n");
		                    System.out.println("1- Manuel d’exploitation;\n2- Procédure de sécurité;\n3- Maintenance et réparations;\n4- Tests et diagnostics;\n5- Code de conduite et opérations sectorielles;");
		                    ec = lire.nextLine();
		                    System.out.println();
		                    System.out.println("=============================================================================="); 

		                    if (ec.trim().isEmpty()){
		                        break;
		                    } else if(ec.equalsIgnoreCase("1") || ec.equalsIgnoreCase("Manuel d’exploitation")) {
		                        directive[h] = "Manuel d’exploitation";
		                    } else if(ec.equalsIgnoreCase("2") || ec.equalsIgnoreCase("Procédure de sécurité")) {
		                        directive[h] = "Procédure de sécurité";
		                    } else if(ec.equalsIgnoreCase("3") || ec.equalsIgnoreCase("Maintenance et réparations")) {
		                        directive[h] = "Maintenance et réparations";
		                    } else if(ec.equalsIgnoreCase("4") || ec.equalsIgnoreCase("Tests et diagnostics")) {
		                        directive[h] = "Tests et diagnostics";
		                    } else if(ec.equalsIgnoreCase("5") || ec.equalsIgnoreCase("Code de conduite et opérations sectorielles")) {
		                        directive[h] = "Code de conduite et opérations sectorielles";
		                    }

		                    System.out.println();
		                    System.out.println("Tapez la nouvelle directive (ID '" + (h + 1) + "') : ");
		                    ec = lire.nextLine();
		                    System.out.println();

		                    if (ec.trim().isEmpty()){
		                        break;
		                    } else {
		                        manuelFr[h] = ec;
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    System.out.println("         La directive '" + edition + "' a été modifiée en '" + nom[h] + "' !");
		                    System.out.println();

		                }
		            }
		        }

		    } else if(methodeModifier.equals("2") || methodeModifier.equalsIgnoreCase("id")) {

		        System.out.println();
		        System.out.println("Tapez l’ID de la directive souhaitée : ");
		        trouverEdition = lire.nextInt();
		        lire.nextLine();
		        System.out.println();

		        for(int h = 0; h < nom.length; h++) {
		            if(trouverEdition == (h + 1) && directive[h] != null && !directive[h].isEmpty()) {

		                System.out.println("================ Sélectionnez ce que vous souhaitez modifier =================\n");
		                System.out.println("1- Nom; \n2- Type; \n3- Directive; \n4- Tout; ");
		                modifier = lire.nextLine();
		                String ec;
		                System.out.println();
		                System.out.println("==============================================================================");

		                if(modifier.equalsIgnoreCase("Nom") || modifier.equalsIgnoreCase("1")) {

		                    System.out.println();
		                    System.out.println("Tapez le nouveau nom de la directive (ID '" + (h + 1) + "') : ");
		                    ec = lire.nextLine();
		                    System.out.println();

		                    if (ec.trim().isEmpty()){
		                        break;
		                    } else {
		                        nom[h] = ec;
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    System.out.println("         La directive '" + edition + "' a été modifiée en '" + nom[h] + "' !");
		                    System.out.println();

		                } else if(modifier.equalsIgnoreCase("type") || modifier.equalsIgnoreCase("2")) {

		                    System.out.println("\n============ Sélectionnez le nouveau type de directive (ID '" + (h + 1) + "') =============\n");
		                    System.out.println("1- Manuel d’exploitation;\n2- Procédure de sécurité;\n3- Maintenance et réparations;\n4- Tests et diagnostics;\n5- Code de conduite et opérations sectorielles;");
		                    ec = lire.nextLine();
		                    System.out.println();

		                    if (ec.trim().isEmpty()){
		                        break;
		                    } else if(ec.equalsIgnoreCase("1") || ec.equalsIgnoreCase("Manuel d’exploitation")) {
		                        directive[h] = "Manuel d’exploitation";
		                    } else if(ec.equalsIgnoreCase("2") || ec.equalsIgnoreCase("Procédure de sécurité")) {
		                        directive[h] = "Procédure de sécurité";
		                    } else if(ec.equalsIgnoreCase("3") || ec.equalsIgnoreCase("Maintenance et réparations")) {
		                        directive[h] = "Maintenance et réparations";
		                    } else if(ec.equalsIgnoreCase("4") || ec.equalsIgnoreCase("Tests et diagnostics")) {
		                        directive[h] = "Tests et diagnostics";
		                    } else if(ec.equalsIgnoreCase("5") || ec.equalsIgnoreCase("Code de conduite et opérations sectorielles")) {
		                        directive[h] = "Code de conduite et opérations sectorielles";
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    System.out.println("               La directive '" + edition + "' a été modifiée !");
		                    System.out.println();

		                } else if(modifier.equalsIgnoreCase("directive") || modifier.equalsIgnoreCase("3")) {
		                    System.out.println();
		                    System.out.println("Tapez la nouvelle directive (ID '" + (h + 1) + "') : ");
		                    ec = lire.nextLine();
		                    System.out.println();

		                    if (ec.trim().isEmpty()){
		                        break;
		                    } else {
		                        manuelFr[h] = ec;
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    System.out.println("               La directive '" + edition + "' a été modifiée !");
		                    System.out.println();

		                } else if(modifier.equalsIgnoreCase("tout") || modifier.equalsIgnoreCase("4")) {

		                    System.out.println();
		                    System.out.println("Tapez le nouveau nom de la directive (ID '" + (h + 1) + "') : ");
		                    ec = lire.nextLine();

		                    if (ec.trim().isEmpty()){
		                        break;
		                    } else {
		                        nom[h] = ec;
		                    }

		                    System.out.println("\n============ Sélectionnez le nouveau type de directive (ID '" + (h + 1) + "') =============\n");
		                    System.out.println("1- Manuel d’exploitation;\n2- Procédure de sécurité;\n3- Maintenance et réparations;\n4- Tests et diagnostics;\n5- Code de conduite et opérations sectorielles;");
		                    ec = lire.nextLine();
		                    System.out.println();
		                    System.out.println("==============================================================================");

		                    if (ec.trim().isEmpty()){
		                        break;
		                    } else if(ec.equalsIgnoreCase("1") || ec.equalsIgnoreCase("Manuel d’exploitation")) {
		                        directive[h] = "Manuel d’exploitation";
		                    } else if(ec.equalsIgnoreCase("2") || ec.equalsIgnoreCase("Procédure de sécurité")) {
		                        directive[h] = "Procédure de sécurité";
		                    } else if(ec.equalsIgnoreCase("3") || ec.equalsIgnoreCase("Maintenance et réparations")) {
		                        directive[h] = "Maintenance et réparations";
		                    } else if(ec.equalsIgnoreCase("4") || ec.equalsIgnoreCase("Tests et diagnostics")) {
		                        directive[h] = "Tests et diagnostics";
		                    } else if(ec.equalsIgnoreCase("5") || ec.equalsIgnoreCase("Code de conduite et opérations sectorielles")) {
		                        directive[h] = "Code de conduite et opérations sectorielles";
		                    }
		                    
		                    
		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    System.out.println("Tapez la nouvelle directive (ID '" + (h + 1) + "') : ");
		                    ec = lire.nextLine();
		                    System.out.println();

		                    if (ec.trim().isEmpty()){
		                        break;
		                    } else {
		                        manuelFr[h] = ec;
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    System.out.println("         La directive '" + edition + "' a été modifiée en '" + nom[h] + "' !");
		                    System.out.println();
		                }
		            }
		        }
		    }
	         
		  //SUPPRIMER-------------------------------------------------------------------------------------------------------------

		} else if(menu.equals("supprimer") || menu.equals("4") ) {
	    	
	    	System.out.println();
            System.out.println("=================== Sélectionnez la méthode de suppression ===================\n");
	    	System.out.println("1- Nom; \n2- ID; ");
	    	String methodeSupprimer = lire.nextLine();
	        System.out.println();
			System.out.println("=============================================================================="); 

	        	if (methodeSupprimer.equalsIgnoreCase("nom") || methodeSupprimer.equalsIgnoreCase("1")) {
	 
	        		System.out.println();
		        	System.out.println("**Remarque : Si plusieurs directives ont des noms identiques, toutes seront \nsupprimées. \n\n**Astuce : Vous pouvez choisir l’ID comme méthode de suppression \npour éviter que cela ne se produise. \n\nTapez le nom de la directive souhaitée: ");
		     		supprimer = lire.nextLine();
		     		System.out.println();
	        		
	                boolean supprime = false;
	                int g = 0;
	                
	                while (g < id) {
	                	
	                	if (nom[g] != null && nom[g].equalsIgnoreCase(supprimer)) {
	                		for (int p = g; p < id - 1; p++) {
	                			nom[p] = nom[p + 1];
	                            manuelFr[p] = manuelFr[p + 1];
	                            directive[p] = directive[p + 1];
	                        }
	                		
	                		nom[id - 1] = null;
	                        manuelFr[id - 1] = null;
	                        directive[id - 1] = null;
	                        id--;
	                        supprime = true;
	                               
	                	} else {
	                        g++; 
	                    }
	                	
	                }

	                if (supprime) {
	                	System.out.println("==============================================================================");
    					System.out.println();
	                	System.out.println("      Toutes les directives portant le nom '" + supprimer + "' ont été supprimées.");
                        System.out.println();
	                	
	                } else {
	                	System.out.println("=============================================================================="); 
    					System.out.println();
	                	System.out.println(" La directive '" + supprimer + "' n’a pas été trouvée, elle n’a donc pas été supprimée.");
                        System.out.println();
	                }
	                 
	        	} else if (methodeSupprimer.equalsIgnoreCase("id") || methodeSupprimer.equalsIgnoreCase("2")) {
	        		
	        		System.out.println();
	        		System.out.println("Tapez l’ID de la directive souhaitée : ");
	                int supprimerId = lire.nextInt();
	                lire.nextLine(); 
	                System.out.println();
	                   
	                int index = supprimerId - 1;
	                
	                if (index >= 0 && index < id && nom[index] != null) {
	                	for (int p = index; p < id - 1; p++) {
	                		nom[p] = nom[p + 1];
	                		manuelFr[p] = manuelFr[p + 1];
	                		directive[p] = directive[p + 1];
	                	}
	                	
	                	nom[id - 1] = null;
	                	manuelFr[id - 1] = null;
	                	directive[id - 1] = null;
	                	id--;
	                   
	                	System.out.println("=============================================================================="); 
    					System.out.println();
	                	System.out.println("              La directive avec l’ID '" + supprimerId + "' a été supprimée.");
                        System.out.println();

	                } else {
	                	System.out.println("==============================================================================");
    					System.out.println();
	                	System.out.println(" La directive avec l’ID '" + supprimerId + "' n’a pas été trouvée, elle n’a donc pas été supprimée.");
                        System.out.println();
	                }
	        	}
	                
	        //CHANGER LA LANGUE-------------------------------------------------------------------------------------------------------------

	    } else if(menu.equalsIgnoreCase("Changer la langue") || menu.equals("5")) {
	    	Sincronizar.sincronizarIdiomas();
	    	PaginaInicial.showMenu();
	    	break;
	    	
	        //QUITTER-------------------------------------------------------------------------------------------------------------
	    	
	    } else if(menu.equalsIgnoreCase("Quitter") || menu.equals("6")) {
	    	System.out.println("\nMerci d'avoir utilisé WegOne ! \nRevenez bientôt.");
			System.out.println("\n==============================================================================");
	    }
		
		}while(!menu.equals("6") && !menu.equalsIgnoreCase("Quitter"));
		
		lire.close();
	}	
}