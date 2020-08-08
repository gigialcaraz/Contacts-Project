package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class FillClient {

    private Scanner input = new Scanner(System.in);
    private String chosenOption;

    ArrayList<Client> clients = new ArrayList<Client>(10);
    ArrayList<Profession> professions = new ArrayList<Profession>(7);
    ArrayList<String> styles = new ArrayList<>(5);
    //methods
    public void firstMenu () {
        String name;
        String surname;
        String email;
        String residence;
        int family;
        int age;
        int phoneNum;
        Profession job;
        System.out.println("Name");
        name =input.nextLine();
        System.out.println("Surname");
        surname=input.nextLine();
        System.out.println("Email");
        email=input.nextLine();
        System.out.println("Residence");
        residence = input.nextLine();
        System.out.println("Phone number");
        phoneNum= input.nextInt();
        System.out.println("Family Members Number");
        family=input.nextInt();
        System.out.println("Age");
        age=input.nextInt();
        System.out.println("sample.Profession");
        job =   returnProfession();

        Client newClient = new Client(name, surname,email,residence, phoneNum,family, age, job);

        clients.add(newClient);
        if (clients.add(newClient)) {
            System.out.println("sample.Client Added " + newClient.getName()); // what's wrong here

        }
    }

    private Profession returnProfession() {
        int i;
        int n = 1;
        for (Profession p:  professions) {
            System.out.println(n + p.getProfessionName());// gets what you selected from Observable list
            n++;
        }
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();
        return professions.get(i -1);
    }
    private void work() {
        professions.add(new Profession("Engineer/Scientist"));
        professions.add(new Profession("Worker"));
        professions.add(new Profession("Doctor/Dentist"));
        professions.add(new Profession("Manager/Director"));
        professions.add(new Profession("CEO"));
        professions.add(new Profession("Teacher"));
        professions.add(new Profession("Official"));
    }

    public void initialize () {
        work();
    }

    public void style () {
        styles.add("modern");
        styles.add("roman");
        styles.add("classic");
        styles.add("elegant");
        styles.add("old-fashioned");
    }
}






