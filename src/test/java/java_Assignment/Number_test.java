package java_Assignment;

import static org.junit.Assert.*;


import org.junit.Test;

public class Number_test {

	@Test
	public void less_that_4_test() {
		Number number= new Number("135 43 512 612");
		assertEquals("Function returns true if there is not a sequence with more than three digits",true, Number.less_than_4(number.getNumber()));
		
		
	}

	@Test
	public void only_numbers_test() {
		Number number= new Number("135 43 512 612");
		assertEquals("Function returns true if string has numbers only",true, Number.only_numbers(number.getNumber()));
		
		
	}

	@Test
	public void remove_spaces_test_test() {
		Number number= new Number("13543512612");
		int spaceCount = 0;
		for (char c : number.getNumber().toCharArray()) {
			if (c == ' ') {
				spaceCount++;
			}
		}
		assertEquals("Function returns string with no spaces", 0, spaceCount);
		
		
		
	}
	

	

}
