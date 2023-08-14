public class Carta {
    private Valor valor;
    private Naipe naipe;

    public Carta(Valor valor, Naipe naipe){
        this.valor = valor;
         this.naipe = naipe;
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
}
