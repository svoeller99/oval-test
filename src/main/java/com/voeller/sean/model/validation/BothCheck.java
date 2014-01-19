package com.voeller.sean.model.validation;

import net.sf.oval.Validator;
import net.sf.oval.configuration.annotation.AbstractAnnotationCheck;
import net.sf.oval.context.OValContext;

import com.voeller.sean.model.SomeClass;

public class BothCheck extends AbstractAnnotationCheck<Both>
{
  public boolean isSatisfied(Object validatedObject, Object valueToValidate, OValContext context, Validator validator)
  {
	  SomeClass someObj = (SomeClass) validatedObject;
	  return someObj.getTweedledee() != null && someObj.getTweedledum() != null;
  }
}