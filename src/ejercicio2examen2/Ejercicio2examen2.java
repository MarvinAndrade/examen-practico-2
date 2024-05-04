/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2examen2;

// Clase abstracta para representar a un empleado
abstract class Empleado {
    private final String nombre;
    private final String id;

    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public abstract double calcularSalario();

    public String getNombre() {
        return nombre;
    }
}

// Clase para empleados a tiempo completo
class EmpleadoTiempoCompleto extends Empleado {
    private final double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, String id, double salarioMensual) {
        super(nombre, id);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
        return salarioMensual;
    }
}

// Clase para empleados por contrato
class EmpleadoPorContrato extends Empleado {
    private final double salarioDiario;

    public EmpleadoPorContrato(String nombre, String id, double salarioDiario) {
        super(nombre, id);
        this.salarioDiario = salarioDiario;
    }

    //entre 22 dias
    @Override
    public double calcularSalario() {
        // Supongamos que trabaja 22 días al mes
        return salarioDiario / 22;
    }
}

// Clase para empleados temporales
class EmpleadoTemporal extends Empleado {
    private double salarioPorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, String id, double salarioPorHora, int horasTrabajadas) {
        super(nombre, id);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return salarioPorHora * horasTrabajadas;
    }
}

// Clase Main con el método main()
public class Ejercicio2examen2 {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto("MARVIN EDUARDO RIVERA ANDRADE", "123", 3000);
        EmpleadoPorContrato empleado2 = new EmpleadoPorContrato("ERICK BLADIMIR CUBIAS", "456", 100);
        EmpleadoTemporal empleado3 = new EmpleadoTemporal("ING. EDGARDO CALDERON", "789", 15, 40);

        System.out.println("Salario de " + empleado1.getNombre() + ":salario mensual  $" + empleado1.calcularSalario());
        System.out.println("Salario de " + empleado2.getNombre() + ":salario al dia  $" + empleado2.calcularSalario());
        System.out.println("Salario de " + empleado3.getNombre() + ": salario por horas trabajadas al mes $" + empleado3.calcularSalario());
    }
}
