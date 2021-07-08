package genericex;

import java.awt.dnd.DragGestureEvent;

class GenericExampleTest {
    public static void main(String[] args) {
        GenericTest<Student> genericStudent = new GenericTest<>();
        GenericTest<String> genericTest = new GenericTest<>();
        genericTest.doSomeThing(new GenericTest<Student>());
    }
}
class Student {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
public class GenericTest<T> {
    T GenericTest;

    public GenericTest() {
    }

    public T getGenericTest() {
        return GenericTest;
    }

    public void setGenericTest(T genericTest) {
        GenericTest = genericTest;
    }

    public void doSomeThing(GenericTest<? super Student> gt) {
        System.out.println(gt);
    }
}
