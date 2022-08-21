public abstract class Rectangle extends Figure{
    int a;
    int b;

    public Rectangle(int a, int b){
        this.a=a;
        this.b=b;


    }
    @Override
    public int getPerimeter(){
        return (a+b*2);
    }
    @Override
    public int getSquare(){
        return (int) (a*b);
    }
    }

