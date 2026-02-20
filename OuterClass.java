class OuterClass {

    private String message = "Hello from Outer Class";

    // Inner Class
    class InnerClass {
        void display() {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {

        // Creating outer class object
        OuterClass outer = new OuterClass();

        // Creating inner class object
        OuterClass.InnerClass inner = outer.new InnerClass();

        inner.display();
    }
}
