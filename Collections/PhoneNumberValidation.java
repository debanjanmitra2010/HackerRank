import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class PhoneNumberValidation {

    public static void input(String[] str) {
        for (int i = 0; i < str.length; i++) {
            System.out.println("Input : " + str[i]);
            System.out.println("Output : " + validatePhoneNumberFormat(str[i]));
        }
    }

    public static String validatePhoneNumberFormat(String address) {
        // Write your code here

        String output = "";
        // For E.164 format
        if (IsE164(address)) {
            output = "SMS";
        } else {

            String[] Address = address.split(":");
//            System.out.println(Arrays.toString(Address));
            if (Address.length == 2) {
//                System.out.println("I'm running");
                String provider = Address[0].toLowerCase().replace(" ", "");
                String number = Address[1].replace(" ", "");
//                System.out.println(number);

                if (provider.contentEquals("whatsapp") || provider.contentEquals("messenger")) {
                    if (IsE164(number)) {
                        output = provider.toUpperCase();
                    } else {
                        output = "INVALID_ADDRESS";
                    }
                } else if (provider.contentEquals("wechat")) {
                    output = provider.toUpperCase();
                }
            } else {
                output = "INVALID_ADDRESS";
            }
        }
        return output;
    }

    public static boolean IsE164(String address) {
        Boolean isCorrect = false;
        if (address.length() <= 16 && address.charAt(0) == '+') {
            String number = address.substring(1).replace(" ", "");
            if (number.charAt(1) != 0 && number.matches("[+-]?\\d*(\\.\\d+)?")) {
                isCorrect = true;
            }
        } else if (address.length() <= 15) {
            String number = address.substring(0).replace(" ", "");
            if (number.charAt(0) != 0 && number.matches("[+-]?\\d*(\\.\\d+)?")) {
                isCorrect = true;
            }
        }
        return isCorrect;
    }

    public static void main(String[] args) {
        String[] address = {"+15555555555", "15555555555", "+15555555555555555", "whatsapp: 15555555555", "wechat:identifier:ghke83772", "wechat:ghke83772", "whatsapp : +15555555555"
                , "messenger: 15555555555", "messenger: +15555555555", "messenger: +15555555555555555", "whatsapp: this_is_not_an_E164_number", "messenger: this_is_not_an_E164_number",
                "wechat: this_is_alphanumeric_with_special_character"};
        input(address);
    }

}
