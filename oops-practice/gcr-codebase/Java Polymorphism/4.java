class LibraryMember{
    String name,id;

    LibraryMember(String n,String i){
        name=n;
        id=i;
    }

    double calculateFine(int days){
        return 0;
    }
}

class StudentMember extends LibraryMember{
    StudentMember(String n,String i){
        super(n,i);
    }

    double calculateFine(int days){
        return days*2;
    }
}

class FacultyMember extends LibraryMember{
    FacultyMember(String n,String i){
        super(n,i);
    }

    @Override
    double calculateFine(int days){
        return days*1;
    }
}

class Main{
    public static void main(String[] args){
        LibraryMember[] arr={
            new StudentMember("Aman","101"),
            new FacultyMember("Raj","102")
        };

        for(LibraryMember m:arr)
            System.out.println(m.calculateFine(5));
    }
}