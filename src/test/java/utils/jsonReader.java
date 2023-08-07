package utils;

import org.apache.commons.io.FileUtils;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.IOException;

public class jsonReader {
    public static JSONObject getJsonData(String filePath) throws IOException, ParseException {

        //pass the path of the testdata.json file
        File filename = new File(filePath);
        String json = FileUtils.readFileToString(filename, "UTF-8");
        Object obj = new JSONParser().parse(json);
        JSONObject jsonObject = (JSONObject) obj;
        return jsonObject;

    }

    public static String getTestData(String path, String input) throws IOException, ParseException {
        String testdata;
        return testdata = (String) getJsonData(path).get(input); //input is the key
    }

}
