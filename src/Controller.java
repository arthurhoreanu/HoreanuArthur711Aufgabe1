import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Controller {

    private final List<Log> logEntries;

    public Controller(List<Log> logEntries) {
        this.logEntries = logEntries;
    }

    public List<String> filterCharacterByLetter(String letter) {
        Set<String> uniqueCharacters = new HashSet<>();
        for (Log entry : logEntries) {
            String characterName = entry.getName();
            if (characterName.startsWith(String.valueOf(letter))) {
                uniqueCharacters.add(characterName);
            }
        }
        return new ArrayList<>(uniqueCharacters); // Converting to List, printStudents needs a List parameter
    }


}
