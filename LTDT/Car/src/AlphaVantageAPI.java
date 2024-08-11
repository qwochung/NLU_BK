import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class AlphaVantageAPI {

    private static final String API_KEY = "your_api_key"; // Thay thế "your_api_key" bằng API key của bạn
    private static final String SYMBOL = "IBM";
    private static final String INTERVAL = "5min";
    private static final String FUNCTION = "TIME_SERIES_INTRADAY";

    public static void main(String[] args) {
        String urlString = String.format(
            "https://www.alphavantage.co/query?function=%s&symbol=%s&interval=%s&apikey=%s",
            FUNCTION, SYMBOL, INTERVAL, API_KEY
        );

        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Chuyển đổi dữ liệu JSON thành đối tượng JSONObject
                JSONObject jsonResponse = new JSONObject(response.toString());

                // In ra dữ liệu JSON
                System.out.println(jsonResponse.toString(4)); // 4 là số lượng khoảng trắng để thụt đầu dòng
            } else {
                System.out.println("GET request failed: " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
