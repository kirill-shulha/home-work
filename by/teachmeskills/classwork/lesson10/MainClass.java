package by.teachmeskills.classwork.lesson10;

public class MainClass {
    public static void main(String[] args) {
        String str = "a";
        String str2 = "b";
        System.out.println(str==str2);
        String str3 = new String("a");
        System.out.println(str==str3);
        System.out.println(str.equals(str3));
        System.out.println(str.length());

        String nextStr = str+str2;
        System.out.println(nextStr);
        String nextStr2 = str.concat(str2);
        System.out.println(nextStr2);
        String nextStr3 = String.join("///",str,str2,str3);
        System.out.println(nextStr3);

        int newInt = 5;
        String mixedString = newInt+str;
        String mixedString2 = str + newInt;
        System.out.println(mixedString);
        System.out.println(mixedString2);
        String mixedString3 = (newInt+newInt)+str;
        System.out.println(mixedString3);

    }
}
