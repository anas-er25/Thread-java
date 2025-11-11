
class Producteur implements Runnable{
    private final Buffer buffer;

    public Producteur(Buffer buffer){
        this.buffer = buffer;
    }
    @Override
    public void run (){
        for(int i = 1; i <= 5; i++ ){
            buffer.produire(i);
            try{
                Thread.sleep(500);
            }catch (InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        }
    }
}
