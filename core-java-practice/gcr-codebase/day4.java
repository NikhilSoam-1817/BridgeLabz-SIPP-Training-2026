import java.util.*;

public class day4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        

        String s="Hello";
        System.out.println(s.charAt(0));


        String s1="java";
        String s2="java";

        System.out.print(s1.equals(s2));
        System.out.print(s1==s2);


        // String immutability 
        String str="hello";
        s.toUpperCase();

        System.out.println(s);//hello


        s=s.toUpperCase();
        System.out.println(s);//HELLO

       
        // reverse string

        String st="hello";
        String result="";

        for(int i=st.length()-1;i>=0;i--){
            result=result+st.charAt(i);
        }
        System.out.print(result);



        // palindrome check

        String s3="madam";
        String s4="";
        for(int i=s3.length();i>=0;i--){
            s4=s4+s3.charAt(i);
        }
        if(s3.equals(s4)){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }
    }
}
