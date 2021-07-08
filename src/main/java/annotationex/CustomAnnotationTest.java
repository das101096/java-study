package annotationex;

public class CustomAnnotationTest {
    public static void main(String[] args) {

    }

    @CustomAnnotation(testDocument = "document test")
    public void testDocument() {}

    @CustomAnnotationNoDocument(testDocumentNoDocument = "document test")
    public void testNoDocument() {}


}
