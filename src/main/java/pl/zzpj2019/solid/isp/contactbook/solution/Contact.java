package pl.zzpj2019.solid.isp.contactbook.solution;

public class Contact {
    private String name;
    private String address;
    private ContactEmail contactEmail;
    private ContactTelephone contactTelephone;

    public Contact(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ContactEmail getContactEmail() {return contactEmail;}

    public void setContactEmail(ContactEmail contactEmail) {this.contactEmail = contactEmail;}

    public ContactTelephone getContactTelephone() {return contactTelephone;}

    public void setContactTelephone(ContactTelephone contactTelephone) {this.contactTelephone = contactTelephone;}

}
