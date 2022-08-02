import java.rmi.*;

public class Server {
    public static void main(String[] args) throws Exception {
        Calculadora calc = new Calculadora();

        Naming.rebind("ADD", calc);

        System.out.println("Server Started");
    }

}
