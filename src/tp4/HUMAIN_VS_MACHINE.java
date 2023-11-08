package tp4;
import java.util.ArrayList;

public class HUMAIN_VS_MACHINE {

	public static void Initialisation(char[][] t)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				t[i][j]='-';
			}
		}
	}
	
	public static void main(String[] args) {
		
		/// PHASE DE CREATION DES BASES DES FAITS ET DES REGLES ET GRILLE ET LES AGENTS ARBITRE ET INTELLIGENT ET JOUEUR;
		RegleComplexe R1=new RegleComplexe("0,0&1,1&2,2","gagner");
		RegleComplexe R2=new RegleComplexe("2,0&1,1&2,0","gagner");
		RegleComplexe R3=new RegleComplexe("0,0&0,1&0,2","gagner");
		RegleComplexe R4=new RegleComplexe("1,0&1,1&1,2","gagner");
		RegleComplexe R5=new RegleComplexe("2,0&2,1&2,2","gagner");
		RegleComplexe R6=new RegleComplexe("0,0&1,0&2,0","gagner");
		RegleComplexe R7=new RegleComplexe("0,1&1,1&2,1","gagner");
		RegleComplexe R8=new RegleComplexe("0,2&1,2&2,2","gagner");
		
		ArrayList<RegleComplexe> BR= new ArrayList<RegleComplexe>();
		
		BR.add(R1);
		BR.add(R2);
		BR.add(R3);
		BR.add(R4);
		BR.add(R5);
		BR.add(R6);
		BR.add(R7);
		BR.add(R8);
		
		char[][] TicTacToe= new char[3][3];
		Initialisation(TicTacToe);
		
		ArrayList<String> BF = new ArrayList<String>() ;
		
		AgentArbitre_H_VS_M A=new AgentArbitre_H_VS_M();
		
		AgentJoueur J1= new AgentJoueur('X');
		AgentIntelligent J2=new AgentIntelligent('O',BF);
		
		
		A.Affichage(TicTacToe);// AFICHAGE DE GRILLE VIDE AU DEPART
		
		while(A.Resultat(TicTacToe)==0 ) //TANT QU'IL N4Y NI GAGNANT NI PERDANT NI PARTIE NULLE
		{
			if(A.Tours(TicTacToe, J1, J2)=='H') { //SI TOUR RETOURNE 'H' ALORS C'EST LE TOUR DU JOUEUR HUMAIN
				TicTacToe=J1.jouer(TicTacToe);
				
			}
			else {
				J2.jouer(BR,J1.BF,TicTacToe);//SI TOUR RETOURNE 'A' ALORS C'EST LE TOUR DU AI
			}
			A.Affichage(TicTacToe);
			System.out.println();
		}	
	}

}
