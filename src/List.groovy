class List {

    static void main(String[] args) {

        // list
        def primes = [2,3,5,7,11,13];

        println("2nd Prime " + primes[1]);
        println("3nd Prime " + primes.get(2));

        def employee = ['Marcin', 40, 6.25, [1,2,3]];
        println("2nd Number " + employee[3][1]);
        println("Length " + primes.size());

        primes.add(17);

        primes<<19;
        primes.add(23);

        println(primes + [29,31]);

        println(primes - [23, 29]);

        println("Is Empty " + primes.isEmpty());
        println("1st 3 " + println([0..2]));

        println(primes);

        println("Matches " + primes.intersect([2,3,7]));
        println("Reverse " + primes.reverse());
        println("Sort " + primes.sort());

        println(primes);

        println("First " + primes.pop());
        println(primes.push(25));
        println(primes.add(29));

        for(def number : primes) {
            print(number + ", ");
        }

        println(primes);

        println("Last element: " + [9,2,4].removeLast());

    }
}
