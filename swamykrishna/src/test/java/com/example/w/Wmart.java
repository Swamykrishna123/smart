package com.example.w;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.s.Smart;

public class Wmart {
	
	private Smart swamy;
	@BeforeEach
	public void setUp() {
		
		swamy=new Smart();
		
		
	}
	@Test
	public void selUp() {
		int a=1;
		int b=1;
		int result=Smart.sub(a, b);
		assertEquals(0, result);
		
	}

}
