package q2;

public class Deposito {
    private int items = 0;
    private final int capacidade = 100;
    public int getNumItens(){
        return items;
    }
    public boolean retirar() {
        if(items>0){
            items=getNumItens() - 1;
        }else{
            System.out.println("Estoque insuficiente!");
        }
        return true;
    }
    public boolean colocar() {
        items = getNumItens() + 1;
        return true;
    }
}
