package projeto;

import java.util.Scanner;

public class Espanhol {
	
	Scanner leer = new Scanner(System.in);
	
	int idBusqueda = 0, encontrarEdicion = 0;
	String menu = null, nombreBusqueda = null, eliminar, edicion, editar, metodoBusqueda, metodoEdicion;
	static String []nombre = new String[100];
	static String []manualEs = new String[100];
	static String []directriz = new String[100];
	int id = 10;
	
	public void espanhol() {
		
		Fixos.fixosEspanhol();
		
		System.out.println("====================== ¡Bienvenido al sitio de WegOne! ======================="); 
		System.out.println(); 
		System.out.println("Aquí conocerás nuestros proyectos, aprenderás sobre nuestras soluciones \ninnovadoras y descubrirás cómo estamos transformando ideas en tecnología."); 
		System.out.println(); 

		do {

			System.out.println("=============================================================================="); 
			System.out.println(); 

			System.out.println("===================== Seleccione qué necesita hacer ahora ====================\n"); 
			System.out.println("1- Registrar una directriz; \n2- Buscar una directriz; \n3- Editar una directriz; \n4- Eliminar una directriz; \n5- Cambiar idioma; \n6- Salir;"); 
			menu = leer.nextLine();

			System.out.println();
			System.out.println("=============================================================================="); 

		//REGISTRAR-------------------------------------------------------------------------------------------------------------

		boolean repetido = false;
		String escrito;

		if(menu.equalsIgnoreCase("registrar") || menu.equals("1")) {

		    System.out.println("\n=================== Seleccione el tipo de directriz deseado ==================");
		    System.out.println();
		    System.out.println("1- Manual de Operación;\n2- Procedimiento de Seguridad;\n3- Mantenimiento y Reparaciones;\n4- Pruebas y Diagnóstico;\n5- Código de Conducta y Operaciones Sectoriales;");
		    directriz[id] = leer.nextLine();
		    System.out.println();
			
		  //MANUAL DE OPERACIÓN-------------------------------------------------------------------------------------------------------------

		    if(directriz[id].equalsIgnoreCase("Manual de Operación") || directriz[id].equals("1")) {

		        System.out.println("====================== Seleccione la opción de registro ======================\n");
		        System.out.println("1- Solo en el idioma actual (español); \n2- En todos los idiomas del sitio web; ");
		        int metodoRegistro = leer.nextInt();
		        leer.nextLine();
		        System.out.println();

		        if(directriz[id].equalsIgnoreCase("1")) {
		            directriz[id] = "Manual de Operación";
		        }

		        for(int a = 0; a < nombre.length; a++) {
		            if(nombre[a] == null) {

		                System.out.println("=============================================================================="); 
		                System.out.println();
		                System.out.println("Escriba el nombre de la directriz: ");
		                escrito = leer.nextLine();
		                System.out.println();

		                while(escrito.trim().isEmpty()) {
		                    System.out.println("Inválido. Intente de nuevo: ");
		                    escrito = leer.nextLine();
		                    System.out.println();
		                }

		                nombre[a] = escrito;
		                String mostrar = escrito;
		                System.out.println("=============================================================================="); 
		                System.out.println();

		                if (metodoRegistro == 2){

		                    System.out.println("Escriba el nombre de la directriz en portugués: ");
		                    escrito = leer.nextLine();
		                    System.out.println();

		                    while(escrito.trim().isEmpty()) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito = leer.nextLine();
		                        System.out.println();
		                    }

		                    Portugues.nome[a] = escrito;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    System.out.println("Escriba el nombre de la directriz en english: ");
		                    escrito = leer.nextLine();
		                    System.out.println();

		                    while(escrito.trim().isEmpty()) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito = leer.nextLine();
		                        System.out.println();
		                    }

		                    Ingles.name[a] = escrito;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    System.out.println("Escriba el nombre de la directriz en alemán: ");
		                    escrito = leer.nextLine();
		                    System.out.println();

		                    while(escrito.trim().isEmpty()) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito = leer.nextLine();
		                        System.out.println();
		                    }

		                    Alemao.nameDe[a] = escrito;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    System.out.println("Escriba el nombre de la directriz en francés: ");
		                    escrito = leer.nextLine();
		                    System.out.println();

		                    while(escrito.trim().isEmpty()) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    Frances.nom[a] = escrito;
		                }

		                System.out.println("Escriba la directriz: ");
		                String escrito1 = leer.nextLine();
		                System.out.println();

		                while(escrito1.trim().isEmpty() || repetido) {
		                    System.out.println("Inválido. Intente de nuevo: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();
		                }

		                System.out.println("=============================================================================="); 
		                System.out.println();
		                manualEs[a] = escrito1;

		                if (metodoRegistro == 2){

		                    System.out.println("Escriba la directriz en portugués: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();

		                    while(escrito1.trim().isEmpty() || repetido) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito1 = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    Portugues.manualPt[a] = escrito1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Escriba la directriz en english: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();

		                    while(escrito1.trim().isEmpty() || repetido) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito1 = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    Ingles.manualEn[a] = escrito1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Escriba la directriz en alemán: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();

		                    while(escrito1.trim().isEmpty() || repetido) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito1 = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    Alemao.handbuch[a] = escrito1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Escriba la directriz en francés: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();

		                    while(escrito1.trim().isEmpty() || repetido) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito1 = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Frances.manuelFr[a] = escrito1;
		                }

		                directriz[a] = "Manual de Operación";

		                System.out.println("               ¡La directriz '" + mostrar + "' ha sido registrada!");
		                System.out.println();

		                break;
		            }
		        }
				
			//PROCEDIMENTO DE SEGURIDAD-------------------------------------------------------------------------------------------------------------
				
			}else if(directriz[id].equalsIgnoreCase("Procedimiento de Seguridad") || directriz[id].equals("2")) {
				
		        System.out.println("====================== Seleccione la opción de registro ======================\n");
		        System.out.println("1- Solo en el idioma actual (español); \n2- En todos los idiomas del sitio web; ");
		        int metodoRegistro = leer.nextInt();
		        leer.nextLine();
		        System.out.println();

		        if(directriz[id].equalsIgnoreCase("2")) {
		            directriz[id] = "Procedimiento de Seguridad";
		        }

		        for(int b = 0; b < nombre.length; b++) {
		            if(nombre[b] == null) {

		                System.out.println("=============================================================================="); 
		                System.out.println();
		                System.out.println("Escriba el nombre de la directriz: ");
		                escrito = leer.nextLine();
		                System.out.println();

		                while(escrito.trim().isEmpty()) {
		                    System.out.println("Inválido. Intente de nuevo: ");
		                    escrito = leer.nextLine();
		                    System.out.println();
		                }

		                nombre[b] = escrito;
		                String mostrar = escrito;
		                System.out.println("=============================================================================="); 
		                System.out.println();

		                if (metodoRegistro == 2){

		                    System.out.println("Escriba el nombre de la directriz en portugués: ");
		                    escrito = leer.nextLine();
		                    System.out.println();

		                    while(escrito.trim().isEmpty()) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito = leer.nextLine();
		                        System.out.println();
		                    }

		                    Portugues.nome[b] = escrito;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    System.out.println("Escriba el nombre de la directriz en english: ");
		                    escrito = leer.nextLine();
		                    System.out.println();

		                    while(escrito.trim().isEmpty()) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito = leer.nextLine();
		                        System.out.println();
		                    }

		                    Ingles.name[b] = escrito;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    System.out.println("Escriba el nombre de la directriz en alemán: ");
		                    escrito = leer.nextLine();
		                    System.out.println();

		                    while(escrito.trim().isEmpty()) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito = leer.nextLine();
		                        System.out.println();
		                    }

		                    Alemao.nameDe[b] = escrito;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    System.out.println("Escriba el nombre de la directriz en francés: ");
		                    escrito = leer.nextLine();
		                    System.out.println();

		                    while(escrito.trim().isEmpty()) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Frances.nom[b] = escrito;
		                }

		                System.out.println("Escriba la directriz: ");
		                String escrito1 = leer.nextLine();
		                System.out.println();

		                while(escrito1.trim().isEmpty() || repetido) {
		                    System.out.println("Inválido. Intente de nuevo: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();
		                }

		                System.out.println("==============================================================================");
		                System.out.println();
		                manualEs[b] = escrito1;

		                if (metodoRegistro == 2){

		                    System.out.println("Escriba la directriz en portugués: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();

		                    while(escrito1.trim().isEmpty() || repetido) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito1 = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    Portugues.manualPt[b] = escrito1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Escriba la directriz en english: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();

		                    while(escrito1.trim().isEmpty() || repetido) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito1 = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    Ingles.manualEn[b] = escrito1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Escriba la directriz en alemán: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();

		                    while(escrito1.trim().isEmpty() || repetido) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito1 = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Alemao.handbuch[b] = escrito1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Escriba la directriz en francés: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();

		                    while(escrito1.trim().isEmpty() || repetido) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito1 = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    Frances.manuelFr[b] = escrito1;
		                }

		                directriz[b] = "Procedimiento de Seguridad";

		                System.out.println("               ¡La directriz '" + mostrar + "' ha sido registrada!");
		                System.out.println();

		                break;
		            }
		        }
				
			//MANTENIMENTO Y REPARACIONES-------------------------------------------------------------------------------------------------------------
				
			}else if(directriz[id].equalsIgnoreCase("Mantenimiento y Reparaciones") || directriz[id].equals("3")) {
				
		        System.out.println("====================== Seleccione la opción de registro ======================\n");
		        System.out.println("1- Solo en el idioma actual (español); \n2- En todos los idiomas del sitio web; ");
		        int metodoRegistro = leer.nextInt();
		        leer.nextLine();
		        System.out.println();

		        if(directriz[id].equalsIgnoreCase("3")) {
		            directriz[id] = "Mantenimiento y Reparaciones";
		        }

		        for(int c = 0; c < nombre.length; c++) {
		            if(nombre[c] == null) {

		                System.out.println("=============================================================================="); 
		                System.out.println();
		                System.out.println("Escriba el nombre de la directriz: ");
		                escrito = leer.nextLine();
		                System.out.println();

		                while(escrito.trim().isEmpty()) {
		                    System.out.println("Inválido. Intente de nuevo: ");
		                    escrito = leer.nextLine();
		                    System.out.println();
		                }

		                nombre[c] = escrito;
		                String mostrar = escrito;
		                System.out.println("=============================================================================="); 
		                System.out.println();

		                if (metodoRegistro == 2){

		                    System.out.println("Escriba el nombre de la directriz en portugués: ");
		                    escrito = leer.nextLine();
		                    System.out.println();

		                    while(escrito.trim().isEmpty()) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito = leer.nextLine();
		                        System.out.println();
		                    }

		                    Portugues.nome[c] = escrito;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    System.out.println("Escriba el nombre de la directriz en english: ");
		                    escrito = leer.nextLine();
		                    System.out.println();

		                    while(escrito.trim().isEmpty()) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito = leer.nextLine();
		                        System.out.println();
		                    }

		                    Ingles.name[c] = escrito;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    System.out.println("Escriba el nombre de la directriz en alemán: ");
		                    escrito = leer.nextLine();
		                    System.out.println();

		                    while(escrito.trim().isEmpty()) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito = leer.nextLine();
		                        System.out.println();
		                    }

		                    Alemao.nameDe[c] = escrito;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    System.out.println("Escriba el nombre de la directriz en francés: ");
		                    escrito = leer.nextLine();
		                    System.out.println();

		                    while(escrito.trim().isEmpty()) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    Frances.nom[c] = escrito;
		                }

		                System.out.println("Escriba la directriz: ");
		                String escrito1 = leer.nextLine();
		                System.out.println();

		                while(escrito1.trim().isEmpty() || repetido) {
		                    System.out.println("Inválido. Intente de nuevo: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();
		                }

		                System.out.println("=============================================================================="); 
		                System.out.println();
		                manualEs[c] = escrito1;

		                if (metodoRegistro == 2){

		                    System.out.println("Escriba la directriz en portugués: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();

		                    while(escrito1.trim().isEmpty() || repetido) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito1 = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    Portugues.manualPt[c] = escrito1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Escriba la directriz en english: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();

		                    while(escrito1.trim().isEmpty() || repetido) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito1 = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    Ingles.manualEn[c] = escrito1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Escriba la directriz en alemán: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();

		                    while(escrito1.trim().isEmpty() || repetido) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito1 = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    Alemao.handbuch[c] = escrito1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Escriba la directriz en francés: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();

		                    while(escrito1.trim().isEmpty() || repetido) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito1 = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    Frances.manuelFr[c] = escrito1;
		                }

		                directriz[c] = "Mantenimiento y Reparaciones";

		                System.out.println("               ¡La directriz '" + mostrar + "' ha sido registrada!");
		                System.out.println();

		                break;
		            }
		        }
				
			//PRUEBAS Y DIAGNOSTICO-------------------------------------------------------------------------------------------------------------
				
			}else if(directriz[id].equalsIgnoreCase("Pruebas y Diagnóstico") || directriz[id].equals("4")) {
				
		        System.out.println("====================== Seleccione la opción de registro ======================\n");
		        System.out.println("1- Solo en el idioma actual (español); \n2- En todos los idiomas del sitio web; ");
		        int metodoRegistro = leer.nextInt();
		        leer.nextLine();
		        System.out.println();

		        if(directriz[id].equalsIgnoreCase("4")) {
		            directriz[id] = "Pruebas y Diagnóstico";
		        }

		        for(int d = 0; d < nombre.length; d++) {
		            if(nombre[d] == null) {

		                System.out.println("=============================================================================="); 
		                System.out.println();
		                System.out.println("Escriba el nombre de la directriz: ");
		                escrito = leer.nextLine();
		                System.out.println();

		                while(escrito.trim().isEmpty()) {
		                    System.out.println("Inválido. Intente de nuevo: ");
		                    escrito = leer.nextLine();
		                    System.out.println();
		                }

		                nombre[d] = escrito;
		                String mostrar = escrito;
		                System.out.println("==============================================================================");
		                System.out.println();

		                if (metodoRegistro == 2){

		                    System.out.println("Escriba el nombre de la directriz en portugués: ");
		                    escrito = leer.nextLine();
		                    System.out.println();

		                    while(escrito.trim().isEmpty()) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito = leer.nextLine();
		                        System.out.println();
		                    }

		                    Portugues.nome[d] = escrito;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    System.out.println("Escriba el nombre de la directriz en english: ");
		                    escrito = leer.nextLine();
		                    System.out.println();

		                    while(escrito.trim().isEmpty()) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito = leer.nextLine();
		                        System.out.println();
		                    }

		                    Ingles.name[d] = escrito;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    System.out.println("Escriba el nombre de la directriz en alemán: ");
		                    escrito = leer.nextLine();
		                    System.out.println();

		                    while(escrito.trim().isEmpty()) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito = leer.nextLine();
		                        System.out.println();
		                    }

		                    Alemao.nameDe[d] = escrito;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    System.out.println("Escriba el nombre de la directriz en francés: ");
		                    escrito = leer.nextLine();
		                    System.out.println();

		                    while(escrito.trim().isEmpty()) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    Frances.nom[d] = escrito;
		                }

		                System.out.println("Escriba la directriz: ");
		                String escrito1 = leer.nextLine();
		                System.out.println();

		                while(escrito1.trim().isEmpty() || repetido) {
		                    System.out.println("Inválido. Intente de nuevo: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();
		                }

		                System.out.println("=============================================================================="); 
		                System.out.println();
		                manualEs[d] = escrito1;

		                if (metodoRegistro == 2){

		                    System.out.println("Escriba la directriz en portugués: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();

		                    while(escrito1.trim().isEmpty() || repetido) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito1 = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    Portugues.manualPt[d] = escrito1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Escriba la directriz en english: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();

		                    while(escrito1.trim().isEmpty() || repetido) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito1 = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    Ingles.manualEn[d] = escrito1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Escriba la directriz en alemán: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();

		                    while(escrito1.trim().isEmpty() || repetido) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito1 = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Alemao.handbuch[d] = escrito1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Escriba la directriz en francés: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();

		                    while(escrito1.trim().isEmpty() || repetido) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito1 = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    Frances.manuelFr[d] = escrito1;
		                }

		                directriz[d] = "Pruebas y Diagnóstico";

		                System.out.println("               ¡La directriz '" + mostrar + "' ha sido registrada!");
		                System.out.println();

		                break;
		            }
		        }
				
			//CODIGO DE CONDUCTA Y OPERACIONES SECTORIALES-------------------------------------------------------------------------------------------------------------
				
			}else if(directriz[id].equalsIgnoreCase("Código de Conducta y Operaciones Sectoriales") || directriz[id].equals("5")) {
				
		        System.out.println("====================== Seleccione la opción de registro ======================\n");
		        System.out.println("1- Solo en el idioma actual (español); \n2- En todos los idiomas del sitio web; ");
		        int metodoRegistro = leer.nextInt();
		        leer.nextLine();
		        System.out.println();

		        if(directriz[id].equalsIgnoreCase("5")) {
		            directriz[id] = "Código de Conducta y Operaciones Sectoriales";
		        }

		        for(int e = 0; e < nombre.length; e++) {
		            if(nombre[e] == null) {

		                System.out.println("=============================================================================="); 
		                System.out.println();
		                System.out.println("Escriba el nombre de la directriz: ");
		                escrito = leer.nextLine();
		                System.out.println();

		                while(escrito.trim().isEmpty()) {
		                    System.out.println("Inválido. Intente de nuevo: ");
		                    escrito = leer.nextLine();
		                    System.out.println();
		                }

		                nombre[e] = escrito;
		                String mostrar = escrito;
		                System.out.println("=============================================================================="); 
		                System.out.println();

		                if (metodoRegistro == 2){

		                    System.out.println("Escriba el nombre de la directriz en portugués: ");
		                    escrito = leer.nextLine();
		                    System.out.println();

		                    while(escrito.trim().isEmpty()) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito = leer.nextLine();
		                        System.out.println();
		                    }

		                    Portugues.nome[e] = escrito;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    System.out.println("Escriba el nombre de la directriz en english: ");
		                    escrito = leer.nextLine();
		                    System.out.println();

		                    while(escrito.trim().isEmpty()) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito = leer.nextLine();
		                        System.out.println();
		                    }

		                    Ingles.name[e] = escrito;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    System.out.println("Escriba el nombre de la directriz en alemán: ");
		                    escrito = leer.nextLine();
		                    System.out.println();

		                    while(escrito.trim().isEmpty()) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito = leer.nextLine();
		                        System.out.println();
		                    }

		                    Alemao.nameDe[e] = escrito;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    System.out.println("Escriba el nombre de la directriz en francés: ");
		                    escrito = leer.nextLine();
		                    System.out.println();

		                    while(escrito.trim().isEmpty()) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    Frances.nom[e] = escrito;
		                }

		                System.out.println("Escriba la directriz: ");
		                String escrito1 = leer.nextLine();
		                System.out.println();

		                while(escrito1.trim().isEmpty() || repetido) {
		                    System.out.println("Inválido. Intente de nuevo: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();
		                }

		                System.out.println("==============================================================================");
		                System.out.println();
		                manualEs[e] = escrito1;

		                if (metodoRegistro == 2){

		                    System.out.println("Escriba la directriz en portugués: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();

		                    while(escrito1.trim().isEmpty() || repetido) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito1 = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    Portugues.manualPt[e] = escrito1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Escriba la directriz en english: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();

		                    while(escrito1.trim().isEmpty() || repetido) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito1 = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    Ingles.manualEn[e] = escrito1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Escriba la directriz en alemán: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();

		                    while(escrito1.trim().isEmpty() || repetido) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito1 = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("=============================================================================="); 
		                    System.out.println();
		                    Alemao.handbuch[e] = escrito1;

		                    //---------------------------------------------------------------------------------------------------

		                    System.out.println("Escriba la directriz en francés: ");
		                    escrito1 = leer.nextLine();
		                    System.out.println();

		                    while(escrito1.trim().isEmpty() || repetido) {
		                        System.out.println("Inválido. Intente de nuevo: ");
		                        escrito1 = leer.nextLine();
		                        System.out.println();
		                    }

		                    System.out.println("==============================================================================");
		                    System.out.println();
		                    Frances.manuelFr[e] = escrito1;
		                }

		                directriz[e] = "Código de Conducta y Operaciones Sectoriales";

		                System.out.println("               ¡La directriz '" + mostrar + "' ha sido registrada!");
		                System.out.println();

		                break;
		            }
		        }
			} id++;
			
			//BUSCAR-------------------------------------------------------------------------------------------------------------
			
	    }else if(menu.equalsIgnoreCase("Buscar") || menu.equals("2")) {
	    	
	    	System.out.println();
	    	System.out.println("====================== Seleccione el método de búsqueda ======================\n");
	    	System.out.println("1- Nombre; \n2- Id; ");
	    	metodoBusqueda = leer.nextLine();
	    	System.out.println();
	    	System.out.println("=============================================================================="); 

	    	boolean encontrado = false;

	    	if (metodoBusqueda.equalsIgnoreCase("nombre") || metodoBusqueda.equalsIgnoreCase("1")) {
	    	    System.out.println();
	    	    System.out.println("Escriba el nombre de la directriz deseada: ");
	    	    nombreBusqueda = leer.nextLine();
	    	    System.out.println();

	    	    int contador = 0;
	    	    for(int f = 0; f < nombre.length; f++) {
	    	        if(nombre[f] != null && nombre[f].equalsIgnoreCase(nombreBusqueda)) {
	    	            contador++;

	    	            if(contador == 1) {

	    	                System.out.println("=============================================================================="); 
	    	                System.out.println();
	    	                System.out.println("             ¡La directriz '" + nombreBusqueda + "' ya ha sido registrada!");
	    	                System.out.println();
	    	                System.out.println("=============================================================================="); 
	    	                System.out.println("\n=========================== Directriz Registrada =============================");

	    	                System.out.println();
	    	                System.out.println("-- Nombre de la directriz: " + nombre[f]);
	    	                System.out.println("-- Id de la directriz: " + (f + 1));
	    	                System.out.println("-- Tipo de la directriz: " + directriz[f]);

	    	                if(manualEs[f] != null) {
	    	                    System.out.println("-- Directriz: " + manualEs[f]);
	    	                    System.out.println();
	    	                }

	    	                encontrado = true;

	    	            } else {
	    	                System.out.println("==============================================================================");
	    	                System.out.println("\n=========================== Directriz Registrada =============================");

	    	                System.out.println();
	    	                System.out.println("-- Nombre de la directriz: " + nombre[f]);
	    	                System.out.println("-- Id de la directriz: " + (f + 1));
	    	                System.out.println("-- Tipo de la directriz: " + directriz[f]);

	    	                if(manualEs[f] != null) {
	    	                    System.out.println("-- Directriz: " + manualEs[f]);
	    	                }
	    	                System.out.println();

	    	                encontrado = true;
	    	            }

	    	        }
	    	    }

	    	    if(!encontrado) {
	    	        System.out.println("=============================================================================="); 
	    	        System.out.println();
	    	        System.out.println("             ¡La directriz '" + nombreBusqueda + "' no está registrada!");
	    	        System.out.println();
	    	    }

	    	} else if (metodoBusqueda.equalsIgnoreCase("id") || metodoBusqueda.equalsIgnoreCase("2")) {
	    	    System.out.println();
	    	    System.out.println("Escriba el ID de la directriz deseada: ");
	    	    idBusqueda = leer.nextInt();
	    	    leer.nextLine();
	    	    System.out.println();

	    	    for(int f = 0; f < nombre.length; f++) {
	    	        if(idBusqueda == (f + 1) && directriz[f] != null && !directriz[f].isEmpty()) {

	    	            System.out.println("=============================================================================="); 
	    	            System.out.println();
	    	            System.out.println("             ¡La directriz con ID '" + idBusqueda + "' ya ha sido registrada!");
	    	            System.out.println();
	    	            System.out.println("=============================================================================="); 
	    	            System.out.println("\n=========================== Directriz Registrada =============================");

	    	            System.out.println();
	    	            System.out.println("-- Nombre de la directriz: " + nombre[f]);
	    	            System.out.println("-- Id de la directriz: " + (f + 1));
	    	            System.out.println("-- Tipo de la directriz: " + directriz[f]);

	    	            if(manualEs[f] != null) {
	    	                System.out.println("-- Directriz: " + manualEs[f]);
	    	            }
	    	            System.out.println();

	    	            encontrado = true;

	    	        }
	    	    }
	    	    if(!encontrado) {
	    	        System.out.println("=============================================================================="); 
	    	        System.out.println();
	    	        System.out.println("             ¡La directriz con ID '" + idBusqueda + "' no está registrada!");
	    	        System.out.println();
	    	    }
	    	}
		
	        //EDITAR-------------------------------------------------------------------------------------------------------------

	    }else if(menu.equals("editar") || menu.equals("3") ) {
	    	
	    	System.out.println();
	    	System.out.println("====================== Seleccione el método de edición =======================\n");
	    	System.out.println("1- Nombre; \n2- Id; ");
	    	metodoEdicion = leer.nextLine();
	    	
	    	System.out.println();
	    	System.out.println("==============================================================================");

	    	if (metodoEdicion.equals("1") || metodoEdicion.equalsIgnoreCase("Nombre")) {
	    	    System.out.println();
	    	    System.out.println("**Nota: Si hay más de una directriz con nombres idénticos, se solicitarán \ntodas para edición. \n\n**Consejo: Puede dejar en blanco los campos que no desea modificar, \ncomo antes. \n\nEscriba el nombre de la directriz deseada: ");
	    	    edicion = leer.nextLine();
	    	    System.out.println();

	    	    for (int h = 0; h < nombre.length; h++) {
	    	        if (nombre[h] != null && nombre[h].equalsIgnoreCase(edicion)) {

	    	            System.out.println("======================== Seleccione qué desea editar =========================\n");
	    	            System.out.println("1- Nombre; \n2- Tipo; \n3- Directriz; \n4- Todo;");
	    	            editar = leer.nextLine();
	    	            String escribir;
	    	            System.out.println();
	    	            System.out.println("==============================================================================");

	    	            if (editar.equalsIgnoreCase("Nombre") || editar.equalsIgnoreCase("1")) {
	    	                System.out.println();
	    	                System.out.println("Escriba el nuevo nombre de la directriz (id '" + (h + 1) + "'): ");
	    	                escribir = leer.nextLine();
	    	                System.out.println();

	    	                if (escribir.trim().isEmpty()) {
	    	                    break;
	    	                } else {
	    	                    nombre[h] = escribir;
	    	                }

	    	                System.out.println("==============================================================================");
	    	                System.out.println();
	    	                System.out.println("     ¡La directriz '" + edicion + "' ha sido editada a '" + nombre[h] + "'!");
	    	                System.out.println();

	    	            } else if (editar.equalsIgnoreCase("Tipo") || editar.equalsIgnoreCase("2")) {
	    	                System.out.println("\n============== Seleccione el nuevo tipo de directriz (id '" + (h + 1) + "') ===============\n");
	    	                System.out.println("1- Manual de operación;\n2- Procedimiento de seguridad;\n3- Mantenimiento y reparaciones;\n4- Pruebas y diagnósticos;\n5- Código de conducta y operaciones sectoriales;");
	    	                escribir = leer.nextLine();
	    	                System.out.println();

	    	                if (escribir.trim().isEmpty()) {
	    	                    break;
	    	                } else if (escribir.equalsIgnoreCase("1") || escribir.equalsIgnoreCase("Manual de operación")) {
	    	                    directriz[h] = "Manual de operación";
	    	                } else if (escribir.equalsIgnoreCase("2") || escribir.equalsIgnoreCase("Procedimiento de seguridad")) {
	    	                    directriz[h] = "Procedimiento de seguridad";
	    	                } else if (escribir.equalsIgnoreCase("3") || escribir.equalsIgnoreCase("Mantenimiento y reparaciones")) {
	    	                    directriz[h] = "Mantenimiento y reparaciones";
	    	                } else if (escribir.equalsIgnoreCase("4") || escribir.equalsIgnoreCase("Pruebas y diagnósticos")) {
	    	                    directriz[h] = "Pruebas y diagnósticos";
	    	                } else if (escribir.equalsIgnoreCase("5") || escribir.equalsIgnoreCase("Código de conducta y operaciones sectoriales")) {
	    	                    directriz[h] = "Código de conducta y operaciones sectoriales";
	    	                }

	    	                System.out.println("==============================================================================");
	    	                System.out.println();
	    	                System.out.println("               ¡La directriz '" + edicion + "' ha sido editada!");
	    	                System.out.println();

	    	            } else if (editar.equalsIgnoreCase("Directriz") || editar.equalsIgnoreCase("3")) {
	    	                System.out.println();
	    	                System.out.println("Escriba la nueva directriz (id '" + (h + 1) + "'): ");
	    	                escribir = leer.nextLine();
	    	                System.out.println();

	    	                if (escribir.trim().isEmpty()) {
	    	                    break;
	    	                } else {
	    	                    manualEs[h] = escribir;
	    	                }

	    	                System.out.println("==============================================================================");
	    	                System.out.println();
	    	                System.out.println("               ¡La directriz '" + edicion + "' ha sido editada!");
	    	                System.out.println();

	    	            } else if (editar.equalsIgnoreCase("Todo") || editar.equalsIgnoreCase("4")) {
	    	                System.out.println();
	    	                System.out.println("Escriba el nuevo nombre de la directriz (id '" + (h + 1) + "'): ");
	    	                escribir = leer.nextLine();

	    	                if (escribir.trim().isEmpty()) {
	    	                    break;
	    	                } else {
	    	                    nombre[h] = escribir;
	    	                }

	    	                System.out.println("\n============== Seleccione el nuevo tipo de directriz (id '" + (h + 1) + "') ===============\n");
	    	                System.out.println("1- Manual de operación;\n2- Procedimiento de seguridad;\n3- Mantenimiento y reparaciones;\n4- Pruebas y diagnósticos;\n5- Código de conducta y operaciones sectoriales;");
	    	                escribir = leer.nextLine();
	    	                System.out.println("==============================================================================");

	    	                if (escribir.trim().isEmpty()) {
	    	                    break;
	    	                } else if (escribir.equalsIgnoreCase("1") || escribir.equalsIgnoreCase("Manual de operación")) {
	    	                    directriz[h] = "Manual de operación";
	    	                } else if (escribir.equalsIgnoreCase("2") || escribir.equalsIgnoreCase("Procedimiento de seguridad")) {
	    	                    directriz[h] = "Procedimiento de seguridad";
	    	                } else if (escribir.equalsIgnoreCase("3") || escribir.equalsIgnoreCase("Mantenimiento y reparaciones")) {
	    	                    directriz[h] = "Mantenimiento y reparaciones";
	    	                } else if (escribir.equalsIgnoreCase("4") || escribir.equalsIgnoreCase("Pruebas y diagnósticos")) {
	    	                    directriz[h] = "Pruebas y diagnósticos";
	    	                } else if (escribir.equalsIgnoreCase("5") || escribir.equalsIgnoreCase("Código de conducta y operaciones sectoriales")) {
	    	                    directriz[h] = "Código de conducta y operaciones sectoriales";
	    	                }

	    	                System.out.println();
	    	                System.out.println("Escriba la nueva directriz (id '" + (h + 1) + "'): ");
	    	                escribir = leer.nextLine();
	    	                System.out.println();

	    	                if (escribir.trim().isEmpty()) {
	    	                    break;
	    	                } else {
	    	                    manualEs[h] = escribir;
	    	                }

	    	                System.out.println("==============================================================================");
	    	                System.out.println();
	    	                System.out.println("     ¡La directriz '" + edicion + "' ha sido editada a '" + nombre[h] + "'!");
	    	                System.out.println();
	    	            }
	    	        }
	    	    }
	    	    
	    	}else if(metodoEdicion.equals("2") || metodoEdicion.equalsIgnoreCase("id")) {
	    		
	    		System.out.println();
	    		System.out.println("Escriba el ID de la orientación deseada: ");
	    		encontrarEdicion = leer.nextInt();
	    		leer.nextLine();
	    		System.out.println();
	    		
	    		for(int h = 0; h < nombre.length; h++) {
	    			if(encontrarEdicion == (h + 1) && directriz[h] != null && !directriz[h].isEmpty()) {
	    				
	    	            System.out.println("======================== Seleccione qué desea editar =========================\n");
	    				System.out.println("1- Nombre; \n2- Tipo; \n3- Orientación; \n4- Todo; ");
	    				editar = leer.nextLine();
	    				String escribir;
	    				System.out.println();
	    				System.out.println("==============================================================================");

	    				if(editar.equalsIgnoreCase("nombre") || editar.equalsIgnoreCase("1")) {

	    					System.out.println();
	    					System.out.println("Escriba el nuevo nombre de la orientación (ID '" + (h + 1) + "'): ");
	    					escribir = leer.nextLine();
	    					System.out.println();

	    					if (escribir.trim().isEmpty()) {
	    						break;
	    					} else {
	    						nombre[h] = escribir;
	    					}

	    					System.out.println("==============================================================================");
	    					System.out.println();
	    					System.out.println("        ¡La orientación '" + edicion + "' fue editada a '" + nombre[h] + "'!");
	    					System.out.println();

	    				}else if(editar.equalsIgnoreCase("tipo") || editar.equalsIgnoreCase("2")) {

	    	                System.out.println("\n=============== Seleccione el nuevo tipo de directriz (id '" + (h + 1) + "') ===============\n");
	    					System.out.println("1- Manual de Operación;\n2- Procedimiento de Seguridad;\n3- Mantenimiento y Reparaciones;\n4- Pruebas y Diagnósticos;\n5- Manual de Conducta y Operaciones Sectoriales;");
	    					escribir = leer.nextLine();
	    					System.out.println();

	    					if (escribir.trim().isEmpty()) {
	    						break;
	    					}else if(escribir.equalsIgnoreCase("1") || escribir.equalsIgnoreCase("Manual de Operación")) {
	    						directriz[h] = "Manual de Operación";
	    					}else if(escribir.equalsIgnoreCase("2") || escribir.equalsIgnoreCase("Procedimiento de Seguridad")) {
	    						directriz[h] = "Procedimiento de Seguridad";
	    					}else if(escribir.equalsIgnoreCase("3") || escribir.equalsIgnoreCase("Mantenimiento y Reparaciones")) {
	    						directriz[h] = "Mantenimiento y Reparaciones";
	    					}else if(escribir.equalsIgnoreCase("4") || escribir.equalsIgnoreCase("Pruebas y Diagnósticos")) {
	    						directriz[h] = "Pruebas y Diagnósticos";
	    					}else if(escribir.equalsIgnoreCase("5") || escribir.equalsIgnoreCase("Manual de Conducta y Operaciones Sectoriales")) {
	    						directriz[h] = "Manual de Conducta y Operaciones Sectoriales";
	    					}

	    					System.out.println("==============================================================================");
	    					System.out.println();
	    					System.out.println("             ¡La orientación '" + edicion + "' fue editada!");
	    					System.out.println();

	    				}else if(editar.equalsIgnoreCase("orientacion") || editar.equalsIgnoreCase("3")) {

	    					System.out.println();
	    					System.out.println("Escriba la nueva orientación (ID '" + (h + 1) + "'): ");
	    					escribir = leer.nextLine();
	    					System.out.println();

	    					if (escribir.trim().isEmpty()) {
	    						break;
	    					} else {
	    						manualEs[h] = escribir;
	    					}

	    					System.out.println("==============================================================================");
	    					System.out.println();
	    					System.out.println("             ¡La orientación '" + edicion + "' fue editada!");
	    					System.out.println();

	    				}else if(editar.equalsIgnoreCase("todo") || editar.equalsIgnoreCase("4")) {

	    					System.out.println();
	    					System.out.println("Escriba el nuevo nombre de la orientación (ID '" + (h + 1) + "'): ");
	    					escribir = leer.nextLine();

	    					if (escribir.trim().isEmpty()) {
	    						break;
	    					} else {
	    						nombre[h] = escribir;
	    					}

	    	                System.out.println("\n============== Seleccione el nuevo tipo de directriz (id '" + (h + 1) + "') ===============\n");
	    					System.out.println("1- Manual de Operación;\n2- Procedimiento de Seguridad;\n3- Mantenimiento y Reparaciones;\n4- Pruebas y Diagnósticos;\n5- Manual de Conducta y Operaciones Sectoriales;");
	    					escribir = leer.nextLine();
	    					System.out.println("==============================================================================");

	    					if (escribir.trim().isEmpty()) {
	    						break;
	    					}else if(escribir.equalsIgnoreCase("1") || escribir.equalsIgnoreCase("Manual de Operación")) {
	    						directriz[h] = "Manual de Operación";
	    					}else if(escribir.equalsIgnoreCase("2") || escribir.equalsIgnoreCase("Procedimiento de Seguridad")) {
	    						directriz[h] = "Procedimiento de Seguridad";
	    					}else if(escribir.equalsIgnoreCase("3") || escribir.equalsIgnoreCase("Mantenimiento y Reparaciones")) {
	    						directriz[h] = "Mantenimiento y Reparaciones";
	    					}else if(escribir.equalsIgnoreCase("4") || escribir.equalsIgnoreCase("Pruebas y Diagnósticos")) {
	    						directriz[h] = "Pruebas y Diagnósticos";
	    					}else if(escribir.equalsIgnoreCase("5") || escribir.equalsIgnoreCase("Manual de Conducta y Operaciones Sectoriales")) {
	    						directriz[h] = "Manual de Conducta y Operaciones Sectoriales";
	    					}

	    					System.out.println();
	    					System.out.println("Escriba la nueva orientación (ID '" + (h + 1) + "'): ");
	    					escribir = leer.nextLine();
	    					System.out.println();

	    					if (escribir.trim().isEmpty()) {
	    						break;
	    					} else {
	    						manualEs[h] = escribir;
	    					}

	    					System.out.println("==============================================================================");
	    					System.out.println();
	    					System.out.println("        ¡La orientación '" + edicion + "' fue editada a '" + nombre[h] + "'!");
	    					System.out.println();

	    				} 

	    			} 

	    		} 

	    	} 
	         
	        //ELIMINAR-------------------------------------------------------------------------------------------------------------

	    }else if(menu.equals("eliminar") || menu.equals("4")) {
	    	
	    	System.out.println();
	    	System.out.println("===================== Seleccione el método de eliminación ====================\n");
	    	System.out.println("1- Nombre; \n2- Id; ");
	    	String metodoEliminar = leer.nextLine();
	    	System.out.println();
	    	System.out.println("=============================================================================="); 

	    	if (metodoEliminar.equalsIgnoreCase("nombre") || metodoEliminar.equalsIgnoreCase("1")) {

	    	    System.out.println();
	    	    System.out.println("**Nota: Si hay más de una directriz con nombres idénticos, todas serán \neliminadas. \n\n**Consejo: Puede elegir el ID como método de eliminación \npara evitar que esto ocurra. \n\nEscriba el nombre de la directriz deseada: ");
	    	    eliminar = leer.nextLine();
	    	    System.out.println();

	    	    boolean eliminarConfirmado = false;
	    	    int g = 0;

	    	    while (g < id) {

	    	        if (nombre[g] != null && nombre[g].equalsIgnoreCase(eliminar)) {
	    	            for (int p = g; p < id - 1; p++) {
	    	                nombre[p] = nombre[p + 1];
	    	                manualEs[p] = manualEs[p + 1];
	    	                directriz[p] = directriz[p + 1];
	    	            }

	    	            nombre[id - 1] = null;
	    	            manualEs[id - 1] = null;
	    	            directriz[id - 1] = null;
	    	            id--;
	    	            eliminarConfirmado = true;

	    	        } else {
	    	            g++;
	    	        }
	    	    }

	    	    if (eliminarConfirmado) {
	    	        System.out.println("==============================================================================");
	    	        System.out.println();
	    	        System.out.println("     Todas las directrices con el nombre '" + eliminar + "' han sido eliminadas.");
	    	        System.out.println();

	    	    } else {
	    	        System.out.println("==============================================================================");
	    	        System.out.println();
	    	        System.out.println("     La directriz '" + eliminar + "' no fue encontrada, por lo tanto, no fue eliminada.");
	    	        System.out.println();
	    	    }

	    	} else if (metodoEliminar.equalsIgnoreCase("id") || metodoEliminar.equalsIgnoreCase("2")) {

	    	    System.out.println();
	    	    System.out.println("Escriba el ID de la directriz deseada: ");
	    	    int idEliminar = leer.nextInt();
	    	    leer.nextLine(); 
	    	    System.out.println();

	    	    int indice = idEliminar - 1;

	    	    if (indice >= 0 && indice < id && nombre[indice] != null) {
	    	        for (int p = indice; p < id - 1; p++) {
	    	            nombre[p] = nombre[p + 1];
	    	            manualEs[p] = manualEs[p + 1];
	    	            directriz[p] = directriz[p + 1];
	    	        }

	    	        nombre[id - 1] = null;
	    	        manualEs[id - 1] = null;
	    	        directriz[id - 1] = null;
	    	        id--;

	    	        System.out.println("==============================================================================");
	    	        System.out.println();
	    	        System.out.println("                      La directriz '" + idEliminar + "' ha sido eliminada.");
	    	        System.out.println();

	    	    } else {
	    	        System.out.println("==============================================================================");
	    	        System.out.println();
	    	        System.out.println("     La directriz '" + idEliminar + "' no fue encontrada, por lo tanto, no fue eliminada.");
	    	        System.out.println();
	    	    }
	    	}
	                
	        //CAMBIAR IDIOMA-------------------------------------------------------------------------------------------------------------

	    } else if(menu.equalsIgnoreCase("Cambiar idioma") || menu.equals("5")) {
	    	Sincronizar.sincronizarIdiomas();
	    	PaginaInicial.showMenu();
	    	break;
	    	
	        //SALIR-------------------------------------------------------------------------------------------------------------
	    	
	    } else if (menu.equalsIgnoreCase("Salir") || menu.equals("6")) {
	    	System.out.println("\n¡Gracias por usar WegOne! \nVuelve pronto.");
			System.out.println("\n=============================================================================="); 
	    }
		
		}while(!menu.equals("6") && !menu.equalsIgnoreCase("Salir"));
		
		leer.close();
	}

}