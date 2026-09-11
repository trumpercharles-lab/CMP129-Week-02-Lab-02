public class PersonTest {
    public static void main(String args[]){
        Person P1=new Person(), P2=new Person();
        P1.setAge(17);
        P1.setName("Patricia");
        P1.setEmail("Patricia@gmail.com");

        P2.setAge(45);
        P2.setName("Bob");
        P2.setEmail("Bob@gmail.com");

        P1.displayInfo();
        P2.displayInfo();
    }
}
