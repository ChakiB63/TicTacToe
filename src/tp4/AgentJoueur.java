package tp4;
import java.util.ArrayList;
import java.util.Scanner;

public class AgentJoueur {

	public AgentJoueur(char symbole)
	{
		this.symbole=symbole;
	}
	public char symbole;
	public ArrayList<String> BF=new ArrayList<String>();
	
	public ArrayList<String> getBF() {
		return BF;
	}
	public void setBF(ArrayList<String> bF) {
		BF = bF;
	}
	public char getSymbole() {
		return symbole;
	}
	public void setSymbole(char symbole) {
		this.symbole = symbole;
	}
	public char[][] jouer(char[][] t) // DEMANDE AU JOUEUR LES COORDONNEES DE LA CASE QU'IL VEUT REMPLIR ET LA REMPLIT DANS LA GRILLE.
	{
	    Scanner myObj = new Scanner(System.in);
	    String pre;

	    System.out.println("Entrer la ligne de la case a remplir: ");
		int i= myObj.nextInt();
		System.out.println("Entrer la colonne de la case a remplir: ");
		int j= myObj.nextInt();
		
		while ((i<0 || i>2) ||(j<0 || j>2) || (t[i][j]!='-'))// TESTER LA VALIDITE DES DONNEES ENTREES  ET SI ELLE EST VIDE PAS DEJA REMPLIE.		{
			{
			System.out.println("Entrer la ligne de la case a remplir: ");
			
			i= myObj.nextInt();
			System.out.println("Entrer la colonne de la case a remplir: ");
			j= myObj.nextInt();
			}
		
		t[i][j]=this.symbole;
		pre=Integer.toString(i)+','+Integer.toString(j);
		this.BF.add(pre);
		
		return t;

	}
	
}

