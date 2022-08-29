package by.teachmeskills.classwork.lesson10;

public class MainClass5 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("MyString: ");
        builder.append("this ").append("is ").append("my "+"house ");

        builder.insert(10, "ooph ");
        builder.delete(0, 8);
        //builder.deleteCharAt(8);
        String result = builder.toString();
        System.out.println(result);

        //System.out.println(builder.reverse().toString());
    }
}
