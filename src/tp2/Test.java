package tp2;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//EXO 1
	    String pre="A&B";
	    RegleComplexe R4=new RegleComplexe(pre,"C");
	    String pre2="C&D";
	    RegleComplexe R5=new RegleComplexe(pre2,"F");
	    String pre3="F&B";
	    RegleComplexe R6=new RegleComplexe(pre3,"E");
	    String pre4="F&A";
	    RegleComplexe R7=new RegleComplexe(pre4,"G");
	    String pre5="G&F";
	    RegleComplexe R8=new RegleComplexe(pre5,"B");
	    
	    ArrayList <String> BF2=new ArrayList<String>();
	    ArrayList <RegleComplexe> BR2=new ArrayList<RegleComplexe>();
	    BR2.add(R4);
	    BR2.add(R5);
	    BR2.add(R6);
	    BR2.add(R7);
	    BR2.add(R8);
	    BF2.add("A");
	    BF2.add("C");
	    BF2.add("D");
	    MoteurInference_Complex M2=new MoteurInference_Complex();

	    for(String el:BF2)
	    	{
	    		System.out.println(el);
	    	}
	    for(int i=0;i<BR2.size();i++)
	    {
		    System.out.println(Arrays.asList(BR2.get(i).getPremisse()).toString()+"=>"+BR2.get(i).getConclusion());
	    }
	    
	    
	    System.out.println(M2.chainageAvant(BR2,BF2,"E"));
	    
	    
	    for(String el:BF2)
    	{
    		System.out.println(el);
    	}
    for(int i=0;i<BR2.size();i++)
    {
	    System.out.println(Arrays.asList(BR2.get(i).getPremisse()).toString()+"=>"+BR2.get(i).getConclusion());
    }
    
    
    //EXO 2
		ArrayList <String> bf=new ArrayList<String>();
	    ArrayList <RegleComplexe> br=new ArrayList<RegleComplexe>();
		
		RegleComplexe r1= new RegleComplexe("Fleur&Graine","Phanérogame");
		RegleComplexe r2= new RegleComplexe("Phanérogame&Graine Nue","Sapin");
		RegleComplexe r3= new RegleComplexe("Phanérogame&1-Cotyledone","Monocotylédone");
		RegleComplexe r4= new RegleComplexe("Phanérogame&2-Cotyledone","Dicotylédone");
		RegleComplexe r5= new RegleComplexe("Monocotylédone&Rhyzome","Muguet");
		RegleComplexe r6= new RegleComplexe("Dicotylédone","Anémone");
		RegleComplexe r7= new RegleComplexe("Monocotylédone&Non Rhyzome","Lilas");
		RegleComplexe r8= new RegleComplexe("Feuille&Fleur","Cryptogame");
		RegleComplexe r9= new RegleComplexe("Cryptogame&Non Racine","Mousse");
		RegleComplexe r10= new RegleComplexe("Cryptogame&Racine","Fougère");
		RegleComplexe r11= new RegleComplexe("Non Feuilles&Plante","Thallophyte");
		RegleComplexe r12= new RegleComplexe("Thallophyte&Chlorophylle","Algue");
		RegleComplexe r13= new RegleComplexe("Thallophyte&Non Chlorophylle","Champignon");
		RegleComplexe r14= new RegleComplexe("Non Feuilles&Non Fleur&Non Plante","Colibacile");
		
		bf.add("Non feuilles");
		bf.add("Chlorophylle"); 
		bf.add("Fleur"); 
		bf.add("Graine"); 
		bf.add("Plante");
		
		br.add(r1);
		br.add(r2);
		br.add(r3);
		br.add(r4);
		br.add(r5);
		br.add(r6);
		br.add(r7);
		br.add(r8);
		br.add(r9);
		br.add(r10);
		br.add(r11);
		br.add(r12);
		br.add(r13);
		br.add(r14);

		MiniMoteur M=new MiniMoteur();
		
		for(String el:bf)
    	{
    		System.out.println(el);
    	}
	    for(int i=0;i<br.size();i++)
	    {
		    System.out.println(Arrays.asList(br.get(i).getPremisse()).toString()+"=>"+br.get(i).getConclusion());
	    }
	    
		M.chainageAvant(br,bf);
	    		
		for(String el:bf)
    	{
    		System.out.println(el);
    	}
	    for(int i=0;i<br.size();i++)
	    {
		    System.out.println(Arrays.asList(br.get(i).getPremisse()).toString()+"=>"+br.get(i).getConclusion());
	    }
	    		
	    		
	}

}
