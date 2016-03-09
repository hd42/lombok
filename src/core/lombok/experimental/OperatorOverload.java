package lombok.experimental;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marks a {@link ElementType#METHOD} as being the implementation for an overloaded operator, defined with the {@link #operator()} parameter.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface OperatorOverload {
	
	Operator operator();

}
