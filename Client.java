import java.rmi.Naming;
import java.util.*;

public class Client {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println(
                        "\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n5.Sinus\n6.Cosine\n7.eLog\n8.10Log\n9.Expo\n10.Sqrt\n11.Exit");

                System.out.println("Enter the option:");

                int option = scanner.nextInt();

                if (option == 11) {
                    break;
                } else if (option < 5) {
                    System.out.println("Enter the first number:");
                    double a = scanner.nextInt();
                    System.out.println("Enter the second number:");
                    double b = scanner.nextInt();

                    double n;

                    switch (option) {
                        case 1:
                            SumInterface obj = (SumInterface) Naming.lookup("ADD");
                            n = obj.sum(a, b);
                            System.out.println("Addition= " + n);
                            break;
                        case 2:
                            SubInterface obj1 = (SubInterface) Naming.lookup("ADD");
                            n = obj1.sub(a, b);
                            System.out.println("Substraction= " + n);
                            break;
                        case 3:
                            MultInterface obj2 = (MultInterface) Naming.lookup("ADD");
                            n = obj2.mult(a, b);
                            System.out.println("Multiplication= " + n);
                            break;
                        case 4:
                            DivInterface obj3 = (DivInterface) Naming.lookup("ADD");
                            n = obj3.div(a, b);
                            System.out.println("Division= " + n);
                            break;
                    }

                } else {
                    System.out.println("Enter the number:");
                    double a = scanner.nextInt();

                    double n;

                    switch (option) {
                        case 5:
                            SenInterface obj = (SenInterface) Naming.lookup("ADD");
                            n = obj.sen(a);
                            System.out.println("Sinus= " + n);
                            break;
                        case 6:
                            CosInterface obj1 = (CosInterface) Naming.lookup("ADD");
                            n = obj1.cos(a);
                            System.out.println("Cosine= " + n);
                            break;
                        case 7:
                            LogeInterface obj2 = (LogeInterface) Naming.lookup("ADD");
                            n = obj2.loge(a);
                            System.out.println("Log e = " + n);
                            break;
                        case 8:
                            Log10Interface obj3 = (Log10Interface) Naming.lookup("ADD");
                            n = obj3.log10(a);
                            System.out.println("Log 10 = " + n);
                            break;
                        case 9:
                            ExpInterface obj4 = (ExpInterface) Naming.lookup("ADD");
                            n = obj4.exp(a);
                            System.out.println("Exp = " + n);
                            break;
                        case 10:
                            SqrInterface obj5 = (SqrInterface) Naming.lookup("ADD");
                            n = obj5.sqr(a);
                            System.out.println("Sqrt = " + n);
                            break;

                    }
                }

            }
        }
    }
}
