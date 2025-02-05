public class Main {
    public static void main(String[] args) {
        Box<String> myStringBox = new Box<>();
        myStringBox.setItem("Hello");
        myStringBox.getItem();

        Box<Double> myDoubleBox = new Box<>();
        myDoubleBox.setItem(3.14);

        
    }
}
