package P5;
interface Shape {
    final double PI = 3.14;

    void draw();

    double getArea();

    default public void redraw() {
        System.out.println("----다시그립니다.----");
        draw();
    }
}

class Circle2 implements Shape{
    int num;
    Circle2(int num){
        this.num = num;
    }
    @Override
    public void draw(){
        System.out.print("반지름 "+ this.num);
    }
    @Override
    public double getArea(){
        return PI*num*num;
    }

}

public class ShapeApp{
    public static void main(String [] args){
        Shape coin = new Circle2(10);
        coin.redraw();
        System.out.println("코인의 면적은 " + coin.getArea());
    }
}
