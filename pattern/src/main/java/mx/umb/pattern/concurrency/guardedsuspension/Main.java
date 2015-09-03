package mx.umb.pattern.concurrency.guardedsuspension;

public class Main {

    public static void main(String[] args){
        RequestQueue requestQueue = new RequestQueue();
        new ClientThread(requestQueue, "Alice", 5522552L).start();
        new ServerThread(requestQueue, "Hobby", 6542562L).start();
        	
    } 
    
}
