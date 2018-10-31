package com.jwebmp.undertow;

import com.jwebmp.logger.LogFactory;
import org.junit.jupiter.api.Test;

import java.util.logging.Level;

public class TestIT
{
	@Test
	public void testUndertow()
	{
		try
		{
			LogFactory.configureConsoleColourOutput(Level.FINE);
			JWebMPUndertow.boot("localhost", 9999);
			System.out.println("done");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}