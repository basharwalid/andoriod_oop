public class Person {
    private String name;
    private String address;

    Person(String name , String address){
        this.name = name;
        this.address = address;
    }

    Person(){};

    String getName(){
        return name;
    }

    String getAddress(){
        return address;
    }

    void setAddress(String address){
        this.address = address;
    }

}
