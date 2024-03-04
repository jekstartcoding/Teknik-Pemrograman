public class Circle extends Shape{
    private double radius;

    //radius attribute getter
    public double getRadius() {
        return radius;
    }

    //radius attribute setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //constructor without arg
    public Circle(){
        super();
        this.radius=1.0;
    }

    //constructor with radius arg
    public Circle(double Rad){
        super();  
        this.radius=Rad;
    }

    //constructor with radius, color and fill arg
    public Circle(double Rad, String col, boolean fill){
        super(col, fill);
        this.radius=Rad;
    }

    //method baru getPerimeter untuk mendapatkan keliling
    public double getPerimeter(){
        return 2*Math.PI*getRadius();
    }

    //method baru getArea untuk mendapatkan luas
    public double getArea(){
        return Math.PI*getRadius()*getRadius();
    }

    @Override
    public String toString(){
        return "A circle with radius = "+getRadius()+", Which is a subclass of "+super.toString();
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        String s = c.toString();
        double luas = c.getArea();
        double keliling = c.getPerimeter();
        System.out.println(s);
        System.out.println("Luas = "+luas+"\nKeliling = "+keliling);
    }
}
