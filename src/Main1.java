import com.zlm.test1.CollectionTest;
import com.zlm.test1.Student;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Student student1 = new Student();
        System.out.println("name:" + student1.name + "," + "age=" + student1.getAge());

        Student student2 = new Student("zlm", 28);
        System.out.println("name:" + student2.name + "," + "age=" + student2.getAge());
        student2.love("wdd");

        Integer age = 10;
        int age1 = 20;
        String name = "dddd";
        String name1 = new String("ddd");

        CollectionTest.testArray();
    }
}