public class Encap {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setID(10);
        System.out.println(emp.getID());

        emp.setName("RDJ");
        System.out.println(emp.getName());
        emp.name = "SRK";// not encapsulatedd
        System.out.println("Name = "+ emp.name);
    }
}

class Employee{
    int id;
    String name;


    void setID(int localID){//Encapsulation
        id = localID;
    }

    int getID(){
        return id;
    }

    void setName(String localName){
        name = localName;
    }

    String getName(){
        return name;
    }
}
