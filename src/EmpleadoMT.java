public class EmpleadoMT extends Empleados{

    public EmpleadoMT (int codigo, String nombre, String apellido, String cargo, double sueldo){
        super(codigo, nombre, apellido, cargo, sueldo);
    }

    @Override
    public  void mostarEmpleado(){
        System.out.println("EMPLEADO A MEDIO TIEMPO");
        System.out.println("Codigo: "+getCodigo());
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido: "+getApellido());
        System.out.println("Cargo: "+getCargo());
        System.out.println("Sueldo: " +getSueldo());
    }


}
