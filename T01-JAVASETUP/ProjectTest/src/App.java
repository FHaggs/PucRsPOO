public class App{
    public static void main(String args[]){
        Placa p1 = new Placa("Brasil","ABC1R23");
        Veiculo v = new Veiculo(p1, 50);
        Veiculo v2 = new Veiculo(p1, 50);
        Veiculo v3 = new Veiculo(p1, 50);
        Veiculo v4 = new Veiculo(p1, 50);
        Veiculo v5 = new Veiculo(p1, 50);


        Veiculo[] meus_Veiculos = new Veiculo[5];
        
        
        

        System.out.println(v);

    }
}