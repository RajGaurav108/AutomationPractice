package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SourceCSV {

	@ParameterizedTest
	@CsvSource({"Planet,p","Color,c"})
	void validateFirstLetter(String src,String target) {
		System.out.println("Source is "+src+" and target is "+target);
		assertEquals(target, src.toLowerCase().substring(0, 1));
	}

}
