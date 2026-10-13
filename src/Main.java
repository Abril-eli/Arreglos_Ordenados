public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    boolean cont = true;
    Arreglos arreglo = new Arreglos(20);

    while (cont == true) {

        System.out.println("1. Inicializar Arreglo");
        System.out.println("2. Mostrar Arreglo");
        System.out.println("3. Buscar en Arreglo");
        System.out.println("4. Insertar");
        System.out.println("5. Eliminar ");
        System.out.println("6. Modificar Arreglo");
        System.out.println("7. Creditos");
        System.out.println("0. Salir");
        int opc = sc.nextInt();
        sc.nextLine();

        switch (opc) {
            case 1:
                System.out.println(" ---Inicializar Arreglo--- ");
                arreglo.inicializar();
                break;
            case 2:
                System.out.println(" ---Mostrar Arreglo--- ");
                arreglo.mostrar();
                break;
            case 3:
                System.out.println(" ---Buscar en Arreglo--- ");
                System.out.println(" ingresa la palabra a buscar ");
                String palabra = sc.nextLine();

                System.out.println("1. busqueda lineal");
                System.out.println("2. busca binaria");
                System.out.println(" ingrese tipo de busqueda ");
                int busqueda = sc.nextInt();
                sc.nextLine();
                switch (busqueda) {
                    case 1:
                        System.out.println(" ---busqueda lineal---");
                        arreglo.BuscarLineal(palabra);
                        break;
                    case 2:
                        System.out.println(" ---busqueda binaria---");
                        arreglo.BuscarBinario(palabra);
                        break;
                    default:
                        System.out.println("selecciona una opcion valida");
                }
                break;
            case 4:
                System.out.println(" ---Insertar---");
                System.out.println(" ingresa la palabra a Insertar");
                String palabraInsertar = sc.nextLine();
                arreglo.insertar(palabraInsertar);
                break;
            case 5:
                System.out.println(" ---Eliminar---");
                System.out.println(" ingresa la palabra a Eliminar");
                String palabraEliminar = sc.nextLine();
                arreglo.Eliminar(palabraEliminar);
                break;
            case 6:
                System.out.println(" ---Modificar---");
                System.out.println(" ingresa la palabra a Modificar");
                String palabraModificar = sc.nextLine();
                arreglo.Modificar(palabraModificar);
                break;
            case 7:
                System.out.println(" ---Creditos---");
                System.out.println("---Materia---");
                System.out.println("Estructura de Datos");
                System.out.println("---Integrantes---");
                System.out.println(" Sebastian Chavarria Gomez" +  " Mat: 24170144");
                System.out.println(" Saul Abimael Ochoa Gonzalez"+ " Mat: 25420166");
                System.out.println(" Abril Elizabeth Guillen Vargas"+ "Mat:");
                break;

            case 0:
                cont = false;
                System.out.println(" saliendo");
                break;
            default:
                System.out.println("selecciona una opcion valida");
                break;
        }
    }
}