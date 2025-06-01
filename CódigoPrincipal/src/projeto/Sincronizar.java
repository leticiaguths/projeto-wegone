package projeto;

public class Sincronizar {
	
	public static void sincronizarIdiomas() {
		
		for (int id = 0; id < Portugues.nome.length; id++) {
		
			//PORTUGUES-------------------------------------------------------------
			
			if(Portugues.nome[id] == null) {
				if(Ingles.name[id] != null) {
					Portugues.nome[id] = Ingles.name[id];
					Portugues.manualPt[id] = Ingles.manualEn[id];
					Portugues.orientacao[id] = Ingles.guideline[id];
				} else if(Espanhol.nombre[id] != null) {
					Portugues.nome[id] = Espanhol.nombre[id];
					Portugues.manualPt[id] = Espanhol.manualEs[id];
					Portugues.orientacao[id] = Espanhol.directriz[id];
				} else if(Alemao.nameDe[id] != null) {
					Portugues.nome[id] = Alemao.nameDe[id];
					Portugues.manualPt[id] = Alemao.handbuch[id];
					Portugues.orientacao[id] = Alemao.richtlinie[id];
				} else if(Frances.nom[id] != null) {
					Portugues.nome[id] = Frances.nom[id];
					Portugues.manualPt[id] = Frances.manuelFr[id];
					Portugues.orientacao[id] = Frances.directive[id];
				}
	        }
			
			//INGLES-------------------------------------------------------------
			
			if(Ingles.name[id] == null) {
				if(Portugues.nome[id] != null) {
					Ingles.name[id] = Portugues.nome[id];
					Ingles.manualEn[id] = Portugues.manualPt[id];
					Ingles.guideline[id] = Portugues.orientacao[id];
				} else if(Espanhol.nombre[id] != null) {
					Ingles.name[id] = Espanhol.nombre[id];
					Ingles.manualEn[id] = Espanhol.manualEs[id];
					Ingles.guideline[id] = Espanhol.directriz[id];
				} else if(Alemao.nameDe[id] != null) {
					Ingles.name[id] = Alemao.nameDe[id];
					Ingles.manualEn[id] = Alemao.handbuch[id];
					Ingles.guideline[id] = Alemao.richtlinie[id];
				} else if(Frances.nom[id] != null) {
					Ingles.name[id] = Frances.nom[id];
					Ingles.manualEn[id] = Frances.manuelFr[id];
					Ingles.guideline[id] = Frances.directive[id];
				}
			}
			
			//ESPANHOL-------------------------------------------------------------

			if(Espanhol.nombre[id] == null) {
				if(Portugues.nome[id] != null) {
					Espanhol.nombre[id] = Portugues.nome[id];
					Espanhol.manualEs[id] = Portugues.manualPt[id];
					Espanhol.directriz[id] = Portugues.orientacao[id];
				} else if(Ingles.name[id] != null) {
					Espanhol.nombre[id] = Ingles.name[id];
					Espanhol.manualEs[id] = Ingles.manualEn[id];
					Espanhol.directriz[id] = Ingles.guideline[id];
				} else if(Alemao.nameDe[id] != null) {
					Espanhol.nombre[id] = Alemao.nameDe[id];
					Espanhol.manualEs[id] = Alemao.handbuch[id];
					Espanhol.directriz[id] = Alemao.richtlinie[id];
				} else if(Frances.nom[id] != null) {
					Espanhol.nombre[id] = Frances.nom[id];
					Espanhol.manualEs[id] = Frances.manuelFr[id];
					Espanhol.directriz[id] = Frances.directive[id];
				}
			}
			
			//ALEMAO-------------------------------------------------------------

			if(Alemao.nameDe[id] == null) {
				if(Ingles.name[id] != null) {
					Alemao.nameDe[id] = Ingles.name[id];
					Alemao.handbuch[id] = Ingles.manualEn[id];
					Alemao.richtlinie[id] = Ingles.guideline[id];
				} else if(Espanhol.nombre[id] != null) {
					Alemao.nameDe[id] = Espanhol.nombre[id];
					Alemao.handbuch[id] = Espanhol.manualEs[id];
					Alemao.richtlinie[id] = Espanhol.directriz[id];
				} else if(Portugues.nome[id] != null) {
					Alemao.nameDe[id] = Portugues.nome[id];
					Alemao.handbuch[id] = Portugues.manualPt[id];
					Alemao.richtlinie[id] = Portugues.orientacao[id];
				} else if(Frances.nom[id] != null) {
					Alemao.nameDe[id] = Frances.nom[id];
					Alemao.handbuch[id] = Frances.manuelFr[id];
					Alemao.richtlinie[id] = Frances.directive[id];
				}
			}
			
			//FRANCES-------------------------------------------------------------

			if(Frances.nom[id] == null) {
				
				if(Ingles.name[id] != null) {
					Frances.nom[id] = Ingles.name[id];
					Frances.manuelFr[id] = Ingles.manualEn[id];
					Frances.directive[id] = Ingles.guideline[id];
				} else if(Portugues.nome[id] != null) {
					Frances.nom[id] = Portugues.nome[id];
					Frances.manuelFr[id] = Portugues.manualPt[id];
					Frances.directive[id] = Portugues.orientacao[id];
				} else if(Espanhol.nombre[id] != null) {
					Frances.nom[id] = Espanhol.nombre[id];
					Frances.manuelFr[id] = Espanhol.manualEs[id];
					Frances.directive[id] = Espanhol.directriz[id];
				} else if(Alemao.nameDe[id] != null) {
					Frances.nom[id] = Alemao.nameDe[id];
					Frances.manuelFr[id] = Alemao.handbuch[id];
					Frances.directive[id] = Alemao.richtlinie[id];
				}
			}
			
			//--------------------------------------------------------------------
			
		}
	}
}