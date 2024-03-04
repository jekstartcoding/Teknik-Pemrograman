public class Rectangle extends Shape{
    private double width;
    private double length;

    //getter attributes width
    public double getWidth() {
        return width;
    }

    //setter attribute width
    public void setWidth(double width) {
        this.width = width;
    }

    //getter attribute length
    public double getLength() {
        return length;
    }

    //setter attribute length
    public void setLength(double length) {
        this.length = length;
    }

    //constructor #1 with no arg
    public Rectangle(){
        super();
        this.width=1.0;
        this.length=1.0;
    }

    //constructor #2 with arg width and length
    public Rectangle(double Width, double Length){
        super();
        this.width=Width;
        this.length=Length;
    }

    //constructor #3 with arg width, length, color and fill
    public Rectangle(double Width, double Length, String Color, boolean Fill){
        super(Color, Fill);
        this.width=Width;
        this.length=Length;
    }

    //method getArea
    public double getArea(){
        return getLength()*getWidth();
    }

    //method getPerimeter
    public double getPerimeter(){
        return 2*(getLength()+getWidth());
    }

    @Override
    public String toString(){
        return "A rectangle with width = "+getWidth()+", And length = "+length+", Which is a subclass of "+super.toString();
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        String s = r.toString();
        double luas = r.getArea();
        double keliling = r.getPerimeter();
        System.out.println(s);
        System.out.println("Luas = "+luas+"\nKeliling = "+keliling);
    }
}