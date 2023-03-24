package task3;

public abstract class Person {

    protected String name;

    public Person(String name){

        this.name = name;

    }

    public String getName(){
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    /*public boolean addCourse(String course){
        return true;
    }*/

    public abstract boolean addCourse(String course);

    /*to main
    Person p1 = new Person("Signe");
    p1.addCourse("Dat1")*/

}

//public class Main {
//  public static void main(String[] args) {
//    Person myObj = new Person();
//    myObj.setName("John"); // Set the value of the name variable to "John"
//    System.out.println(myObj.getName());
//  }
//}