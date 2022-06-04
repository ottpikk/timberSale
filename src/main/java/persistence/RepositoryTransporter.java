package persistence;

import model.Transporter;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RepositoryTransporter {
    Transporter transporter = new Transporter();
    private EntityManager em;

    Scanner scanner = new Scanner(System.in);
    public RepositoryTransporter(){
        em = DBUtil.getEntityManager();
    }

    public void addTransporter(){

        System.out.println("Company name: ");
        transporter.setCompanyName(scanner.nextLine());
        System.out.println("Contact person: ");
        transporter.setContactPerson(scanner.nextLine());
        System.out.println("Phone number: ");
        transporter.setPhone(scanner.nextLine());
        System.out.println("E-mail: ");
        transporter.setEmail(scanner.nextLine());
        System.out.println("Max weight: ");
        transporter.setMaxWeight(scanner.nextInt());
        System.out.println("Address: ");
        transporter.setAddress(scanner.nextLine());
        System.out.println("Bank account: ");
        transporter.setBankAccount(scanner.nextLine());

        validation();

        try {
            this.em.getTransaction().begin();
            this.em.persist(transporter);
            this.em.getTransaction().commit();
            System.out.println("New transporter added:\n\t"+transporter.toString());
        } catch (Exception e){
            this.em.getTransaction().rollback();
        }
    }

    public void validation(){
        Pattern namePattern = Pattern.compile("^[A-z\\s]{3,20}$");
        Pattern phonePattern = Pattern.compile("^[0-9\\d]{5,18}$");
        Pattern emailPattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        while (!namePattern.matcher(transporter.getCompanyName()).matches()){
            System.out.println("Type correct name of company: ");
            transporter.setCompanyName(scanner.nextLine());
        }
        while (!namePattern.matcher(transporter.getContactPerson()).matches()){
            System.out.println("Type correct name of the contact person: ");
            transporter.setContactPerson(scanner.nextLine());
        }
        while (!phonePattern.matcher(transporter.getPhone()).matches()){
            System.out.println("Type the correct phone number: ");
            transporter.setPhone(scanner.nextLine());

        }
        while (!emailPattern.matcher(transporter.getEmail()).matches()){
            System.out.println("Type the correct e-mail address: ");
            transporter.setEmail((scanner.nextLine()));
        }
    }



    @SuppressWarnings("unchecked")
    public List<Transporter> listAllTransporters() {
        return em.createQuery("Select e from Transporter as e order by e.transporterId asc")
                .getResultList();
    }
}
