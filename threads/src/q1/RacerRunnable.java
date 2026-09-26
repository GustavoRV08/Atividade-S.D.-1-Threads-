package q1;

class RacerRunnable implements Runnable{
    private Thread t;
    private String id;

    RacerRunnable(String num){
        id = num;
        System.out.println("Criando racer " + id);
    }

    public void run(){
        for(int i = 0; i<1000; i++){
            System.out.println("Racer " + id + "-Imprimindo");
        }
    }

    public void start(){
        if(t == null){
            t = new Thread (this, id);
            try{
                System.out.println("Iniciando racer " + id);
                t.start();
                if(Integer.parseInt(id)%2 == 0){
                    t.join();
                }
            }catch(InterruptedException e){
                System.out.println("ERRO!");
            }
        }
    }
}
