public class Carta {
    private Valor valor;
    private Naipe naipe;
    private boolean isAberto;

    public Carta(Valor valor, Naipe naipe){
        this.valor = valor;
         this.naipe = naipe;
         isAberto = false;
    }
    public Valor getValor(){
        return valor;
    }
    public Naipe getNaipe(){
        return naipe;
    }
    public String toString(){
        return valor + ":" + naipe;
    }
    public boolean isAberto(){
        return this.isAberto;
    }
    public void virar(){
        isAberto = !isAberto;
    }
    public boolean isMaior(Carta outra){
        if(valor.ordinal() > outra.getValor().ordinal()){
            return true;
        }
        return false;
    }
}
