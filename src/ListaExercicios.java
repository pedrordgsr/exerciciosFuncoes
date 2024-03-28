public class ListaExercicios {

    public  static void ex1() {
        int number = 10;
        System.out.println(number);
        
    }

    public static void ex2() {
        double number = 1.0;
        System.out.println(number);
    }

    public static void ex3() {
        String content = "Linguagem de programação";
        System.out.println(content);
    }

    public static void ex4() {
        int n1 = 2;
        int n2 = 4;
        int n3 = 6;
        int n4 = 8;

        int media = (n1 + n2 + n3 + n4) / 4;
        System.out.println(media);
    }

    public static void ex5() {
        double n1 = 2.0;
        double n2 = 4.0;
        double n3 = 6.0;
        double n4 = 8.0;

        double media = (n1 + n2 + n3 + n4) / 4;
        System.out.println(media);
    }

    public static void ex6() {
        String content = "Banco de dados";
        System.out.println("Disciplina " + content); 
    }
    
    public static void ex7() {
        int number = 12;
        
        if(number == 12){
            System.out.println("O número " + number + " é maior que 10" );
        } else {
            System.out.println("O número " + number + " é menor que 10" );
        }
    }
    
    public static void ex8() {
        int number = 13;
        
        if(number % 2 == 0){
            System.out.println("O número " + number + " é par" );
        } else {
            System.out.println("O número " + number + " é impar" );
        }
    }

    public static void ex9() {
        for(int i=0;i<10;i++){
            System.out.println("Conta " + (i + 1) +"!");
        }
    }
    
    public static void ex10() {
        for(int i=1000;i>=100;i = i - 100){
            System.out.println("Conta " + i +"!");
        }
    }
    
    public static void ex11() {
        String[] names = new String[] {"Eu"," amo"," programação", " orientada a gambiarra"};

        for(int i = 0;i< 4;i++){
            System.out.print(names[i]);
        }
     
    }
    
    public static void ex12() {
        int[] nums = new int[] {1,2,3};

        for(int i = 0;i< 3;i++){
            System.out.println(nums[i]);
        }
     
    }
    
    public static void ex13() {
        double[] nums = new double[] {1,2,3};

        for(int i = 0;i< 3;i++){
            System.out.println(nums[i]);
        }
     
    }

}
