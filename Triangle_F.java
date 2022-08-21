public abstract class Triangle_F extends Figure {
int a;
int b;
int c;
    public Triangle_F(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;

    }
    @Override
    public int getPerimeter(){
        return (a+b+c);
    }
    @Override
    public int getSquare(){
        return (int) (a*b/2);
    }
}


