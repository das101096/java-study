package annotationex;

import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AnnotationExClassTest {
    public static void main(String[] args) {
        AnnotationExClass annotationExClass = new AnnotationExClass();
        Field[] declaredFields = annotationExClass.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.print(declaredField.getName());
            Annotation[] declaredAnnotations = declaredField.getDeclaredAnnotations();
            for (Annotation declaredAnnotation : declaredAnnotations) {
                AnnotationTest declaredAnnotation1 = (AnnotationTest) declaredAnnotation;
                System.out.println(declaredAnnotation1.name());
            }
        }
    }
}
