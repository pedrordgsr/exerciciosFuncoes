
import java.util.Scanner;

public class cadernoExercicios {

    public static void main(String[] args) {
        
        ListaExercicios  exercicioNovo = new ListaExercicios();

        Scanner read = new Scanner(System.in);

        System.out.print("Escreva o exercicio desejado > ");
        int option = read.nextInt();

        switch (option) {
            case 1:
                exercicioNovo.ex1();
                break;
            case 2:
                exercicioNovo.ex2();
                break;
            case 3:
                exercicioNovo.ex3();
                break;
            case 4:
                exercicioNovo.ex4();
                break;
            case 5:
                exercicioNovo.ex5();
                break;
            case 6:
                exercicioNovo.ex6();
                break;
            case 7:
                exercicioNovo.ex7();
                break;
            case 8:
                exercicioNovo.ex8();
                break;
            case 9:
                exercicioNovo.ex9();
                break;
            case 10:
                exercicioNovo.ex10();
                break;
            case 11:
                exercicioNovo.ex11();
                break;
            case 12:
                exercicioNovo.ex12();
                break;
            case 13:
                exercicioNovo.ex13();
                break;
        }

    }
    
}
