import java.util.Scanner;

public class Arreglos {
    Scanner sc = new Scanner(System.in);

    public class Arreglo {

        String[] A;
        int max;
        int n;

        public Arreglo(int m) {
            max = m;
            A = new String[20];
            n = -1;
        }

        public int BuscarLineal(String v) {
            for (int i = 0; i <= n; i++) {
                if (A[i].equalsIgnoreCase(v)) {
                    return i;
                }
                if (A[i].compareToIgnoreCase(v) > 0) {
                    return -1;
                }
            }
            return -1;
        }

        public int BuscarBinario(String v) {
            int inicio = 0;
            int fin = n;

            while (inicio <= fin) {
                int p = (inicio + fin) / 2;

                if (A[p].equalsIgnoreCase(v)) {
                    return p;
                }

                if (v.compareToIgnoreCase(A[p]) > 0) {
                    inicio = p + 1;
                } else {
                    fin = p - 1;
                }
            }

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

            return R;
        }

        public void inicializar() {
            n = -1;
        }

        public int Modificar(String v) {
            int R = Eliminar(v);
            if (R != -1) {
                System.out.println("INGRESE UN VALOR");
                String temp = sc.nextLine();
                insertar(temp);
            }
            return R;
        }
    }

}
