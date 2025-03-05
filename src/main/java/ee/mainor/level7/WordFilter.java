package ee.mainor.level7;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    //todo fix tests

    public List<Word> getNouns(List<Word> words) {
        List<Word> nouns = new ArrayList<>();
        for (Word word : words) {
            if (word.getWordType() == Word.WordType.NOUN) {
                nouns.add(word);
            }
        }
        return nouns;
    }

    public Word getFirstVerb(List<Word> words) {

        for (Word word : words) {
            if (word.getWordType() == Word.WordType.VERB) {
                return word;
            }
        }
        return null;
    }

    public Word getFirstOfType(List<Word> words, Word.WordType type) {
        for (Word word : words) {
            if (word.getWordType() == type) {
                return word;
            }
        }
        return null;
    }

    public List<Word> getAllNotNouns(List<Word> words) {
        List<Word> notNouns = new ArrayList<>();
        for (Word word : words) {
            if (word.getWordType() != Word.WordType.NOUN) {
                notNouns.add(word);
            }
        }
        return notNouns;
    }

    public List<String> getNounStrings(List<Word> words) {
        ArrayList<String> nounStrings = new ArrayList<>();
        for (Word word : words) {
            if (word.getWordType() == Word.WordType.NOUN) {
                nounStrings.add(word.getWord());
            }
        }
        return nounStrings;
    }

    public String getFirstVerbString(List<Word> words) {
        for (Word word : words) {
            if (word.getWordType() == Word.WordType.VERB) {
                return word.getWord();
            }
        }
        return "";
    }

    public String getFirstStringOfType(List<Word> words, Word.WordType type) {
        for (Word word : words) {
            if (word.getWordType() == type) {
                return word.getWord();
            }
        }
        return "";
    }
}
