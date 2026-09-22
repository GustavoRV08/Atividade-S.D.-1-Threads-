
class RacerThreads extends Thread{
    private Thread t;
    private String id;
    RacerThreads(String num){
        id = num;
        System.out.println("Criando racer " + id);
    }

    public void run(){
        try{
            while(true){
                System.out.println("Racer " + id + "-Imprimindo");
                //Thread.sleep(100);
                this.setPriority(10);
            }
        }catch(Exception e /*InterruptedException e*/){
            System.out.println("Erro!");
        }
    }

    public void start(){
        System.out.println("Iniciando racer " + id);
        if(t == null){
            t = new Thread(this, id);
            t.start();
        }
    }
}
