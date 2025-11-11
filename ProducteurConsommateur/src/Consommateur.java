class Consommateur implements Runnable{
    private final Buffer buffer;

    public Consommateur(Buffer buffer){
        this.buffer = buffer;
    }
    @Override
    public void run (){
        for(int i = 1; i <= 5; i++ ){
            buffer.consommer();
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        }
    }
}
