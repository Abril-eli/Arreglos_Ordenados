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

        public int Buscar(String v) {
            for (int i = 0; i <= n; i++) {
                if (A[i].equalsIgnoreCase(v)) {
                    return i;
                }
            }

            return -1;
        }

        public int Eliminar(String v) {
            int R = Buscar(v);

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
