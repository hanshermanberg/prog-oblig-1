import org.junit.Test;
import prog.PersonValidator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class personTest {

@Test
    public void testValidEmailAdresses(){
        assertTrue(PersonValidator.email("per.andresen@oslomet.no"));
        assertTrue(PersonValidator.email("example@example.com"));
        assertTrue(PersonValidator.email("uk@domain.co.uk"));
    }
    @Test
    public void testInvalidEmailAdresses(){
        assertFalse(PersonValidator.email(""));
        assertFalse(PersonValidator.email("per.andresen"));
        assertFalse(PersonValidator.email("per@andresen"));
        assertFalse(PersonValidator.email(";per@example.com"));
    }

    @Test
    public void testValidNavn(){
        assertTrue(PersonValidator.navn("Per Andresen"));

    }

    @Test
    public void testInvalidNavn(){
        assertFalse(PersonValidator.navn("Per007"));
        assertFalse(PersonValidator.navn("Per_Arne Andresen"));
        assertFalse(PersonValidator.navn(""));
    }






}
