
class NamePrinter{
    private final Shape shape;
    public NamePrinter(Shape shape){
            this.shape = shape;
        }public void printName(){
            System.out.println(shape.getName());
        }
}

