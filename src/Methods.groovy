class Methods {

    static void main(String[] args) {

        sayHello();

        // In groovy we always pass by value
        def myName = "Marcin";
        passByValue(myName);
        println("In Main: " + myName);

        def listToDouble = [1,2,3,4];
        listToDouble = doubleList(listToDouble);
        println(listToDouble);

        def nums = sumAll(1,2,3,4);
        println("Sum: " + nums);

        def fact4 = factorial(4);
        println("Factorial 4: " + fact4);
    }

    static def sayHello() {
        println("Hello")

        println("5 + 4 = " + getSum(5,4));
    }

    static def getSum(num1=0, num2=0) {
        return num1 + num2;
    }

    static def passByValue(name) {
        name = "In Function";
        println("Name: " + name);
    }

    static def doubleList( list ) {
        def newList = list.collect { it * 2 }; // closure
        return newList;
    }

    static def sumAll(int... num) {
        def sum = 0;
        num.each {sum += it }
        return sum;
    }

    // recursion
    static def factorial(num) {
        if(num <= 1) {
            return 1;
        } else {
            return (num * factorial(num - 1));
        }
    }
}
