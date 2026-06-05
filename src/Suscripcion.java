public class Suscripcion {

    String tipo;
    double costo;
    int periodicidadMeses;

    // Constructor completo
    public Suscripcion(String tipo, double costo, int periodicidadMeses) {
        this.tipo = tipo;
        this.costo = costo;
        this.periodicidadMeses = periodicidadMeses;
    }
    // Métodos Getters
    public String getTipo() {
        return this.tipo;
    }

    public double getCosto() {
        return this.costo;
    }

    public int getPeriodicidadMeses() {
        return this.periodicidadMeses;
    }


}
