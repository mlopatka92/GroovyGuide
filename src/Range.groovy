class Range {

    static void main(String[] args) {

        def oneTo10 = 1..10;
        def aToZ = 'a'..'z';
        def zToA = 'z'..'a';

        println(oneTo10);
        println(aToZ);
        println(zToA);

        println("Size " + oneTo10.size());
        println("Size " + aToZ.size());
        println("Size " + zToA.size());

        println("Contains 11 " + oneTo10.contains(11));
        println("Get Last " + oneTo10.getTo());
        println("Get First " + oneTo10.getFrom());
    }
}
