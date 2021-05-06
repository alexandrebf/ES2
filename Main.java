import java.io.IOException;
import java.util.Scanner;
import java.util.Formatter;

public class Main {

    public static void main(String[] args) throws IOException {
        
        System.out.println("***** Calculo de area e perimetro *****");
        System.out.println("0 para circulo || 1 para retangulo");
        
        int opcao;
        Scanner lerOpcao = new Scanner(System.in);
        opcao = lerOpcao.nextInt();
        
        if (opcao == 0){
            
            double pi = 3.14159;
            double raio;
            double area;
            double per;
            System.out.println("***** Calculo de area e perimetro *****");
            System.out.println("Informe o valor do raio referente ao circulo");

        
            Scanner ler = new Scanner(System.in);
            raio = ler.nextDouble();
            area = pi*(raio*raio);
            System.out.println("Area = "+String.format("%.2f", area));
            
            per = 2 * pi * raio;
            System.out.println("Perimetro = "+String.format("%.2f", per));
        }
        else if (opcao == 1){
            double areaR;
            double perR;
            double base;
            double altura;
            System.out.println("***** Calculo de area e perimetro *****");
            System.out.println("Informe o valor da base referente ao retangulo");
            
            Scanner ler3 = new Scanner(System.in);
            base = ler3.nextDouble();
            
            System.out.println("***** Informe o valor da altura referente ao retangulo *****");
            Scanner ler4 = new Scanner(System.in);
            altura = ler4.nextDouble();
    
            
            areaR = base * altura;
            System.out.println("Area = "+String.format("%.2f", areaR));
            
            perR = 2 * (base + altura);
            System.out.println("Perimetro = "+String.format("%.2f", perR));
        }
        else{
             System.out.println("Digite uma opcao valida!");
        }
    }
}