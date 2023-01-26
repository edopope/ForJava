package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class NumberOfTimes {
    public static void main(String[] args) {
        int count = 0;
        String[] story = {"i", "am", "a", "boy", "i", "am", "man"};
        Map<String, Integer> newStory = new HashMap<>();
        for (int i = 0; i < story.length ; i++) {
            String word =story[i];
            if(newStory.containsKey(word) ){
                int value = newStory.get(word);
                newStory.put(word,++value);
          }
            else {
                newStory.put(word,1);
            }
        }
        System.out.println(newStory);
    }
}
