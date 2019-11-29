package Model;

import java.util.Comparator;

public class SortByLuckyNumber implements Comparator <Personaje>{

	public SortByLuckyNumber() {
		
	}


	public int compare(Personaje arg0, Personaje arg1) {
		
		return arg0.getLuckyNumber() - arg1.getLuckyNumber();
	}

}
