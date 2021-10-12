import java.util.Scanner;

public class main {
    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int z1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int z2 = sc.nextInt();
        Vector Vector1 = new Vector(x1, y1, z1);
        Vector Vector2 = new Vector(x2, y2, z2);
        Vector1.add(Vector2);
        System.out.println(Vector1.length());
        System.out.println(Vector1.length());
        System.out.println(Vector1.scalarProduct(Vector2));
        System.out.println(Vector1.crossProduct(Vector2));
        System.out.println(Vector1.cos(Vector2));
        System.out.println(Vector1.add(Vector2));
        System.out.println(Vector1.subtract(Vector2));

    }
}
