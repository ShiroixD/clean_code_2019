package pl.zzpj2019.solid.isp.contactbook.solution;

public class ContactTelephone implements Diallable {
    private String telephone;

    public ContactTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
