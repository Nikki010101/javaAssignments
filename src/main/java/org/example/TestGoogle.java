package org.example;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.edge.EdgeDriver;
public class TestGoogle

{


@Test
    public void testGoogle()

    {  // Hello am i audible   // once see mic settings
        WebDriverManager.edgedriver().setup();;
        EdgeDriver edge=new EdgeDriver();
        edge.get("https://www.google.com/");
    }
}
