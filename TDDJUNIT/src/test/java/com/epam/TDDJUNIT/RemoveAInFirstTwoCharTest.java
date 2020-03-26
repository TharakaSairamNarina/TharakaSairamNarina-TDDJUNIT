package com.epam.TDDJUNIT;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class RemoveAInFirstTwoCharTest {

	/*
	 * 0 chars : "" -> ""
	 * 1 char : A -> ""
	 * 1 char : B ->B
	 * 2 char : AA -> ""
	 * 2 char : BA/AB -> B
	 * 3 char : AAB -> B
	 * 3 char : ABA/BAA -> BA
	 * n char : ABCDEFGH -> BCDEFGH
	 * n char : AABCDEFGH -> BCDEFGH 
	 */
	
	RemoveAInFirstTwoChar RemoveAInFirstTwoChar;
	
	@BeforeEach
	void setup() {
		RemoveAInFirstTwoChar = new RemoveAInFirstTwoChar();
	}
	
	@Test
	void remove0charI() {
		assertEquals("",RemoveAInFirstTwoChar.remove(""));
	}
	@Test
	void remove1charI() {
		assertEquals("",RemoveAInFirstTwoChar.remove("A"));
	}
	
	@Test
	void remove1charII() {
		assertEquals("B",RemoveAInFirstTwoChar.remove("B"));
	}
	
	@Test
	void remove2charI() {
		assertEquals("",RemoveAInFirstTwoChar.remove("AA"));
	}

	@Test
	void remove2charII() {
		assertEquals("B",RemoveAInFirstTwoChar.remove("BA"));
	}
	
	@Test
	void remove2charIII() {
		assertEquals("B",RemoveAInFirstTwoChar.remove("AB"));
	}
	
	@Test
	void remove3charI() {
		assertEquals("A",RemoveAInFirstTwoChar.remove("AAA"));
	}

	@Test
	void remove3charII() {
		assertEquals("BA",RemoveAInFirstTwoChar.remove("ABA"));
	}
	
	@Test
	void remove3charIII() {
		assertEquals("BB",RemoveAInFirstTwoChar.remove("BAB"));
	}
	
	@Test
	void removencharI() {
		assertEquals("BCDEFGH",RemoveAInFirstTwoChar.remove("ABCDEFGH"));
	}
	
	@Test
	void removencharII() {
		assertEquals("BCDEFGH",RemoveAInFirstTwoChar.remove("AABCDEFGH"));
	}
}
