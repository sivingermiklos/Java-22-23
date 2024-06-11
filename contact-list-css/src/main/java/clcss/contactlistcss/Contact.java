package clcss.contactlistcss;

public class Contact {
    private String nev, telos, email;

    public String getNev() {
        return nev;
    }
    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getTelos() {
        return telos;
    }
    public void setTelos(String telos) {
        this.telos = telos;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public Contact(String nev, String telos, String email) {
        this.setNev(nev);
        this.setTelos(telos);
        this.setEmail(email);
    }
}
