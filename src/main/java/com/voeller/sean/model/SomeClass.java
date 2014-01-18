package com.voeller.sean.model;

import com.voeller.sean.model.validation.OneOrTheOther;

@OneOrTheOther
public class SomeClass {
	private String tweedledee;
	private String tweedledum;

	public String getTweedledee() {
		return tweedledee;
	}

	public String getTweedledum() {
		return tweedledum;
	}

	public void setTweedledee(String tweedledee) {
		this.tweedledee = tweedledee;
	}

	public void setTweedledum(String tweedledum) {
		this.tweedledum = tweedledum;
	}
}
