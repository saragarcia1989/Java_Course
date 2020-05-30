package Chapter12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FinalResults {

    public static void main(String[] args) {

        Map originalGrades = TestResults.getOriginalGrades();

        Map makeUpGrades = TestResults.getMakeUpGrades();

        System.out.println(finalResults(originalGrades, makeUpGrades));
    }


    public static Map<String, Integer> finalResults(Map originalGrades, Map makeUpGrades) {

        Map grades = new HashMap();

        Set<String> names = originalGrades.keySet();

        for (String name : names) {

            int oldMark = (int) originalGrades.get(name);

            int newMark = (int) makeUpGrades.get(name);

            if (newMark >= oldMark) {

                grades.put(name, newMark);

            } else {

                grades.put(name, oldMark);
            }
        }

        return grades;
    }
}
