import java.util.Locale; //biblioteca de formatação de numéricos

public class Teste {
    public static void main(String[] args){

        double x = 30.0034;
            
        System.out.println("Olá Mundo!");
        System.out.printf("%.2f%n", x);
        Locale.setDefault(Locale.US); //para importar uma biblioteca de formatação de numeros reais, troca a vírgula(,) por ponto(.)
        System.out.printf("%.4f%n",x);

        

    }
    

}
