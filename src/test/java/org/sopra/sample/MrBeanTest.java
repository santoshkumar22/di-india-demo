package org.sopra.sample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MrBeanTest {
	
	@Test
	public void testMrBeanCarBrand() {
		MrBean mrBean = new MrBean();
		String result = mrBean.getCarBrand();
		assertEquals("Leyland Mini", result);
	}
	
	@Test
	public void testMrBeanAge() {
		MrBean mrBean = new MrBean();
		String result = String.valueOf(mrBean.getAge());
		assertEquals("60", result);
	}
}
