package mx.umb.miscellaneous.split;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SplitArrayList {

	public static <T>List<List<T>> chopIntoParts( final List<T> ls, final int iParts ){
	    final List<List<T>> lsParts = new ArrayList<List<T>>();
	    final int iChunkSize = ls.size() / iParts;
	    int iLeftOver = ls.size() % iParts;
	    int iTake = iChunkSize;

	    for( int i = 0, iT = ls.size(); i < iT; i += iTake ){
	        if( iLeftOver > 0 ){
	            iLeftOver--;

	            iTake = iChunkSize + 1;
	        }else {
	            iTake = iChunkSize;
	        }

	        lsParts.add( new ArrayList<T>( ls.subList( i, Math.min( iT, i + iTake ) ) ) );
	    }

	    return lsParts;
	}
	
	//chops a list into non-view sublists of length L
	static <T> List<List<T>> chopped(List<T> list, final int L) {
		List<List<T>> parts = new ArrayList<List<T>>();
		final int N = list.size();
		for (int i = 0; i < N; i += L) {
			parts.add(new ArrayList<T>(list.subList(i, Math.min(N, i + L))));
		}
	 return parts;
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = Collections.unmodifiableList(Arrays.asList(5,3,1,2,9,5,0,7));
		List<List<Integer>> parts = chopped(numbers, 2);
		System.out.println(parts); // prints "[[5, 3, 1], [2, 9, 5], [0, 7]]"
		parts.get(0).add(-1);
		System.out.println(parts); // prints "[[5, 3, 1, -1], [2, 9, 5], [0, 7]]"
		System.out.println(numbers); // prints "[5, 3, 1, 2, 9, 5, 0, 7]" (unmodified!)
	
		List <Persona> listPersona = new ArrayList<Persona>();
		for (int i = 1; i <= 5; i++) {
			listPersona.add(new Persona("Nombre"+i, i));
		}
		
		List<List <Persona>> partsListPersona = chopped(listPersona, 2);
		System.out.println(partsListPersona);
		
		
		/***************************************************************************************/
		
		List<List<Integer>> partsIntoParts = chopIntoParts(numbers, 1);
		System.out.println(partsIntoParts); 
		
		

	}
	
}
