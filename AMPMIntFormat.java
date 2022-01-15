//Given a time in -hour AM/PM format, convert it to military (24-hour) time.

// Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
// - 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

class AMPMIntFormat {

    public static String timeConversion(String s) {
    // Write your code here
    String str ="";
    if(s.charAt(8) == 'P' && Integer.parseInt(s.substring(0,2))<12){
        int newTime = Integer.parseInt(s.substring(0,2)) + 12;
        str = Integer.toString(newTime)+s.substring(2,8);
    }
    else if(s.charAt(8) == 'A' && Integer.parseInt(s.substring(0,2))==12){
        int newTime = Integer.parseInt(s.substring(0,2)) - 12;
        str = "0" + Integer.toString(newTime)+s.substring(2,8); 
    }
    
    else{
        str = s.substring(0,8); 
    }
    return str;
}
}
