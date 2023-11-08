package tp1;
import java.util.ArrayList;


public class MoteurInference {

	public boolean chainageAvant(ArrayList<RegleSimple> BR, ArrayList<String> BF, String PropVerif)
    {
        int i;
        /*boolean t=true;
        boolean f=false;*/
        int flag;
        flag=0;
    	while ((!BF.contains(PropVerif)) && (BR.size()!=0) && (flag==0)) //?? ??
        {
            flag=1;
    		for (i=0;i<BR.size() ;i++ ) //??
            {
                if ( BF.contains(BR.get(i).getPremisse())) 
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
