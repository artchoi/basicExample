package basicexample.common;

import basicexample.InnventoryApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { InnventoryApplication.class })
public class CucumberSpingConfiguration {}
