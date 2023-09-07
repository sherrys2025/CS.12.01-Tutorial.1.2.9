import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;

    public WordPairList(String[] words)
    {
        allPairs = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                allPairs.add(new WordPair(words[i], words[j]));

            }
        }
    }


    public int numMatches()
    {
        int count = 0;
        for (WordPair wp: allPairs) {
            if (wp.getFirst().equals(wp.getSecond())) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<WordPair> getAllPairs() {
        return allPairs;
    }
}
