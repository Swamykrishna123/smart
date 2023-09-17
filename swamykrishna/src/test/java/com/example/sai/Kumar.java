package com.example.sai;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.swamy.Krishna;

public class Kumar {
	
	private Krishna krish;
	
	@BeforeEach
	public void setUp() {
		krish=new Krishna();
	}
	@Test
	public void setKep() {
		Integer a=1;
		Integer b=2;
		int result=krish.add(a, b);
		assertEquals(3, result);
	}

}
