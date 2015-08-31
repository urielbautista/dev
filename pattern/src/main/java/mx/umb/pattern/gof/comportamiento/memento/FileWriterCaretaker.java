package mx.umb.pattern.gof.comportamiento.memento;

public class FileWriterCaretaker {
	 private Object obj;
     
	 public void save(FileWriter fileWriter){
		 this.obj=fileWriter.save();
	 }
	     
	 public void undo(FileWriter fileWriter){
		 fileWriter.undoToLastSave(obj);
	 }
}
