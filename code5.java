public class code5 {
   public code5() {
   }

   public static int add(int var0, int var1) {
      return var0 + var1;
   }

   public static int add(int var0, int var1, int var2) {
      return var0 + var1 + var2;
   }

   public static void main(String[] var0) {
      int var1 = add(10, 20);
      int var2 = add(10, 20, 30);
      System.out.println(var1);
      System.out.println(var2);
   }
}