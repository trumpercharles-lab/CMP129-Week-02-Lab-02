public class Person {
    private String name, email;
    private int age;

    public void setName(String newName){
        name=newName;
    }

    public void setAge(int newAge){
        age=newAge;
    } 

    public void setEmail(String newEmail){
        email=newEmail;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getEmail(){
        return email;
    }

    public void displayInfo(){
        System.out.print("Name: "+name+" | Age: "+age+" | Email: "+email+"\n");
    }
}
