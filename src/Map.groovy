class Map {

    static void main(String[] args) {

        def paulMap = [
                'name': 'Paul',
                'age': 35,
                'address': '123 Main St',
                'list': [1,2,3]
        ];

        println("Name: " + paulMap['name']);
        println("Age: " + paulMap.get('age'));
        println("List item: " + paulMap['list'][1]);

        paulMap.put('city', 'Kraków');
        println("Has City " + paulMap.containsKey('city'));
        println("Size " + paulMap.size());
    }
}
