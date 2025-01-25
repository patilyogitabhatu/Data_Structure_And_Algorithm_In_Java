public class String_Methods {
    public static void main(String args[]){
        String str1 = "Hello World";
        
        //length()
        System.out.println("__________________");
        System.out.println("length()");
        System.out.println(str1);
        System.out.println("Length of str1 is "+str1.length());

        //indexOf()
        System.out.println("__________________");
        System.out.println("indexOf()");
        System.out.println(str1);
        System.out.println("Index Of Character o is "+str1.indexOf('o'));

        //lastIndexOf()
        System.out.println("__________________");
        System.out.println("lastIndexOf()");
        System.out.println(str1);
        System.out.println("Index of l char : "+str1.indexOf('l'));
        System.out.println("Last Index of l char : "+str1.lastIndexOf('l'));
        

        //toUpperCase()
        System.out.println("__________________");
        System.out.println("toUpperCase()");
        System.out.println("Original String: "+str1);
        System.out.println("After apply toUpperCase() : "+str1.toUpperCase());

        //toLowerCase()
        System.out.println("__________________");
        System.out.println("toLowerCase()");
        System.out.println("Original String: "+str1);
        System.out.println("After apply toLowerCase() : "+str1.toLowerCase());

        //concat()
        System.out.println("__________________");
        System.out.println("concat()");
        String str2 = " Welcome";

        System.out.println("After Using concat()");
        System.out.println(str1.concat(str2));

        //charAt()
        System.out.println("__________________");
        System.out.println("charAt()");
        System.out.println(str1);
        System.out.println("Char at index 2 is :"+str1.charAt(2));

        //compareTo()
        //0: if the current object is equal to the specified object.
        //A negative value: if the current object is less than the specified object.
        //A positive value: if the current object is greater than the specified object.
        System.out.println("__________________");
        System.out.println("compareTo()");
        String str3 = "Hello World";
        System.out.println(str1);
        System.out.println(str3);
        System.out.println(str1.compareTo(str3));

        //compareToIgnoreCase()
        System.out.println("__________________");
        System.out.println("compareToIgnoreCase()");
        String s1 = "HELLO";
        String s2 = "hello";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.compareToIgnoreCase(s2));

        //contains()
        System.out.println("__________________");
        System.out.println("contains()");
        System.out.println(str3);
        System.out.println("In the String hel contains : "+str3.contains("Hell"));
        System.out.println("In the String Ho contains : "+str3.contains("Ho"));

        //contentEquals()
        System.out.println("__________________");
        System.out.println("contentEquals()");
        System.out.println(str3);
        System.out.println("String content is equals to Hello :"+str3.contentEquals("Hello World"));

        //copyValueOf()
        System.out.println("__________________");
        System.out.println("copyValueOf()");
        char[] mystr1 = {'H' , 'E' , 'L' , 'L' , 'O'};
        String mystring = " demo ";
        mystring = mystring.copyValueOf(mystr1 , 0 , 4);
        System.out.println(mystring);

        //endsWith()
        System.out.println("__________________");
        System.out.println("endsWith()");
        System.out.println(str3);
        System.out.println("String ands with ld : "+str3.endsWith("ld"));

        //startsWith()
        System.out.println("__________________");
        System.out.println("startsWith()");
        System.out.println(str3);
        System.out.println("String ands with Hel : "+str3.startsWith("Hel"));

        //equals()
        System.out.println("__________________");
        System.out.println("equals()");
        str1 = "Hello";
        str2 = "Hello";
        System.out.println(str1+ " || "+str2+ " are equals : "+str1.equals(str2));

        //equalsIgnoreCase()
        System.out.println("__________________");
        System.out.println("equals()");
        str1 = "heLlo";
        str2 = "Hello";
        System.out.println(str1+ " || "+str2+ " are equals : "+str1.equalsIgnoreCase(str2));

        //isEmpty()
        System.out.println("__________________");
        System.out.println("isEmpty()");
        System.out.println("Is this String "+str1+" Empty : "+str1.isEmpty());

        //String.valueOf()
        //Use to convert value into the string
        System.out.println("__________________");
        System.out.println("valueOf()");
        int a = 411;
        int b = 1;
        System.out.println("Before applying valueOf : "+(a+b));
        System.out.println("After applying valueOf : "+(String.valueOf(a)+String.valueOf(b)));

        //join()
        //Syntax:
        //public String join(char sequence seperator, elements)
        System.out.println("__________________");
        System.out.println("Join()");
        String fruits = String.join("-","Orange","Apple","Mango");
        System.out.println(fruits);

        //replace()
        System.out.println("__________________");
        System.out.println("replace()");
        System.out.println(str1);
        System.out.println("After replacing e with i : "+str1.replace('e','i'));

        //replaceFirst()
        System.out.println("__________________");
        System.out.println("replaceFirst()");
        String demo1 = "This is w3School is.";
        System.out.println("After replacing is with at : "+demo1.replaceFirst("is", "at"));


        //split()
        System.out.println("__________________");
        System.out.println("split()");
        demo1 = "my name, is a, Yogita ";
        System.out.println(demo1);
        String arr[] = demo1.split(",");

        for(String s : arr){
            System.out.println(s);
        }

        //subSequence() / substring()
        System.out.println("__________________");
        System.out.println("subSequence() / substring()");
        System.out.println(str3);
        System.out.println("After using subSequence() from index 0 to 3 "+str3.subSequence(0, 3));
        System.out.println("After using substring() from index 0 to 3 "+str3.substring(0, 3));

        //toCharArray()
        System.out.println("__________________");
        System.out.println("toCharArray()");
        System.out.println(str3);
        char[] myarray = str3.toCharArray();

        for(char s : myarray){
            System.out.println(s);
        }

        //trim()
        System.out.println("__________________");
        System.out.println("trim()");
        str1 = "      Hello yogita   ";
        System.out.println(str1);
        System.out.println("After trim (removing whitespace from both ends.) : "+str1.trim());

        

        



        
    }    
}
