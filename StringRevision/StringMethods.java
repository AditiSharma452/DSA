package aditi.StringRevision;

public class StringMethods {


    //Commonly used String methods:

1.

    charAt(int index)

    String str = "Hello";
    char c = str.charAt(1); // 'e'


2.

    length()

    String str = "Hello";
    int len = str.length(); // 5


3.

    substring(int beginIndex)

    String str = "HelloWorld";
    String sub = str.substring(5); // "World"


4.

    substring(int beginIndex, int endIndex)

    String str = "HelloWorld";
    String sub = str.substring(0, 5); // "Hello"


5.

    indexOf(String str)

    String str = "HelloWorld";
    int index = str.indexOf("World"); // 5


6.

    indexOf(char ch)

    String str = "Hello";
    int index = str.indexOf('e'); // 1


7.

    lastIndexOf(String str)

    String str = "HelloWorldHello";
    int lastIndex = str.lastIndexOf("Hello"); // 10


8.

    lastIndexOf(char ch)

    String str = "Hello";
    int lastIndex = str.lastIndexOf('l'); // 3


9.

    contains(CharSequence s)

    String str = "HelloWorld";
    boolean result = str.contains("World"); // true


10.

    equals(Object anObject)

    String str1 = "Hello";
    String str2 = "Hello";
    boolean isEqual = str1.equals(str2); // true


11.

    equalsIgnoreCase(String anotherString)

    String str1 = "hello";
    String str2 = "Hello";
    boolean isEqual = str1.equalsIgnoreCase(str2); // true


12.

    toLowerCase()

    String str = "HELLO";
    String lower = str.toLowerCase(); // "hello"


13.

    toUpperCase()

    String str = "hello";
    String upper = str.toUpperCase(); // "HELLO"


14.

    trim()

    String str = "  Hello  ";
    String trimmed = str.trim(); // "Hello"


15.

    replace(char oldChar, char newChar)

    String str = "hello";
    String replaced = str.replace('l', 'r'); // "herro"


16.

    replace(CharSequence target, CharSequence replacement)

    String str = "hello world";
    String replaced = str.replace("world", "Java"); // "hello Java"


17.

    split(String regex)

    String str = "apple,banana,orange";
    String[] parts = str.split(","); // ["apple", "banana", "orange"]


18.

    startsWith(String prefix)

    String str = "HelloWorld";
    boolean starts = str.startsWith("Hello"); // true


19.

    endsWith(String suffix)

    String str = "HelloWorld";
    boolean ends = str.endsWith("World"); // true


20.

    toCharArray()

    String str = "Hello";
    char[] charArray = str.toCharArray(); // ['H', 'e', 'l', 'l', 'o']


21.

    valueOf(Object obj)

    int num = 123;
    String str = String.valueOf(num); // "123"


22.

    isEmpty()

    String str = "";
    boolean isEmpty = str.isEmpty(); // true


23.

    matches(String regex)

    String str = "12345";
    boolean matches = str.matches("\\d+"); // true


24.

    compareTo(String anotherString)

    String str1 = "abc";
    String str2 = "xyz";
    int cmp = str1.compareTo(str2); // Negative value (-23), since "abc" is lexicographically less than "xyz"


25.

    compareToIgnoreCase(String str)

    String str1 = "abc";
    String str2 = "ABC";
    int cmp = str1.compareToIgnoreCase(str2); // 0, because the strings are equal ignoring case

}