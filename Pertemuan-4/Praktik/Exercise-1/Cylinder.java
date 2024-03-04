public class Cylinder extends Circle{
    private double height;

    //constructor with default color, radius, and height
    public Cylinder(){
        super();        //call superclass no-arg constructor
        height= 1.0;
    }

    //Constructor with default radius, color but given height
    public Cylinder (double Height){
        super();
        this.height=Height;
    }

    //Constructor with default color, but given radius and height
    public Cylinder(double radius, double Height){
        super(radius);
        this.height=Height;
    }

    public double getHeight(){
        return height;
    }

    @Override
    public double getArea() {
        return (2*Math.PI*getRadius()*height)+(2*super.getArea());
    }

    @Override
    public String toString(){
        return "Cylinder: Subclass of "+super.toString()+" height = "+height;
    }

    //A public for computing the volume of cylinder
    //use superclass method getArea() to get the base area
    public double getVolume(){
        return super.getArea()*height;
    }
}
