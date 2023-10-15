// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Clases.*;
import Ejercicio15.*;
import Ejercicio15.Persona;
import Ejercicio17.Vendedor;
import Ejercicio18.TeamProgrammer;

import java.util.List;
import java.util.Scanner;


class abuelo{
    public String ojos = "azules";
    private String billeteraAbueno = "abu111";
    protected int edad = 63;

    public void imprimaTodo() {
        System.out.println("Ojos del abuelo: " + ojos);
        System.out.println("Billetera del Abuelo: " + billeteraAbueno);
        System.out.println("Edad del abuelo: " + edad);
    }
    class padre extends abuelo {
        public String ojos = "azules";
        private String billeteraPadre = "padre111";

        //SETTERS Y GETTERS HEREDADOS DEL ABUELO
        public void setBilleteraPadre(String billeteraPadre) {this.billeteraPadre = billeteraPadre;}
        public String getBilleteraPadre() {return billeteraPadre;}
        public void setOjos(String ojos) {this.ojos = ojos;}
        public String getOjos() {return ojos;}

        public void imprimaTodo() {
            //IMPRIME LOS DATOS DEL PADRE
            System.out.println("DATOS DEL PADRE");
            System.out.println("Ojos del padre: "+getOjos());
            System.out.println("Billetera del Padre: " + getBilleteraPadre());
        }
    }
}

public class Main {

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }



    public static void main(String[] args) {
        int problemas;
        problemas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el problema del 1 al 18"));

    switch (problemas) {
        case 1:
            Ejercicio1();
            break;

        case 2:
            Ejercicio2();
            break;

        case 3:
            Ejercicio3();
            break;

        case 4:
            Ejercicio4();
            break;

        case 5:
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            int numPrimoInferior = num - 1;
            while (!esPrimo(numPrimoInferior)) {
                numPrimoInferior--;
            }
            JOptionPane.showMessageDialog(null, "El numero primo ingresado es " + num + ", el inferior es " + numPrimoInferior);
            break;

        case 6:
            int opcion = Integer.parseInt(String.valueOf(JOptionPane.showOptionDialog(null, "¿Qué desea calcular? \n"
                            + "a - Area de la esfera \n" +
                            "b - Superficie de la esfera",
                    "Problema 6",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{"a", "b"},
                    "a")));

            int r;
            do {
                r = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el radio de la esfera: ", "Esfera", JOptionPane.QUESTION_MESSAGE));
            } while (r < 0);
            double radio = Double.parseDouble(String.valueOf(r));

            if (opcion == 0) {
                AreaEsfera(radio);
            } else {
                SuperficieEsfera(radio);
            }
            break;

        case 7:
            Ejercicio7();
            break;

        case 8:
            Ejercicio8();
            break;

        case 9:
            Ejercicio9();

            break;

        case 10:
            Ejercicio10();

        case 11:
            Ejercicio11();
            break;

        case 12:
            Ejercicio12();
            break;

        case 13:
            String marca, colour, patente, cilindro, name, apellido, asiento, carga;
            Long dni, telefono;
            List<Cliente> clientes = new ArrayList<>();
            List<Vehiculo> vehiculos = new ArrayList<>();
            Scanner reader = new Scanner(System.in);

            while(true) {
                System.out.println("Bienvenido al menú de RENT - ART");
                int opt;
                System.out.println("1. Ingresar Cliente y vehículo\n 2. Vehiculos alquilados por el cliente\n 3. Eliminar vehículos ingresados\n 4. Salir");
                opt = reader.nextInt();
                reader.nextLine();

                switch (opt) {
                    case 1:

                        System.out.println("\t\t RENT-ART");
                        System.out.println("Ingrese el cliente");
                        name = reader.nextLine();
                        System.out.println("Ingrese el apellido");
                        apellido = reader.nextLine();
                        System.out.println("Ingrese el DNI");
                        dni = reader.nextLong();
                        reader.nextLine();
                        System.out.println("Ingrese el telefono");
                        telefono = reader.nextLong();
                        reader.nextLine();

                        Cliente persona = new Cliente.RegistroCliente(name, apellido, dni, telefono);
                        persona.setNombreCliente(name);
                        persona.setApellidoCliente(apellido);
                        persona.setDniCliente(dni);
                        persona.setTelefonoCliente(telefono);

                        System.out.println("\t\t DATOS DEL CLIENTE");
                        System.out.println("Nombre del cliente: " + persona.getNombreCliente());
                        System.out.println("Apellido del cliente: " + persona.getApellidoCliente());
                        System.out.println("DNI del cliente: " + persona.getDniCliente());
                        System.out.println("Telefono del cliente: " + persona.getTelefonoCliente());
                        clientes.add(persona);

                        wait(3000);

                        System.out.println("VEHICULOS");
                        int veh;

                        System.out.println("Ingrese la marca:");
                        marca = reader.nextLine();
                        System.out.println("Ingrese color:");
                        colour = reader.nextLine();
                        System.out.println("Ingrese patente:");
                        patente = reader.nextLine();

                        System.out.println("Tipo de vehículos: \n1. Moto\n2. Auto\n 3.Camion");
                        veh = reader.nextInt();
                        reader.nextLine();
                        if (veh == 1) {
                            System.out.println("Ingrese los cilindros");
                            cilindro = reader.nextLine();

                            Vehiculo.Motos moto = new Vehiculo.Motos(marca, colour, patente);
                            moto.setMarca(marca);
                            moto.setColour(colour);
                            moto.setPatente(patente);
                            moto.setCilindro(cilindro);

                            System.out.println("DATOS DE LA MOTO");
                            System.out.println("Marca: " + moto.getMarca());
                            System.out.println("Color: " + moto.getColour());
                            System.out.println("Patente: " + moto.getPatente());
                            moto.mostrarCilindro();
                            vehiculos.add(moto);

                            persona.agregarVehiculoAlquilado(moto);
                            wait(3000);

                        } else if (veh == 2) {
                            System.out.println("Ingrese la cantidad de asientos");
                            asiento = reader.nextLine();

                            Vehiculo.Autos auto = new Vehiculo.Autos(marca, colour, patente);
                            auto.setMarca(marca);
                            auto.setColour(colour);
                            auto.setPatente(patente);
                            auto.setCantAsientos(asiento);

                            System.out.println("DATOS DEL AUTO");
                            System.out.println("Marca: " + auto.getMarca());
                            System.out.println("Color: " + auto.getColour());
                            System.out.println("Patente: " + auto.getPatente());
                            auto.mostrarAsientos();
                            vehiculos.add(auto);

                            persona.agregarVehiculoAlquilado(auto);
                            wait(3000);
                        } else if (veh == 3) {
                            System.out.println("Ingrese la capacidad de carga");
                            carga = reader.nextLine();

                            Vehiculo.Camiones camion = new Vehiculo.Camiones(marca, colour, patente);
                            camion.setMarca(marca);
                            camion.setColour(colour);
                            camion.setPatente(patente);
                            camion.setCapCarga(carga);

                            System.out.println("DATOS DE CAMION");
                            System.out.println("Marca: " + camion.getMarca());
                            System.out.println("Color: " + camion.getColour());
                            System.out.println("Patente: " + camion.getPatente());
                            camion.mostrarCapCarga();
                            vehiculos.add(camion);
                            persona.agregarVehiculoAlquilado(camion);
                            wait(3000);
                        } else {
                            System.out.println("Opción incorrecta - Se saldrá del sistema");
                            System.exit(0);
                        }

                        break;
                    case 2:
                        System.out.println("ALQUILERES");
                        System.out.println("Vehiculos alquilados");

                        for (Cliente cliente : clientes) {
                            List<Vehiculo> vehiculosAlquilados = cliente.getVehiculosAlquilados();

                            if (!vehiculosAlquilados.isEmpty()) {
                                System.out.println("Cliente: " + cliente.getNombreCliente() + " " + cliente.getApellidoCliente());
                                System.out.println("Vehiculos alquilados por este cliente: ");
                            }

                            for (Vehiculo vehiculo : vehiculosAlquilados) {
                                System.out.println("Marca: " + vehiculo.getMarca());
                                System.out.println("Color: " + vehiculo.getColour());
                                System.out.println("Patente: " + vehiculo.getPatente());

                                if (vehiculo instanceof Vehiculo.Motos) {
                                    Vehiculo.Motos moto = (Vehiculo.Motos) vehiculo;
                                    System.out.println("Cilindro: " + moto.getCilindro());
                                } else if (vehiculo instanceof Vehiculo.Autos) {
                                    Vehiculo.Autos auto = (Vehiculo.Autos) vehiculo;
                                    System.out.println("Cantidad de asientos: " + auto.getCantAsientos());
                                } else if (vehiculo instanceof Vehiculo.Camiones) {
                                    Vehiculo.Camiones camion = (Vehiculo.Camiones) vehiculo;
                                    System.out.println("Capacidad de carga: " + camion.getCapCarga());
                                }
                            }
                            wait(3000);
                            break;

                        }
                        break;
                    case 3:
                        System.out.println("Eliminar clientes que ya no alquilan vehículos:");
                        List<Cliente> clientesARemover = new ArrayList<>();
                        for (Cliente cliente : clientes) {
                            List<Vehiculo> vehiculosAlquilados = cliente.getVehiculosAlquilados();
                            if (vehiculosAlquilados.isEmpty()) {
                                clientesARemover.add(cliente);
                            }
                        }
                        for (Cliente clienteARemover : clientesARemover) {
                            clientes.remove(clienteARemover);
                            System.out.println("Cliente eliminado: " + clienteARemover.getNombreCliente() + " " + clienteARemover.getApellidoCliente());
                        }
                        break;
                    case 4:
                        System.out.println("Se saldrá del programa");
                        System.exit(0);
                    default:
                        System.exit(0);
                }
            }
        case 14:
            Ejercicio14();
            break;
        case 15:
            Ejercicio15();
        case 16:
            String nombre, apell, nombEquipo, pais; int edad, golesRecibidos, golesAnot, numAsistencias, ataquesAnotados, golesAnotados;
            boolean esTitular;
            List<Ejercicio16.Persona.Mediocampista> mediocampistas = new ArrayList<>();
            List<Ejercicio16.Persona.Delantero> delanteros = new ArrayList<>();
            List<Ejercicio16.Persona.Defensor> defensores = new ArrayList<>();

            Scanner lectu = new Scanner(System.in);

            while(true){
                System.out.println("Conformación de equipo de futbol");
                int optio;
                System.out.println(" 1. Agregar personas\n 2. Mostrar equipo");
                optio = lectu.nextInt();
                lectu.nextLine();

                switch (optio){
                    case 1:
                        System.out.println("PERSONAS");
                        try {
                            System.out.println("Ingrese el nombre:");
                            nombre = lectu.nextLine();
                            System.out.println("Ingrese el apellido:");
                            apell = lectu.nextLine();
                            System.out.println("Ingrese la edad:");
                            edad = lectu.nextInt();
                            lectu.nextLine();
                            System.out.println(" 1. Jugador\n 2. Tecnico");
                            int cho = lectu.nextInt();
                            lectu.nextLine();
                            if(cho == 1){
                                try{
                                    System.out.println("ARQUERO");
                                    System.out.println("1. Titular | 2. No titular)");
                                    esTitular = lectu.nextBoolean();

                                    System.out.println("DEFENSORES");
                                    System.out.println("Ataques anotados:");
                                    ataquesAnotados = lectu.nextInt();
                                    System.out.println("Goles anotados:");
                                    golesAnotados = lectu.nextInt();

                                    //Persona persona2 = new Ejercicio16.Persona.Defensor(nombre, apell, edad, esTitular, ataquesAnotados, golesAnotados);




                                }catch(java.util.InputMismatchException e){
                                    System.out.println("Entrada incorrecta");
                                }
                            }


                        }catch (java.util.InputMismatchException e){
                            System.out.println("Entrada incorrecta");
                        }
                }
            }
        case 17:
            String nom, apelli; int age;
            Scanner ej17 = new Scanner(System.in);
            System.out.println("Ingresar nombre:");
            nom = ej17.nextLine();
            System.out.println("Ingresar apellido:");
            apelli = ej17.nextLine();
            System.out.println("Ingrese la edad:");
            age = ej17.nextInt();
            ej17.nextLine();

            Vendedor vendedor = new Vendedor(nom, apelli, age);
            vendedor.setNombre(nom);
            vendedor.setApellido(apelli);
            vendedor.setEdad(age);

            String result = vendedor.verificarEdad();
            System.out.println(result);

            vendedor.imprimir();
            break;

        case 18:
            Scanner rea = new Scanner(System.in);
            System.out.println("Nombre del equipo: ");
            String nombreEquipo = rea.nextLine();

            System.out.println("Universidad:");
            String univ = rea.nextLine();

            System.out.println("Lenguaje de programación: ");
            String lengProgrammer = rea.nextLine();

            TeamProgrammer equipo = new TeamProgrammer();
            equipo.setNombreEquipo(nombreEquipo);
            equipo.setUniversidad(univ);
            equipo.setLenguajeProgramacion(lengProgrammer);

            while (!equipo.estaCompleto()){
                System.out.println("Nombre y apellidos del programador: ");
                String nombreProgramador = rea.nextLine();
                equipo.agregarProgramador(nombreProgramador);
            }
            rea.close();
            break;
    }
    }
    static boolean esPrimo (int par){
        int resto = 1;
        int n=2;
        while((n<par/2) && (resto!=0)){
            resto=  (par % n);
            n++;
        }
        return resto != 0;
    }


    public static void Ejercicio1(){
        int a, b, c, d;
        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la primera nota"));

        b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la segunda nota"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tercera nota"));
        d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cuarta nota"));
        System.out.println("Las notas ingresadas son " + a + ", " + b + ", " + c + ", " + d);

        int promedio;
        promedio = (a + b + c + d) / 4;

        if (promedio <= 4) {
            System.out.println("El promedio que obtuvo es: " + promedio + ". LIBRE");
        } else if (promedio <= 7) {
            System.out.println("El promedio que obtuvo es: " + promedio + ". REGULAR");
        } else {
            System.out.println("Promedio: " + promedio + ". PROMOCIONADO");
        }
    }
    public static void Ejercicio2(){
        int num, suma = 0, contador = 0;
        float media;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:  (Para frenar, ingrese un número negativo"));

        while(num >= 0){
            suma+=num;
            contador++;
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número:  (Para frenar, ingrese un número negativo"));
        }
        if(contador == 0){
            System.out.println("No es posible calcular el promedio");
        }else{
            System.out.println("La sumatoria de todos los elementos es: "+suma);
            media = (float)suma/contador;
            System.out.println("el promedio es: "+media);
        }
    }
    public static void Ejercicio3(){
        int a = 0, b = 1, c, n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números a mostrar: "));

        System.out.println("Número elegido: "+n);
        int i = 0;
        while (i < n) {
            System.out.print(a + "");

            if (i < (n - 1)) {
                System.out.print("-");
            }
            c = a + b;
            a = b;
            b = c;
            i++;
        }
    }
    public static void Ejercicio4(){
        String dniPaciente, nombrePaciente, apellidoPaciente, sexoPaciente, pesoPaciente,alturaPaciente;
        int edadPaciente;
        boolean continuar;
        do {
            System.out.println("DATOS DEL PACIENTE");
            do {
                dniPaciente = JOptionPane.showInputDialog("Ingrese el DNI");
            } while (dniPaciente.length() < 8);
            do {
                nombrePaciente = JOptionPane.showInputDialog("Ingrese el nombre");
            } while (nombrePaciente.equalsIgnoreCase(""));
            do {
                apellidoPaciente = JOptionPane.showInputDialog("Ingrese el apellido");
            } while (nombrePaciente.equalsIgnoreCase(""));
            do {
                sexoPaciente = JOptionPane.showInputDialog("Ingrese género - (Femenino|Masculino)");
            } while (sexoPaciente.equalsIgnoreCase(""));
            do {
                edadPaciente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
            } while (edadPaciente == 0);
            do {
                pesoPaciente = JOptionPane.showInputDialog("Ingrese el peso");
            } while (pesoPaciente.equalsIgnoreCase("0"));
            do {
                alturaPaciente = JOptionPane.showInputDialog("Ingrese la altura en metros");
            } while (alturaPaciente.equalsIgnoreCase(""));

            Paciente nuevoPaciente = new Paciente(dniPaciente, nombrePaciente, edadPaciente, apellidoPaciente, sexoPaciente, pesoPaciente, alturaPaciente);
            nuevoPaciente.setDni(dniPaciente);
            nuevoPaciente.setNombre(nombrePaciente);
            nuevoPaciente.setEdad(edadPaciente);
            nuevoPaciente.setApellido(apellidoPaciente);
            nuevoPaciente.setSexo(sexoPaciente);
            nuevoPaciente.setPeso(pesoPaciente);
            nuevoPaciente.setAltura(alturaPaciente);

            System.out.println("El nombre es: " + nuevoPaciente.getNombre());
            System.out.println("el apellido es: " + nuevoPaciente.getApellido());
            System.out.println("El DNI es: " + nuevoPaciente.getDni());
            System.out.println("La edad es: " + nuevoPaciente.getEdad());
            System.out.println("El género es: " + nuevoPaciente.getSexo());
            System.out.println("El peso es: " + nuevoPaciente.getPeso());
            System.out.println("La altura es: " + nuevoPaciente.getAltura());

            double altura = Double.parseDouble(alturaPaciente);
            double peso = Double.parseDouble(pesoPaciente);
            double square = Math.pow(altura,2);
            double imc;
            imc = peso/square;
            System.out.println("El IMC calculado es: "+imc);
            if (imc < 18.5){
                System.out.println("Peso inferior al normal");
            }else if((imc >= 18.5) && (imc <= 24.9)){
                System.out.println("Peso normal");
            }else if ((imc >= 25.0) && (imc <= 29.9)){
                System.out.println("Peso superior al normal");
            }else{
                System.out.println("Obesidad");
            }

            String respuesta = JOptionPane.showInputDialog("Desea ingresar más datos? [SI | NO]").toLowerCase();
            continuar = respuesta.equals("si");
        }while(continuar);
    }

    public static void AreaEsfera(double radio) {
        double square = Math.pow(radio, 2);
        JOptionPane.showMessageDialog(null, "El area de la esfera es: " + 4 * Math.PI * square, "Area de una esfera", JOptionPane.QUESTION_MESSAGE);
    }
    public static void SuperficieEsfera(double radio){
        double cubico = Math.pow(radio,3);
        JOptionPane.showMessageDialog(null, "El volumen de la esfera es: "+4.0/3.0 * Math.PI * cubico,"Superficie de una esfera",JOptionPane.QUESTION_MESSAGE);
    }

    public static void Ejercicio7(){
        String x = "el murciélago voló hacia el horizonte al caer la noche";
        while (true) {
            try {
                int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición desde cero hasta ... (Numero negativo para salir):"));

                if (posicion < 0) {
                    JOptionPane.showMessageDialog(null, "Se ingresó un número negativo ¡Adiós!");
                    break;
                }

                char caracter = JOptionPane.showInputDialog("Ingrese un carácter: ").charAt(0);

                if (posicion < x.length()) {

                    if (x.charAt(posicion) == caracter) {
                        JOptionPane.showMessageDialog(null, "¡Adivinaste! El carácter coincide en la posición. \n"+"Frase: "+x);

                    } else {
                        JOptionPane.showMessageDialog(null, "No coincide el carácter en la posición.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Posición fuera de rango.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Ingrese un número válido.");
            } catch (IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "Error: Posición fuera del rango de la cadena.");
            }
        }
    }

    public static void Ejercicio8(){
        int Diamifecha, Mesmifecha, Annomifecha;
        do{
            Diamifecha = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dia (1 - 31): " ));
        }while (Diamifecha <= 0 || Diamifecha > 31);

        do{
            Mesmifecha = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes (1 - 12):" ));
        }while (Mesmifecha <= 0 || Mesmifecha > 13);

        do {
            Annomifecha = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año (AAAA): "));
        }while (Annomifecha <5);

        MiFecha fecha = new MiFecha(Diamifecha, Mesmifecha, Annomifecha);
        fecha.setDia(Diamifecha);
        fecha.setMes(Mesmifecha);
        fecha.setAnno(Annomifecha);

        JOptionPane.showMessageDialog(null, "El dia "+ Diamifecha + " del mes "+MiFecha.nombreMes()+" del año "+Annomifecha +" - "+MiFecha.mostrarFecha());
        //System.out.println("El dia "+fecha.getDia()+" del mes "+fecha.getMes()+" del año "+fecha.getAnno()+" - "+fecha.isEs_bisiesto());
    }

    public static void Ejercicio9(){
        int opcion2 = 0;
        Scanner elegir = new Scanner(System.in);
        System.out.println(" 1. Perro\n 2. Persona\n 3. Rectangulo\n 4. Cuenta bancaria\n 5. Estudiante\n 6. Vehiculo\n 7.Libro\n 8. Mascota\n 9. Empleado");
        opcion2 = elegir.nextInt();
        elegir.nextLine();
    switch (opcion2) {

        case 1:
            String nombre, raza, alimento;
            int edad;
            Scanner read = new Scanner(System.in);

            System.out.println("DATOS DE PERRO");

            System.out.println("Ingrese el nombre del perro: ");
            nombre = read.nextLine();

            System.out.println("Ingrese la edad: ");
            edad = read.nextInt();
            read.nextLine();
            System.out.println("Ingrese la raza: ");
            raza = read.nextLine();

            System.out.println("Ingrese el alimento: ");
            alimento = read.nextLine();

            Perro perro = new Perro(nombre, raza, alimento, edad);
            perro.setNombre(nombre);
            perro.setRaza(raza);
            perro.setAlimento(alimento);
            perro.setEdad(edad);

            System.out.println(perro.getNombre() + " tiene " + perro.getEdad() + ", la raza es " + perro.getRaza() + ", y su alimento es: " + perro.getAlimento());
            perro.ladrar();
            perro.caminar();
            perro.comer();
            break;
        case 2:

            System.out.println("DATOS DE PERSONA");
            String nombreP, generoP;
            int edadP;
            Scanner classP = new Scanner(System.in);

            System.out.println("Ingrese su nombre: ");
            nombreP = classP.nextLine();

            System.out.println("Ingrese su edad: ");
            edadP = classP.nextInt();
            classP.nextLine();
            System.out.println("Ingrese su género: [M | F | X] ");
            generoP = classP.nextLine();

            Clases.Persona datos = new Clases.Persona(nombreP, generoP, edadP);
            datos.setNombre(nombreP);
            datos.setEdad(edadP);
            datos.setGenero(generoP);

            datos.decirNombre();
            datos.decirEdad();
            datos.decirGenero();
            break;
        case 3:
            String color;
            float altura, base, perimetro = 0, area = 0;
            Scanner rectan = new Scanner(System.in);

            System.out.println("RECTANGULO");
            System.out.println("Ingrese un color");
            color = rectan.nextLine();
            System.out.println("Ingrese la altura");
            altura = Float.parseFloat(rectan.nextLine().replace(",", "."));
            System.out.println("Ingrese el ancho");
            base = Float.parseFloat(rectan.nextLine().replace(",", "."));


            rectan.close();
            Rectangulo rectangulo = new Rectangulo(color, altura, base, area, perimetro);
            rectangulo.setAltura(altura);
            rectangulo.setAncho(base);
            rectangulo.setColor(color);

            System.out.println("El color del rectangulo es: " + rectangulo.getColor());
            rectangulo.calcularArea();
            rectangulo.calcularPerimetro();
            break;
        case 4:
            Long numCuenta;
            int saldo;
            String titularCuenta;
            Scanner cuenta = new Scanner(System.in);
            System.out.println("CUENTA BANCARIA");
            System.out.println("Ingrese el numero de cuenta");
            numCuenta = cuenta.nextLong();
            cuenta.nextLine();
            System.out.println("Ingrese el saldo");
            saldo = cuenta.nextInt();
            cuenta.nextLine();
            System.out.println("Ingrese el titular de la cuenta");
            titularCuenta = cuenta.nextLine();

            CuentaBancaria cuentaBancaria = new CuentaBancaria(numCuenta, saldo, titularCuenta);
            cuentaBancaria.setNumCuenta(numCuenta);
            cuentaBancaria.setSaldo(saldo);
            cuentaBancaria.setTitularCuenta(titularCuenta);

            while (true) {
                System.out.println("\nMenú de operaciones:");
                System.out.println("1. Depositar");
                System.out.println("2. Retirar");
                System.out.println("3. Consultar saldo");
                System.out.println("4. Mostrar detalles de la cuenta");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");

                int opcion = cuenta.nextInt();
                cuenta.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese la cantidad a depositar: ");
                        int cantidadDeposito = cuenta.nextInt();
                        cuentaBancaria.depositar(cantidadDeposito);
                        break;
                    case 2:
                        System.out.print("Ingrese la cantidad a retirar: ");
                        int cantidadRetiro = cuenta.nextInt();
                        cuentaBancaria.retirar(cantidadRetiro);
                        break;
                    case 3:
                        cuentaBancaria.consultarSaldo();
                        break;
                    case 4:
                        cuentaBancaria.mostrarCuenta();
                    case 5:
                        System.out.println("Saliendo del programa.");
                        return;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }

            }
        case 5:
            String nombreEstudiante;
            int edadEstudiante;
            Scanner estud = new Scanner(System.in);

            System.out.println("Ingrese el nombre del estudiante: ");
            nombreEstudiante = estud.nextLine();

            System.out.println("Ingrese la edad del estudiante: ");
            edadEstudiante = estud.nextInt();

            Estudiante estudiante = new Estudiante(nombreEstudiante, edadEstudiante);

            int opcion;
            do {
                System.out.println("\nMenú de acciones para " + nombreEstudiante + ":");
                System.out.println("1. Estudiar");
                System.out.println("2. Hacer tarea");
                System.out.println("3. Tomar examen");
                System.out.println("4. Registrar calificación");
                System.out.println("5. Mostrar calificaciones");
                System.out.println("6. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = estud.nextInt();

                switch (opcion) {
                    case 1:
                        estudiante.estudiar();
                        break;
                    case 2:
                        estudiante.hacerTarea();
                        break;
                    case 3:
                        estudiante.tomarExamen();
                        break;
                    case 4:
                        System.out.println("Ingrese el índice de la materia (0-4): ");
                        int indice = estud.nextInt();
                        System.out.println("Ingrese la calificación: ");
                        double calificacion = estud.nextDouble();
                        estudiante.registrarCalificacion(indice, calificacion);
                        break;
                    case 5:
                        estudiante.mostrarCalificaciones();
                        break;
                    case 6:
                        System.out.println("Saliendo del programa.");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } while (opcion != 6);
            estud.close();
            break;
        case 6:
            Clases.Vehiculo2 vehiculo1 = new Clases.Vehiculo2("Fiat", "Stilo", 2012);

            vehiculo1.datosVehiculo();
            vehiculo1.acelerar();
            vehiculo1.frear();
            vehiculo1.encender();
            break;
        case 7:
            Libro libro1 = new Libro("El contador de Historias", "Rabih Alameddine", "Lumen");

            libro1.datosLibro();
            libro1.leer();
            libro1.prestar();
            libro1.devolver();
            break;
        case 8:
            Mascota mascota1 = new Mascota("Blanco", "11", "Perro");
            mascota1.datosMascota();
            mascota1.jugar();
            mascota1.comer();
            mascota1.dormir();
            break;
        case 9:
            Clases.Empleado2 empleado1 = new Clases.Empleado2("Sofia", 300000, "UX Designer");
            empleado1.datosEmpleado();
            empleado1.trabajar();
            empleado1.CobrarSalario();
            empleado1.cargo();
    }

    }

    public static void Ejercicio10(){
        String nombreM, razaM, sexoM, fechaNacM, duenioM;
        int edadM;
        Mascotas mascota = new Mascotas(null, null, null, null, null, 0);
        Scanner lectura = new Scanner(System.in);
        List<Mascotas> mascotasRegistradas = new ArrayList<Mascotas>();

        int option = 0; int opcion2 = 0;
        while (true) {
            System.out.println("Bienvenido al sistema de mascotas");
            System.out.println("MENU\n 1. Ingresar mascotas\n 2. Mostrar registro de mascotas\n 3. Actualizar mascota\n 4. Eliminar mascota\n 5. Salir del programa");
            option = lectura.nextInt();
            lectura.nextLine();

            switch (option) {
                case 1:
                    System.out.println("INGRESO DE MASCOTAS");
                    System.out.println("Ingrese el nombre:");
                    nombreM = lectura.nextLine();

                    System.out.println("Ingrese la raza");
                    razaM = lectura.nextLine();

                    System.out.println("Ingrese el género: ");
                    sexoM = lectura.nextLine();

                    System.out.println("Ingrese la fecha de nacimiento: ");
                    fechaNacM = lectura.nextLine();

                    System.out.println("Ingrese el duenio");
                    duenioM = lectura.nextLine();

                    System.out.println("Ingrese la edad");
                    edadM = lectura.nextInt();
                    lectura.nextLine();

                    System.out.println("SISTEMA DE MASCOTAS\n ¿Tipo de animal que ha registrado?\n 1. Perros\n 2. Gatos\n 3.Roedores\n 4. Anfibios\n 5.cardumen\n Salir");
                    opcion2 = lectura.nextInt();
                    switch (opcion2) {
                        case 1:
                            //PERROS
                            Mascotas.Perros perro = mascota.new Perros(nombreM, razaM, sexoM, fechaNacM, duenioM, edadM);
                            perro.setNombreMascota(nombreM);
                            perro.setrazaMascota(razaM);
                            perro.setsexoMascota(sexoM);
                            perro.setfechaNacMascota(fechaNacM);
                            perro.setduenioMascota(duenioM);
                            perro.setedadMascota(edadM);

                            mascotasRegistradas.add(perro);
                            break;
                        case 2:
                            //GATOS
                            Mascotas.Gatos gato = mascota.new Gatos(nombreM, razaM, sexoM, fechaNacM, duenioM, edadM);
                            gato.setNombreMascota(nombreM);
                            gato.setrazaMascota(razaM);
                            gato.setsexoMascota(sexoM);
                            gato.setfechaNacMascota(fechaNacM);
                            gato.setduenioMascota(duenioM);
                            gato.setedadMascota(edadM);

                            mascotasRegistradas.add(gato);
                            break;
                        case 3:
                            System.out.println("ROEDOR");
                            Mascotas.Roedores roedor = mascota.new Roedores(nombreM, razaM, sexoM, fechaNacM, duenioM, edadM);
                            roedor.setNombreMascota(nombreM);
                            roedor.setrazaMascota(razaM);
                            roedor.setsexoMascota(sexoM);
                            roedor.setfechaNacMascota(fechaNacM);
                            roedor.setduenioMascota(duenioM);
                            roedor.setedadMascota(edadM);

                            mascotasRegistradas.add(roedor);
                            break;
                        case 4:
                            System.out.println("ANFIBIO");
                            Mascotas.Anfibios anfibio = mascota.new Anfibios(nombreM, razaM, sexoM, fechaNacM, duenioM, edadM);
                            anfibio.setNombreMascota(nombreM);
                            anfibio.setrazaMascota(razaM);
                            anfibio.setsexoMascota(sexoM);
                            anfibio.setfechaNacMascota(fechaNacM);
                            anfibio.setduenioMascota(duenioM);
                            anfibio.setedadMascota(edadM);

                            mascotasRegistradas.add(anfibio);
                            break;
                        case 5:
                            System.out.println("PECES");
                            Mascotas.Cardumen pez = mascota.new Cardumen(nombreM, razaM, sexoM, fechaNacM, duenioM, edadM);
                            pez.setNombreMascota(nombreM);
                            pez.setrazaMascota(razaM);
                            pez.setsexoMascota(sexoM);
                            pez.setfechaNacMascota(fechaNacM);
                            pez.setduenioMascota(duenioM);
                            pez.setedadMascota(edadM);

                            mascotasRegistradas.add(pez);
                            break;
                        default:
                            System.out.println("Opción no válida");
                            break;
                    }
                    lectura.nextLine();
                    System.out.println("Desea ingresar más mascotas? [s / n]");
                    String response = lectura.nextLine();
                    if (!response.equalsIgnoreCase("s")) {
                        System.out.println("Volviendo al proceso anterior...");
                        break;
                    }
                    break;
                case 2:
                    System.out.println("REGISTRO DE DATOS DE MASCOTAS");
                    for (int i = 0; i < mascotasRegistradas.size(); i++) {
                        System.out.println("Detalles de la mascota " + (i + 1) + ":");
                        mostrarDetallesMascota(mascotasRegistradas.get(i));
                    }
                    break;
                case 3:
                    System.out.println("ACTUALIZAR MASCOTAS");
                    System.out.println("Seleccione el número de la mascota que desea actualizar (o 0 para salir):");
                    int select = lectura.nextInt();

                    if (select >= 1 && select <= mascotasRegistradas.size()) {
                        Mascotas mascotaAActualizar = mascotasRegistradas.get(select - 1);
                        System.out.println("Detalles actuales de la mascota:");
                        mostrarDetallesMascota(mascotaAActualizar);

                        System.out.println("Ingrese los nuevos datos para la mascota:");

                        System.out.println("Ingrese el nombre:");
                        nombreM = lectura.next();
                        mascotaAActualizar.setNombreMascota(nombreM);

                        System.out.println("Ingrese la raza");
                        razaM = lectura.next();
                        mascotaAActualizar.setrazaMascota(razaM);

                        System.out.println("Ingrese si es hembra o macho");
                        sexoM = lectura.next();
                        mascotaAActualizar.setsexoMascota(sexoM);

                        System.out.println("Ingrese el año de nacimiento");
                        fechaNacM = lectura.next();
                        mascotaAActualizar.setfechaNacMascota(fechaNacM);

                        System.out.println("Ingrese el duenio: ");
                        duenioM = lectura.next();
                        mascotaAActualizar.setduenioMascota(duenioM);

                        System.out.println("Ingrese la edad");
                        edadM = lectura.nextInt();
                        mascotaAActualizar.setedadMascota(edadM);
                        lectura.nextLine();

                        System.out.println("Mascota actualizada exitosamente.");

                    } else if (select == 0) {
                        System.out.println("Saliendo del programa.");
                    } else {
                        System.out.println("Número de mascota no válido.");
                    }
                    break;
                case 4:
                    System.out.println("ELIMINAR MASCOTA");
                    for (int i = 0; i < mascotasRegistradas.size(); i++) {
                        System.out.println("Mascota" + (i + 1) + ";");
                        mostrarDetallesMascota(mascotasRegistradas.get(i));
                    }

                    System.out.println("Seleccione el número de la mascota que desee borrar");
                    int seleccion = lectura.nextInt();
                    if (seleccion >= 1 && seleccion <= mascotasRegistradas.size()) {
                        Mascotas mascotaAEliminar = mascotasRegistradas.get(seleccion - 1);
                        System.out.println("¿Seguro que desea borrar el registro de esa mascota?");
                        String confirmacion = lectura.next();

                        if (confirmacion.equalsIgnoreCase("s")) {
                            mascotasRegistradas.remove(mascotaAEliminar);
                            System.out.println("Mascota eliminada de forma exitosa");
                        } else {
                            System.out.println("Mascota no eliminada");
                        }
                    } else if (seleccion == 0) {
                        System.out.println("Saliendo del programa.");
                    } else {
                        System.out.println("Numero de mascota no valido");
                    }
                    break;
                case 5:
                    System.out.println("Se saldrá del programa");
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }

    public static void Ejercicio11(){
        //En el código otorgado:
        abuelo abu = new abuelo(); abu.imprimaTodo();
        abuelo.padre pa = abu.new padre();
        pa.ojos = "verdes";
        pa.setBilleteraPadre("padre333");
        pa.imprimaTodo();
    }
    private static void mostrarDetallesMascota(Mascotas mascota){
        System.out.println("El nombre es: " + mascota.getNombreMascota());
        System.out.println("La raza es: " + mascota.getRazaMascota());
        System.out.println("El sexo es: " + mascota.getSexoMascota());
        System.out.println("La fecha de nacimiento es: " + mascota.getFechaNacMascota());
        System.out.println("El duenio es: " + mascota.getDuenioMascota());
        System.out.println("La edad es: " + mascota.getEdadMascota());
    }

    public static void Ejercicio12(){
        Scanner read = new Scanner(System.in);
        try {
            //int edad = Integer.parseInt("123A4");
            int edad;
            System.out.println("Ingrese la edad: ");
            edad = Integer.parseInt(read.nextLine());
        }
        catch (NumberFormatException nfe) {
            System.out.println("El formato del número es erroneo");
            System.out.println(nfe.getMessage());
        }
        finally{
            System.out.println("Esta línea siempre se imprimirá");
        }
    }


    public static void Ejercicio14(){
        String lastname;
        int DNI = 0;
        double sueldo;
        boolean continuar;
        List<Empleado> empleados = new ArrayList<>();
        Scanner lee = new Scanner(System.in);

        do {
            System.out.println("Ingrese el apellido");
            lastname = lee.nextLine();
            System.out.println("Ingrese el DNI");
            DNI = Integer.parseInt(lee.nextLine());
            System.out.println("Ingrese el sueldo");
            sueldo = Double.parseDouble(lee.nextLine());

            Empleado empl = Empleado.RegistroEmpleado(lastname, sueldo, DNI); // Usar el método estático
            empleados.add(empl);

            if (sueldo <= 180000) {
                System.out.println("Sueldo de categoría A: " + sueldo);
            } else if (sueldo <= 300000) {
                System.out.println("Sueldo de categoría B: " + sueldo);
            } else if (sueldo <= 500000) {
                System.out.println("Sueldo de categoría C: " + sueldo);
            } else {
                System.out.println("Se saldrá del programa");
            }

            String respuesta = JOptionPane.showInputDialog("Desea ingresar más datos? [SI | NO]").toLowerCase();
            continuar = respuesta.equals("si");
        } while (continuar);

        JFrame f = new JFrame();
        f.setTitle("Empleados");

        String[] columnNames = { "Apellido", "DNI", "Categoria" };

        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columnNames);

        for (Empleado empleado : empleados) {
            model.addRow(new Object[]{empleado.getApellido(), empleado.getDni(), empleado.getCategoria()});
        }

        JTable j = new JTable(model);

        JScrollPane sp = new JScrollPane(j);
        f.add(sp);

        f.setSize(500, 200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Busqueda por comparación de DNI
        for (Empleado empleado : empleados) {
            if (empleado.getDni() == DNI) {
                System.out.println("Apellido del Empleado encontrado: " + empleado.getApellido());
                break;
            }
        }
    }
    public static void Ejercicio15(){
        String nombreCompleto, email, telefonoCelular, telefonoFijo, website, CUIT;
        int DNI;
        List<Persona> persona = new ArrayList<>();
        List<Empresa> empresa = new ArrayList<>();

        Scanner leer = new Scanner(System.in);

        while(true){
            System.out.println("Registro de empresas y personas");
            int opt;
            System.out.println((" 1. Agregar Contacto (empresa o persona)\n 2. Mostrar contacto por ID.\n 3. Editar contacto por ID.\n 4. Ver libreta completa.\n 5. Salir"));
            opt = leer.nextInt();

            switch(opt){
                case 1:
                    try {
                        System.out.println("¿Qué desea añadir");
                        System.out.println(" 1. Persona \n 2. Empresa");
                        int calc;
                        calc = leer.nextInt();
                        leer.nextLine();
                        if (calc == 1 || calc == 2) {

                            if (calc == 1) {
                                System.out.println("Registro de Persona");
                                System.out.println("Ingrese nombre y apellido");
                                nombreCompleto = leer.nextLine();
                                nombreCompleto = nombreCompleto.toUpperCase();
                                System.out.println("Ingrese su DNI");
                                DNI = leer.nextInt();
                                leer.nextLine();
                                System.out.println("Ingrese su email");
                                email = leer.nextLine();
                                System.out.println("Ingrese el teléfono");
                                telefonoCelular = leer.nextLine();

                                Contacto persona1 = new Persona.guardarPersonas(nombreCompleto, email, telefonoCelular, DNI);
                                persona1.setNombreCompleto(nombreCompleto);
                                ((Persona) persona1).setEmail(email);
                                ((Persona) persona1).setTelefonoCelular(telefonoCelular);
                                ((Persona) persona1).setDNI(DNI);


                                persona.add((Persona) persona1);
                                System.out.println("Se agregó la persona.");



                            }else if( calc == 2){
                                System.out.println("Registro de Empresa");
                                System.out.println("Ingrese nombre y apellido");
                                nombreCompleto = leer.nextLine();
                                nombreCompleto = nombreCompleto.toUpperCase();
                                System.out.println("Ingrese su CUIT");
                                CUIT = leer.nextLine();
                                System.out.println("Ingrese su sitio web");
                                website = leer.nextLine();
                                System.out.println("Ingrese el teléfono");
                                telefonoFijo = leer.nextLine();

                                Contacto empresa1 = new Empresa.guardarEmpresa(nombreCompleto, telefonoFijo, website, CUIT);
                                empresa1.setNombreCompleto(nombreCompleto);
                                ((Empresa) empresa1).setWebsite(website);
                                ((Empresa) empresa1).setTelefonoFijo(telefonoFijo);
                                ((Empresa) empresa1).setCUIT(CUIT);

                                empresa.add((Empresa) empresa1);
                            }
                        } else {
                            System.out.println("Entrada incorrecta.");
                        }
                    }catch(java.util.InputMismatchException e){
                        System.out.println("Entrada incorrecta");
                    }

                    break;
                case 2:
                    System.out.println("Mostrar contactos por ID");
                    try {
                        System.out.println(" 1. Persona\n 2.Empresa");
                        int most = leer.nextInt();
                        leer.nextLine();
                        if (most == 1) {
                            System.out.println("Mostrar personas por ID");
                            for (int i = 0; i < persona.size(); i++) {
                                System.out.println("ID: " + (i + 1));
                                persona.get(i).mostrarContactos();
                            }
                        } else if (most == 2) {
                            System.out.println("Mostrar empresas por ID");
                            for (int i = 0; i < empresa.size(); i++) {
                                System.out.println("ID: " + (i + 1));
                                empresa.get(i).mostrarContactos();
                            }
                        } else {
                            System.out.println("Entrada incorrecta.");
                        }
                    }catch(java.util.InputMismatchException e){
                        System.out.println("Entrada incorrecta");
                    }
                    break;
                case 3:
                    System.out.println("Editar contacto por ID");
                    try {
                        System.out.println(" 1. Persona\n 2. Empresa");
                        int opti = leer.nextInt();
                        leer.nextLine();
                        if(opti == 1) {
                            System.out.println("Seleccione el ID del contacto que desea editar");
                            int sel = leer.nextInt();
                            leer.nextLine();
                            if (sel >= 1 && sel <= persona.size()) {
                                Persona personaUpdate = persona.get(sel - 1);
                                System.out.println("Detalles actuales de la persona");
                                personaUpdate.mostrarContactos();

                                System.out.println("Ingrese los nuevos datos para el contacto");
                                System.out.println("Ingrese nombre y apellido");
                                nombreCompleto = leer.nextLine();
                                nombreCompleto = nombreCompleto.toUpperCase();
                                personaUpdate.setNombreCompleto(nombreCompleto);
                                System.out.println("Ingrese su DNI");
                                DNI = leer.nextInt();
                                leer.nextLine();
                                personaUpdate.setDNI(DNI);
                                System.out.println("Ingrese su email");
                                email = leer.nextLine();
                                personaUpdate.setEmail(email);
                                System.out.println("Ingrese el teléfono");
                                telefonoCelular = leer.nextLine();
                                personaUpdate.setTelefonoCelular(telefonoCelular);
                                System.out.println("Contacto actualizado correctamente");
                            } else {
                                System.out.println("Opcion inválida");
                            }
                        }else if(opti == 2){
                            System.out.println("Seleccione el ID del contacto que desea editar");
                            int sel = leer.nextInt();
                            leer.nextLine();
                            if (sel >= 1 && sel <= empresa.size()) {
                                Empresa empresaUpdate = empresa.get(sel - 1);
                                System.out.println("Detalles actuales de la persona");
                                empresaUpdate.mostrarContactos();

                                System.out.println("Ingrese los nuevos datos para el contacto");
                                System.out.println("Ingrese nombre y apellido");
                                nombreCompleto = leer.nextLine();
                                nombreCompleto = nombreCompleto.toUpperCase();
                                empresaUpdate.setNombreCompleto(nombreCompleto);
                                System.out.println("Ingrese su CUIT");
                                CUIT = leer.nextLine();
                                empresaUpdate.setCUIT(CUIT);
                                System.out.println("Ingrese su sitio web");
                                website = leer.nextLine();
                                empresaUpdate.setWebsite(website);
                                System.out.println("Ingrese el teléfono");
                                telefonoFijo = leer.nextLine();
                                empresaUpdate.setTelefonoFijo(telefonoFijo);
                                System.out.println("Contacto actualizado correctamente");
                            } else {
                                System.out.println("Opcion inválida");
                            }
                        }
                    }catch(java.util.InputMismatchException e){
                        System.out.println("Entrada incorrecta");
                    }
                    break;
                case 4:
                    System.out.println("Mostrar libreta completa");
                    System.out.println("PERSONAS");
                    if(persona.isEmpty()){
                        System.out.println("No hay personas registradas.");
                    }else {
                        for (int i = 0; i < persona.size(); i++) {
                            System.out.println("ID: " + (i + 1));
                            persona.get(i).mostrarContactos();
                        }
                    }

                    if(empresa.isEmpty()){
                        System.out.println("No hay empresas agregadas.");
                    }else {
                        System.out.println("EMPRESA");
                        for (int i = 0; i < empresa.size(); i++) {
                            System.out.println("ID: " + (i + 1));
                            empresa.get(i).mostrarContactos();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Se saldrá del programa");
                    System.exit(0);
                    break;
            }
            break;
        }
    }
}