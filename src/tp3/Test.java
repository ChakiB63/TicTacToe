package tp3;

public class Test {

	public static void Affichage(char[][] t)
	{
		for(int i=0;i<3;i++)
		{
			
			if(i!=2) 
			{
				System.out.println(" "+t[i][0]+" | "+t[i][1]+" | "+t[i][2]+" ");
				System.out.println("-----------");
			}
			else
			{
				System.out.println(" "+t[i][0]+" | "+t[i][1]+" | "+t[i][2]+" ");
			} 
				
		}
		
	}
	public static boolean GameOver(char[][] t)
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
	public static boolean gagner(char[][] t, char s)
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
		char[][] TicTacToe= new char[3][3];
		
		Initialisation(TicTacToe);
		Affichage(TicTacToe);
		AgentJoueur J1=new AgentJoueur('X');
		AgentJoueur J2=new AgentJoueur('O');
		
		while(GameOver(TicTacToe)==false )
		{
			J1.jouer(TicTacToe, 'X');
			Affichage(TicTacToe);
			System.out.println();
			if(gagner(TicTacToe, 'X')) 
			{
				break;
			}
			J2.jouer(TicTacToe, 'O');
			Affichage(TicTacToe);
			System.out.println();
			if(gagner(TicTacToe, 'O')) 
			{
				break;							
			}
		}
		if(gagner(TicTacToe, 'O'))
		{
			System.out.println("O a gagne !");
		}
		if(gagner(TicTacToe, 'X'))
		{
			System.out.println("X a gagne !");
		}
		if(GameOver(TicTacToe))
		{
			System.out.println("Match nulle !");
		}
		
		
		
		
		
	}
}
