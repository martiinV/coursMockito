package org.exam;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Unit test for simple App.
 */

	
public class AppTest 
{
	
	App app = null;
	
	App service = Mockito.mock(App.class);
	
	@Before
	public void setUp() throws Exception{
		this.app = new App();
	}
	
	@After
	public void tearDown() throws Exception{
		this.app = null;
	}
	
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertEquals("Hello World!", app.HelloWorld());
        when(service.HelloWorld()).thenReturn("Bonjour Madame");
        assertEquals("Bonjour Madame", service.HelloWorld());
        verify(service).HelloWorld();
        verify(service, times(1)).HelloWorld();
    }
}
