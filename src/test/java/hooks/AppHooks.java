package hooks;
import java.util.Properties;

import org.junit.BeforeClass;

import dataproviders.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import static io.restassured.RestAssured.*;

public class AppHooks {

	public Properties prop;
	@Before
	public void getProperties() {

		prop = ConfigReader.getInstance().initProp();

		baseURI=prop.getProperty("baseUrl");

	}



}
