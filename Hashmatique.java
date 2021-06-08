import java.util.HashMap;
import java.util.Set;

public class Hashmatique{
    public static void main(String[] args){
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("Toosie Slide","Black leather gloves, no sequins");
        userMap.put("War", "I don't cop things for resale, Don't do iCloud, don't do email");
        userMap.put("Greece", "Come with me, leave all of your things, yeah We can stop at Gucci, stop at Louis V, yeah");
        userMap.put("Wants and Needs", "Leave me out the comments, leave me out the nonsense, Speakin' out of context, people need some content");

        String track = userMap.get("Greece");
        System.out.println("The lyrics to Greece are:" + track);

        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));  
        }
    }
}