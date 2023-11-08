package tp4;

public class AgentArbitre_H_VS_M {

	// ARBITRE DE PARTIE DE AGENT INTELLIGENT CONTRE AGENT JOUEUR HUMAIN
	
	public AgentArbitre_H_VS_M() {
	}

	public void Affichage(char[][] t)
	{
		for(int i=0;i<3;i++)
		{
			if(i!=2) 
			{
				System.out.println(" "+t[i][0]+" | "+t[i][1]+" | "+t[i][2]+" ");
				System.out.println("-----------");
				//System.out.println(t[i][j]);
			}
			else
			{
				System.out.println(" "+t[i][0]+" | "+t[i][1]+" | "+t[i][2]+" ");
			}		
		}
	}
	
	public  boolean GameOver(char[][] t)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(t[i][j]=='-')
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public  boolean gagner(char[][] t, char s)
	{
		for(int i=0;i<3;i++)
		{
			if(t[i][0]== s && t[i][1]==s && t[i][2]==s)
			{
				return true;
			}
			if (t[0][i]== s && t[1][i]==s && t[2][i]==s)
			{
				return true;
			}
		}
		if(t[0][0]== s && t[1][1]==s && t[2][2]==s) 
		{
			return true;
		}
		if(t[0][2]== s && t[1][1]==s && t[2][0]==s)
		{
			return true;
		}
		return false;
	}
	
	public int Resultat(char[][] t)
	{
		if(gagner(t,'X'))
		{
			System.out.println("X a gagne !");
			return 1;
		}
		else if(gagner(t,'O'))
		{
			System.out.println("O a gagne !");
			return 1;
		}
		else if(GameOver(t))
		{
			System.out.println("Partie nulle !");
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public  char Tours(char[][] t, AgentJoueur J1, AgentIntelligent J2)
	// CETTE FONCTION COMPTE LES SYMBOLES PRESENTS DANS LA GRILLE ET ACCORDE LE TOUR A CELUI
	// AVEC MOINS DE SYMBOLES PUISQUE C'EST EVIDEMMENT SON ROLE. ET SI C'EST LE DEBUT DE LA PARTIE, IL ACCORDE LE ROLE A J.
	{
			int x=0;
			int y=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(t[i][j]==J1.getSymbole()) {
						x++;
					}
					if(t[i][j]==J2.getSymbole()) {
						y++;
					}
				}
			}
			if(x>y) {
				return 'A';// DANS LA FONCTION MAIN, 'A' CORRESPOND A AI CAD QUE C'EST LE ROLE DE AgentIntelligent J2
				}
			else {
				return 'H';// DANS LA FONCTION MAIN, 'H' CORRESPOND A HUMAIN CAD QUE C'EST LE ROLE DE AgentJoueur J1
			}
	}		
		
}
