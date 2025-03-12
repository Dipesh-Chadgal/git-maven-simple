package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import com.MainApp;

public class TestAddition {
	
	@Test
	public void testAddition() {
		MainApp main = new MainApp();
		int result = main.addition(3, 7);
		assertEquals(10, result);
	}
	
	@Test
	public void testAddition1() {
		MainApp main = new MainApp();
		int result = main.addition(3, 12);
		assertNotEquals(12, result);
	}
	
	
	@Test
	public void testMultiply() {
		MainApp main = new MainApp();
		int result = main.multiply(3, 7);
		assertEquals(21, result);
	}
	
}
