public class Racional {
    private int numerador;
    private int denominador;

    public Racional() {
        this.numerador = 0;
        this.denominador = 1;
    }

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public String toString() {
        return this.numerador + "/" + this.denominador;
    }

    public static void main(String[] args) {
        // Referencia r se asigna un obj
        Racional r = new Racional();
        System.out.println(r);
        System.out.println(r.getClass());
        System.out.println(r.hashCode());
        System.out.println(r.toString());
    }
}
