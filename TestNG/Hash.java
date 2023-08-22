package DDT;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Hash {

@DataProvider

public Object[][] getData(){
	HashMap<String, String> map = new HashMap<String, String>();
	map.put("email","abc@gmail.com");
	map.put("username","user@gmail.com");
	map.put("password","pass123");
	
	System.out.println("Keys" +map.keySet());
	System.out.println("Values" +map.values());
	
	HashMap<String, String> map1 = new HashMap<String, String>();
	map1.put("email","abc@gmail.com");
	map1.put("username","user@gmail.com");
	map1.put("password","pass123");
	
	System.out.println("Keys" +map1.keySet());
	System.out.println("Values" +map1.values());
	
	return new Object[][]{{map},{map1}};
}

@Test(dataProvider="getData")

public void fetchingdata(HashMap<String, String> input) 
{
	System.out.println(input.get("email"));
	System.out.println(input.get("username"));
	System.out.println(input.get("password"));
}
	
}

/* Add this dependency if you get an error related to slf4j into pom.xml
<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-simple</artifactId>
    <version>2.0.7</version>
    <scope>test</scope>
</dependency>

// Add TestNG from the Project>Properties>Java BUild Path>Classpath>Add Library
//https://www.programiz.com/java-programming/hashmap#google_vignette
*/