public class TestClassJT{
    public static void main(String[] args){
        JobTitle[]arr2=new JobTitle[3];
        arr2[0]=new Director();
        arr2[1]=new Worker();
        arr2[2]=new accountant();
        for (JobTitle jt : arr2){
            jt.JobTitle();
        }
        System.out.println("Let's work");
    }

}
