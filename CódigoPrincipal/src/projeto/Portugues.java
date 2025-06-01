package projeto;

import java.util.Scanner;

public class Portugues {
	
	Scanner leia = new Scanner(System.in);
	
	int pesquisarId = 0, acharEdicao = 0;
	String menu = null, pesquisarNome = null, excluir, edicao, editar, formaPesquisa;
	static String []nome = new String[100];
	static String []manualPt = new String[100];
	static String []orientacao = new String[100];
	int id = 10;
    
	public void portugues() {
		
		Fixos.fixosPortugues();
		
		System.out.println("======================== Bem-vindo ao site da WegOne! ========================"); 
		System.out.println(); 
		System.out.println("Aqui você vai conhecer nossos projetos, aprender sobre nossas soluções \ninovadoras e descobrir como estamos transformando ideias em tecnologia."); 
		System.out.println(); 

		do {

		System.out.println("=============================================================================="); 
		System.out.println(); 

		System.out.println("====================== Selecione o que você precisa fazer ====================\n"); 
		System.out.println("1- Cadastrar uma orientação; \n2- Pesquisar uma orientação; \n3- Editar uma orientação; \n4- Excluir uma orientação; \n5- Trocar Idioma; \n6- Sair;"); 
		menu = leia.nextLine();

		System.out.println(); 
		System.out.println("==============================================================================");

		//CADASTRO-------------------------------------------------------------------------------------------------------------

		boolean repetido = false;
        String digitado;
		if(menu.equalsIgnoreCase("cadastrar") || menu.equals("1")) {
			
			System.out.println("\n=================== Selecione o tipo de orientação desejada ==================");
			System.out.println();
		    System.out.println("1- Manual de Operação;\n2- Procedimento de Segurança;\n3- Manutenção e Reparos;\n4- Teste e Diagnósticos;\n5- Manual de Conduta e Operações Setoriais;");
			orientacao[id] = leia.nextLine();
			System.out.println();
	        
			//MANUAL DE OPERACAO-------------------------------------------------------------------------------------------------------------
			
			if(orientacao[id].equalsIgnoreCase("Manual de Operação") ||  orientacao[id].equals("1")) {
				
	            System.out.println("======================= Selecione a opção de cadastro ========================\n");
		    	System.out.println("1- Apenas no idioma atual (português); \n2- Em todos os idiomas do site; ");
		        int formaCadastro = leia.nextInt();
		        leia.nextLine();
		        System.out.println();
				
		        if(orientacao[id].equalsIgnoreCase("1")) {
					orientacao[id] = "Manual de Operação";
		        }
		        
				for(int a = 0; a < nome.length; a++) {			
					if(nome[a] == null) {
					
					System.out.println("=============================================================================="); 
					System.out.println();
					System.out.println("Digite o nome da orientação: ");
					digitado = leia.nextLine();
					System.out.println();
					
					while(digitado.trim().isEmpty()) {
						System.out.println("Inválido. Digite novamente: ");
						digitado = leia.nextLine();
						System.out.println();
					}
						
					nome[a] = digitado;
					String mostrar = digitado;
					System.out.println("=============================================================================="); 
					System.out.println();
					
					if (formaCadastro == 2){
						
						System.out.println("Digite o nome da orientação em inglês: ");
						digitado = leia.nextLine();
						System.out.println();
						
						while(digitado.trim().isEmpty()) {
							System.out.println("Inválido. Digite novamente: ");
							digitado = leia.nextLine();
							System.out.println();
						}
							
						Ingles.name[a] = digitado;
						
						//---------------------------------------------------------------------------------------------------
						
						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Digite o nome da orientação em espanhol: ");
						digitado = leia.nextLine();
						System.out.println();
						
						while(digitado.trim().isEmpty()) {
							System.out.println("Inválido. Digite novamente: ");
							digitado = leia.nextLine();
							System.out.println();
						}
							
						Espanhol.nombre[a] = digitado;
						
						//---------------------------------------------------------------------------------------------------
						
						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Digite o nome da orientação em alemão: ");
						digitado = leia.nextLine();
						System.out.println();
						
						while(digitado.trim().isEmpty()) {
							System.out.println("Inválido. Digite novamente: ");
							digitado = leia.nextLine();
							System.out.println();
						}
							
						Alemao.nameDe[a] = digitado;
						
						//---------------------------------------------------------------------------------------------------
						
						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Digite o nome da orientação em francês: ");
						digitado = leia.nextLine();
						System.out.println();
						
						while(digitado.trim().isEmpty()) {
							System.out.println("Inválido. Digite novamente: ");
							digitado = leia.nextLine();
							System.out.println();
						}
							
						System.out.println("=============================================================================="); 
						System.out.println();
						Frances.nom[a] = digitado;
						
					}
						
					System.out.println("Digite a orientação: ");
					String digitado1 = leia.nextLine();
					System.out.println();
					
					while(digitado1.trim().isEmpty() || repetido) {
						System.out.println("Inválido. Digite novamente: ");
					    digitado1 = leia.nextLine();
					    System.out.println();
					}
					
					System.out.println("==============================================================================");
					System.out.println();
					manualPt[a] = digitado1;
					
					if (formaCadastro == 2){
						
						System.out.println("Digite a orientação em inglês: ");
						digitado1 = leia.nextLine();
						System.out.println();
						
						while(digitado1.trim().isEmpty() || repetido) {
							System.out.println("Inválido. Digite novamente: ");
						    digitado1 = leia.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Ingles.manualEn[a] = digitado1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Digite a orientação em espanhol: ");
						digitado1 = leia.nextLine();
						System.out.println();
						
						while(digitado1.trim().isEmpty() || repetido) {
							System.out.println("Inválido. Digite novamente: ");
						    digitado1 = leia.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Espanhol.manualEs[a] = digitado1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Digite a orientação em alemão: ");
						digitado1 = leia.nextLine();
						System.out.println();
						
						while(digitado1.trim().isEmpty() || repetido) {
							System.out.println("Inválido. Digite novamente: ");
						    digitado1 = leia.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Alemao.handbuch[a] = digitado1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Digite a orientação em francês: ");
						digitado1 = leia.nextLine();
						System.out.println();
						
						while(digitado1.trim().isEmpty() || repetido) {
							System.out.println("Inválido. Digite novamente: ");
						    digitado1 = leia.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Frances.manuelFr[a] = digitado1;
						
					}
					
					orientacao[a] = "Manual de Operação";
					
                    System.out.println("               A orientação '" + mostrar + "' foi cadastrada!");
                    System.out.println();
					
					break;
					}
				}
				
			//PROCEDIMENTO DE SEGURANÇA-------------------------------------------------------------------------------------------------------------
				
			}else if(orientacao[id].equalsIgnoreCase("Procedimento de Segurança") || orientacao[id].equals("2")) {
				
				System.out.println("======================== Selecione a opção de cadastro =========================\n");
		    	System.out.println("1- Apenas no idioma atual (português); \n2- Em todos os idiomas do site; ");
		        int formaCadastro = leia.nextInt();
		        leia.nextLine();
		        System.out.println();
				
		        if(orientacao[id].equalsIgnoreCase("2")) {
					orientacao[id] = "Procedimento de Segurança";
		        }
		        
				for(int b = 0; b < nome.length; b++) {			
					if(nome[b] == null) {
					
					System.out.println("=============================================================================="); 
					System.out.println();
					System.out.println("Digite o nome da orientação: ");
					digitado = leia.nextLine();
					System.out.println();
					
					while(digitado.trim().isEmpty()) {
						System.out.println("Inválido. Digite novamente: ");
						digitado = leia.nextLine();
						System.out.println();
					}
						
					nome[b] = digitado;
					String mostrar = digitado;
					System.out.println("=============================================================================="); 
					System.out.println();
					
					if (formaCadastro == 2){
						
						System.out.println("Digite o nome da orientação em inglês: ");
						digitado = leia.nextLine();
						System.out.println();
						
						while(digitado.trim().isEmpty()) {
							System.out.println("Inválido. Digite novamente: ");
							digitado = leia.nextLine();
							System.out.println();
						}
							
						Ingles.name[b] = digitado;
						
						//---------------------------------------------------------------------------------------------------
						
						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Digite o nome da orientação em espanhol: ");
						digitado = leia.nextLine();
						System.out.println();
						
						while(digitado.trim().isEmpty()) {
							System.out.println("Inválido. Digite novamente: ");
							digitado = leia.nextLine();
							System.out.println();
						}
							
						Espanhol.nombre[b] = digitado;
						
						//---------------------------------------------------------------------------------------------------
						
						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Digite o nome da orientação em alemão: ");
						digitado = leia.nextLine();
						System.out.println();
						
						while(digitado.trim().isEmpty()) {
							System.out.println("Inválido. Digite novamente: ");
							digitado = leia.nextLine();
							System.out.println();
						}
							
						Alemao.nameDe[b] = digitado;
						
						//---------------------------------------------------------------------------------------------------
						
						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Digite o nome da orientação em francês: ");
						digitado = leia.nextLine();
						System.out.println();
						
						while(digitado.trim().isEmpty()) {
							System.out.println("Inválido. Digite novamente: ");
							digitado = leia.nextLine();
							System.out.println();
						}
							
						System.out.println("=============================================================================="); 
						System.out.println();
						Frances.nom[b] = digitado;
						
					}
						
					System.out.println("Digite a orientação: ");
					String digitado1 = leia.nextLine();
					System.out.println();
					
					while(digitado1.trim().isEmpty() || repetido) {
						System.out.println("Inválido. Digite novamente: ");
					    digitado1 = leia.nextLine();
					    System.out.println();
					}
					
					System.out.println("=============================================================================="); 
					System.out.println();
					manualPt[b] = digitado1;
					
					if (formaCadastro == 2){
						
						System.out.println("Digite a orientação em inglês: ");
						digitado1 = leia.nextLine();
						System.out.println();
						
						while(digitado1.trim().isEmpty() || repetido) {
							System.out.println("Inválido. Digite novamente: ");
						    digitado1 = leia.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Ingles.manualEn[b] = digitado1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Digite a orientação em espanhol: ");
						digitado1 = leia.nextLine();
						System.out.println();
						
						while(digitado1.trim().isEmpty() || repetido) {
							System.out.println("Inválido. Digite novamente: ");
						    digitado1 = leia.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Espanhol.manualEs[b] = digitado1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Digite a orientação em alemão: ");
						digitado1 = leia.nextLine();
						System.out.println();
						
						while(digitado1.trim().isEmpty() || repetido) {
							System.out.println("Inválido. Digite novamente: ");
						    digitado1 = leia.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Alemao.handbuch[b] = digitado1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Digite a orientação em francês: ");
						digitado1 = leia.nextLine();
						System.out.println();
						
						while(digitado1.trim().isEmpty() || repetido) {
							System.out.println("Inválido. Digite novamente: ");
						    digitado1 = leia.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Frances.manuelFr[b] = digitado1;
						
					}
					
					orientacao[b] = "Procedimento de Segurança";
					
                    System.out.println("               A orientação '" + mostrar + "' foi cadastrada!");
                    System.out.println();
					
					break;
					}
				}
				
			//MANUTENÇÃO E REPAROS-------------------------------------------------------------------------------------------------------------
				
			}else if(orientacao[id].equalsIgnoreCase("Manutenção e Reparos") || orientacao[id].equals("3")) {
				
				System.out.println("======================== Selecione a opção de cadastro =========================\n");
		    	System.out.println("1- Apenas no idioma atual (português); \n2- Em todos os idiomas do site; ");
		        int formaCadastro = leia.nextInt();
		        leia.nextLine();
		        System.out.println();
				
		        if(orientacao[id].equalsIgnoreCase("3")) {
					orientacao[id] = "Manutenção e Reparos";
		        }
		        
				for(int c = 0; c < nome.length; c++) {			
					if(nome[c] == null) {
					
					System.out.println("=============================================================================="); 
					System.out.println();
					System.out.println("Digite o nome da orientação: ");
					digitado = leia.nextLine();
					System.out.println();
					
					while(digitado.trim().isEmpty()) {
						System.out.println("Inválido. Digite novamente: ");
						digitado = leia.nextLine();
						System.out.println();
					}
						
					nome[c] = digitado;
					String mostrar = digitado;
					System.out.println("=============================================================================="); 
					System.out.println();
					
					if (formaCadastro == 2){
						
						System.out.println("Digite o nome da orientação em inglês: ");
						digitado = leia.nextLine();
						System.out.println();
						
						while(digitado.trim().isEmpty()) {
							System.out.println("Inválido. Digite novamente: ");
							digitado = leia.nextLine();
							System.out.println();
						}
							
						Ingles.name[c] = digitado;
						
						//---------------------------------------------------------------------------------------------------
						
						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Digite o nome da orientação em espanhol: ");
						digitado = leia.nextLine();
						System.out.println();
						
						while(digitado.trim().isEmpty()) {
							System.out.println("Inválido. Digite novamente: ");
							digitado = leia.nextLine();
							System.out.println();
						}
							
						Espanhol.nombre[c] = digitado;
						
						//---------------------------------------------------------------------------------------------------
						
						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Digite o nome da orientação em alemão: ");
						digitado = leia.nextLine();
						System.out.println();
						
						while(digitado.trim().isEmpty()) {
							System.out.println("Inválido. Digite novamente: ");
							digitado = leia.nextLine();
							System.out.println();
						}
							
						Alemao.nameDe[c] = digitado;
						
						//---------------------------------------------------------------------------------------------------
						
						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Digite o nome da orientação em francês: ");
						digitado = leia.nextLine();
						System.out.println();
						
						while(digitado.trim().isEmpty()) {
							System.out.println("Inválido. Digite novamente: ");
							digitado = leia.nextLine();
							System.out.println();
						}
							
						System.out.println("=============================================================================="); 
						System.out.println();
						Frances.nom[c] = digitado;
						
					}
						
					System.out.println("Digite a orientação: ");
					String digitado1 = leia.nextLine();
					System.out.println();
					
					while(digitado1.trim().isEmpty() || repetido) {
						System.out.println("Inválido. Digite novamente: ");
					    digitado1 = leia.nextLine();
					    System.out.println();
					}
					
					System.out.println("=============================================================================="); 
					System.out.println();
					manualPt[c] = digitado1;
					
					if (formaCadastro == 2){
						
						System.out.println("Digite a orientação em inglês: ");
						digitado1 = leia.nextLine();
						System.out.println();
						
						while(digitado1.trim().isEmpty() || repetido) {
							System.out.println("Inválido. Digite novamente: ");
						    digitado1 = leia.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Ingles.manualEn[c] = digitado1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Digite a orientação em espanhol: ");
						digitado1 = leia.nextLine();
						System.out.println();
						
						while(digitado1.trim().isEmpty() || repetido) {
							System.out.println("Inválido. Digite novamente: ");
						    digitado1 = leia.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Espanhol.manualEs[c] = digitado1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Digite a orientação em alemão: ");
						digitado1 = leia.nextLine();
						System.out.println();
						
						while(digitado1.trim().isEmpty() || repetido) {
							System.out.println("Inválido. Digite novamente: ");
						    digitado1 = leia.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Alemao.handbuch[c] = digitado1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Digite a orientação em francês: ");
						digitado1 = leia.nextLine();
						System.out.println();
						
						while(digitado1.trim().isEmpty() || repetido) {
							System.out.println("Inválido. Digite novamente: ");
						    digitado1 = leia.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Frances.manuelFr[c] = digitado1;
						
					}
					
					orientacao[c] = "Manutenção e Reparos";
					
                    System.out.println("               A orientação '" + mostrar + "' foi cadastrada!");
                    System.out.println();
					
					break;
					}
				}
				
			//TESTE E DIAGNÓSTICOS-------------------------------------------------------------------------------------------------------------
				
			}else if(orientacao[id].equalsIgnoreCase("Teste e Diagnósticos") || orientacao[id].equals("4")) {
				
				System.out.println("======================== Selecione a opção de cadastro =========================\n");
		    	System.out.println("1- Apenas no idioma atual (português); \n2- Em todos os idiomas do site; ");
		        int formaCadastro = leia.nextInt();
		        leia.nextLine();
		        System.out.println();
				
		        if(orientacao[id].equalsIgnoreCase("4")) {
					orientacao[id] = "Teste e Diagnósticos";
		        }
		        
				for(int d = 0; d < nome.length; d++) {			
					if(nome[d] == null) {
					
					System.out.println("=============================================================================="); 
					System.out.println();
					System.out.println("Digite o nome da orientação: ");
					digitado = leia.nextLine();
					System.out.println();
					
					while(digitado.trim().isEmpty()) {
						System.out.println("Inválido. Digite novamente: ");
						digitado = leia.nextLine();
						System.out.println();
					}
						
					nome[d] = digitado;
					String mostrar = digitado;
					System.out.println("=============================================================================="); 
					System.out.println();
					
					if (formaCadastro == 2){
						
						System.out.println("Digite o nome da orientação em inglês: ");
						digitado = leia.nextLine();
						System.out.println();
						
						while(digitado.trim().isEmpty()) {
							System.out.println("Inválido. Digite novamente: ");
							digitado = leia.nextLine();
							System.out.println();
						}
							
						Ingles.name[d] = digitado;
						
						//---------------------------------------------------------------------------------------------------
						
						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Digite o nome da orientação em espanhol: ");
						digitado = leia.nextLine();
						System.out.println();
						
						while(digitado.trim().isEmpty()) {
							System.out.println("Inválido. Digite novamente: ");
							digitado = leia.nextLine();
							System.out.println();
						}
							
						Espanhol.nombre[d] = digitado;
						
						//---------------------------------------------------------------------------------------------------
						
						System.out.println("==============================================================================");
						System.out.println();
						System.out.println("Digite o nome da orientação em alemão: ");
						digitado = leia.nextLine();
						System.out.println();
						
						while(digitado.trim().isEmpty()) {
							System.out.println("Inválido. Digite novamente: ");
							digitado = leia.nextLine();
							System.out.println();
						}
							
						Alemao.nameDe[d] = digitado;
						
						//---------------------------------------------------------------------------------------------------
						
						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Digite o nome da orientação em francês: ");
						digitado = leia.nextLine();
						System.out.println();
						
						while(digitado.trim().isEmpty()) {
							System.out.println("Inválido. Digite novamente: ");
							digitado = leia.nextLine();
							System.out.println();
						}
							
						System.out.println("=============================================================================="); 
						System.out.println();
						Frances.nom[d] = digitado;
						
					}
						
					System.out.println("Digite a orientação: ");
					String digitado1 = leia.nextLine();
					System.out.println();
					
					while(digitado1.trim().isEmpty() || repetido) {
						System.out.println("Inválido. Digite novamente: ");
					    digitado1 = leia.nextLine();
					    System.out.println();
					}
					
					System.out.println("=============================================================================="); 
					System.out.println();
					manualPt[d] = digitado1;
					
					if (formaCadastro == 2){
						
						System.out.println("Digite a orientação em inglês: ");
						digitado1 = leia.nextLine();
						System.out.println();
						
						while(digitado1.trim().isEmpty() || repetido) {
							System.out.println("Inválido. Digite novamente: ");
						    digitado1 = leia.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Ingles.manualEn[d] = digitado1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Digite a orientação em espanhol: ");
						digitado1 = leia.nextLine();
						System.out.println();
						
						while(digitado1.trim().isEmpty() || repetido) {
							System.out.println("Inválido. Digite novamente: ");
						    digitado1 = leia.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Espanhol.manualEs[d] = digitado1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Digite a orientação em alemão: ");
						digitado1 = leia.nextLine();
						System.out.println();
						
						while(digitado1.trim().isEmpty() || repetido) {
							System.out.println("Inválido. Digite novamente: ");
						    digitado1 = leia.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Alemao.handbuch[d] = digitado1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Digite a orientação em francês: ");
						digitado1 = leia.nextLine();
						System.out.println();
						
						while(digitado1.trim().isEmpty() || repetido) {
							System.out.println("Inválido. Digite novamente: ");
						    digitado1 = leia.nextLine();
						    System.out.println();
						}
						
						System.out.println("==============================================================================");
						System.out.println();
						Frances.manuelFr[d] = digitado1;
						
					}
					
					orientacao[d] = "Teste e Diagnósticos";
					
                    System.out.println("               A orientação '" + mostrar + "' foi cadastrada!");
                    System.out.println();
					
					break;
					}
				}
				
			//MANUAL DE CONDUTA E OPERAÇÕES SETORIAIS-------------------------------------------------------------------------------------------------------------
				
			}else if(orientacao[id].equalsIgnoreCase("Manual de conduta e Operações setoriais") || orientacao[id].equals("5")) {
				
				System.out.println("======================== Selecione a opção de cadastro =========================\n");
		    	System.out.println("1- Apenas no idioma atual (português); \n2- Em todos os idiomas do site; ");
		        int formaCadastro = leia.nextInt();
		        leia.nextLine();
		        System.out.println();
				
		        if(orientacao[id].equalsIgnoreCase("5")) {
					orientacao[id] = "Manual de conduta e Operações setoriais";
		        }
		        
				for(int e = 0; e < nome.length; e++) {			
					if(nome[e] == null) {
					
					System.out.println("=============================================================================="); 
					System.out.println();
					System.out.println("Digite o nome da orientação: ");
					digitado = leia.nextLine();
					System.out.println();
					
					while(digitado.trim().isEmpty()) {
						System.out.println("Inválido. Digite novamente: ");
						digitado = leia.nextLine();
						System.out.println();
					}
						
					nome[e] = digitado;
					String mostrar = digitado;
					System.out.println("=============================================================================="); 
					System.out.println();
					
					if (formaCadastro == 2){
						
						System.out.println("Digite o nome da orientação em inglês: ");
						digitado = leia.nextLine();
						System.out.println();
						
						while(digitado.trim().isEmpty()) {
							System.out.println("Inválido. Digite novamente: ");
							digitado = leia.nextLine();
							System.out.println();
						}
							
						Ingles.name[e] = digitado;
						
						//---------------------------------------------------------------------------------------------------
						
						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Digite o nome da orientação em espanhol: ");
						digitado = leia.nextLine();
						System.out.println();
						
						while(digitado.trim().isEmpty()) {
							System.out.println("Inválido. Digite novamente: ");
							digitado = leia.nextLine();
							System.out.println();
						}
							
						Espanhol.nombre[e] = digitado;
						
						//---------------------------------------------------------------------------------------------------
						
						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Digite o nome da orientação em alemão: ");
						digitado = leia.nextLine();
						System.out.println();
						
						while(digitado.trim().isEmpty()) {
							System.out.println("Inválido. Digite novamente: ");
							digitado = leia.nextLine();
							System.out.println();
						}
							
						Alemao.nameDe[e] = digitado;
						
						//---------------------------------------------------------------------------------------------------
						
						System.out.println("=============================================================================="); 
						System.out.println();
						System.out.println("Digite o nome da orientação em francês: ");
						digitado = leia.nextLine();
						System.out.println();
						
						while(digitado.trim().isEmpty()) {
							System.out.println("Inválido. Digite novamente: ");
							digitado = leia.nextLine();
							System.out.println();
						}
							
						System.out.println("=============================================================================="); 
						System.out.println();
						Frances.nom[e] = digitado;
						
					}
						
					System.out.println("Digite a orientação: ");
					String digitado1 = leia.nextLine();
					System.out.println();
					
					while(digitado1.trim().isEmpty() || repetido) {
						System.out.println("Inválido. Digite novamente: ");
					    digitado1 = leia.nextLine();
					    System.out.println();
					}
					
					System.out.println("==============================================================================");
					System.out.println();
					manualPt[e] = digitado1;
					
					if (formaCadastro == 2){
						
						System.out.println("Digite a orientação em inglês: ");
						digitado1 = leia.nextLine();
						System.out.println();
						
						while(digitado1.trim().isEmpty() || repetido) {
							System.out.println("Inválido. Digite novamente: ");
						    digitado1 = leia.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Ingles.manualEn[e] = digitado1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Digite a orientação em espanhol: ");
						digitado1 = leia.nextLine();
						System.out.println();
						
						while(digitado1.trim().isEmpty() || repetido) {
							System.out.println("Inválido. Digite novamente: ");
						    digitado1 = leia.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Espanhol.manualEs[e] = digitado1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Digite a orientação em alemão: ");
						digitado1 = leia.nextLine();
						System.out.println();
						
						while(digitado1.trim().isEmpty() || repetido) {
							System.out.println("Inválido. Digite novamente: ");
						    digitado1 = leia.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Alemao.handbuch[e] = digitado1;
						
						//---------------------------------------------------------------------------------------------------

						System.out.println("Digite a orientação em francês: ");
						digitado1 = leia.nextLine();
						System.out.println();
						
						while(digitado1.trim().isEmpty() || repetido) {
							System.out.println("Inválido. Digite novamente: ");
						    digitado1 = leia.nextLine();
						    System.out.println();
						}
						
						System.out.println("=============================================================================="); 
						System.out.println();
						Frances.manuelFr[e] = digitado1;
						
					}
					
					orientacao[e] = "Manual de conduta e Operações setoriais";
					
                    System.out.println("               A orientação '" + mostrar + "' foi cadastrada!");
                    System.out.println();
					
					break;
					}
				}
			} id++;
			
			//PESQUISA-------------------------------------------------------------------------------------------------------------
			
	    }else if(menu.equalsIgnoreCase("Pesquisa") || menu.equals("2")) {
	    	
	        System.out.println();
            System.out.println("======================= Selecione o método de pesquisa =======================\n");
	    	System.out.println("1- Nome; \n2- Id; ");
	        formaPesquisa = leia.nextLine();
	        System.out.println();
			System.out.println("=============================================================================="); 
	        
	        boolean encontrado = false;
	        
	        if (formaPesquisa.equalsIgnoreCase("nome") || formaPesquisa.equalsIgnoreCase("1")) {
	        	System.out.println();
	            System.out.println("Digite o nome da orientação desejada: ");
	            pesquisarNome = leia.nextLine();
	            System.out.println();
	            
	            int contagem = 0;
	            for(int f = 0; f < nome.length; f++) {
	                if(nome[f] != null && nome[f].equalsIgnoreCase(pesquisarNome)) {
	                    contagem++;
	                    
	                    if(contagem == 1) {
	                    	
	    					System.out.println("==============================================================================");
	    					System.out.println();
	                        System.out.println("             A orientação '" + pesquisarNome + "' já foi cadastrada!");
	                        System.out.println();
	    					System.out.println("=============================================================================="); 
	                        System.out.println("\n========================== Orientação Cadastrada =============================");
	                        
	                        System.out.println();
	                        System.out.println("-- Nome da orientação: " + nome[f]);
	                        System.out.println("-- Id da orientação: " + (f + 1));
	                        System.out.println("-- Tipo da orientação: " + orientacao[f]);
	                        
	                        if(manualPt[f] != null) {
	                            System.out.println("-- Orientação: " + manualPt[f]);
	                        }
	                        System.out.println();
	                        
	                        encontrado = true;
	                    
	                    } else {
	    					System.out.println("=============================================================================="); 
	                        System.out.println("\n========================== Orientação Cadastrada =============================");
	                        
	                        System.out.println();
	                        System.out.println("-- Nome da orientação: " + nome[f]);
	                        System.out.println("-- Id da orientação: " + (f + 1));
	                        System.out.println("-- Tipo da orientação: " + orientacao[f]);
	                        
	                        if(manualPt[f] != null) {
	                            System.out.println("-- Orientação: " + manualPt[f]);
	                        }
	                        System.out.println();
	                        
	                        encontrado = true;
	                    }
	                    
	                }
	            }
	                    
	            if(!encontrado) {
	            	System.out.println("=============================================================================="); 
					System.out.println();
                    System.out.println("             A orientação '" + pesquisarNome + "' não está cadastrada!");
                    System.out.println();
	            }
	            
	        } else if (formaPesquisa.equalsIgnoreCase("id") || formaPesquisa.equalsIgnoreCase("2")) {
	        	System.out.println();
	            System.out.println("Digite o ID da orientação desejada: ");
	            pesquisarId = leia.nextInt();
	            leia.nextLine();
	            System.out.println();
	            
	            for(int f = 0; f < nome.length; f++) {
	                if(pesquisarId == (f + 1) && orientacao[f] != null && !orientacao[f].isEmpty()) {
	                	
	                	System.out.println("=============================================================================="); 
    					System.out.println();
                        System.out.println("             A orientação '" + pesquisarId + "' já foi cadastrada!");
                        System.out.println();
    					System.out.println("=============================================================================="); 
                        System.out.println("\n=========================== Orientação Cadastrada ============================");
	                    
	                    System.out.println();
	                    System.out.println("-- Nome da orientação: " + nome[f]);
                        System.out.println("-- Id da orientação: " + (f + 1));
                        System.out.println("-- Tipo da orientação: " + orientacao[f]);

	                    if(manualPt[f] != null) {
	                        System.out.println("-- Orientação: " + manualPt[f]);
	                    }
	                    System.out.println();
	                    
	                    encontrado = true;
	                    
	                }
	            }
	            if(!encontrado) {
	                System.out.println("=============================================================================="); 
					System.out.println();
                    System.out.println("             A orientação '" + pesquisarId + "' não está cadastrada!");
                    System.out.println();
	            }
	        }
		
	        //EDITAR-------------------------------------------------------------------------------------------------------------

	    }else if(menu.equals("editar") || menu.equals("3") ) {
	    	
	    	System.out.println();
            System.out.println("======================== Selecione o método de edição ========================\n");
	    	System.out.println("1- Nome; \n2- Id; ");
	    	String formaEditar = leia.nextLine();
	        System.out.println();
			System.out.println("=============================================================================="); 
	    		         
	         if (formaEditar.equals("1") || formaEditar.equalsIgnoreCase("nome")) {
	        	System.out.println();
	        	System.out.println("**Observação: Se mais de uma orientação conter o mesmo nome, todas serão \nsolicitadas para edição.\n\n**Dica: Você pode deixar em branco para ignorar aquelas que não deseja mudar, \ndeixando-as como antes. (Ou você pode selecionar o ID como método de pesquisa) \n\nDigite o nome da orientação desejada: ");
	     		edicao = leia.nextLine();
	     		System.out.println();
	     		
	     		for(int h = 0; h < nome.length; h++) {
	     			if(nome[h] != null && nome[h].equalsIgnoreCase(edicao)) {
	     				
	     	            System.out.println("====================== Selecione o que você deseja editar =======================\n");
	     		    	System.out.println("1- Nome; \n2- Tipo; \n3- Orientação; \n4- Tudo; ");
	     		    	editar = leia.nextLine();
	     		    	String dig;
	     		        System.out.println();
	     				System.out.println("==============================================================================");
	     				
	     				if(editar.equalsIgnoreCase("nome") || editar.equalsIgnoreCase("1")) {
	     					
	     					System.out.println();
	     					System.out.println("Digite o novo nome da orientação (de ID '" + (h + 1) + "'): ");
	     					dig = leia.nextLine();
	     					System.out.println();
	     					
	     					if (dig.trim().isEmpty()){
	     						break;
	     					} else {
	     						nome[h] = dig;
	     					}
	     					
	     					System.out.println("=============================================================================="); 
	    					System.out.println();
	                        System.out.println("            A orientação '" + edicao + "' foi editada para '" + nome[h] + "'!");
	                        System.out.println();
	     				
	     				}else if(editar.equalsIgnoreCase("tipo") || editar.equalsIgnoreCase("2")) {
	     					
	                        System.out.println("\n============= Selecione o novo tipo da orientação (de ID '" + (h + 1) + "') ===============\n");
	     					System.out.println("1- Manual de Operação;\n2- Procedimento de Segurança;\n3- Manutenção e Reparos;\n4- Teste e Diagnósticos;\n5- Manual de conduta e Operações setoriais;");	     					
	     					dig = leia.nextLine();
	     					System.out.println();
	     					
	     					if (dig.trim().isEmpty()){
	     						break;
	     					}else if(dig.equalsIgnoreCase("1") || dig.equalsIgnoreCase("Manual de Operação")) {
	     						orientacao[h] = "Manual de Operação";
	     					}else if(dig.equalsIgnoreCase("2") || dig.equalsIgnoreCase("Procedimento de Segurança")) {
	     						orientacao[h] = "Procedimento de Segurança";
	     					}else if(dig.equalsIgnoreCase("3") || dig.equalsIgnoreCase("Manutenção e Reparos")) {
	     						orientacao[h] = "Manutenção e Reparos";
	     					}else if(dig.equalsIgnoreCase("4") || dig.equalsIgnoreCase("Teste e Diagnósticos")) {
	     						orientacao[h] = "Teste e Diagnósticos";
	     					}else if(dig.equalsIgnoreCase("5") || dig.equalsIgnoreCase("Manual de conduta e Operações setoriais")) {
	     						orientacao[h] = "Manual de conduta e Operações setoriais";
	     					}
	     					
	     					System.out.println("=============================================================================="); 
	    					System.out.println();
	                        System.out.println("               A orientação '" + edicao + "' foi editada!");
	                        System.out.println();
	     					
	     				}else if(editar.equalsIgnoreCase("orientacao") || editar.equalsIgnoreCase("3")) {
	     					System.out.println();
	     					System.out.println("Digite a nova orientação (de ID '" + (h + 1) + "'): ");
	     					dig = leia.nextLine();
	     					System.out.println();
	     					
	     					if (dig.trim().isEmpty()){
	     						break;
	     					} else {
	     						manualPt[h] = dig;
	     					}
	     					
	     					System.out.println("=============================================================================="); 
	    					System.out.println();
	                        System.out.println("               A orientação '" + edicao + "' foi editada!");
	                        System.out.println();
	     					
	     				}else if(editar.equalsIgnoreCase("tudo") || editar.equalsIgnoreCase("4")) {
	     				
	     					System.out.println();
	     					System.out.println("Digite o novo nome da orientação (de ID '" + (h + 1) + "'): ");
	     					dig = leia.nextLine();
	     					
	     					if (dig.trim().isEmpty()){
	     						break;
	     					} else {
	     						nome[h] = dig;
	     					}
	     				
	                        System.out.println("\n============= Selecione o novo tipo da orientação (de ID '" + (h + 1) + "') ===============\n");
	     					System.out.println("1- Manual de Operação;\n2- Procedimento de Segurança;\n3- Manutenção e Reparos;\n4- Teste e Diagnósticos;\n5- Manual de conduta e Operações setoriais;");	     					
	     					dig = leia.nextLine();
	     					System.out.println();
		     				System.out.println("=============================================================================="); 
	     					
	     					if (dig.trim().isEmpty()){
	     						break;
	     					}else if(dig.equalsIgnoreCase("1") || dig.equalsIgnoreCase("Manual de Operação")) {
	     						orientacao[h] = "Manual de Operação";
	     					}else if(dig.equalsIgnoreCase("2") || dig.equalsIgnoreCase("Procedimento de Segurança")) {
	     						orientacao[h] = "Procedimento de Segurança";
	     					}else if(dig.equalsIgnoreCase("3") || dig.equalsIgnoreCase("Manutenção e Reparos")) {
	     						orientacao[h] = "Manutenção e Reparos";
	     					}else if(dig.equalsIgnoreCase("4") || dig.equalsIgnoreCase("Teste e Diagnósticos")) {
	     						orientacao[h] = "Teste e Diagnósticos";
	     					}else if(dig.equalsIgnoreCase("5") || dig.equalsIgnoreCase("Manual de conduta e Operações setoriais")) {
	     						orientacao[h] = "Manual de conduta e Operações setoriais";
	     					}
	     				
	     					System.out.println();
	     					System.out.println("Digite a nova orientação (de ID '" + (h + 1) + "'): ");
	     					dig = leia.nextLine();
	     					System.out.println();
	     					
	     					if (dig.trim().isEmpty()){
	     						break;
	     					} else {
	     						manualPt[h] = dig;
	     					}
	     					
	     					System.out.println("=============================================================================="); 
	    					System.out.println();
	                        System.out.println("            A orientação '" + edicao + "' foi editada para '" + nome[h] + "'!");
	                        System.out.println();
	     					
	     			}
	     		}
	     	}
	     		
	        }else if(formaEditar.equals("2") || formaEditar.equalsIgnoreCase("id")) {
	        	
	      		System.out.println();
	        	System.out.println("Digite o ID da orientação desejada: ");
	     		acharEdicao = leia.nextInt();
	     		leia.nextLine();
	     		System.out.println();
	      		
	      		 for(int h = 0; h < nome.length; h++) {
	                 if(acharEdicao == (h + 1) && orientacao[h] != null && !orientacao[h].isEmpty()) {
	                	 
	                	System.out.println("====================== Selecione o que você deseja editar =======================\n");
		     		    System.out.println("1- Nome; \n2- Tipo; \n3- Orientação; \n4- Tudo; ");
		     		    editar = leia.nextLine();
		     		    String dig;
		     		    System.out.println();
		     		    System.out.println("=============================================================================="); 
		     				
		     			if(editar.equalsIgnoreCase("nome") || editar.equalsIgnoreCase("1")) {
		     					
		     				System.out.println();
	     					System.out.println("Digite o novo nome da orientação (de ID '" + (h + 1) + "'): ");
		     				dig = leia.nextLine();
		     				System.out.println();
		     					
		     				if (dig.trim().isEmpty()){
		     					break;
		     				} else {
		     					nome[h] = dig;
		     				}
		     				
		     				System.out.println("=============================================================================="); 
	    					System.out.println();
	                        System.out.println("            A orientação '" + acharEdicao + "' foi editada para '" + nome[h] + "'!");
	                        System.out.println();
		     				
		     			}else if(editar.equalsIgnoreCase("tipo") || editar.equalsIgnoreCase("2")) {
		     					
	                        System.out.println("\n============= Selecione o novo tipo da orientação (de ID '" + (h + 1) + "') ===============\n");
		     				System.out.println("1- Manual de Operação;\n2- Procedimento de Segurança;\n3- Manutenção e Reparos;\n4- Teste e Diagnósticos;\n5- Manual de conduta e Operações setoriais;");	     					
		     				dig = leia.nextLine();
		     				System.out.println();
		     					
		     				if (dig.trim().isEmpty()){
		     					break;
		     				}else if(dig.equalsIgnoreCase("1") || dig.equalsIgnoreCase("Manual de Operação")) {
		     					orientacao[h] = "Manual de Operação";
		     				}else if(dig.equalsIgnoreCase("2") || dig.equalsIgnoreCase("Procedimento de Segurança")) {
		     					orientacao[h] = "Procedimento de Segurança";
		     				}else if(dig.equalsIgnoreCase("3") || dig.equalsIgnoreCase("Manutenção e Reparos")) {
		     					orientacao[h] = "Manutenção e Reparos";
		     				}else if(dig.equalsIgnoreCase("4") || dig.equalsIgnoreCase("Teste e Diagnósticos")) {
		     					orientacao[h] = "Teste e Diagnósticos";
		     				}else if(dig.equalsIgnoreCase("5") || dig.equalsIgnoreCase("Manual de conduta e Operações setoriais")) {
		     					orientacao[h] = "Manual de conduta e Operações setoriais";
		     				}
		     				
		     				System.out.println("=============================================================================="); 
	    					System.out.println();
	                        System.out.println("               A orientação '" + acharEdicao + "' foi editada!");
	                        System.out.println();
		     					
		     			}else if(editar.equalsIgnoreCase("orientacao") || editar.equalsIgnoreCase("3")) {
		     				System.out.println();
	     					System.out.println("Digite a nova orientação (de ID '" + (h + 1) + "'): ");
		     				dig = leia.nextLine();
		     				System.out.println();
		     					
		     				if (dig.trim().isEmpty()){
		     					break;
		     				} else {
		     					manualPt[h] = dig;
		     				}
		     				
		     				System.out.println("=============================================================================="); 
	    					System.out.println();
	                        System.out.println("               A orientação '" + acharEdicao + "' foi editada!");
	                        System.out.println();
		     					
		     			}else if(editar.equalsIgnoreCase("tudo") || editar.equalsIgnoreCase("4")) {
		     				
		     				System.out.println();
	     					System.out.println("Digite o novo nome da orientação (de ID '" + (h + 1) + "'): ");
		     				dig = leia.nextLine();
		     					
		     				if (dig.trim().isEmpty()){
		     					break;
		     				} else {
		     					nome[h] = dig;
		     				}
		     				
	                        System.out.println("\n============= Selecione o novo tipo da orientação (de ID '" + (h + 1) + "') ===============\n");
		     				System.out.println("1- Manual de Operação;\n2- Procedimento de Segurança;\n3- Manutenção e Reparos;\n4- Teste e Diagnósticos;\n5- Manual de conduta e Operações setoriais;");	     					
		     				dig = leia.nextLine();
		     				System.out.println();
			     			System.out.println("=============================================================================="); 
		     					
		     				if (dig.trim().isEmpty()){
		     					break;
		     				}else if(dig.equalsIgnoreCase("1") || dig.equalsIgnoreCase("Manual de Operação")) {
		     					orientacao[h] = "Manual de Operação";
		     				}else if(dig.equalsIgnoreCase("2") || dig.equalsIgnoreCase("Procedimento de Segurança")) {
		     					orientacao[h] = "Procedimento de Segurança";
		     				}else if(dig.equalsIgnoreCase("3") || dig.equalsIgnoreCase("Manutenção e Reparos")) {
		     					orientacao[h] = "Manutenção e Reparos";
		     				}else if(dig.equalsIgnoreCase("4") || dig.equalsIgnoreCase("Teste e Diagnósticos")) {
		     					orientacao[h] = "Teste e Diagnósticos";
		     				}else if(dig.equalsIgnoreCase("5") || dig.equalsIgnoreCase("Manual de conduta e Operações setoriais")) {
		     					orientacao[h] = "Manual de conduta e Operações setoriais";
		     				}
		     				
		     				System.out.println();
	     					System.out.println("Digite a nova orientação (de ID '" + (h + 1) + "'): ");
		     				dig = leia.nextLine();
		     				System.out.println();
		     					
		     				if (dig.trim().isEmpty()){
		     					break;
		     				} else {
		     					manualPt[h] = dig;
		     				}
		     				
		     				System.out.println("==============================================================================");
	    					System.out.println();
	                        System.out.println("            A orientação '" + acharEdicao + "' foi editada para '" + nome[h] + "'!");
	                        System.out.println();
	      			
	      				} 
	         
	      			} 
	         
	      		} 
	         
	      	}
	         
	        //EXCLUIR-------------------------------------------------------------------------------------------------------------

	    }else if(menu.equals("excluir") || menu.equals("4")) {
	    	
	    	System.out.println();
            System.out.println("======================== Selecione o método de exclusão =========================\n");
	    	System.out.println("1- Nome; \n2- Id; ");
	    	String formaExcluir = leia.nextLine();
	        System.out.println();
			System.out.println("=============================================================================="); 

	        	if (formaExcluir.equalsIgnoreCase("nome") || formaExcluir.equalsIgnoreCase("1")) {
	 
	        		System.out.println();
		        	System.out.println("**Observação: Se mais de uma orientação conter o mesmo nome, todas serão excluídas.\n\n**Dica: Você pode selecionar o ID como método de exclusão \npara previnir este ocorrido. \n\nDigite o nome da orientação desejada: ");
		     		excluir = leia.nextLine();
		     		System.out.println();
	        		
	                boolean remover = false;
	                int g = 0;
	                
	                while (g < id) {
	                	
	                	if (nome[g] != null && nome[g].equalsIgnoreCase(excluir)) {
	                		for (int p = g; p < id - 1; p++) {
	                			nome[p] = nome[p + 1];
	                            manualPt[p] = manualPt[p + 1];
	                            orientacao[p] = orientacao[p + 1];
	                        }
	                		
	                		nome[id - 1] = null;
	                        manualPt[id - 1] = null;
	                        orientacao[id - 1] = null;
	                        id--;
	                        remover = true;
	                               
	                	} else {
	                        g++; 
	                    }
	                	
	                }

	                if (remover) {
	                	System.out.println("=============================================================================="); 
    					System.out.println();
	                	System.out.println("          Todas as orientações com o nome '" + excluir + "' foram excluídas.");
                        System.out.println();
	                	
	                } else {
	                	System.out.println("=============================================================================="); 
    					System.out.println();
	                	System.out.println("     A orientação '" + excluir + "' não foi localizada, portanto, não foi excluída.");
                        System.out.println();
	                }
	                 
	        	} else if (formaExcluir.equalsIgnoreCase("id") || formaExcluir.equalsIgnoreCase("2")) {
	        		
	        		System.out.println();
	        		System.out.println("Digite o ID da orientação desejada: ");
	                int excluirId = leia.nextInt();
	                leia.nextLine(); 
	                System.out.println();
	                   
	                int index = excluirId - 1;
	                
	                if (index >= 0 && index < id && nome[index] != null) {
	                	for (int p = index; p < id - 1; p++) {
	                		nome[p] = nome[p + 1];
	                		manualPt[p] = manualPt[p + 1];
	                		orientacao[p] = orientacao[p + 1];
	                	}
	                	
	                	nome[id - 1] = null;
	                	manualPt[id - 1] = null;
	                	orientacao[id - 1] = null;
	                	id--;
	                   
	                	System.out.println("=============================================================================="); 
    					System.out.println();
	                	System.out.println("                      A orientação '" + excluirId + "' foi excluída.");
                        System.out.println();

	                } else {
	                	System.out.println("=============================================================================="); 
    					System.out.println();
	                	System.out.println("     A orientação '" + excluirId + "' não foi localizada, portanto, não foi excluída.");
                        System.out.println();
	                }
	        	}
	                
	        //TROCAR IDIOMA-------------------------------------------------------------------------------------------------------------

	    } else if(menu.equalsIgnoreCase("trocar idioma") || menu.equals("5")) {
	    	Sincronizar.sincronizarIdiomas();
	    	PaginaInicial.showMenu();
	    	break;
	    	
	        //SAIR-------------------------------------------------------------------------------------------------------------
	    	
	    } else if (menu.equalsIgnoreCase("sair") || menu.equals("6")) {
            System.out.println("\nObrigado por utilizar a WegOne! \nVolte Sempre.");
            System.out.println("\n=============================================================================="); 
        }
		
		}while(!menu.equals("6") && !menu.equalsIgnoreCase("sair"));
		
		leia.close();
	}
}