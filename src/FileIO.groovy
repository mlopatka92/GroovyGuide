class FileIO {

    static void main(String[] args) {

        // Command will work with cmd line level having context in src dir
        new File("text.txt").eachLine {
            line -> println("$line");
        }

        new File("text.txt").withWriter ('utf-8') {
            writer -> writer.writeLine("Line 4");
        }

        File file = new File("text.txt");
        file.append("Line 5")

        println("Display file text: ")
        println(file.text);

        println("File Size: ${file.length()} bytes");
        println("File: ${file.isFile()}");
        println("Dir: ${file.isDirectory()}");

        def newFile = new File("test2.txt");
        newFile << file.text;

        newFile.delete();

        def dirFiles = new File("").listRoots();

        dirFiles.each {
            item -> println file.absolutePath;
        }
    }
}
