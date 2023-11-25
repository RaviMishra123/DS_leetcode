import java.util.*;
public class DuplicateIdentifier {
    public static Set<Integer> duplicateIdentifier(Map<Integer, Integer> num){
        Set<Integer> uniqueValues = new HashSet<>();
        Set<Integer> duplicateValues = new HashSet<>();

        for (Map.Entry<Integer, Integer> entry : num.entrySet()) {
            if (!uniqueValues.add(entry.getValue())) {
                duplicateValues.add(entry.getValue());
            }
        }
        return duplicateValues;
    }

    public static Set<Integer> listofDuplicatenumber(List<Integer> num){
        Map<Integer, Integer> occurence = new HashMap<>();
        for(int i=0; i<num.size();i++){
            occurence.put(i, num.get(i));
        }
        return duplicateIdentifier(occurence);
    }

    public static void main (String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 6, 3, 6, 1, 2);
        System.out.println(listofDuplicatenumber(num));
    }
}