class Looping {

    static void main(String[] args) {

        def i = 0;

        print("While loop values: ")

        while (i < 10) {
            if (i % 2) {
                i++;
                continue;
            }
            if (i == 8) {
                break;
            }

            print(i + " ");
            i++;
        }

        println();
        print("For loop values: ");

        for(i = 0; i < 5; i++) {
            print(i + " ");
        }

        println();
        print("For loop (range) values: ");

        for(j in 2..6) {
            print(j + " ");
        }

        def randList = [10,12,13,14];

        println();
        print("For each values: ");

        for(j in randList) {
            print(j + " ");
        }

        println();
        print("Map Values: \n");

        def custs = [
                100 : "Paul",
                101: "Sally",
                102: "Sue"
        ];

        for(cust in custs) {
            println("$cust.value : $cust.key");
        }
    }
}
