package tr.edu.medipol.yazortarac;
import org.junit.Test;
import org.junit.*;
public class HesaplamaTest {
	@Test
	public void testToplama() {
		int asilsonuc= Hesaplama.toplama(2,2);
		Assert.assertEquals(4,asilsonuc);
		
		Assert.assertEquals(0,Hesaplama.toplama(2,-2));
		
		Assert.assertEquals(0,Hesaplama.toplama(-2,2));
		
		Assert.assertEquals(0,Hesaplama.toplama(0,9999));
	}
}
