package tp3;

import java.util.Random;

public class AgentJoueur {

	public AgentJoueur(char symbole)
	{
		this.symbole=symbole;
	}
	public char symbole;
	public char getSymbole() {
		return symbole;
	}
	public void setSymbole(char symbole) {
		this.symbole = symbole;
	}
	public char[][] jouer(char[][] t, char s)
	{
		Random rand = new Random(); 
		int i = rand.nextInt((2 - 0) + 1);
		int j = rand.nextInt((2 - 0) + 1);
		while (t[i][j]!='-')
		{
			 i = rand.nextInt((2 - 0) + 1);
			 j = rand.nextInt((2 - 0) + 1);
		}
		t[i][j]=s;
		return t;

	}
	
}
