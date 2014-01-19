package com.voeller.sean.model;

import static org.junit.Assert.assertEquals;

import java.util.List;

import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;

import org.junit.Test;

public class SomeClassTest {
	@Test public void testValidationSuccessTweedledee() {
		Validator validator = new Validator();
		validator.disableProfile("bothProfile");
		SomeClass someObj = new SomeClass();
		someObj.setTweedledee("foo");
		assertEquals(0, validator.validate(someObj).size());
	}
	
	@Test public void testValidationSuccessTweedledum() {
		Validator validator = new Validator();
		validator.disableProfile("bothProfile");
		SomeClass someObj = new SomeClass();
		someObj.setTweedledum("foo");
		assertEquals(0, validator.validate(someObj).size());
	}
	
	@Test public void testValidationFailure() {
		Validator validator = new Validator();
		validator.disableProfile("bothProfile");
		SomeClass someObj = new SomeClass();
		List<ConstraintViolation> validationResult = validator.validate(someObj);
		assertEquals(1, validationResult.size());
		ConstraintViolation theViolation = validationResult.get(0);
		assertEquals("foo violation message", theViolation.getMessage());
	}
	
	@Test public void testValidationSuccessBoth() {
		Validator validator = new Validator();
		SomeClass someObj = new SomeClass();
		someObj.setTweedledee("foo");
		someObj.setTweedledum("bar");
		assertEquals(0, validator.validate(someObj).size());
	}
	
	@Test public void testValidationFailureBothProfile() {
		Validator validator = new Validator();
		SomeClass someObj = new SomeClass();
		someObj.setTweedledee("asdf");
		List<ConstraintViolation> validationResult = validator.validate(someObj);
		assertEquals(1, validationResult.size());
		ConstraintViolation theViolation = validationResult.get(0);
		assertEquals("both violation message", theViolation.getMessage());
	}
}
