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
	
		
		@Test
		public void testCikarma() {
		int cikarmaAsilSonuc= Hesaplama.cikarma(2,2);
		Assert.assertEquals(0,cikarmaAsilSonuc);
		Assert.assertEquals(5, Hesaplama.cikarma(10,5));
	
		}
		
		@Test
		public void testCarpma() {
		int carpmaAsilSonuc= Hesaplama.carpma(5,2);
		Assert.assertEquals(10,carpmaAsilSonuc);
		
		Assert.assertEquals(50, Hesaplama.carpma(10,5));
	}
		@Test
		public void testBolme() {
			int bolmeAsilSonuc= Hesaplama.bolme(10,2);
			Assert.assertEquals(5,bolmeAsilSonuc);
			
			Assert.assertEquals(50, Hesaplama.bolme(10,5));
		}
}

