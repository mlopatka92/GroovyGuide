class MoreComplexStuff {

    static void main(String[] args) {

        def randString = "Random";

        // Format data

        println("A $randString string");
        printf("A %s string \n", randString);
        printf("%-10s %d %.2f %10s \n", ['Stuff', 10, 1.234, 'Random2']);

        // Input

        print("Whats your name ");
        def fName = System.console().readLine(); // When running app from terminal
        println("Hello " + fName);

        print("Enter a number ");
        def num1 = System.console().readLine().toDouble();
        print("Enter a number ");
        def num2 = System.console().readLine().toDouble();

        printf("%.2f + %.2f = %.2f \n", [num1, num2, (num1 + num2)]);
    }
}
