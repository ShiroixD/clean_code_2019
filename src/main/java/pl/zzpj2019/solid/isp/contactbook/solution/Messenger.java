package pl.zzpj2019.solid.isp.contactbook.solution;

public class Messenger {
    private static Emailer emailer;
    private static Dialler dialler;

    public Messenger() {
        emailer = new Emailer();
        dialler = new Dialler();
    }

    public static void contactPeople(final Contact contact) {
        System.out.println("Name: " + contact.getName() + "\nAddress: " + contact.getAddress() + "\n");
        ContactEmail email = contact.getContactEmail();
        ContactTelephone teelphone = contact.getContactTelephone();

        if (email != null) {
            emailer.sendEmail(contact.getContactEmail(), "promocja", "tanio dzisiaj!");
        }

        if (email != null) {
            dialler.call(contact.getContactTelephone());
        }
    }

    public static void main(String[] args) {
        Contact contact = new Contact("Jan Kowalski", "Kielce");
        ContactEmail contactEmail = new ContactEmail("jan.kowalski@gmail.com");
        ContactTelephone ContactTelephone = new ContactTelephone("83744-23434");
        contact.setContactEmail(contactEmail);
        contact.setContactTelephone(ContactTelephone);
        contactPeople(contact);
    }
}
