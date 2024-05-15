public class NestedClassSimple {
  class Outer {
    private int outerNonStatic = 10;
    public static int outerStatic = 20;

    static class Inner {
        private static int innerStatic = 30;
        private int innerNonStatic = 40;

        public static void innerStaticMethod() {
            System.out.println("Inner static method:");
            System.out.println("Inner static: " + innerStatic);
            System.out.println("Outer static: " + outerStatic); // Accessing outer static
            // Cannot access outerNonStatic directly
            System.out.println("Outer non-static: " + outerNonStatic); // Compilation error

            // Need an instance of the outer class to access outerNonStatic
            Outer outerInstance = new Outer();
            System.out.println("Outer non-static: " + outerInstance.outerNonStatic);
            Outer.Inner innerInstance = new Outer.Inner();
            System.out.println("Outer non Static" + innerInstance.outerNonStatic);
            System.out.println();
        }
    }
}

}
