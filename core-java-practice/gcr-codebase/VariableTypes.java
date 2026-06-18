// Ravi just joined a coding guild. Store his name, age, rank, salary, and 
// membership fee (float) using correct data types. Compute his 
// annual bonus (12% of salary), cast it to int, and print a formatted 
// welcome card.
import java.util.*;
public  class VariableTypes{
public static void main (String args[]){
    Scanner sc=new Scanner(System.in);


    String name=sc.nextLine();
    int age=sc.nextInt();
    int rank=sc.nextInt();
    float salary=sc.nextFloat();
    float fee=sc.nextFloat();
   

    int bonus=(int) ((12*salary)/100);
    System.out.println(bonus);
    
    float LPA=salary+bonus;
    System.out.println("Welcome! Your salary is,"+LPA);

    


}
}


