package ObjectFundamentals09.Inheritance;

public class Test {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setCustomerId(401);
        customer.setFirstName("Y11d1z1m");
        customer.setLastName("Gurses");
        customer.setTotalDebit(500);
        customer.setEmailAdress("yılmaz@gmail.com");

        Person person = new Customer();
        person.setFirstName("Erdogan");
        person.setLastName("Berker");
        person.setEmailAdress("erdoğan@gmail.com");
        if (person instanceof Customer) {
            Customer customerPerson = (Customer) person;
            customerPerson.setCustomerId(402);
            customerPerson.setTotalDebit(230);
        }


        Supplier supplier=new Supplier ();
        supplier.setSupplierId (831); ;
        supplier. setFirstName ("Zekai") ;
        supplier. setLastName ("Tunca") ;
        supplier. setMainSector ("Kartasiye");
        supplier.setEmailAdress("Zekai@gmail.com");

        Employee employee=new Employee () ;
        employee. setEmployeId (651); ;
        employee. setFirstName ("Suat") ;
        employee.setLastName ("Sayin") ;
        employee. setDepartmentName ("Pazarlama");
        employee.setEmailAdress("Suat@gmail.com");


        System.out.println("Mugtera "+customer.getFullName());
        System.out.println("K191 "+person. getFullName () ) ;
        System.out.println("tedarikçi "+supplier.getFullName ()) ;
        System.out.println ("Calisan "+employee.getFullName());

        //polimorfizm
        System.out.println(customer.getGreetings()+"  Mugtera "+customer.getFullName());
        System.out.println(person.getGreetings()+"  K191 "+person. getFullName () ) ;
        System.out.println(supplier.getGreetings()+"  tedarikçi "+supplier.getFullName ()) ;
        System.out.println (employee.getGreetings()+"  Calisan "+employee.getFullName());

        Mailer mailer =new Mailer();
        mailer.send(customer);
        mailer.send(person);
        mailer.send(supplier);
        mailer.send(employee);


        Agent agent =new Agent();
        agent.setAgentId(123);
        agent.setFirstName("teoman");
        agent.setLastName("emel");
        agent.setActiviteRegion("marmara bölgesi");
        agent.setEmailAdress("teoman@gmail.com");


    }
}
