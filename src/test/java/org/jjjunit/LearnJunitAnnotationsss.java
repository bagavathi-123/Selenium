package org.jjjunit;

import org.junit.*;

public class LearnJunitAnnotationsss {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("afterclass");
	}

	@Before
	public void before() {
		System.out.println("before ");
	}

	@After
	public void after() {
		System.out.println("after");
	}

	@Ignore
	@Test
	public void test() {
		System.out.println("test");

	}

	@Test
	public void test1() {
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("test2");
	}

}
