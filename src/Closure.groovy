class Closure {

    // Closure represents a block of code that can accept a parameter and can be passed into methods

    static void main(String[] args) {

        // call -> call method one more time
        def getFactorial = {num -> (num <= 1 ? 1 : num * call(num -1))}

        println("Factorial 4: " + getFactorial(4));

        // Closure can get methods outside of it
        def greeting = "Goodbye";

        def sayGoodbye = { theName -> println( "$greeting $theName" )};
        sayGoodbye("Marcin")

        def numList = [1,2,3,4];
        numList.each {print((it + " "))}

        def employees = [
                'Paul': 34,
                'Sally': 35,
                'Sam': 36
        ];

        println();
        employees.each {println("$it.key : $it.value");}

        def randNums = [1,2,3,4,5,6];
        randNums.each {num -> if (num % 2 == 0) print(num + " ")};
        println();

        def nameList = ["Doug", "Sally", "Sue"];

        def matchEl = nameList.find {item -> item == "Sue" }
        println(matchEl);

        def randNumList = [1,2,3,4,5,6];
        def numMatches = randNumList.findAll(item -> item > 4);
        println(numMatches);

        println("Any > 5 : " + randNumList.any{item -> item > 5});
        println("All > 1 : " + randNumList.every{item -> item > 1});

        println("Double: " + randNumList.collect{item -> item * 2});
        println("Double: " + randNumList.collect{item -> item * 2});

        def getEven = {num -> return (num % 2 == 0)}
        def evenNums = listEdit(randNumList, getEven);
        println("Evens: " + evenNums);
    }

    static def listEdit(list, clo) {
        return list.findAll(clo);
    }
}
