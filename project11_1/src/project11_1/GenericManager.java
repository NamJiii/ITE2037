package project11_1;

import java.util.ArrayList;
import java.util.Collections;

public class GenericManager <T extends Comparable>{
	private ArrayList<T> cList;

	public GenericManager() {
		cList = new ArrayList<>();
	}
	
	public void add(T a) {
		cList.add(a);
	}
	
	public void sort() {
		Collections.sort(cList);
	}
	
	public String find(T a) {
		StringBuilder builder = new StringBuilder();
		for(T e : cList)
			if(e.equals(a))
				builder.append(e);
		return builder.toString();
	}
	
	public String toString() {
        StringBuilder builder = new StringBuilder();
        for(T e : cList)
            builder.append(e);
        return builder.toString();
	}
}
