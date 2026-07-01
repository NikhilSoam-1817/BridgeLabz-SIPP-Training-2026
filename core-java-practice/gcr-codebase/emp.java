import java.util.ArrayList;

public class emp {
    static class employee{
        String name;


    employee(String name){
        this.name=name;
    }

    public String toString(){
        return name;
    }
    }
    public static void main(String args[]){
        ArrayList<employee> list=new ArrayList<>();
        list.add(new employee("Alice"));
        list.add(new employee("Bob"));
        System.out.print(list);
    }
}