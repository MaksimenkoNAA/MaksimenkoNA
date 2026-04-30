import java.util.*;
public class PhoneDirectory {
        private Map<String, List<String>> справочник = new HashMap<>();
        public void add(String фамилия, String номерТелефон) {
            List<String> номера = справочник.getOrDefault(фамилия, new ArrayList<>());
            номера.add(номерТелефон);
            справочник.put(фамилия, номера);
        }
        public List<String> get(String фамилия) {
            return справочник.get(фамилия);
        }
    }