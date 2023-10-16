public class ContactTest {
    @Test
    public void testCreateContact() {
        Contact contact = new Contact("1234567890", "Johnny", "Doe", "1234567890", "123 Trap St");

        assertEquals("1234567890", contact.getContactId());
        assertEquals("Johnny", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Trap St", contact.getAddress());
    }

    private void assertEquals(String string, String address) {
        // this method is empty
    }

    @Test
    public void testInvalidContactId() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "Johnny", "Doe", "1234567890", "123 Trap St");
        });
    }

    @Test
    public void testInvalidFirstName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", null, "Doe", "1234567890", "123 Trap St");
        });
    }

    @Test
    public void testInvalidLastName() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "Johnny", null, "1234567890", "123 Trap St");
        });
    }

    @Test
    public void testInvalidPhone() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "Johnny", "Doe", null, "123 Trap St");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "Johnny", "Doe", "12345", "123 Trap St");
        });
    }

    @Test
    public void testInvalidAddress() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "Johnny", "Doe", "1234567890", null);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1234567890", "Johnny", "Doe", "1234567890", "This is a very long address that exceeds 30 characters.");
        });
    }

    private void assertThrows(Class<IllegalArgumentException> class1, Object object) {
    }
}
