package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class ParameterInjection {

	@ParameterizedTest
	@MethodSource("DP")
	void test(String name) {
		System.out.println(name);
	}
	
	static Stream<String> DP(){
		return Stream.of("Raj","Gaurav","Singh");
	}
	
	

}
