package junit;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledDemo {
	@Test
	void test_1() {
		System.out.println("test 1");
	}
	@Disabled
	@Test
	void test_2() {
		System.out.println("test 2");
	}
	@Test
	void test_3(){
		System.out.println("test 3");
	}

}
