package annotationex;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface AnnotationTest {
    String name() default "reflection";
}
