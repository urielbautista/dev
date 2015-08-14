package mx.umb.pattern.comportamiento.memento;

public class FileWriter {
	private String fileName;
    private StringBuilder content;
     
    public FileWriter(String file){
        this.fileName=file;
        this.content=new StringBuilder();
    }
     
    @Override
    public String toString(){
        return this.content.toString();
    }
     
    public void write(String str){
        content.append(str);
    }
     
    public Memento save(){
        return new Memento(this.fileName,this.content);
    }
     
    public void undoToLastSave(Object obj){
        Memento memento = (Memento) obj;
        this.fileName= memento.getFileName();
        this.content=memento.getContent();
    }
 
}
