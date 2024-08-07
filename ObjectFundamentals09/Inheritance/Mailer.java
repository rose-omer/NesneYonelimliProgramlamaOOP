package ObjectFundamentals09.Inheritance;

public class Mailer {
    public  void  send(Person person){
        System.out.println("kime "+ person.getEmailAdress());
        System.out.println("Konu "+ person.getGreetings());
        System.out.println("Gövde "+person.getGreetings()+" "+ person.getFullName());
        System.out.println();
    }
}
