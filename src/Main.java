//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {// 1 Crear clientes sobrecarga de construc
        Cliente cliente1 = new Cliente("Romario", "Salas Cerdas", "101110111", 'M', "San José");
        Cliente cliente2 = new Cliente("Andrea", "Salas", "202220222", "Cartago");

        Cliente cliente3 = new Cliente(); // Uso del constructor por defecto
        cliente3.nombre = "Luis";
        cliente3.apellidos = "Valeriano";

        // 2 Crear de instancias Suscripcion
        Suscripcion planFamiliar = new Suscripcion("Premium Familiar Mensual ", 10.99, 1);
        Suscripcion planDuo = new Suscripcion("Premium Duo Mensual ", 7.99, 1);

        // 3 Prueba funcionalidad conectando las clases
        cliente1.suscribirse(planFamiliar);
        cliente2.suscribirse(planDuo);

        // 4 Magia FINAL: Pasar un objeto Suscripcion de forma anónima
        cliente3.suscribirse(new Suscripcion("Premium Individual Mensual ", 5.99, 1));
    }
}