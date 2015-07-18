package com.cdg.test.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class testFraudDice {
	FraudDice test;
	
	@Before
	public void setup(){
		test = new FraudDice();
	}
	
	@Test
	public void l0test() throws Exception {
		test.setLevel(0);
		int result = test.makeNum();
		Assert.assertTrue(0<=result || result<=6);
	}
	
	public void l1test() throws Exception{
		test.setLevel(1);
		int result = test.makeNum();
		Assert.assertTrue(result<5);
	}
	
	public void l2test() throws Exception{
		test.setLevel(2);
		int result=test.makeNum();
		Assert.assertTrue(result>=3);
	}

}
