package P5;

class Point{
    private int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    protected void move(int x, int y){
        this.x = x;
        this.y = y;
    }
}


public class ColorPoint extends Point{
    String Color;
    public ColorPoint(int x, int y, String color){
        super(x,y);
        this.Color = color;
    }

    public void setPoint(int x, int y){
        super.move(x, y);
    }

    public void setColor(String color){
        this.Color = color;
    }

    public void show(){
        System.out.println(Color+"색으로"+"("+super.getX()+","+super.getY()+")");
    }

    public static void main(String[] args){
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setPoint(10, 20);
        cp.setColor("GREEN");
        cp.show();
    }
}
