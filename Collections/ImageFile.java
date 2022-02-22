import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImageFile {

    public static List<List<String>> validateImageSize(List<List<String>> imageUrls, String maxSize) {
        // Write your code here
        if (maxSize == "") {
            maxSize = "1MB";
        }

        List<List<String>> output = new ArrayList<List<String>>();


        for (int i = 0; i < imageUrls.size(); ++i) {
//            System.out.println(" " + imageUrls.get(i).get(0));
//            System.out.println(" " + imageUrls.get(i).get(1));
            Boolean ValidUrl = isValid(imageUrls.get(i).get(0));
            Double Size = CalSize(imageUrls.get(i).get(1), maxSize);
            if (ValidUrl && Size < Capacity(maxSize)) {
                List<String> url = new ArrayList<>();
                url.add(imageUrls.get(i).get(0));
                url.add("TRUE");
                output.add(url);
            } else {
                List<String> url = new ArrayList<>();
                url.add(imageUrls.get(i).get(0));
                url.add("FALSE");
                output.add(url);
            }
        }

        return output;

    }

    public static boolean isValid(String url) {
        Boolean validity = false;
        String url_format = "(http|ftp|https):\\/\\/([\\w_-]+(?:(?:\\.[\\w_-]+)+))([\\w.,@?^=%&:\\/~+#-]*[\\w@?^=%&\\/~+#-])";
        Pattern p = Pattern.compile(url_format, Pattern.CASE_INSENSITIVE);
        Matcher matcher = p.matcher(url);
        if (matcher.matches()) {
            validity = true;
        }
        return validity;
    }

    public static Double Capacity(String maxSize) {
        Double MaxSize = Double.parseDouble(maxSize.replaceAll("[^\\d]", ""));
        return MaxSize;
    }

    public static Double CalSize(String ImageSize, String MaxSize) {

        Double size;
        if (MaxSize.toLowerCase().contains("mb")) {
            size = Double.parseDouble(ImageSize);
            size = size / 1000000;
        } else if (MaxSize.toLowerCase().contains("kb")) {
            size = Double.parseDouble(ImageSize);
            size = size / 1000;

        } else if (MaxSize.toLowerCase().contains("gb")) {
            size = Double.parseDouble(ImageSize);
            size = size / 1000000000;
        } else {
            size = -1.0;
        }

        return size;
    }

    public static void main(String[] args) {
        List<String> url1 = new ArrayList<>();
        url1.add("https://techcrunch.com/wp-content/uploads/2020/09/flex_agent_view.jpg");
        url1.add("12000000");
        List<String> url2 = new ArrayList<>();
        url2.add("https://twilio-cms-prod.s3.amazonaws.com/images/Voice_Client_Diagrams.width-800.png");
        url2.add("32000000");
        List<String> url3 = new ArrayList<>();
        url3.add("https://twilio-cms-prod.s3.amazonaws.com/images/Voice_Mobile_SDK_Overview.width-800.png");
        url3.add("25000000");
        List<List<String>> input = new ArrayList<List<String>>();
        input.add(url1);
        input.add(url2);
        input.add(url3);
        System.out.println(validateImageSize(input, "40MB"));
        System.out.println(validateImageSize(input, "20MB"));
        System.out.println(validateImageSize(input, ""));
    }

}
