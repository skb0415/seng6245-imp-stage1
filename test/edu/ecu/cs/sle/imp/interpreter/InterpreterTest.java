package edu.ecu.cs.sle.imp.interpreter;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import edu.ecu.cs.sle.imp.value.IntegerValue;

public class InterpreterTest {

	private static Interpreter interpreter;
	
	@BeforeClass
	public static void setUpClass() {
		interpreter = new Interpreter();
	}
	
	@Test
	public void testMultiply() {
		IntegerValue iv = interpreter.interpret("1*2");
		assertEquals("1*2", 2, iv.getIntValue().intValue());
	}

	@Test
	public void testSum() {
		IntegerValue iv = interpreter.interpret("1+2");
		assertEquals("1+2", 3, iv.getIntValue().intValue());
	}
	@Test
	public void testMinus() {
		IntegerValue iv = interpreter.interpret("3-2");
		assertEquals("3-2", 1, iv.getIntValue().intValue());
	
}
	@Test
	public void testDivision() {
		IntegerValue iv = interpreter.interpret("100/50");
		assertEquals("100/50", 2, iv.getIntValue().intValue());
	
}
	@Test
	public void uranyMinus() {
		IntegerValue iv = interpreter.interpret("10--2");
		assertEquals("10--2", 12, iv.getIntValue().intValue());
	
}
}
