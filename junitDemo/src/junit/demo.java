package junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;


@TestInstance(Lifecycle.PER_CLASS)

public class demo {
	
	@BeforeAll
	void beforeAllTest() {
		System.out.println(" beforeAllTest ");
		
	}
	@BeforeEach
	void beforeEachest() {
		System.out.println(" beforeEachest ");

		
	}
	@AfterAll
	void AfterAllTest() {
		System.out.println(" AfterAllTest ");

		
	}
	@AfterEach
	void AfterEachest() {
		System.out.println(" AfterEachest ");

	}
	@Test
	void test() {
		System.out.println(" test ");
	}

}
