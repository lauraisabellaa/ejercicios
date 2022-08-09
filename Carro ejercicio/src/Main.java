public class Main {
    public static void main(String[] args) {
        Coche micoche = new Coche();
        micoche.ponerPuerta(4);
        System.out.println(micoche.obtenerPuerta());
    }
    public static int suma (int a, int b) {
        return a + b;
    }
}
class Coche {
    private int puerta = 0;

    public void ponerPuerta(int puerta) {
        this.puerta = this.puerta + puerta;
    }

    public int obtenerPuerta() {
        return this.puerta;
    }
}
