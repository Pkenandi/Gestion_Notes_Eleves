public static class Somme {

  public static void Add(int A, int B) {
    if (A % 2 == 0)
      System.out.println(A + " est paire ");
    else if (A % 2 != 0) {
      System.out.println(A + " est impaire ");
    }

  }

  public static void main() {
    int a, b;

    System.out.println(" Saisir A : ");
    Unit(a);
    System.out.println(" Saisir B : ");
    Unit(b);
    System.out.println(" Est vaut : " + A);

    Add(a, b);

  }
}
