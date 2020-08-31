package com.pack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathOperationTest {
	MathOperation m;
	@Before
	public void setUp() throws Exception {
		m=new MathOperation();
	}

	@After
	public void tearDown() throws Exception {
		m=null;
	}

	@Test
	public void testAdd_positive() {
		int addition=m.add(12,12);
		assertEquals(24, addition);
	}
	@Test
	public void testAdd_positive1() {
		int addition=m.add(-12,12);
		assertEquals(0, addition);
	}
	@Test
	public void testAdd_positive2() {
		int addition=m.add(12,-12);
		assertEquals(0, addition);
	}
	@Test
	public void testAdd_positive3() {
		int addition=m.add(12,0);
		assertEquals(12, addition);
	}
	@Test
	public void testAdd_negative() {
		int addition=m.add(-12,-12);
		assertEquals(-24, addition);
	}
	
	
	@Test
	public void testDiv() {
		double division=m.div(12,12);
		assertEquals(1,division,0);
	}
	@Test
	public void testDiv_positive2() {
		double division=m.div(-12,12);
		assertEquals(-1,division,0);
	}
	@Test
	public void testDiv_positive3(){
		double division=m.div(12,5);
		assertEquals(2.4,division,0);
	}
	@Test
	public void testDiv_positive4(){
		double division=m.div(12,0);
//		assertEquals(2.4,division,0);
	}
	@Test(expected=ArithmeticException.class)
	public void testDiv_byzero(){
//		int division=m.div1(12,0);
		assertEquals(1,m.div1(12,0),0);
	}
	@Test
	public void testDiv_negative(){
		double division=m.div(12,3);
//		assertEquals(3,division,0);
		assertTrue(division!=3);
	}

	
}
