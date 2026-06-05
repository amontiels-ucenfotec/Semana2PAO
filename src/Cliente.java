public class Cliente {

    String nombre;
    String apellidos;
    String cedula;
    char sexo;
    String ubicacion;

    // Constructor 1 Inicia todos los atributos
    public Cliente(String nombre, String apellidos, String cedula, char sexo, String ubicacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.sexo = sexo;
        this.ubicacion = ubicacion;
    }

    // Constructor 2 Sobrecarga q inicia todo menos el sexo
    public Cliente(String nombre, String apellidos, String cedula, String ubicacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.ubicacion = ubicacion;
    }

    // Constructor 3 Constructor x defecto
    public Cliente() {
    }

    // Método de funcionalidad optimizado con Encapsulamiento
    public void suscribirse(Suscripcion sub) {
        System.out.println(this.getNombre() + " " + this.getApellidos() + " adquirió una suscripción " + sub.getTipo() + ".");
    }

    // Métodos Getters
    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public String getCedula() {
        return this.cedula;
    }

    public char getSexo() {
        return this.sexo;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }



}
