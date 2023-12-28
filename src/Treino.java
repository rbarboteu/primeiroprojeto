import java.util.Scanner;

public class Treino {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int perguntaInicial;
        int medidaQuadrado;
        double medidaDoCiruclo;

        System.out.println("Digite 1 para calcular a área do quadrado ou 2 para calcular a área do círculo");
        perguntaInicial = leitura.nextInt();
        
        if (perguntaInicial == 1) {

            System.out.println("Digite a medida do lado do quadrado");
            medidaQuadrado = leitura.nextInt();
            double areaQuadrado = medidaQuadrado * medidaQuadrado;
            System.out.println("A área do quadrado é: " + areaQuadrado);

        } else if (perguntaInicial == 2) {

            System.out.println("Digite o raio do círculo");
            medidaDoCiruclo = leitura.nextDouble();
            double areaCirculo = 3.14 * medidaDoCiruclo * medidaDoCiruclo;
            System.out.println("A área do círculo é: " + areaCirculo);
        }

    }
    }

