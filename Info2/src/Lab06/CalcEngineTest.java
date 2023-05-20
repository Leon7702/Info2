package Lab06;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalcEngineTest {

private CalcEngine calcEngine; 
private HexaNotation gui;

@Before
public void setUp(){
	calcEngine = new CalcEngine();
	gui = new HexaNotation(calcEngine);
}
	@Test
	public void testCalcEngine() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDisplayValue() {
		fail("Not yet implemented");
	}

	@Test
	public void testNumberPressed() {
		fail("Not yet implemented");
	}

	@Test
	public void testPlus() {
	
		calcEngine.numberPressed(5); 
		calcEngine.plus(); 
		calcEngine.numberPressed(3); 
		calcEngine.equals(); 
		assertEquals(8, calcEngine.getDisplayValue());
		
		
	}

	@Test
	public void testMinus() {
		calcEngine.numberPressed(10); 
		calcEngine
	}

	@Test
	public void testMulti() {
		calcEngine.numberPressed(3); 
		calcEngine.multi(); 
		calcEngine.numberPressed(3); 
		calcEngine.equals(); 
		assertEquals(9, calcEngine.getDisplayValue());	}

	@Test
	public void testDiv() {
		calcEngine.numberPressed(10); 
		calcEngine.div(); 
		calcEngine.numberPressed(2); 
		calcEngine.equals(); 
		assertEquals(5, calcEngine.getDisplayValue());
	}

	@Test
	public void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	public void testClear() {
		calcEngine.numberPressed(7); 
		calcEngine.clear(); 
		assertEquals(0, calcEngine.getDisplayValue()); 
		
	}

}
