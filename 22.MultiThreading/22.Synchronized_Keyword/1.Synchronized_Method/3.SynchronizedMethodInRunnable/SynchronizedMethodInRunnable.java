class Printer {
    public synchronized void printDocument(String document) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Printing " + document + " - Page " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class PrintJob implements Runnable {
    private Printer printer;
    private String document;

    public PrintJob(Printer printer, String document) {
        this.printer = printer;
        this.document = document;
    }

    public void run() {
        printer.printDocument(document);
    }
}

public class SynchronizedMethodInRunnable{
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread thread1 = new Thread(new PrintJob(printer, "Document1"));
        Thread thread2 = new Thread(new PrintJob(printer, "Document2"));

        thread1.start();
        thread2.start();
    }
}
