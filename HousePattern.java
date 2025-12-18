public class HousePattern {
    public static void main(String[] args) {
        int n = 5;
        // Roof (Triangle)
        for (int i = 1; i <= n; i++) {
            for (int s = n; s > i; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        // Body (Square)
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= (2 * n - 1); j++) {
                if (j == 1 || j == (2 * n - 1) || i == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
