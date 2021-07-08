package lambdaex;

public class MyFunctionTest {
    public static void main(String[] args) {
        MyFunction f = () -> {};
        MyFunction f1 = (MyFunction) (() -> {});

        //Object obj = (Object) (() -> {});
        Object obj1 = (Object)(MyFunction) (() -> {});
        String str = ((Object)(MyFunction) (() -> {})).toString();
    }
}
