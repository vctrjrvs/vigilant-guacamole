import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private final Map<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Contact with the same ID already exists.");
        }
        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String contactId) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact with the specified ID does not exist.");
        }
        contacts.remove(contactId);
    }

    public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
        Contact existingContact = contacts.get(contactId);
        if (existingContact != null) {
            if (firstName != null) {
                existingContact.setFirstName(firstName);
            }
            if (lastName != null) {
                existingContact.setLastName(lastName);
            }
            if (phone != null) {
                existingContact.setPhone(phone);
            }
            if (address != null) {
                existingContact.setAddress(address);
            }
        }
    }

    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}
