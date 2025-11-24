import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main() {
        Scanner input = new Scanner(System.in);
        ArrayList<Empleados> lista = new ArrayList<>();
        int op =0;
        do {

            int codigo = 0;
            double sueldobase =0,bono =0,horas =0,pago =0;
            String nombres = "",apellidos = "",cargo = "";

            System.out.println("MENU DE EMPLEADOS");
            System.out.println("1. Registrar empleado tiempo completo");
            System.out.println("2. Registrar empleado medio tiempo");
            System.out.println("3. Mostrar empleados registrados");
            System.out.println("4. Mostrar Estadísticas.");
            System.out.println("5. Salir");
            System.out.printf("Ingrese opción:");

            while (true){
                op= input.nextInt();
                input.nextLine();
                if (op > 0 ){
                    break;
                }else{
                    System.out.println("Error : la op no puede ser negativo o 0 debe ser del 1 a 5 ");
                }
            }

            switch (op){
                case 1:
                    try{
                        System.out.println("Registrar empleado tiempo completo");
                        while (true){
                            System.out.printf("CODIGO: ");
                            codigo = input.nextInt();
                            input.nextLine();
                            if (codigo > 0 ){
                                break;
                            }else {
                                System.out.println("Error : el codigo no puede ser negativo o 0 ");
                            }
                        }

                        while (true){
                            System.out.printf("Nombres: ");
                            nombres = input.nextLine();

                            if (!nombres.trim().isEmpty()){
                                break;
                            } else{
                                System.out.println("Error : el nombre no puede estar vacio ");
                            }
                        }

                        while (true){
                            System.out.printf("Apellidos: ");
                            apellidos = input.nextLine();

                            if (!apellidos.trim().isEmpty()){
                                break;
                            } else{
                                System.out.println("Error : el apellido no puede estar vacio ");
                            }
                        }

                        while (true){
                            System.out.printf("Cargo: ");
                            cargo= input.nextLine();

                            if (!cargo.trim().isEmpty()){
                                break;
                            } else{
                                System.out.println("Error : el cargo no puede estar vacio ");
                            }
                        }

                        while (true){
                            System.out.printf("Sueldo: ");
                            sueldobase = input.nextDouble();
                            input.nextLine();
                            if (sueldobase> 0 ){
                                break;
                            }else{
                                System.out.println("Error : el sueldo no puede ser negativo o 0 ");
                            }
                        }


                        while (true){
                            System.out.printf("Bono: ");
                            bono = input.nextDouble();
                            input.nextLine();
                            if (bono >= 0 ){
                                break;
                            }else{
                                System.out.println("Error : el bono no puede ser negativo");
                            }
                        }

                        double sueltoTotal = sueldobase+bono;

                        lista.add(new EmpleadoTC(codigo,nombres,apellidos,cargo,sueltoTotal));

                        System.out.println("Empleado a tiempo completo ingresado con exito");
                        System.out.println("===============================\n");

                    }catch (Exception e){
                        System.out.println("ERROR: " + e);
                    }
                    break;
                case 2:
                    try {

                        while (true){
                            System.out.printf("CODIGO: ");
                            codigo = input.nextInt();
                            input.nextLine();
                            if (codigo > 0 ){
                                break;
                            }else {
                                System.out.println("Error : el codigo no puede ser negativo o 0 ");
                            }
                        }

                        while (true){
                            System.out.printf("Nombres: ");
                            nombres = input.nextLine();

                            if (!nombres.trim().isEmpty()){
                                break;
                            } else{
                                System.out.println("Error : el nombre no puede estar vacio ");
                            }
                        }

                        while (true){
                            System.out.printf("Apellidos: ");
                            apellidos = input.nextLine();

                            if (!apellidos.trim().isEmpty()){
                                break;
                            } else{
                                System.out.println("Error : el apellido no puede estar vacio ");
                            }
                        }

                        while (true){
                            System.out.printf("Cargo: ");
                            cargo= input.nextLine();

                            if (!cargo.trim().isEmpty()){
                                break;
                            } else{
                                System.out.println("Error : el cargo no puede estar vacio ");
                            }
                        }


                        while (true){
                            System.out.printf("Horas Trabajadas: ");
                            horas = input.nextDouble();
                            input.nextLine();
                            if (horas > 0 ){
                                break;
                            }else {
                                System.out.println("Error : las horas no puede ser negativo o 0 ");
                            }
                        }

                        while (true){
                            System.out.printf("Pago por hora: ");
                            pago = input.nextDouble();
                            input.nextLine();
                            if (pago > 0 ){
                                break;
                            }else {
                                System.out.println("Error : el pago no puede ser negativo o 0 ");
                            }
                        }

                        double sueldoTotal = horas*pago;

                        lista.add(new EmpleadoMT(codigo,nombres,apellidos,cargo,sueldoTotal));

                        System.out.println("Empleado a MEDIO TIEMPO ingresado con exito");
                        break;
                    }catch (Exception e){
                        System.out.println("ERROR: " + e);
                    }


                case 3:
                    System.out.println("==================================");
                    System.out.println("Mostrar empleados registrados");
                    if (lista.isEmpty()){
                        System.out.println("la lista se encuentra vacia.");
                        break;
                    }else {
                        for (Empleados l : lista) {
                            l.mostarEmpleado();
                            System.out.println("--------------------------------");
                        }
                    }
                        break;



                case 4:
                    System.out.println("Mostrar Estadísticas");
                    String nombre ="";
                    double sueldoMax=0;
                    double sueldoMIN=0;
                    int contador =0;
                    double sueldos =0;

                    if (lista.isEmpty()){
                        System.out.println("la lista se encuentra vacia.");
                        break;
                    }else {
                        for (Empleados l : lista) {
                            if (l.getSueldo() > sueldoMax) {
                                sueldoMax = l.getSueldo();
                                nombre = l.getNombre();
                            }
                        }
                        System.out.println("El empleado con mayor sueldo es: "+nombre);

                        for (Empleados l : lista) {
                           if (l.getSueldo()>sueldoMIN){
                               sueldos = l.getSueldo();
                               contador ++;
                           }
                        }
                        double promedioSalario = sueldos/contador;

                        System.out.println("El Promedio salarial entre todos los empleados es: "+promedioSalario);
                    }
                    break;

                case 5:
                    System.out.println("SALIENDO DEL SISTEMA");


                default:
                    System.out.println("SOLO se puede introducir numeros del 1-5");
                    break;

            }
        }while (op != 5);
    }
}