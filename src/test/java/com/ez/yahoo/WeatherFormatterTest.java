package com.ez.yahoo;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import com.ez.Weather;
import com.ez.WeatherFormatter;
import com.ez.YahooParser;
import junit.framework.TestCase;

public class WeatherFormatterTest extends TestCase {
  public WeatherFormatterTest(String name) {
    super(name);
  }
  public void testFormat() throws Exception {
    InputStream nyData = 
      getClass().getClassLoader().getResourceAsStream("ny-weather.xml");
    Weather weather = new YahooParser().parse( nyData );
    String formattedResult = new WeatherFormatter().format( weather );
    System.out.println("formattedResult:"+formattedResult);
    InputStream expected = 
      getClass().getClassLoader().getResourceAsStream("format-expected.dat");
    assertEquals( IOUtils.toString( expected ).trim(), formattedResult.trim() );
  }
}