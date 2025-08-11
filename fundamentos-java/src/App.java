import java.time.OffsetDateTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        exercicio1(sc);
        exercicio2(sc);
        exercicio3(sc);
        exercicio4(sc);

        sc.close();
    }

    public static void exercicio1(Scanner sc) {
        System.out.println("=== EXERCÍCIO 1 ===");
        var baseYear = OffsetDateTime.now().getYear();
        System.out.println("Informe o seu nome:");
        var name = sc.next();
        System.out.println("Informe o seu ano de nascimento");
        var birthYear = sc.nextInt();
        var age = baseYear - birthYear;
        System.out.printf("Olá %s você tem %s anos \n", name, age);
    }

    public static void exercicio2(Scanner sc) {
        System.out.println("=== EXERCÍCIO 2 ===");
        System.out.println("Insira um valor do lado do quadrado:");
        var side = sc.nextInt();
        var area = side * side;
        System.out.printf("O valor da área do quadrado é %s \n", area);
    }

    public static void exercicio3(Scanner sc) {
        System.out.println("=== EXERCÍCIO 3 ===");
        System.out.println("Insira um valor para a base do retângulo:");
        var base = sc.nextInt();
        System.out.println("Insira um valor para a altura do retângulo");
        var altura = sc.nextInt();
        var area = base * altura;
        System.out.printf("O valor da área do retângulo é %s \n", area);
    }

    public static void exercicio4(Scanner sc) {
        var ageGap = 0;
        System.out.println("=== EXERCÍCIO 4 ===");
        System.out.println("Insira o nome da pessoa 1:");
        var namePerson1 = sc.next();
        System.out.println("Insira a idade da pessoa 1:");
        var agePerson1 = sc.nextInt();
        System.out.println("Insira o nome da pessoa 2:");
        var namePerson2 = sc.next();
        System.out.println("Insira a idade da pessoa 2:");
        var agePerson2 = sc.nextInt();

        if(agePerson1 > agePerson2) {
            ageGap = agePerson1 - agePerson2;
            System.out.printf("A diferença de idade entre %s e %s é de %s", namePerson1, namePerson2, ageGap);
        } else {
            ageGap = agePerson2 - agePerson1;
            System.out.printf("A diferença de idade entre %s e %s é de %s", namePerson1, namePerson2, ageGap);
        }
    }
}