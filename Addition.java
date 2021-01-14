public class Addition {

    private static int A;
    private static int B;

    public Addition(int a, int b) {
        A = a;
        B = b;
    }

    public static int Somme(int a, int b) {
        return (a + b);
    }

    public static void main(String[] args) {
        A = 5;
        B = 10;

        int S = Somme(A, B);

        system.out.println(" La somme de " + A + " + " + B + " est " + S);

    }

}