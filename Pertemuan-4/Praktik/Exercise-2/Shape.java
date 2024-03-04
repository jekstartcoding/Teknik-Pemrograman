public class Shape{
    private String color;
    private boolean filled;

    //setter attribute color
    public void setColor(String color) {
        this.color = color;
    }

    //setter attribute filled
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    //getter attribute color
    public String getColor() {
        return color;
    }

    //getter attribute Filled
    public boolean isFilled() {
        return filled;
    }

    //constructor with 0 args
    public Shape(){
        this.color="green";
        this.filled=true;
    }

    //constructor with args color and filled
    public Shape(String Color, boolean Filled){
        this.color=Color;
        this.filled=Filled;
    }

    //method toString
    public String toString(){
        return "Shape[color = "+getColor()+", filled = "+isFilled()+"]";
    }

    //main untuk melakukan tes terhadap attributes dan method yang sudah dibuat
    public static void main(String[] args) {
        Shape s = new Shape();
        String p;
        p=s.toString();
        System.out.println(p);
    }
}