package objetos.parcial3.intro;

public class Rectangle {

    private int base;
    private int height;

    public Rectangle(int base, int height){
        this.base = base;
        this.height = height;
    }

    public int getBase(){return base;}
    public int getHeight(){return height;}

    public double getArea(){
        return base * height;
    }

    public double getPerimeter(){
        return 2 * base + 2 * height;
    }
}
