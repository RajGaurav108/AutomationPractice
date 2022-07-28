package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestParam {

	@ParameterizedTest
	@ValueSource(ints = {6,8,12})
	void test_IntParams(int i) {
		System.out.println(i);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Raj","Druthi","Rahul"})
	void test_StringParams(String name) {
		System.out.println(name);
	}

}
