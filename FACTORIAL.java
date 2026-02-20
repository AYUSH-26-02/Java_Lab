class Factorial {

    private final int num = 2;  

    public int calculateFactorial() {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact; } 

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        System.out.println("Factorial is: " + obj.calculateFactorial());
    }
}
