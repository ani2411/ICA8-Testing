import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class urinalsTest {

	@Test
	void testing1() {
		urinals bs = new urinals();
		String s = "10001";
		assertEquals(true,bs.validateString(s));
		System.out.println("====== SESHA SAI ANEESWAR == TEST ONE EXECUTED AND PASSED =======");  
	}
	
	@Test
	void testing2() {
		urinals bs = new urinals();
		String s = "1231";
		assertEquals(false,bs.validateString(s));
		System.out.println("====== SESHA SAI ANEESWAR == TEST TWO EXECUTED AND PASSED =======");  
	}
	
	@Test
	void testing3() {
		urinals bs = new urinals();
		String s = "00";
		assertEquals(true,bs.validateString(s));
		System.out.println("====== SESHA SAI ANEESWAR == TEST THREE EXECUTED AND PASSED =======");  
	}

}
