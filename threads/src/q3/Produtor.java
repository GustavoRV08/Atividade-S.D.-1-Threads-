package q3;

public class Produtor extends Thread{
    Thread th;
    Deposito deposito;
    int tempo;
    public Produtor(Deposito dep, int t){
        deposito = dep;
        tempo = t;
    }
    public void run(){
        try{
            for(int i = 0; i<100; i++){
                deposito.colocar();
                Thread.sleep(tempo);
                System.out.println("Deposito atual: " + deposito.getNumItens());
            }
        }catch(InterruptedException e){
            System.out.println("ERRO!");
        }
    }

    public void start(){
        if(th == null){
            th = new Thread(this, "produtor");
            th.start();
        }
    }
}
