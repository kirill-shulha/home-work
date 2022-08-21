public abstract class Circle extends Figure{
    int radius;
    public Circle(int radius){
        this.radius=radius;
    }
    @Override
    public int getPerimeter(){
        return 2*radius;
    }
}
