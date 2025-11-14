package junit;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class parameterizedTesting {
	//for testing whether given word is palindrome or not
	
	@ParameterizedTest
	@ValueSource(strings= {"racecar","civic","madam","swey","mom","moni" })
	void testForPalindrome(String word) {
		assertTrue(word.equals(new StringBuffer(word).reverse().toString()));	}

}
