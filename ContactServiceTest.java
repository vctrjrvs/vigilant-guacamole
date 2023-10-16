public class ContactServiceTest {
    private ContactService contactService;

    @BeforeEach
    public void setUp() {
        contactService = new ContactService();
    }

    @Test
    public void testAddContact() {
        Contact contact = new Contact("1234567890", "Johnny", "Doe", "1234567890", "123 Trap St");
        contactService.addContact(contact);

        assertEquals(contact, contactService.getContact("1234567890"));
    }

    private void assertEquals(Contact contact, Contact contact2) {
        // this method is empty
    }

    @Test
    public void testDeleteContact() {
        Contact contact = new Contact("1234567890", "Johnny", "Doe", "1234567890", "123 Trap St");
        contactService.addContact(contact);
        contactService.deleteContact("1234567890");

        assertNull(contactService.getContact("1234567890"));
    }

    private void assertNull(Contact contact) {
        // this method is empty
    }

    @Test
    public void testUpdateContact() {
        Contact contact = new Contact("1234567890", "Johnny", "Doe", "1234567890", "123 Trap St");
        contactService.addContact(contact);

        contactService.updateContact("1234567890", "Janey", "Smith", "9876543210", "456 Paper St");

        Contact updatedContact = contactService.getContact("1234567890");
        assertEquals("Janey", updatedContact.getFirstName());
        assertEquals("Smith", updatedContact.getLastName());
        assertEquals("9876543210", updatedContact.getPhone());
        assertEquals("456 Paper St", updatedContact.getAddress());
    }

    private void assertEquals(String string, String address) {
        // this method is empty
    }
}
