package com.rajivraghu;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.raghuraghu.StringHelper;

@RunWith(Parameterized.class)
public class StringHelperTest {

	private String expectedOutput;
	private String input;
	
	
	public StringHelperTest(String input,String expectedOutput) {
		super();
		
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	@Parameters
	public static Collection<String[]> testConditions(){
		
		String expectedOutputs[][] = {{"AACD","CD"}};
		
		return Arrays.asList(expectedOutputs);
	}
	@Test
	public void test() {
		
		StringHelper helper = new StringHelper();
		assertEquals(expectedOutput, helper.truncateAInFirst2Positions(input));
		
	}

}
