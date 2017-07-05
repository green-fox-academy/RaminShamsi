package screen;

import java.lang.annotation.*;



//  @Inherited
//  @Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

public @interface Monitor {
  String aspectRatio() default "";

  String classification() default "";
}


