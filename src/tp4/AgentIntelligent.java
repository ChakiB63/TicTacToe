package tp4;
import java.util.ArrayList;


public class AgentIntelligent {

	public char symbole;
	public  ArrayList<String> BF;
	
	public AgentIntelligent(char symbole, ArrayList<String> bF) {
		this.symbole = symbole;
		this.BF = bF;
	}
	
	
	public char getSymbole() {
		return symbole;
	}
	public void setSymbole(char symbole) {
		this.symbole = symbole;
	}
	public ArrayList<String> getBF() {
		return BF;
	}
	public void setBF(ArrayList<String> bF) {
		BF = bF;
	}
	
	
	public boolean jouer(ArrayList<RegleComplexe> bR, ArrayList<String> bF, char[][] t) {
	
		
	    String pre;
		MoteurInference_Complex M =new MoteurInference_Complex();
	    
		// ICI POUR CHERCHER A FAIRE UN COUP DECISIF ET GAGNER LA PARTIE
		for(int i=0; i<3; i++) {
	    	for(int j=0; j<3; j++) {
		    	if( t[i][j]=='-') {
		    		pre=Integer.toString(i)+','+Integer.toString(j);
		    		BF.add(pre);
		    		if (M.chainageAvant(bR, this.BF, "gagner")) {
		    			t[i][j]=this.getSymbole();
		    		}
		    		else {
		    			BF.remove(BF.size()-1);
		    		}
		    		
		    		if(t[i][j]!='-') {
		    			System.out.println("1ere option");
		    			return true;
		    		}
		    		}
		    	}
		    }
		// ICI LA POSSIBILITE D'ANNULER UN MOUVEMENT DECISIF LE L'ADVERSAIRE
		for(int i=0; i<3; i++) {
	    	for(int j=0; j<3; j++) {
		    	if( t[i][j]=='-') {
		    		pre=Integer.toString(i)+','+Integer.toString(j);
		    		bF.add(pre);
		    		if (M.chainageAvant(bR, bF, "gagner")) {
		    			t[i][j]=this.getSymbole();
		    			BF.add(pre);
		    		}
		    		bF.remove(bF.size()-1);
		    		if(t[i][j]!='-') {
		    			System.out.println("2eme option");
		    			return true;
		    		}
		    	}
		    }
		}
		
		///ICI SONT LES POSSIBILITES POUR AUGUMENER SES CHANCES DE GAINS, EN EXAMINANT LA GRILLE, 
		///ET MARQUANT UNE CASE QUI EST PRES D'UNE AUTRE CONTENENT SON SYMBOLE; 
		if (t[1][1]=='-')
		{
			t[1][1]=this.symbole;
    		BF.add("1,1");
    		
    		return true;
		}
		
		 if(t[0][0]=='-' && (t[0][1]==this.symbole || t[1][0]==this.symbole)) {
			t[0][0]=this.symbole;
			BF.add("0,0");
			return true;
		}
		 if(t[0][2]=='-' && (t[0][1]==this.symbole || t[1][2]==this.symbole)) {
			t[0][2]=this.symbole;
			BF.add("0,2");
			return true;
		}
		 if(t[2][0]=='-' && (t[2][1]==this.symbole || t[1][0]==this.symbole)) {
			t[2][0]=this.symbole;
			BF.add("2,0");
			return true;
		}
		 if(t[2][2]=='-' && (t[1][2]==this.symbole || t[2][1]==this.symbole)) {
			t[2][2]=this.symbole;
			BF.add("2,2");
			return true;
		}
		
		 
		 if(t[1][0]=='-' && (t[0][0]==this.symbole || t[2][0]==this.symbole)) {
			t[1][0]=this.symbole;
			BF.add("1,0");
			return true;
		}
		 if(t[1][2]=='-' && (t[0][2]==this.symbole || t[2][2]==this.symbole)) {
			t[1][2]=this.symbole;
			BF.add("1,2");
			return true;
		}
		 if(t[0][1]=='-' && (t[0][0]==this.symbole || t[0][2]==this.symbole)) {
			t[0][1]=this.symbole;
			BF.add("0,1");
			return true;
		}
		 if(t[2][1]=='-' && (t[2][0]==this.symbole || t[2][2]==this.symbole)) {
			t[2][1]=this.symbole;
			BF.add("2,1");
			return true;
		}
		 
		 /// ICI C'EST POUR L'OPTION DU REMPLISSAGE ALEATOIRE;
		 
		 for(int i=0; i<3; i++) {
		    	for(int j=0; j<3; j++) {
		    		if (t[i][j]=='-') {
		    			t[i][j]=symbole;
		    			System.out.println("4eme option");
		    			return true;
		    		}
		    	}
		 }
		 
		 return false;
		
	}
	
}
	
	



















