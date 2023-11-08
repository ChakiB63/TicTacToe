package tp4;

import java.util.ArrayList;

public class BROUILLON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> l= new ArrayList<String>();
		l.add("a");
		l.add("a");
		l.add("a");
		l.add("a");
		for(String elm:l) {
			System.out.println(elm);
		}
		System.out.println();
		l.remove(l.size()-1);
		l.remove(l.size()-1);
		l.remove(l.size()-1);
		for(String elm:l) {
			System.out.println(elm);
		}
		}

	}


