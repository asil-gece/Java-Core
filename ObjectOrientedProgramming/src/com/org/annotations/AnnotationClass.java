package com.org.annotations;

@AnnotationExample(name = "Max", lastName = "Thunder",age = 28)
public class AnnotationClass {
   @AnnotationExample(name = "Henry",lastName = "Brown", age = 45)
    String middleName;
    @AnnotationExample(name = "John", lastName = "Black",age = 30)
    void method(){}


}
