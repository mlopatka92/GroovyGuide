class Objects {

    static void main(String[] args) {
        // When constructor is not present we can pass typed-parameters
        // def king = new Animal(name: 'King', sound: 'Growl');

        def king = new Animal('King', 'Growl');

        println("$king.name says $king.sound");

        king.setSound('Grrrrrr');

        println("$king.name says $king.sound");

        king.run();

        println(king.toString());

        def grover = new Dog('Grover', 'Grrrr', 'Marcin');
        king.makeSound();
        grover.makeSound();

    }
}
