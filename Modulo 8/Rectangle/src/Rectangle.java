public class Rectangle {

    public double height;
    public double widght;

    public Rectangle(double height, double widght) {
        this.height = height;
        this.widght = widght;
    }
    public double Area(){
        return height*widght;
    }
    public double Perimeter(){
        return 2*(height+widght);
    }
    public double Diagonal(){
        return Math.sqrt(Math.pow(height,2)+Math.pow(widght,2));
    }
}
