import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class urinalsTest {

	@Test
	void testing1() {
		urinals u = new urinals();
		String s = "10001";
		assertEquals(true,u.validateString(s));
		System.out.println("====== SESHA SAI ANEESWAR == TEST ONE EXECUTED AND PASSED =======");  
	}
	
	@Test
	void testing2() {
		urinals u = new urinals();
		String s = "186";
		assertEquals(false,u.validateString(s));
		System.out.println("====== SESHA SAI ANEESWAR == TEST TWO EXECUTED AND PASSED =======");  
	}
	
	@Test
	void testing3() {
		urinals u = new urinals();
		String s = "00";
		assertEquals(true,u.validateString(s));
		System.out.println("====== SESHA SAI ANEESWAR == TEST THREE EXECUTED AND PASSED =======");  
	}
	@Test
	void testing4() {
		urinals u = new urinals();
		String s = "11";
		assertEquals(true,u.validateString(s));
		System.out.println("====== SESHA SAI ANEESWAR == TEST FOUR EXECUTED AND PASSED =======");  
	}
	@Test
	void testing5() {
		urinals u = new urinals();
		String s = "10001";
		assertEquals(1,u.countUrinals(s));
		System.out.println("====== SESHA SAI ANEESWAR == TEST FIVE EXECUTED AND PASSED =======");  
	}
	
	
}
