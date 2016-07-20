//package (default)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

public class Users {

  private static String readAll(Reader rd) throws IOException {
    StringBuilder sb = new StringBuilder();
    int cp;
    while ((cp = rd.read()) != -1) {
      sb.append((char) cp);
    }
    return sb.toString();
  }

  public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
    InputStream is = new URL(url).openStream();
    try {
      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
      String jsonText = readAll(rd);
      JSONObject json = new JSONObject(jsonText);
      return json;
    } finally {
      is.close();
    }
  }

  public static void main(String[] args) throws IOException, JSONException {
    JSONObject json = readJsonFromUrl("http://core.cityrisks.eu/cityrisks/api/crUsers/");
    JSONArray arr = json.getJSONObject("_embedded").getJSONArray("crUsers");
    List<String> list = new ArrayList<String>();
    System.out.println(arr+"\n");
    for(int i = 0; i < arr.length(); i++){
    	list.add(arr.getJSONObject(i).getJSONObject("_links").getJSONObject("self").getString("href"));
    }
    System.out.println(list+"\n");
    for(int i=0;i<list.size();i++){
    	System.out.println(list.get(i));
    	JSONObject json2 = readJsonFromUrl(list.get(i));
    	String firstname = json2.getString("firstname");
    	String lastname = json2.getString("lastname");
    	//String username = json2.getString("username");
    	String email = json2.getString("email");
    	System.out.println(lastname +" "+ firstname +" ("+ email +") \n"+ json2+"\n\n");
    } 
    System.out.println("Done");
  }
}