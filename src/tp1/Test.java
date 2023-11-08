package tp1;
import java.util.ArrayList;


public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creation et remplissage des bases des faits et des regles
	    RegleSimple R1=new RegleSimple("P","Q");
	    RegleSimple R2=new RegleSimple("Q","R");
	    ArrayList <String> BF=new ArrayList<String>();
	    ArrayList <RegleSimple> BR=new ArrayList<RegleSimple>();
	    BR.add(R1);
	    BR.add(R2);
	    BF.add("P");
	    // Affichage des bases des faits et des regles 
	    System.out.println(BR);
	    System.out.println(BF);
	    for(int i=0;i<BR.size();i++)
	    {
		    System.out.println(BR.get(i).getPremisse()+"=>"+BR.get(i).getConclusion());
	    }
	    
	    //Creation de moteur d'interference et testes ses resultats
	    MoteurInference M=new MoteurInference();
	    System.out.println(M.chainageAvant(BR,BF,"R"));
	    System.out.println(M.chainageAvant(BR,BF,"F"));
	    
	    
	    RegleSimple R3=new RegleSimple("T","R");
	    BR.add(R3);
	    System.out.println(M.chainageAvant(BR,BF,"F"));
	    
	    
	    System.out.println("***********************");
	}

}
