public abstract class Empleados {
    private int codigo;
    private String nombre;
    private String apellido;
    private String cargo;
    private  double sueldo;

    public Empleados( int codigo, String nombre, String apellido, String cargo, double sueldo){
        setCodigo(codigo);
        setNombre(nombre);
        setApellido(apellido);
        setCargo(cargo);
        setSueldo(sueldo);
    }
    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setCodigo(int codigo) {
        if (codigo <= 0){
            throw new IllegalArgumentException("Error: codigo no puede ser negativo.");
        }
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        if (nombre==null || nombre.trim().isEmpty()){
            throw new IllegalArgumentException("Error: nombre no puede estar vacio.");
        }
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        if (apellido==null || apellido.trim().isEmpty()){
            throw new IllegalArgumentException("Error: apellido no puede estar vacio.");
        }
        this.apellido = apellido;
    }

    public void setCargo(String cargo) {
        if (cargo==null || cargo.trim().isEmpty()){
            throw new IllegalArgumentException("Error: cargo no puede estar vacio.");
        }
        this.cargo = cargo;
    }

    public void setSueldo(double sueldo) {
        if (sueldo <= 0){
            throw new IllegalArgumentException("Error: sueldo no puede ser negativo.");
        }
        this.sueldo = sueldo;
    }

    public abstract void mostarEmpleado();

}

