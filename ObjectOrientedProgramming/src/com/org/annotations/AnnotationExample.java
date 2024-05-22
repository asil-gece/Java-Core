package com.org.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.PACKAGE, ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.CONSTRUCTOR, ElementType.FIELD,ElementType.ANNOTATION_TYPE,ElementType.PARAMETER, ElementType.TYPE_USE})
public @interface AnnotationExample {
    //body of the annotation
    String name();
    String lastName();
    int age();
}
