class Operators {

    static void main(String[] args) {
        // Comparision operators:
        // == != > < >= <=

        // Logical operators
        // && || !

        def ageOld = 6;
        if (ageOld == 5) {
           println("Go to kindergarten")
        } else if((ageOld > 5) && (ageOld < 18)) {
            printf("Go to grade %d \n", (ageOld - 5));
        } else {
            println("Go to College");
        }

        def canVote = true;

        println(canVote ? "Can Vote" : "Can't Vote");

        //checking 16 and 18 if there is no break
        switch (ageOld) {
            case 16: println("You can drive");
            case 18:
                println("You can vote");
                break;
            default: println("Have Fun");
        }

        switch (ageOld) {
            case 0..6: println("Child"); break;
            case 7..12: println("Teenager"); break;
            case 13..18: println("Young Adult"); break;
            break;
            default: println("Adult");
        }
    }
}
