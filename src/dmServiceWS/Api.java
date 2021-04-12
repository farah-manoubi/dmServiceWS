package dmServiceWS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class Api {
	private static HttpURLConnection connection;
	
	public static void main(String[] args) throws JSONException {
		
		BufferedReader reader;
		String line;
		StringBuffer responseContent = new StringBuffer();
		
		
		try {
			URL url = new URL("https://graph.facebook.com/v10.0/me?fields=id%2Cname%2Cage_range%2Clocation%7Bcountry%7D%2Clikes.limit(1).summary(true)&access_token=EAAPsaQ2O6sUBAB0mUedpE5ZCjt3DPcfbZAUxhb3pQYT9XrTXQOVLm8DFReS73dwaz8ASXjGkfiVNOhfxg7v75CaNAU9HbEKSxO9fcdZAnJLwt8PJw135pYccLHisfzF5yIFMJWHeFD0VpJQbd3lbk3jTsNBwuasVYpX7PgV6LEOPyG8t5e6fsTtJwimmFZBBj4N1IqIl0Gs4iRGx5Fjsco8z8RtS7sQDwXPUSYonh0n70eEtZB8YZCZCzQHCx74sqMZD\"");
			connection = (HttpURLConnection) url.openConnection();
			
			
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(5000);
			connection.setReadTimeout(5000);
			
			int status = connection.getResponseCode();
			System.out.println(status);
			
			if(status > 299) {
				reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
				while((line = reader.readLine()) != null) {
					responseContent.append(line);
				}
				reader.close();
			}
			else {
				reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				while((line = reader.readLine()) != null) {
					responseContent.append(line);
				}
				reader.close();
			}
			//System.out.println(responseContent.toString());
			
		parse(responseContent.toString());
			
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			connection.disconnect();
		}
	}
	
	public static String parse(String responseBody) throws JSONException{
		JSONObject album = new JSONObject(responseBody);
		for(int i = 0; i < album.length(); i++) {
			int id = album.getInt("id");
			String name = album.getString("name");
			String age_range = album.getString("age_range");
			System.out.println(id + "  " + name + "  " + age_range);
			///
		}
		
		return null;
	}

}
