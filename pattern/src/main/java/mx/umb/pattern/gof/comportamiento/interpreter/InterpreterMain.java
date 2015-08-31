package mx.umb.pattern.gof.comportamiento.interpreter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InterpreterMain {

	public static void main(String[] args) {
		String romano="LXI";
		
		Context context= new Context(romano);
		//Contrimos el arbol
		List <Expresion> tree= new ArrayList<Expresion>();
		tree.add(new ThousandExpresion());
		tree.add(new HundredExpresion());
		tree.add(new TenExpresion());
		tree.add(new OneExpresion());
		
		// Lo interpretamos
		
		Iterator <Expresion> iterator = tree.iterator();
		while (iterator.hasNext()) {
			Expresion expresion = (Expresion) iterator.next();
			expresion.interpret(context);
		}

		//obviamente la contruccion e interpretacion no la deberia 
		// hacer el cliente, deberiamos encapsular esta logica en otra clase.
		System.out.println("El numero interpretado []:" +context.output);
	}

}
