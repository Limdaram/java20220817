package ch06.lecture.p10annotation;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// @Target(value = {ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER}) 
// 정의한곳만 쓸 수 있다
@Target(value = {TYPE, FIELD, CONSTRUCTOR, METHOD, PARAMETER})
public @interface MyAnnotation3 {

}
