package CustomizedLibrary;

import java.io.IOException;

public class EnviromentSetting {
	
	public static void setGeckoDriverPath() throws IOException {
		System.setProperty("webdriver.gecko.driver", PropertyUtility.getGeckoDriverPath());
	}
	
	
}
