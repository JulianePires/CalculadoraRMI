import java.rmi.server.*;

public class Calculadora extends UnicastRemoteObject implements SumInterface, SubInterface, SenInterface, CosInterface,
        MultInterface, DivInterface, LogeInterface, Log10Interface, ExpInterface {

    public Calculadora() throws Exception {
        super();
    }

    public double sum(double x, double y) {
        return x + y;
    }

    public double sub(double x, double y) {
        return x - y;
    }

    public double mult(double x, double y) {
        return x * y;
    }

    public double div(double x, double y) {
        return x / y;
    }

    public double loge(double x) {
        return Math.log(x);
    }

    public double log10(double x) {
        return Math.log10(x);
    }

    public double exp(double x) {
        return Math.exp(x);
    }

    public double sen(double x) {
        return Math.sin(x);
    }

    public double cos(double x) {
        return Math.cos(x);
    }

};
