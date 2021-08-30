class SimpleVariables {

    // Source: https://www.youtube.com/watch?v=B98jc8hdu9g&ab_channel=DerekBanas
    static void main(String[] args) {

        println("Hello World!");

        def age = "dog";
        println(age);
        age = 40;
        println(age);

        // Integer operations

        println("5 + 4 = " + (5 + 4));
        println("5 - 4 = " + (5 - 4));
        println("5 * 4 = " + (5* 4));
        println("5 / 4 = " + (5.intdiv(4)));
        println("5 % 4 = " + (5 % 4));

        // Floating point operators

        println("5.2 + 4.4 = " + (5.2.plus(4.4)));
        println("5.2 - 4.4 = " + (5.2.minus(4.4)));
        println("5.2 * 4.4 = " + (5.2.multiply(4.4)));
        println("5.2 / 4.4 = " + 5.2 / 4.4);

        // Order of operations

        println("3 + 2 * 5 = " + (3 + 2 *5));

        // Incrementation and decrementation

        println("age++ = " + (age++));
        println("++age = " + (++age));
        println("age-- = " + (age--));
        println("--age = " + (--age));

        println("Biggest Int " + Integer.MAX_VALUE);
        println("Smallest Int " + Integer.MIN_VALUE);

        println("Biggest Float " + Float.MAX_VALUE);
        println("Smallest Float " + Float.MIN_VALUE);

        println("Biggest Double " + Double.MAX_VALUE);
        println("Smallest Double " + Double.MIN_VALUE);

        // Decimal accurycy in groovy example

        println(1.000000000000000000000000000000011111111111111 + 1.000000000000000000000000000000011111111111111);

        def randNum = 2.0;
        println("Math.abs(-2.45) = " + (Math.abs(-2.45)));
        println("Math.round(2.45) = " + (Math.round(2.45)));
        println("Math.round(2.55) = " + (Math.round(2.55)));
        println("randNum.pow(3) = " + (randNum.pow(3)));
        println("3.0.equals(2.0) = " + 3.0.equals(2.0));
        println("randNum.equals(Float.NaN) = " + (randNum.equals(Float.NaN)));
        println("Math.sqrt(9) = " + (Math.sqrt(9)));
        println("Math.cbrt(27) = " + (Math.cbrt(27)));
        println("Math.ceil(2.45) = " + Math.ceil(2.45));
        println("Math.floor(2.45) = " + (Math.floor(2.45)));
        println("Math.min(2,3) = " + Math.min(2, 3));
        println("Math.max(2,3) = " + Math.max(2, 3));

        println("Math.log(2) = " + Math.log(2));
        println("Math.log10(2) = " + Math.log10(2));

        println(Math.abs(new Random().nextInt() % 100) + 1);


        def name = "Marcin";

        println('I am ${name}\n');
        println("I am ${name}\n"); // Convention is to use {}
        println("I am $name\n");

        def multilineString = '''I am
        a String
        that goes on
        form many lines'''

        println(multilineString);

        println("3rd Inxdex of Name " + name[3]);
        println("Index of r " + name.indexOf('r'));

        println("1st 3 Chars " + name[0..2]);
        println("Every Other Character " + name[0,2,4]);

        println("Substring at 1 " + name.substring(1));
        println("Substring at 1 to 4 " + name.substring(1,4));

        println("My Name " + name);
        println("My Name ".concat(name));

        println("What I Said is " * 2); //double up string
        println("Marcin == Marcin " + 'Marcin'.equals('Marcin'))
        println("marcin == marcin " + 'Marcin'.equalsIgnoreCase('marcin'))

        println("Length " + name.length());

        def repeatStr = "What I said is " * 2;

        println(repeatStr - " What");
        println(repeatStr.split(' '));
        println(repeatStr.toList());

        println(repeatStr.replaceAll('I', 'she'));
        println("Uppercase " + name.toUpperCase());
        println("Lowercase " + name.toLowerCase());

        // <=> - compare strings:
        // -1 - first string comes before second
        // 1 - opposite
        // 0 - equals

        println("Ant <=> Banana " + ('Ant' <=> 'Banana'))
        println("Banana <=> Ant " + ('Banana' <=> 'Ant'))
        println("Ant <=> Ant " + ('Ant' <=> 'Ant'))
    }
}
