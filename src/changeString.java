public class changeString {

    public static String removeString(String mainString, String searchString) {
        String lMainString = mainString.toLowerCase();
        String lSearchString = searchString.toLowerCase();

        // Find the index of the first occurrence of searchString in lowerMainString
        int index = lMainString.indexOf(lSearchString);

        if (index != -1) {
            String result = mainString.substring(0, index) + mainString.substring(index + searchString.length());
            return result;
        }

        return mainString;
    }
}