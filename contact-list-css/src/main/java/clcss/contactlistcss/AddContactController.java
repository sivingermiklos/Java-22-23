package clcss.contactlistcss;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class AddContactController {
    @FXML
    private TextField name;
    @FXML
    private TextField phone;
    @FXML
    private TextField em;
    @FXML
    private ArrayList<Contact> allContacts = new ArrayList<>();

    @FXML
    protected void addContact(){
        String nev = name.getText();
        String telos = phone.getText();
        String email = em.getText();
        Contact egyContact = new Contact(nev,telos,email);
        allContacts.add(egyContact);
        System.out.println("Kontaktok szama: " + allContacts.size());
        name.setText("");
        phone.setText("");
        em.setText("");
    }
}