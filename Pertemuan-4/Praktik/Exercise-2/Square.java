public class Square extends Rectangle{
    //constructor #1 with no args
    public Square(){
        super();
    }

    //constructor #2 with side args
    public Square(double side){
        super(side, side);
    }

    //constructor #3 with side, col and fill args
    public Square(double side, String col, boolean fill){
        super(side, side, col, fill);
    }

    //Side setter
    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    //side getter (bebas menggunakan width/length karena keduanya bernilai sama)
    public double getSide(){
        return super.getLength();
    }

    //override toString method
    @Override
    public String toString(){
        return "A square with side = "+getSide()+", Which is a subclass of "+super.toString();
    }

    //override getArea method
    @Override
    public double getArea(){
        return getSide()*getSide();
    }

    //override getPerimeter method
    @Override
    public double getPerimeter(){
        return getSide()*4;
    }

    //main untuk melakukan tes terhadap attributes dan method yang sudah dibuat
    public static void main(String[] args) {
        Square s = new Square(5);
        String p = s.toString();
        double luas,kel;
        System.out.println(p);
        kel=s.getPerimeter();
        luas=s.getArea();
        System.out.println("Luas = "+luas+"\nKeliling = "+kel);
    }
}
