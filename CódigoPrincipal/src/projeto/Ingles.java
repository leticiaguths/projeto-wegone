package projeto;

import java.util.Scanner;

public class Ingles {
	
	Scanner read = new Scanner(System.in);
	
	int searchId = 0, findEdition = 0;
	String menu = null, searchName = null, delete, edition, edit, searchMethod;
	static String []name = new String[100];
	static String []manualEn = new String[100];
	static String []guideline = new String[100];
	int id = 10;
	
	public void ingles() {
		
		Fixos.fixosIngles();
		
		System.out.println("======================== Welcome to the WegOne site! ========================="); 
		System.out.println();
		System.out.println("Here you will get to know our projects, learn about our innovative solutions \nand discover how we are turning ideas into technology."); 
		System.out.println(); 

		do {

		System.out.println("=============================================================================="); 
		System.out.println(); 

		System.out.println("====================== Select what do you need to do now =====================\n"); 
		System.out.println("1- Register a guideline; \n2- Search for a guideline; \n3- Edit a guideline; \n4- Delete a guideline; \n5- Change Language; \n6- Exit;"); 
		menu = read.nextLine();

		System.out.println(); 
		System.out.println("=============================================================================="); 

		//REGISTER-------------------------------------------------------------------------------------------------------------

		boolean repeated = false;
        String writed;
		if(menu.equalsIgnoreCase("register") || menu.equals("1")) {
			
			System.out.println("\n==================== Select the desired type of guideline ====================");
			System.out.println();
		    System.out.println("1- Operation Manual;\n2- Safety Procedure;\n3- Maintenance and Repairs;\n4- Testing and Diagnostics;\n5- Code of Conduct and Sectorial Operations;");
			guideline[id] = read.nextLine();
			System.out.println();
			
			//OPERATION MANUAL-------------------------------------------------------------------------------------------------------------
			
			if(guideline[id].equalsIgnoreCase("Operation Manual") ||  guideline[id].equals("1")) {
				
				System.out.println("======================= Select the option of register ========================\n");
		    	System.out.println("1- Just in the current language (english); \n2- In all languages of the website; ");
		        int methodRegister = read.nextInt();
		        read.nextLine();
		        System.out.println();
						
		        if(guideline[id].equalsIgnoreCase("1")) {
		        	guideline[id] = "Operation Manual";
		        }
					
				for(int a = 0; a < name.length; a++) {			
					if(name[a] == null) {
				
					System.out.println("=============================================================================="); 
					System.out.println();
					System.out.println("Type the name of the guideline: ");
					writed = read.nextLine();
					System.out.println();
					
					while(writed.trim().isEmpty()) {
						System.out.println("Invalid. Try again: ");
						writed = read.nextLine();
						System.out.println();
					}
						
					name[a] = writed;
					String show = writed;
					System.out.println("==============================================================================");
					System.out.println();
					
					if (methodRegister == 2){
						
						System.out.println("Type the name of the guideline in portuguese: ");
						writed = read.nextLine();
						System.out.println();
						
						while(writed.trim().isEmpty()) {
							System.out.println("Invalid. Try again: ");
							writed = read.nextLine();
							System.out.println();
						}
							
						Portugues.nome[a] = writed;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("==============================================================================");
						System.out.println();
						System.out.println("Type the name of the guideline in spanish: ");
						writed = read.nextLine();
						System.out.println();
						
						while(writed.trim().isEmpty()) {
							System.out.println("Invalid. Try again: ");
							writed = read.nextLine();
							System.out.println();
						}
							
						Espanhol.nombre[a] = writed;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Type the name of the guideline in german: ");
						writed = read.nextLine();
						System.out.println();
						
						while(writed.trim().isEmpty()) {
							System.out.println("Invalid. Try again: ");
							writed = read.nextLine();
							System.out.println();
						}
							
						Alemao.nameDe[a] = writed;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Type the name of the guideline in french: ");
						writed = read.nextLine();
						System.out.println();
						
						while(writed.trim().isEmpty()) {
							System.out.println("Invalid. Try again: ");
							writed = read.nextLine();
							System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Frances.nom[a] = writed;
						
					}
					
					System.out.println("Type the guideline: ");
					String writed1 = read.nextLine();
					System.out.println();
					
					while(writed1.trim().isEmpty() || repeated) {
					    System.out.println("Invalid. Try again: ");
					    writed1 = read.nextLine();
					    System.out.println();
					}
					
					System.out.println("=============================================================================="); 
					System.out.println();
					manualEn[a] = writed1;
					
					if (methodRegister == 2){
						
						System.out.println("Type the guideline in portuguese: ");
						writed1 = read.nextLine();
						System.out.println();
						
						while(writed1.trim().isEmpty() || repeated) {
						    System.out.println("Invalid. Try again: ");
						    writed1 = read.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Portugues.manualPt[a] = writed1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Type the guideline in spanish: ");
						writed1 = read.nextLine();
						System.out.println();
						
						while(writed1.trim().isEmpty() || repeated) {
						    System.out.println("Invalid. Try again: ");
						    writed1 = read.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Espanhol.manualEs[a] = writed1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Type the guideline in german: ");
						writed1 = read.nextLine();
						System.out.println();
						
						while(writed1.trim().isEmpty() || repeated) {
						    System.out.println("Invalid. Try again: ");
						    writed1 = read.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Alemao.handbuch[a] = writed1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Type the guideline in french: ");
						writed1 = read.nextLine();
						System.out.println();
						
						while(writed1.trim().isEmpty() || repeated) {
						    System.out.println("Invalid. Try again: ");
						    writed1 = read.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Frances.manuelFr[a] = writed1;
					}
					
					guideline[a] = "Operation Manual";
					
                    System.out.println("               The guideline '" + show + "' has been registered!");
                    System.out.println();
					
					break;
					}
				}
				
			//SAFETY PROCEDURE-------------------------------------------------------------------------------------------------------------
				
			}else if(guideline[id].equalsIgnoreCase("Safety Procedure") || guideline[id].equals("2")) {
				
				System.out.println("======================= Select the option of register ========================\n");
		    	System.out.println("1- Just in the current language (english); \n2- In all languages of the website; ");
		        int methodRegister = read.nextInt();
		        read.nextLine();
		        System.out.println();
						
		        if(guideline[id].equalsIgnoreCase("2")) {
		        	guideline[id] = "Safety Procedure";
		        }
		        
				for(int b = 0; b < name.length; b++) {			
					if(name[b] == null) {
				
					System.out.println("=============================================================================="); 
					System.out.println();
					System.out.println("Type the name of the guideline: ");
					writed = read.nextLine();
					System.out.println();
					
					while(writed.trim().isEmpty()) {
						System.out.println("Invalid. Try again: ");
						writed = read.nextLine();
						System.out.println();
					}
						
					name[b] = writed;
					String show = writed;
					System.out.println("=============================================================================="); 
					System.out.println();
					
					if (methodRegister == 2){
						
						System.out.println("Type the name of the guideline in portuguese: ");
						writed = read.nextLine();
						System.out.println();
						
						while(writed.trim().isEmpty()) {
							System.out.println("Invalid. Try again: ");
							writed = read.nextLine();
							System.out.println();
						}
							
						Portugues.nome[b] = writed;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Type the name of the guideline in spanish: ");
						writed = read.nextLine();
						System.out.println();
						
						while(writed.trim().isEmpty()) {
							System.out.println("Invalid. Try again: ");
							writed = read.nextLine();
							System.out.println();
						}
							
						Espanhol.nombre[b] = writed;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Type the name of the guideline in german: ");
						writed = read.nextLine();
						System.out.println();
						
						while(writed.trim().isEmpty()) {
							System.out.println("Invalid. Try again: ");
							writed = read.nextLine();
							System.out.println();
						}
							
						Alemao.nameDe[b] = writed;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Type the name of the guideline in french: ");
						writed = read.nextLine();
						System.out.println();
						
						while(writed.trim().isEmpty()) {
							System.out.println("Invalid. Try again: ");
							writed = read.nextLine();
							System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Frances.nom[b] = writed;
						
					}
						
					System.out.println("Type the guideline: ");
					String writed1 = read.nextLine();
					System.out.println();
					
					while(writed1.trim().isEmpty() || repeated) {
					    System.out.println("Invalid. Try again: ");
					    writed1 = read.nextLine();
					    System.out.println();
					}
					
					System.out.println("=============================================================================="); 
					System.out.println();
					manualEn[b] = writed1;
					
					if (methodRegister == 2){
						
						System.out.println("Type the guideline in portuguese: ");
						writed1 = read.nextLine();
						System.out.println();
						
						while(writed1.trim().isEmpty() || repeated) {
						    System.out.println("Invalid. Try again: ");
						    writed1 = read.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Portugues.manualPt[b] = writed1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Type the guideline in spanish: ");
						writed1 = read.nextLine();
						System.out.println();
						
						while(writed1.trim().isEmpty() || repeated) {
						    System.out.println("Invalid. Try again: ");
						    writed1 = read.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Espanhol.manualEs[b] = writed1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Type the guideline in german: ");
						writed1 = read.nextLine();
						System.out.println();
						
						while(writed1.trim().isEmpty() || repeated) {
						    System.out.println("Invalid. Try again: ");
						    writed1 = read.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Alemao.handbuch[b] = writed1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Type the guideline in french: ");
						writed1 = read.nextLine();
						System.out.println();
						
						while(writed1.trim().isEmpty() || repeated) {
						    System.out.println("Invalid. Try again: ");
						    writed1 = read.nextLine();
						    System.out.println();
						    System.out.println("=============================================================================="); 
							System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Frances.manuelFr[b] = writed1;
					}
					
		        	guideline[b] = "Safety Procedure";
					
                    System.out.println("               The guideline '" + show + "' has been registered!");
                    System.out.println();
					
					break;
					}
				}
				
			//MAINTENANCE AND REPAIRS-------------------------------------------------------------------------------------------------------------
				
			}else if(guideline[id].equalsIgnoreCase("Maintenance and Repairs") || guideline[id].equals("3")) {
				
				System.out.println("======================= Select the option of register ========================\n");
		    	System.out.println("1- Just in the current language (english); \n2- In all languages of the website; ");
		        int methodRegister = read.nextInt();
		        read.nextLine();
		        System.out.println();
						
		        if(guideline[id].equalsIgnoreCase("3")) {
		        	guideline[id] = "Maintenance and Repairs";
		        }
		        
				for(int c = 0; c < name.length; c++) {			
					if(name[c] == null) {
				
					System.out.println("=============================================================================="); 
					System.out.println();
					System.out.println("Type the name of the guideline: ");
					writed = read.nextLine();
					System.out.println();
					
					while(writed.trim().isEmpty()) {
						System.out.println("Invalid. Try again: ");
						writed = read.nextLine();
						System.out.println();
					}
						
					name[c] = writed;
					String show = writed;
					System.out.println("=============================================================================="); 
					System.out.println();
					
					if (methodRegister == 2){
						
						System.out.println("Type the name of the guideline in portuguese: ");
						writed = read.nextLine();
						System.out.println();
						
						while(writed.trim().isEmpty()) {
							System.out.println("Invalid. Try again: ");
							writed = read.nextLine();
							System.out.println();
						}
							
						Portugues.nome[c] = writed;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Type the name of the guideline in spanish: ");
						writed = read.nextLine();
						System.out.println();
						
						while(writed.trim().isEmpty()) {
							System.out.println("Invalid. Try again: ");
							writed = read.nextLine();
							System.out.println();
						}
							
						Espanhol.nombre[c] = writed;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("==============================================================================");
						System.out.println();
						System.out.println("Type the name of the guideline in german: ");
						writed = read.nextLine();
						System.out.println();
						
						while(writed.trim().isEmpty()) {
							System.out.println("Invalid. Try again: ");
							writed = read.nextLine();
							System.out.println();
						}
							
						Alemao.nameDe[c] = writed;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Type the name of the guideline in french: ");
						writed = read.nextLine();
						System.out.println();
						
						while(writed.trim().isEmpty()) {
							System.out.println("Invalid. Try again: ");
							writed = read.nextLine();
							System.out.println();
						}
							
						System.out.println("=============================================================================="); 
						System.out.println();
						Frances.nom[c] = writed;
						
					}
						
					System.out.println("Type the guideline: ");
					String writed1 = read.nextLine();
					System.out.println();
					
					while(writed1.trim().isEmpty() || repeated) {
					    System.out.println("Invalid. Try again: ");
					    writed1 = read.nextLine();
					    System.out.println();
					}
					
					System.out.println("=============================================================================="); 
					System.out.println();
					manualEn[c] = writed1;
					
					if (methodRegister == 2){
						
						System.out.println("Type the guideline in portuguese: ");
						writed1 = read.nextLine();
						System.out.println();
						
						while(writed1.trim().isEmpty() || repeated) {
						    System.out.println("Invalid. Try again: ");
						    writed1 = read.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Portugues.manualPt[c] = writed1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Type the guideline in spanish: ");
						writed1 = read.nextLine();
						System.out.println();
						
						while(writed1.trim().isEmpty() || repeated) {
						    System.out.println("Invalid. Try again: ");
						    writed1 = read.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Espanhol.manualEs[c] = writed1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Type the guideline in german: ");
						writed1 = read.nextLine();
						System.out.println();
						
						while(writed1.trim().isEmpty() || repeated) {
						    System.out.println("Invalid. Try again: ");
						    writed1 = read.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Alemao.handbuch[c] = writed1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Type the guideline in french: ");
						writed1 = read.nextLine();
						System.out.println();
						
						while(writed1.trim().isEmpty() || repeated) {
						    System.out.println("Invalid. Try again: ");
						    writed1 = read.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Frances.manuelFr[c] = writed1;
					}
					
		        	guideline[c] = "Maintenance and Repairs";
					
                    System.out.println("               The guideline '" + show + "' has been registered!");
                    System.out.println();
					
					break;
					}
				}
				
			//TESTING AND DIAGNOSTICS-------------------------------------------------------------------------------------------------------------
				
			}else if(guideline[id].equalsIgnoreCase("Testing and Diagnostics") || guideline[id].equals("4")) {
				
				System.out.println("======================= Select the option of register ========================\n");
		    	System.out.println("1- Just in the current language (english); \n2- In all languages of the website; ");
		        int methodRegister = read.nextInt();
		        read.nextLine();
		        System.out.println();
						
		        if(guideline[id].equalsIgnoreCase("4")) {
		        	guideline[id] = "Testing and Diagnostics";
		        }
		        
				for(int d = 0; d < name.length; d++) {			
					if(name[d] == null) {
				
					System.out.println("==============================================================================");
					System.out.println();
					System.out.println("Type the name of the guideline: ");
					writed = read.nextLine();
					System.out.println();
					
					while(writed.trim().isEmpty()) {
						System.out.println("Invalid. Try again: ");
						writed = read.nextLine();
						System.out.println();
					}
						
					name[d] = writed;
					String show = writed;
					System.out.println("=============================================================================="); 
					System.out.println();
					
					if (methodRegister == 2){
						
						System.out.println("Type the name of the guideline in portuguese: ");
						writed = read.nextLine();
						System.out.println();
						
						while(writed.trim().isEmpty()) {
							System.out.println("Invalid. Try again: ");
							writed = read.nextLine();
							System.out.println();
						}
							
						Portugues.nome[d] = writed;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Type the name of the guideline in spanish: ");
						writed = read.nextLine();
						System.out.println();
						
						while(writed.trim().isEmpty()) {
							System.out.println("Invalid. Try again: ");
							writed = read.nextLine();
							System.out.println();
						}
							
						Espanhol.nombre[d] = writed;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Type the name of the guideline in german: ");
						writed = read.nextLine();
						System.out.println();
						
						while(writed.trim().isEmpty()) {
							System.out.println("Invalid. Try again: ");
							writed = read.nextLine();
							System.out.println();
						}
							
						Alemao.nameDe[d] = writed;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Type the name of the guideline in french: ");
						writed = read.nextLine();
						System.out.println();
						
						while(writed.trim().isEmpty()) {
							System.out.println("Invalid. Try again: ");
							writed = read.nextLine();
							System.out.println();
						}
							
						System.out.println("=============================================================================="); 
						System.out.println();
						Frances.nom[d] = writed;
						
					}
						
					System.out.println("Type the guideline: ");
					String writed1 = read.nextLine();
					System.out.println();
					
					while(writed1.trim().isEmpty() || repeated) {
					    System.out.println("Invalid. Try again: ");
					    writed1 = read.nextLine();
					    System.out.println();
					}
					
					System.out.println("=============================================================================="); 
					System.out.println();
					manualEn[d] = writed1;
					
					if (methodRegister == 2){
						
						System.out.println("Type the guideline in portuguese: ");
						writed1 = read.nextLine();
						System.out.println();
						
						while(writed1.trim().isEmpty() || repeated) {
						    System.out.println("Invalid. Try again: ");
						    writed1 = read.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Portugues.manualPt[d] = writed1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Type the guideline in spanish: ");
						writed1 = read.nextLine();
						System.out.println();
						
						while(writed1.trim().isEmpty() || repeated) {
						    System.out.println("Invalid. Try again: ");
						    writed1 = read.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Espanhol.manualEs[d] = writed1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Type the guideline in german: ");
						writed1 = read.nextLine();
						System.out.println();
						
						while(writed1.trim().isEmpty() || repeated) {
						    System.out.println("Invalid. Try again: ");
						    writed1 = read.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Alemao.handbuch[d] = writed1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Type the guideline in french: ");
						writed1 = read.nextLine();
						System.out.println();
						
						while(writed1.trim().isEmpty() || repeated) {
						    System.out.println("Invalid. Try again: ");
						    writed1 = read.nextLine();
						    System.out.println();
						}
						
						System.out.println("==============================================================================");
						System.out.println();
						Frances.manuelFr[d] = writed1;
					}
					
		        	guideline[d] = "Testing and Diagnostics";
					
                    System.out.println("               The guideline '" + show + "' has been registered!");
                    System.out.println();
					
					break;
					}
				}
				
			//CODE OF CONDUCT AND SECTORIAL OPERATIONS-------------------------------------------------------------------------------------------------------------
				
			}else if(guideline[id].equalsIgnoreCase("Code of Conduct and Sectorial Operations") || guideline[id].equals("5")) {
				
				System.out.println("======================= Select the option of register ========================\n");
		    	System.out.println("1- Just in the current language (english); \n2- In all languages of the website; ");
		        int methodRegister = read.nextInt();
		        read.nextLine();
		        System.out.println();
						
		        if(guideline[id].equalsIgnoreCase("5")) {
		        	guideline[id] = "Code of Conduct and Sectorial Operations";
		        }
		        
				for(int e = 0; e < name.length; e++) {			
					if(name[e] == null) {
				
					System.out.println("=============================================================================="); 
					System.out.println();
					System.out.println("Type the name of the guideline: ");
					writed = read.nextLine();
					System.out.println();
					
					while(writed.trim().isEmpty()) {
						System.out.println("Invalid. Try again: ");
						writed = read.nextLine();
						System.out.println();
					}
						
					name[e] = writed;
					String show = writed;
					System.out.println("=============================================================================="); 
					System.out.println();
					
					if (methodRegister == 2){
						
						System.out.println("Type the name of the guideline in portuguese: ");
						writed = read.nextLine();
						System.out.println();
						
						while(writed.trim().isEmpty()) {
							System.out.println("Invalid. Try again: ");
							writed = read.nextLine();
							System.out.println();
						}
							
						Portugues.nome[e] = writed;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Type the name of the guideline in spanish: ");
						writed = read.nextLine();
						System.out.println();
						
						while(writed.trim().isEmpty()) {
							System.out.println("Invalid. Try again: ");
							writed = read.nextLine();
							System.out.println();
						}
							
						Espanhol.nombre[e] = writed;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Type the name of the guideline in german: ");
						writed = read.nextLine();
						System.out.println();
						
						while(writed.trim().isEmpty()) {
							System.out.println("Invalid. Try again: ");
							writed = read.nextLine();
							System.out.println();
						}
							
						Alemao.nameDe[e] = writed;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("==============================================================================");
						System.out.println();
						System.out.println("Type the name of the guideline in french: ");
						writed = read.nextLine();
						System.out.println();
						
						while(writed.trim().isEmpty()) {
							System.out.println("Invalid. Try again: ");
							writed = read.nextLine();
							System.out.println();
						}
							
						System.out.println("=============================================================================="); 
						System.out.println();
						Frances.nom[e] = writed;
						
					}
						
					System.out.println("Type the guideline: ");
					String writed1 = read.nextLine();
					System.out.println();
					
					while(writed1.trim().isEmpty() || repeated) {
					    System.out.println("Invalid. Try again: ");
					    writed1 = read.nextLine();
					    System.out.println();
					}
					
					System.out.println("=============================================================================="); 
					System.out.println();
					manualEn[e] = writed1;
					
					if (methodRegister == 2){
						
						System.out.println("Type the guideline in portuguese: ");
						writed1 = read.nextLine();
						System.out.println();
						
						while(writed1.trim().isEmpty() || repeated) {
						    System.out.println("Invalid. Try again: ");
						    writed1 = read.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Portugues.manualPt[e] = writed1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Type the guideline in spanish: ");
						writed1 = read.nextLine();
						System.out.println();
						
						while(writed1.trim().isEmpty() || repeated) {
						    System.out.println("Invalid. Try again: ");
						    writed1 = read.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Espanhol.manualEs[e] = writed1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Type the guideline in german: ");
						writed1 = read.nextLine();
						System.out.println();
						
						while(writed1.trim().isEmpty() || repeated) {
						    System.out.println("Invalid. Try again: ");
						    writed1 = read.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Alemao.handbuch[e] = writed1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Type the guideline in french: ");
						writed1 = read.nextLine();
						System.out.println();
						
						while(writed1.trim().isEmpty() || repeated) {
						    System.out.println("Invalid. Try again: ");
						    writed1 = read.nextLine();
						    System.out.println();
						}
						
						System.out.println("==============================================================================");
						System.out.println();
						Frances.manuelFr[e] = writed1;
					}
					
		        	guideline[e] = "Code of Conduct and Sectorial Operations";
					
                    System.out.println("               The guideline '" + show + "' has been registered!");
                    System.out.println();
					
					break;
					}
				}
			} id++;
			
			//SEARCH-------------------------------------------------------------------------------------------------------------
			
	    }else if(menu.equalsIgnoreCase("Search") || menu.equals("2")) {
	    	
	        System.out.println();
            System.out.println("======================== Select the method of search =========================\n");
	    	System.out.println("1- Name; \n2- Id; ");
	        searchMethod = read.nextLine();
	        System.out.println();
			System.out.println("=============================================================================="); 
	        
	        boolean found = false;
	        
	        if (searchMethod.equalsIgnoreCase("name") || searchMethod.equalsIgnoreCase("1")) {
	        	System.out.println();
	            System.out.println("Type the name of the desired guideline: ");
	            searchName = read.nextLine();
	            System.out.println();
	            
	            int count = 0;
	            for(int f = 0; f < name.length; f++) {
	                if(name[f] != null && name[f].equalsIgnoreCase(searchName)) {
	                    count++;
	                    
	                    if(count == 1) {
	                    	
	    					System.out.println("=============================================================================="); 
	    					System.out.println();
	                        System.out.println("             The guideline '" + searchName + "' has already been registered!");
	                        System.out.println();
	    					System.out.println("=============================================================================="); 
	                        System.out.println("\n=========================== Registered Guideline =============================");
	                        
	                        System.out.println();
	                        System.out.println("-- Name of the guideline: " + name[f]);
	                        System.out.println("-- Id of the guideline: " + (f + 1));
	                        System.out.println("-- Type of the guideline: " + guideline[f]);
	                        
	                        if(manualEn[f] != null) {
	                            System.out.println("-- Guideline: " + manualEn[f]);
	                            System.out.println();
	                        }
	                        
	                        found = true;
	                    
	                    } else {
	    					System.out.println("=============================================================================="); 
	                        System.out.println("\n=========================== Registered Guideline =============================");
	                        
	                        System.out.println();
	                        System.out.println("-- Name of the guideline: " + name[f]);
	                        System.out.println("-- Id of the guideline: " + (f + 1));
	                        System.out.println("-- Type of the guideline: "+ guideline[f]);
	                        
	                        if(manualEn[f] != null) {
	                            System.out.println("-- Guideline: " + manualEn[f]);
	                        }
	                        System.out.println();
	                        
	                        found = true;
	                    }
	                    
	                }
	            }
	                    
	            if(!found) {
	            	System.out.println("=============================================================================="); 
					System.out.println();
                    System.out.println("             The guideline '" + searchName + "' is not registered!");
                    System.out.println();
	            }
	            
	        } else if (searchMethod.equalsIgnoreCase("id") || searchMethod.equalsIgnoreCase("2")) {
	        	System.out.println();
	            System.out.println("Type the ID of the desired guideline: ");
	            searchId = read.nextInt();
	            read.nextLine();
	            System.out.println();
	            
	            for(int f = 0; f < name.length; f++) {
	                if(searchId == (f + 1) && guideline[f] != null && !guideline[f].isEmpty()) {
	                	
	                	System.out.println("=============================================================================="); 
    					System.out.println();
                        System.out.println("             The guideline '" + searchId + "' has already been registered!");
                        System.out.println();
    					System.out.println("=============================================================================="); 
                        System.out.println("\n=========================== Registered Guideline =============================");
	                    
	                    System.out.println();
                        System.out.println("-- Name of the guideline: " + name[f]);
                        System.out.println("-- Id of the guideline: " + (f + 1));
                        System.out.println("-- Type of the guideline: "+ guideline[f]);

	                    if(manualEn[f] != null) {
	                        System.out.println("-- Guideline: " + manualEn[f]);
	                    }
	                    System.out.println();
	                    
	                    found = true;
	                    
	                }
	            }
	            if(!found) {
	                System.out.println("=============================================================================="); 
					System.out.println();
                    System.out.println("             The guideline '" + searchId + "' is not registered!");
                    System.out.println();
	            }
	        }
		
	        //EDIT-------------------------------------------------------------------------------------------------------------

	    }else if(menu.equals("edit") || menu.equals("3") ) {
	    	
	    	System.out.println();
            System.out.println("======================== Select the method of edition ========================\n");
	    	System.out.println("1- Name; \n2- Id; ");
	    	String editMethod = read.nextLine();
	        System.out.println();
			System.out.println("=============================================================================="); 
	    		         
	         if (editMethod.equals("1") || editMethod.equalsIgnoreCase("Name")) {
	        	System.out.println();
	        	System.out.println("**Note: If more than one guideline has identical names, all will be requested \nfor editing. \n\n**Hint: You may leave it blank to retain those that you do not wish to change, \nas before. \n\nType the name of the desired guideline: ");
	     		edition = read.nextLine();
	     		System.out.println();
	     		
	     		for(int h = 0; h < name.length; h++) {
	     			if(name[h] != null && name[h].equalsIgnoreCase(edition)) {
	     				
	     	            System.out.println("====================== Select what do you need to edit =======================\n");
	     		    	System.out.println("1- Name; \n2- Type; \n3- Guideline; \n4- All; ");
	     		    	edit = read.nextLine();
	     		    	String wri;
	     		        System.out.println();
	     				System.out.println("==============================================================================");
	     				
	     				if(edit.equalsIgnoreCase("Name") || edit.equalsIgnoreCase("1")) {
	     					
	     					System.out.println();
	     					System.out.println("Type the new name of the guideline (from id '" + (h + 1) + "'): ");
	     					wri = read.nextLine();
	     					System.out.println();
	     					
	     					if (wri.trim().isEmpty()){
	     						break;
	     					} else {
	     						name[h] = wri;
	     					}
	     					
	     					System.out.println("=============================================================================="); 
	    					System.out.println();
	                        System.out.println("         The guideline '" + edition + "' has been edited to '" + name[h] + "'!");
	                        System.out.println();
	     				
	     				}else if(edit.equalsIgnoreCase("type") || edit.equalsIgnoreCase("2")) {
	     					
	                        System.out.println("\n============= Select the new type of the guideline (from id '" + (h + 1) + "') ===============\n");
	     					System.out.println("1- Operation Manual;\n2- Safety Procedure;\n3- Maintenance and Repairs;\n4- Testing and Diagnostics;\n5- Code of Conduct and Sectorial Operations;");	     					
	     					wri = read.nextLine();
	     					System.out.println();
	     					
	     					if (wri.trim().isEmpty()){
	     						break;
	     					}else if(wri.equalsIgnoreCase("1") || wri.equalsIgnoreCase("Operation Manual")) {
	     						guideline[h] = "Operation Manual";
	     					}else if(wri.equalsIgnoreCase("2") || wri.equalsIgnoreCase("Safety Procedure")) {
	     						guideline[h] = "Safety Procedure";
	     					}else if(wri.equalsIgnoreCase("3") || wri.equalsIgnoreCase("Maintenance and Repairs")) {
	     						guideline[h] = "Maintenance and Repairs";
	     					}else if(wri.equalsIgnoreCase("4") || wri.equalsIgnoreCase("Testing and Diagnostics")) {
	     						guideline[h] = "Testing and Diagnostics";
	     					}else if(wri.equalsIgnoreCase("5") || wri.equalsIgnoreCase("Code of Conduct and Sectorial Operations")) {
	     						guideline[h] = "Code of Conduct and Sectorial Operations";
	     					}
	     					
	     					System.out.println("=============================================================================="); 
	    					System.out.println();
	                        System.out.println("               The guideline '" + edition + "' has been edited!");
	                        System.out.println();
	     					
	     				}else if(edit.equalsIgnoreCase("Guideline") || edit.equalsIgnoreCase("3")) {
	     					System.out.println();
	     					System.out.println("Type the new guideline (from id '" + (h + 1) + "'): ");
	     					wri = read.nextLine();
	     					System.out.println();
	     					
	     					if (wri.trim().isEmpty()){
	     						break;
	     					} else {
	     						manualEn[h] = wri;
	     					}
	     					
	     					System.out.println("=============================================================================="); 
	    					System.out.println();
	                        System.out.println("               The guideline '" + edition + "' has been edited!");
	                        System.out.println();
	     					
	     				}else if(edit.equalsIgnoreCase("All") || edit.equalsIgnoreCase("4")) {
	     				
	     					System.out.println();
	     					System.out.println("Type the new name of the guideline (from id '" + (h + 1) + "'): ");
	     					wri = read.nextLine();
	     					
	     					if (wri.trim().isEmpty()){
	     						break;
	     					} else {
	     						name[h] = wri;
	     					}
	     				
	     					System.out.println("\n============= Select the new type of the guideline (from id '" + (h + 1) + "') ===============\n");
	     					System.out.println("1- Operation Manual;\n2- Safety Procedure;\n3- Maintenance and Repairs;\n4- Testing and Diagnostics;\n5- Code of Conduct and Sectorial Operations;");	     					
	     					wri = read.nextLine();
	     					System.out.println();
		     				System.out.println("==============================================================================");
	     					
	     					if (wri.trim().isEmpty()){
	     						break;
	     					}else if(wri.equalsIgnoreCase("1") || wri.equalsIgnoreCase("Operation Manual")) {
	     						guideline[h] = "Operation Manual";
	     					}else if(wri.equalsIgnoreCase("2") || wri.equalsIgnoreCase("Safety Procedure")) {
	     						guideline[h] = "Safety Procedure";
	     					}else if(wri.equalsIgnoreCase("3") || wri.equalsIgnoreCase("Maintenance and Repairs")) {
	     						guideline[h] = "Maintenance and Repairs";
	     					}else if(wri.equalsIgnoreCase("4") || wri.equalsIgnoreCase("Testing and Diagnostics")) {
	     						guideline[h] = "Testing and Diagnostics";
	     					}else if(wri.equalsIgnoreCase("5") || wri.equalsIgnoreCase("Code of Conduct and Sectorial Operations")) {
	     						guideline[h] = "Code of Conduct and Sectorial Operations";
	     					}
	     				
	     					System.out.println();
	     					System.out.println("Type the new guideline (from id '" + (h + 1) + "'): ");
	     					wri = read.nextLine();
	     					System.out.println();
	     					
	     					if (wri.trim().isEmpty()){
	     						break;
	     					} else {
	     						manualEn[h] = wri;
	     					}
	     					
	     					System.out.println("==============================================================================");
	    					System.out.println();
	                        System.out.println("         The guideline '" + edition + "' has been edited to '" + name[h] + "'!");
	                        System.out.println();
	     					
	     			}
	     		}
	     	}
	     		
	        }else if(editMethod.equals("2") || editMethod.equalsIgnoreCase("id")) {
	        	
	      		System.out.println();
	        	System.out.println("Type the ID of the desired guideline: ");
	     		findEdition = read.nextInt();
	     		read.nextLine();
	     		System.out.println();
	      		
	      		 for(int h = 0; h < name.length; h++) {
	                 if(findEdition == (h + 1) && guideline[h] != null && !guideline[h].isEmpty()) {
	                	 
	                	System.out.println("====================== Select what do you need to edit =======================\n");
		     		    System.out.println("1- Name; \n2- Type; \n3- Guideline; \n4- All; ");
		     		    edit = read.nextLine();
		     		    String wri;
		     		    System.out.println();
		     		    System.out.println("=============================================================================="); 
		     				
		     			if(edit.equalsIgnoreCase("Name") || edit.equalsIgnoreCase("1")) {
		     					
		     				System.out.println();
		     				System.out.println("Type the new name of the guideline (from id '" + (h + 1) + "'): ");
		     				wri = read.nextLine();
		     				System.out.println();
		     					
		     				if (wri.trim().isEmpty()){
		     					break;
		     				} else {
		     					name[h] = wri;
		     				}
		     				
		     				System.out.println("=============================================================================="); 
	    					System.out.println();
	                        System.out.println("         The guideline '" + edition + "' has been edited to '" + name[h] + "'!");
	                        System.out.println();
		     				
		     			}else if(edit.equalsIgnoreCase("type") || edit.equalsIgnoreCase("2")) {
		     					
		                    System.out.println("\n============= Type the new type of the guideline (from id '" + (h + 1) + "') ===============\n");
		     				System.out.println("1- Operation Manual;\n2- Safety Procedure;\n3- Maintenance and Repairs;\n4- Testing and Diagnostics;\n5- Code of Conduct and Sectorial Operations;");	     					
		     				wri = read.nextLine();
		     				System.out.println();
		     					
		     				if (wri.trim().isEmpty()){
		     					break;
		     				}else if(wri.equalsIgnoreCase("1") || wri.equalsIgnoreCase("Operation Manual")) {
		     					guideline[h] = "Operation Manual";
		     				}else if(wri.equalsIgnoreCase("2") || wri.equalsIgnoreCase("Safety Procedure")) {
		     					guideline[h] = "Safety Procedure";
		     				}else if(wri.equalsIgnoreCase("3") || wri.equalsIgnoreCase("Maintenance and Repairs")) {
		     					guideline[h] = "Maintenance and Repairs";
		     				}else if(wri.equalsIgnoreCase("4") || wri.equalsIgnoreCase("Testing and Diagnostics")) {
		     					guideline[h] = "Testing and Diagnostics";
		     				}else if(wri.equalsIgnoreCase("5") || wri.equalsIgnoreCase("Code of Conduct and Sectorial Operations")) {
		     					guideline[h] = "Code of Conduct and Sectorial Operations";
		     				}
		     				
		     				System.out.println("=============================================================================="); 
	    					System.out.println();
	                        System.out.println("               The guideline '" + edition + "' has been edited!");
	                        System.out.println();
		     					
		     			}else if(edit.equalsIgnoreCase("Guideline") || edit.equalsIgnoreCase("3")) {
		     				System.out.println();
		     				System.out.println("Type the new guideline (from id '" + (h + 1) + "'): ");
		     				wri = read.nextLine();
		     				System.out.println();
		     					
		     				if (wri.trim().isEmpty()){
		     					break;
		     				} else {
		     					manualEn[h] = wri;
		     				}
		     				
		     				System.out.println("=============================================================================="); 
	    					System.out.println();
	                        System.out.println("               The guideline '" + edition + "' has been edited!");
	                        System.out.println();
		     					
		     			}else if(edit.equalsIgnoreCase("All") || edit.equalsIgnoreCase("4")) {
		     				
		     				System.out.println();
		     				System.out.println("Type the new name of the guideline (from id '" + (h + 1) + "'): ");
		     				wri = read.nextLine();
		     					
		     				if (wri.trim().isEmpty()){
		     					break;
		     				} else {
		     					name[h] = wri;
		     				}
		     				
		     				System.out.println("\n============= Type the new type of the guideline (from id '" + (h + 1) + "') ===============\n");
		     				System.out.println("1- Operation Manual;\n2- Safety Procedure;\n3- Maintenance and Repairs;\n4- Testing and Diagnostics;\n5- Code of Conduct and Sectorial Operations;");	     					
		     				wri = read.nextLine();
		     				System.out.println();
			     			System.out.println("=============================================================================="); 
		     					
		     				if (wri.trim().isEmpty()){
		     					break;
		     				}else if(wri.equalsIgnoreCase("1") || wri.equalsIgnoreCase("Operation Manual")) {
		     					guideline[h] = "Operation Manual";
		     				}else if(wri.equalsIgnoreCase("2") || wri.equalsIgnoreCase("Safety Procedure")) {
		     					guideline[h] = "Safety Procedure";
		     				}else if(wri.equalsIgnoreCase("3") || wri.equalsIgnoreCase("Maintenance and Repairs")) {
		     					guideline[h] = "Maintenance and Repairs";
		     				}else if(wri.equalsIgnoreCase("4") || wri.equalsIgnoreCase("Testing and Diagnostics")) {
		     					guideline[h] = "Testing and Diagnostics";
		     				}else if(wri.equalsIgnoreCase("5") || wri.equalsIgnoreCase("Code of Conduct and Sectorial Operations")) {
		     					guideline[h] = "Code of Conduct and Sectorial Operations";
		     				}
		     				
		     				System.out.println();
		     				System.out.println("Type the new guideline (from id '" + (h + 1) + "'): ");
		     				wri = read.nextLine();
		     				System.out.println();
		     					
		     				if (wri.trim().isEmpty()){
		     					break;
		     				} else {
		     					manualEn[h] = wri;
		     				}
		     				
		     				System.out.println("==============================================================================");
	    					System.out.println();
	                        System.out.println("         The guideline '" + edition + "' has been edited to '" + name[h] + "'!");
	                        System.out.println();
	      			
	      				} 
	         
	      			} 
	         
	      		} 
	         
	      	} 
	         
	        //DELETE-------------------------------------------------------------------------------------------------------------

	    }else if(menu.equals("delete") || menu.equals("4")) {
	    	
	    	System.out.println();
            System.out.println("======================== Select the method of delete =========================\n");
	    	System.out.println("1- Name; \n2- Id; ");
	    	String deleteMethod = read.nextLine();
	        System.out.println();
			System.out.println("==============================================================================");

	        	if (deleteMethod.equalsIgnoreCase("name") || deleteMethod.equalsIgnoreCase("1")) {
	 
	        		System.out.println();
		        	System.out.println("**Note: If more than one guideline has identical names, all will be deleted. \n\n**Hint: You may choose the ID as the method of exclusion \nto prevent this from happening. \n\nType the name of the desired guideline: ");
		     		delete = read.nextLine();
		     		System.out.println();
	        		
	                boolean remove = false;
	                int g = 0;
	                
	                while (g < id) {
	                	
	                	if (name[g] != null && name[g].equalsIgnoreCase(delete)) {
	                		for (int p = g; p < id - 1; p++) {
	                			name[p] = name[p + 1];
	                            manualEn[p] = manualEn[p + 1];
	                            guideline[p] = guideline[p + 1];
	                        }
	                		
	                		name[id - 1] = null;
	                        manualEn[id - 1] = null;
	                        guideline[id - 1] = null;
	                        id--;
	                        remove = true;
	                               
	                	} else {
	                        g++; 
	                    }
	                	
	                }

	                if (remove) {
	                	System.out.println("=============================================================================="); 
    					System.out.println();
	                	System.out.println("          All guidelines with the name '" + delete + "' have been deleted.");
                        System.out.println();
	                	
	                } else {
	                	System.out.println("=============================================================================="); 
    					System.out.println();
	                	System.out.println("     The guideline '" + delete + "' was not found, therefore, it was not deleted.");
                        System.out.println();
	                }
	                 
	        	} else if (deleteMethod.equalsIgnoreCase("id") || deleteMethod.equalsIgnoreCase("2")) {
	        		
	        		System.out.println();
	        		System.out.println("Type the ID of the desired guideline: ");
	                int deleteId = read.nextInt();
	                read.nextLine(); 
	                System.out.println();
	                   
	                int index = deleteId - 1;
	                
	                if (index >= 0 && index < id && name[index] != null) {
	                	for (int p = index; p < id - 1; p++) {
	                		name[p] = name[p + 1];
	                		manualEn[p] = manualEn[p + 1];
	                		guideline[p] = guideline[p + 1];
	                	}
	                	
	                	name[id - 1] = null;
	                	manualEn[id - 1] = null;
	                	guideline[id - 1] = null;
	                	id--;
	                   
	                	System.out.println("=============================================================================="); 
    					System.out.println();
	                	System.out.println("                      The guideline '" + deleteId + "' has been deleted.");
                        System.out.println();

	                } else {
	                	System.out.println("=============================================================================="); 
    					System.out.println();
	                	System.out.println("        The guideline '" + deleteId + "' was not found, therefore, it was not deleted.");
                        System.out.println();
	                }
	        	}
	                
	        //CHANGE LANGUAGE-------------------------------------------------------------------------------------------------------------

	    } else if(menu.equalsIgnoreCase("change language") || menu.equals("5")) {
	    	Sincronizar.sincronizarIdiomas();
	    	PaginaInicial.showMenu();
	    	break;
	    	
	        //EXIT-------------------------------------------------------------------------------------------------------------
	    	
	    } else if(menu.equalsIgnoreCase("exit") || menu.equals("6")) {
	    	System.out.println("\nThank you for using WegOne! \nCome back soon.");
			System.out.println("\n=============================================================================="); 
	    }
		
		}while(!menu.equals("6") && !menu.equalsIgnoreCase("Exit"));
		
		read.close();
	}	
}