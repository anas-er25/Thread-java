public class Buffer {
    private int data;
    private boolean isEmpty = true;
    public synchronized void produire(int value){
        try {
            while (!isEmpty){
                wait();
            }
            data = value;
            isEmpty = false;
            System.out.println("Produit : "+ data);
            notify();
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    public synchronized int consommer(){
        try {
            while (isEmpty){
                wait();
            }
            isEmpty = false;
            System.out.println("Produit : "+ data);
            notify();
            return data;
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
            return -1;
        }
    }
}
