public class Main{
    public static void main(String args[]){
        Shape circle = new Circle();
        NamePrinter namePrinter = new NamePrinter(circle);
        namePrinter.printName();

    }
}