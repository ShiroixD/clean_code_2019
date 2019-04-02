package pl.zzpj2019.solid.isp.contactbook.solution;

public class Emailer {
    public void sendEmail(Emailable emailable, String subject, String content) {
        String email = emailable.getEmailAddress();
        String message = "Subject: " + subject;
        message += "\nTo: " + email;
        message += "\nContent:\n" + content;
        System.out.println("Sending message:\n" + message);
    }
}
