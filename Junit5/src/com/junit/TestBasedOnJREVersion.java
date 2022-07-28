package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

class TestBasedOnJREVersion {

	@Test
	@EnabledOnOs(OS.WINDOWS)
	void testonJava11() {
		System.out.println("Testing with Windows");
	}

}

