package task3;

public class Person {

    private String name;

    public Person(String theName){

        this.name = theName;

    }

    public String getName(){
        return name;
    }

    public void setName(String theNewName) {
        this.name = theNewName;
    }

    public boolean addCourse(String course){
        return true;
    }

}

//public class Main {
//  public static void main(String[] args) {
//    Person myObj = new Person();
//    myObj.setName("John"); // Set the value of the name variable to "John"
//    System.out.println(myObj.getName());
//  }
//}