package screen;

import java.lang.annotation.*;

/**
 * Created by HP on 4/25/2017.
 */

//  @Inherited
//  @Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

public @interface Monitor {
  String aspectRatio() default "";

  String classification() default "";
}


