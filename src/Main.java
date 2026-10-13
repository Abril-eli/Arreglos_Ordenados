public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int opc = sc.nextInt();
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
                System.out.println(" ingrese tipo de busqueda ");
                int busqueda = sc.nextInt();
                switch (busqueda) {
                    case 1:
                        System.out.println(" ---busqueda lineal---");
                        arreglo.BuscarLineal(palabra);


                }

        }
    }
}