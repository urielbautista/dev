package mx.umb.pattern.comportamiento.memento;

public class Memento {
    private String fileName;
    private StringBuilder content;
     
    public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public StringBuilder getContent() {
		return content;
	}

	public void setContent(StringBuilder content) {
		this.content = content;
	}

	public Memento(String file, StringBuilder content){
        this.fileName=file;
        //notice the deep copy so that Memento and FileWriterUtil content variables don't refer to same object
        this.content=new StringBuilder(content);
    }
}
