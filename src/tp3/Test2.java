package tp3;

public class Test2 {

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
		
		AgentArbitre A=new AgentArbitre();
		AgentJoueur J1=new AgentJoueur('X');
		AgentJoueur J2=new AgentJoueur('O');
		
		A.Affichage(TicTacToe);
		
		while(A.Resultat(TicTacToe)==0 )
		{
			TicTacToe=A.Partie(TicTacToe, J1, J2).jouer(TicTacToe,A.Partie(TicTacToe, J1, J2).getSymbole());
			A.Affichage(TicTacToe);
			System.out.println();
		}		
	}
}
