package mx.umb.pattern.gof.comportamiento.memento;

public class MementoMain {

	public static void main(String[] args) {
	
		FileWriterCaretaker caretaker = new FileWriterCaretaker();
        FileWriter fileWriter = new FileWriter("data.txt");
        fileWriter.write("First Set of Data\n");
        System.out.println("Guardando: \n"+ fileWriter);
        // lets save the file
        caretaker.save(fileWriter);
        //now write something else
        fileWriter.write("Second Set of Data\n");
         
        //checking file contents
        System.out.println("Escribiendo:\n"+fileWriter);
 
        //lets undo to last save
        caretaker.undo(fileWriter);
         
        //checking file content again
        System.out.println("Recuperado:\n"+fileWriter);

	}

}
