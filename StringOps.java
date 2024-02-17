public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
    }

    public static String capVowelsLowRest (String string) {
        String newString = "";
        for (int i = 0; i< string.length();i++)
        {
            char curr= string.charAt(i);
            if (curr == 'a' ||curr=='e'||curr == 'i'||curr=='o'||curr == 'u')
            {
                newString= newString + ((char)(curr-32));
            }else if (curr == 'A' ||curr=='E'||curr == 'I'||curr=='O'||curr == 'U')
             {
                newString = newString+((char)(curr));
            } else if (curr>=65 && curr<=90 ) {
                newString= newString+ ((char)(curr+32));    
            }else 
            newString=newString+((char)(curr));
       }
        return newString;
    }

    public static String camelCase (String string) {
        // Write your code here:
        String newString="";
        int x = 0;
        
        while (string.charAt(x) ==32)
        {
            x++;
        }
        char temp=string.charAt(x);
        if (temp>=65 && temp<=90)
        {
            newString=newString+((char)(temp+32));
        }else newString=newString+((char)(temp));
        
        
        for (int i=(x+1); i<string.length(); i++)
        {
            char curr= string.charAt(i);
            
            if ((temp==32) &&(curr != 32))
            {
                if ((curr>=97) && (curr<=122)){
                    newString=newString+ ((char)(curr-32));
                }else newString=newString+ ((char)(curr));
            }else if ((temp!=32) &&(curr != 32)){
                if ((curr>=97) && (curr<=122)){
                    newString=newString+ ((char)(curr));
                }else newString=newString+ ((char)(curr+32));
            }
            temp=curr;
        }

        return newString;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        int index=0;
        for (int i=0; i<string.length();i++)
        {
            if (string.charAt(i)==chr)
            {
                index++;
            }
        }
        int[] arr = new int[index];
        index=0;
        for (int j=0;j<string.length();j++)
        {
            if (string.charAt(j)==chr)
            {
                arr[index]=j;
                index++;
            }
        }
        return arr;
    }
}
