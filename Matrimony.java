// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class Matrimony {
   public Matrimony() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the Gender (M/F):");
      char var2 = var1.next().charAt(0);
      System.out.println("Enter the Age:");
      int var3 = var1.nextInt();
      if (var2 != 'M' && var2 != 'F') {
         System.out.println("Invalid input");
      } else if (var2 == 'M') {
         if (var3 >= 21) {
            System.out.println("Eligible");
         } else {
            System.out.println("Not Eligible");
         }
      } else if (var3 >= 18) {
         System.out.println("Eligible");
      } else {
         System.out.println("Not Eligible");
      }

   }
}
