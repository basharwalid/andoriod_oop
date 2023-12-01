package Person;

public class Person {
    private String name;
    private String address;
    Person(){
        name = "";
        address = "";
    };

    Person(String name , String address){
        this.name = name;
        this.address = address;
    }



    String getName(){
        return name;
    }

    String getAddress(){
        return address;
    }

    void setAddress(String address){
        this.address = address;
    }

    public String toString(){
        return name+"("+address+")";
    }

}
