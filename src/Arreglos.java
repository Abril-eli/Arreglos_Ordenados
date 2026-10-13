import java.util.Random;
import java.util.Scanner;

public class Arreglos {
    Scanner sc = new Scanner(System.in);



        String[] A;
        int max;
        int n;

        public Arreglos(int m) {
            max = m;
            A = new String[20];
            n = -1;
        }

        public int BuscarLineal(String v) {
            for (int i = 0; i <= n; i++) {
                if (A[i].equalsIgnoreCase(v)) {
                    System.out.println(" palabra encontrada en la localidad " + (i + 1));
                    return i;
                }
                if (A[i].compareToIgnoreCase(v) > 0) {
                    System.out.println(" no existe la palabra en el arreglo ");
                    return -1;
                }
            }
            System.out.println(" no existe la palabra en el arreglo ");
            return -1;
        }

        public int BuscarBinario(String v) {
            int inicio = 0;
            int fin = n;

            while (inicio <= fin) {
                int p = (inicio + fin) / 2;

                if (A[p].equalsIgnoreCase(v)) {
                    System.out.println(" palabra encontrada en la localidad " + (p + 1));
                    return p;
                }

                if (v.compareToIgnoreCase(A[p]) > 0) {
                    inicio = p + 1;
                } else {
                    fin = p - 1;
                }
            }
            System.out.println("No existe dicha palabra en el arreglo");

            return -1;
        }


        public int Eliminar(String v) {
            int R = BuscarBinario(v);

            if (R == -1) {
                System.out.println("No existe el valor");
                return -1;
            }
            for (int i = R; i <= n - 1; i++) {
                A[i] = A[i + 1];
            }
            n = n - 1;
            System.out.println("Elemento eliminado de la localidad: " + R);
            return R;
        }

        public void inicializar() {
            n = -1;
            System.out.println("arreglo inicializado");
        }

        public int Modificar(String v) {
            int R = Eliminar(v);
            if (R != -1) {
                System.out.println("Ingrese un valor ");
                String temp = sc.nextLine();
                insertar(temp);
            }
            return R;
        }

        public void insertar (String v) {
            if (n == max-1) {
                System.out.println("Arreglo lleno");
            }
            else {
                int i = n;
                while (i >= 0 && v.compareToIgnoreCase(A[i]) < 0) {
                    A[i + 1] = A[i];
                    i--;
                }
                A[i + 1] = v;
                n++;
                System.out.println("Elemento insertado en la localidad " + (i+1));
                }
        }

        public void mostrar() {
            if (n == -1) {
                System.out.println(" Arreglo vacio");
            }
            else {
                for (int i = 0; i <= n; i++) {
                    System.out.println(i +" "+ A[i]);
                }
            }
        }
    }


