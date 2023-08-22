package DDT;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JsonDataClass {

	
	     public List<HashMap<String, String>> getJsonDataToMap() throws IOException
	    {
		String jsonContent = FileUtils.readFileToString(new File(System.getProperty("user.dir")+"src\\DDT\\data.json"),StandardCharsets.UTF_8);
		
		
		//List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>());
		 List<HashMap<String, String>> dataHashMap = new Gson()
	                .fromJson(jsonContent, 
	                    new TypeToken<List<HashMap<String, 
	                        String>>>() {}.getType());
	            return dataHashMap;	
	    }

		
   
	
	@DataProvider
	public Object[][] getData() throws IOException{
		List<HashMap<String, String>> pdata =getJsonDataToMap();
	
		return new Object[][]{{pdata.get(0)},{pdata.get(1)}};
	}
	
	
	
	
	
	@Test(dataProvider="getData")

	public void fetchingdata(HashMap<String, String> input) 
	{
		System.out.println(input.get("email"));
		System.out.println(input.get("username"));
		System.out.println(input.get("password"));
	}
	
}
