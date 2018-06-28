/**
 * 
 */
package com.tarun.spring.hibernate.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.stereotype.Component;

/**
 * The Interface BusinessObject.
 *
 * @author taruntyagi
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface BusinessObject {

	/**
	 * The value may indicate a suggestion for a logical component name, to be
	 * turned into a Spring bean in case of an auto detected component.
	 * 
	 * @return the suggested component name, if any
	 */
	String value() default "";
}
