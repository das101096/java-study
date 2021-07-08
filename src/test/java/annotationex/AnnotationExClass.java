package annotationex;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AnnotationExClass {
    @AnnotationTest
    private String defaultName;

    @AnnotationTest(name="babo")
    private String customName;

    public AnnotationExClass() {
        this.defaultName = "daseul";
        this.customName = "daseul";
    }

    public String getDefaultName() {
        return defaultName;
    }
}
