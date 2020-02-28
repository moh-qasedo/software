package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import source.Calculator;

class testcode {
	static Calculator calc;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		calc = new Calculator();
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {	
	}
	@Test
	void test_BothArePositive() {
		assertTrue(calc.sum(10, 10) > 0);
	}
	@Test
	void test_BothAreNegative() {
		assertTrue(calc.sum(-10, -10) < 0);
	}
	@Test
	void test_X_GreaterThan_Y_absolute() {
		assertTrue(calc.sum(20, -10) > 0);
	}
	@Test
	void test_Y_GreaterThan_X_absolute() {
		assertTrue(calc.sum(10, -20) < 0);
	}
	@Test
	void test_BothEqualsWithOppositeSigns() {
		assertTrue(calc.sum(10, -10) == 0);
	}
}
