public class Main {
    public static void main(String[] args) {
        AbstractDisplay charDisplay = new CharDisplay('H');
        AbstractDisplay stringDisplay = new StringDisplay("hello,java");

        charDisplay.display();
        stringDisplay.display();
    }
}
