package lambdaex;

import java.util.function.Function;

class Outer {
    int val = 10;
    static int staticVal = 0;

    class Inner {
        void method(int i) {
            int innerval = 30;

            MyFunction f = () -> {
                System.out.println(i);
                System.out.println(val);
                System.out.println(innerval);
                System.out.println(staticVal);
                System.out.println(this.getClass());

                val = 456;
                //innerval = 123;
                staticVal = 789;
            };
            f.run();
        }
    }

}
public class CaptureEx {
    public static void main(String[] args) {
        Outer.Inner testClass = new Outer().new Inner();
        testClass.method(100);
    }
}
