package com.voeller.sean.model.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import net.sf.oval.configuration.annotation.Constraint;
import net.sf.oval.exception.ConstraintsViolatedException;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
@Constraint(checkWith = OneOrTheOtherCheck.class)
public @interface OneOrTheOther {
	/**
	 * message to be used for the ConstraintsViolatedException.
	 * @see ConstraintsViolatedException
	 */
	String message() default "foo violation message";
}
