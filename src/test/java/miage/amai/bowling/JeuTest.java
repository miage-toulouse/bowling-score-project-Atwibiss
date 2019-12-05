package miage.amai.bowling;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JeuTest {

    @Test
    public void testJeuEstValide(){
        Jeu j = new Jeu(new Essai(4), new Essai(6));
        assertTrue(j.isValid());
        j = new Jeu(new Essai(10), null);
        assertTrue(j.isValid());
        j = new Jeu(new Essai(3), new Essai(3));
        assertTrue(j.isValid());
    }

    @Test
    public void testJeuEstInvalide(){
        Jeu j = new Jeu(null, new Essai(6));
        assertFalse(j.isValid());
        j = new Jeu(new Essai(10), new Essai(6));
        assertFalse(j.isValid());
        j = new Jeu(new Essai(6), null);
        assertFalse(j.isValid());
        j = new Jeu(null, null);
        assertFalse(j.isValid());
}

}