import Imc.java;

public class ExibirResultado
{
    public static void main( String[] args )
    {
		int peso = 60;
		int altura = 150;
		Imc imc;
        System.out.println( imc = new Imc(peso, altura) );
    }
}
