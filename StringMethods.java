public class StringMethods {
    public static void main(String[] args) {
        String name= "Sahil";
        String untrimmedname= "    Sahil     ";
        // String Methods Starting
        int value= name.length(); //this method prints length of String name
        System.out.println(value);
        System.out.println(name.toUpperCase()); //Returns a new String which has all the uppercase characters from the String name.
        System.out.println(name.toLowerCase()); //Returns a new String which has all the lowercase characters from the String name.
        System.out.println(untrimmedname);
        System.out.println(untrimmedname.trim()); //Returns a new String after removing all the leading and trailing spaces from the original string.
        System.out.println(name.substring(2)); //Returns a substring from start to the end. Substring(2) returns “hil”.
        System.out.println(name.substring(1,5)); //Returns a substring from the start index to the end index. The start index is included and the end is excluded.
        System.out.println(name.replace('a','o')); //Returns a new string after replacing a with o. Sohil is returned in this case. (This method takes char as argument)
        System.out.println(name.replace("hil","gar")); //Returns a new string after replacing hil with gar.
        System.out.println(name.startsWith("Sa")); //Returns true if name starts with string “Sa”.
        System.out.println(name.endsWith("il"));   //Returns true if name ends with string “il”
        System.out.println(name.charAt(2)); //Returns the character at a given index position.
        System.out.println(name.indexOf("i")); //Returns the index of the given string.
        System.out.println(name.indexOf("ah")); //Returns the index of the given string.
        System.out.println(name.indexOf("a,3")); //Returns the index of the given String starting from index 3(int). (-1 is returned in this case)
        System.out.println(name.lastIndexOf("i")); //Returns the last index of the given string. (3 in this case)
        System.out.println(name.equals("Sahil")); //Returns true if the given string is equal to “Sahil” false otherwise [Case sensitive]
        System.out.println(name.equalsIgnoreCase("sahil")); //Returns true if two strings are equal ignoring the case of characters.
    }
}

