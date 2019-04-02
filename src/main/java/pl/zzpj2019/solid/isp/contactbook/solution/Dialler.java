package pl.zzpj2019.solid.isp.contactbook.solution;

public class Dialler {
    public void call(Diallable diallable) {
        String telephone = diallable.getTelephone();
        System.out.println("Calling telephone number: " + telephone);
    }
}
