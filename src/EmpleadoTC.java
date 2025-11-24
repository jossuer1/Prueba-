public class EmpleadoTC extends Empleados{

    public EmpleadoTC(int codigo, String nombre, String apellido, String cargo, double sueldo){
        super(codigo, nombre, apellido, cargo, sueldo);
    }


    public double calcularSueldo(double base, double bono){
        double total;
        return total = base + bono;
    }

    @Override
    public  void mostarEmpleado(){
        System.out.println("EMPLEADO A TIEMPO COMPLETO");
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Cargo: "+getCargo());
        System.out.println("Sueldo: " +getSueldo());
    }


}
