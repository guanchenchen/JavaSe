package onlyfun.caterpillar;

import junit.framework.TestCase;

public class MathToolUnitTest extends TestCase {
	public void testGCD() {
		assertEquals(5, MathTool.gcd(10, 5));
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(MathToolUnitTest.class);
	}

}
