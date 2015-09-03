package mx.umb.pattern.concurrency.monitorobject;

public class MonitorWaitNotify {

	public static void main(String[] args) {
		final Book book = new Book();
	    
	    final Thread writer = new Thread(new Runnable() {
	      @Override
	      public void run() {
	        System.out.println("Writer run");
	        synchronized(book) {
	          try {
	            System.out.println("W: Hey, I'm still writting this book. Please wait 5 seconds");
	            Thread.sleep(5000);
	            System.out.println("... 5 seconds after");
	            System.out.println("W: The book is ready. I notify my publisher about it");
	            book.notify();
	          } catch (Exception e) {
	            e.printStackTrace();
	          }
	        };
	      }
	    });
	    
	    Thread publisher = new Thread(new Runnable() {
	      @Override
	      public void run() {
	        System.out.println("Publisher run");
	        writer.start();
	        synchronized(book) {
	          try {
	            System.out.println("P: I'm waiting for the book");
	            book.wait();
	            System.out.println("P: OK, I can publish the book");
	          } catch (Exception e) {
	            e.printStackTrace();
	          }
	        };
	      }
	    });
	    
	    publisher.start();
	 }
}

class Book {
}

