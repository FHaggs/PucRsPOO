public class App {
    public static void main(String[] args) throws Exception {
        
        Baralho b = new Baralho();

        b.retirarCima();

        Carta cartas[] = b.getCartas();

        for(int i=0;i<cartas.length;i++){
            System.out.println(cartas[i]);
        }

    }
}
