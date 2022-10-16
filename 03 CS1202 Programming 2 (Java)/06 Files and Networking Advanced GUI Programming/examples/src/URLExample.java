import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLExample {
    static void readFromUrl(URL context, String relativeURL, String contentType) throws IOException {
        // Create url base on context and relative url
        URL url = new URL(context, relativeURL);

        // Set up a connection
        URLConnection connection = url.openConnection();
        InputStream urlData = connection.getInputStream();

        // Check the type of the content
        String type = connection.getContentType();

        // Check if the url refer proper file type
        if(type == null || contentType.startsWith(contentType) == false) {
            throw new IOException("URL does not seem to refer to a " + contentType + " file.");
        }

        // Read the file from url
        System.out.println("Fetching content...");
        BufferedReader in = new BufferedReader(new InputStreamReader(urlData));

        // Process each line of file
        String line = in.readLine();
        while(line != null) {
            System.out.println(line);
            line = in.readLine();
        }

        // Close the file
        in.close();
    }

    public static void main(String[] args) {
        try {
            URL context = new URL("https://math.hws.edu/eck/");
            readFromUrl(context, "index.html", "text");
        } catch(MalformedURLException e) {
            System.out.println("The specified strings don't represent legal url. " + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
