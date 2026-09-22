
class RacerThreads extends Thread{
    private Thread t;
    private String id;

    RacerThreads(String num){
        id = num;
        System.out.println("Criando racer " + id);
    }

    public void run(){
        while(true){
            System.out.println("Racer " + id + "-Imprimindo");
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
