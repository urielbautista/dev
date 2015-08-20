package mx.umb.utility.split;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.ListUtils;

public class SplitArrayList {

	public static void main(String[] args) {
		int targetSize = 3;
		List <Persona> largeList = new ArrayList<Persona>();
		for (int i = 1; i <= 5; i++) {
			largeList.add(new Persona("Nombre"+i, i));
		}
		
		List<List<Persona>> output = ListUtils.partition(largeList, targetSize);
		System.out.println(output);

	}
}
