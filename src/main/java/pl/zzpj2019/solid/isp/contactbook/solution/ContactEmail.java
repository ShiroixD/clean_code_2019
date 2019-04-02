package pl.zzpj2019.solid.isp.contactbook.solution;

public class ContactEmail implements Emailable {
    private String emailAddress;

    public ContactEmail(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
