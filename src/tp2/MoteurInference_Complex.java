package tp2;

import java.util.ArrayList;

public class MoteurInference_Complex {

	public void MoteurInfernce_Complex()
    {
    }
    public boolean chainageAvant(ArrayList<RegleComplexe> BR, ArrayList<String> BF, String PropVerif)
    {
        int i;
        int premis_verifi;
        /*boolean t=true;
        boolean f=false;*/
        int flag;
        flag=0;
    	while ((!BF.contains(PropVerif)) && (BR.size()!=0) && (flag==0)) //?? ??
        {
            flag=1;
    		for (i=0;i<BR.size() ;i++ ) //??
            {
    			premis_verifi=1;
    			for(String elm : BR.get(i).getPremisse())
    			{
    				if ( !BF.contains(elm))
    				{
    					premis_verifi=0;
    					break;
    				}
    			}
    			if ( premis_verifi==1) 
                {
                    BF.add(BR.get(i).getConclusion());
                    BR.remove(i);
                    flag=0;
                }
            }
        }
        if (BF.contains(PropVerif))
        {
            return true;
        }
        return false;
    }
}
