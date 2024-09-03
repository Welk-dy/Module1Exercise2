public class ChangeString {

    public static String removeFirstOccurrence(String mainString, String searchString) {
        int index = mainString.indexOf(searchString);

        if (index != -1) {
            String result = mainString.substring(0, index) + mainString.substring(index + searchString.length());
            return result;
        }

        return mainString;
    }
}