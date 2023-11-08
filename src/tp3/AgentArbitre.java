package tp3;

public class AgentArbitre {

	public AgentArbitre()
	{
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
	public  AgentJoueur Partie(char[][] t, AgentJoueur J1, AgentJoueur J2)
	{
			int j1=0;
			int j2=0;
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					if(t[i][j]==J1.getSymbole()) {
						j1++;
					}
					if(t[i][j]==J2.getSymbole()) {
						j2++;
					}
				}
			}
			if(j1>j2) {
				return J2;
			}
			else {
				return J1;
			}
	}		
		
}
