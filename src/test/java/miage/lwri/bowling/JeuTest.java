package miage.lwri.bowling;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JeuTest {

    @Test
    public void testGetlance1() {
        // given : un jeu avec un lancé 1 de 4 et un lancé 2 de 3
        Jeu jeu = new Jeu(4, 3);
        // when : on demande le score du lancé 1
        Integer score =  jeu.getLance1();
        //then: le score est de 4
        assertEquals(new Integer(4), score);
    }

    @Test
    public void testGetlance2() {
        // given : un jeu avec un lancé 1 de 4 et un lancé 2 de 3
        Jeu jeu = new Jeu(4, 3);
        // when : on demande le score du lancé 2
        Integer score = jeu.getLance2();
        //then: le score est de 3
        assertEquals(new Integer(3), score);
    }

    @Test
    public void testGetScore() {
        // given : un jeu avec un lancé 1 de 4 et un lancé 2 de 3
        Jeu jeu = new Jeu(4, 3);
        // when : on demande le score du jeu
        Integer score = jeu.getScore();
        // then : le score est de 7
        assertEquals(new Integer(7), score);
    }

    @Test
    public void testIsStrike() {
        // given : un jeu avec un Strike
        Jeu jeu = new Jeu(10, null);
        // when : on demande si le jeu est un strike
        boolean score = jeu.isStrike();
        // then : c'est un strike
        assertTrue(score);

        // given : un jeu avec un lancé 1 de 9 et un lancé 2 de 1
        Jeu jeu1 = new Jeu(9, 1);
        // when : on demande si le jeu est un strike
        boolean score1 = jeu1.isStrike();
        // then : ce n'est pas un strike
        assertFalse(jeu1.isStrike());
    }

    @Test
    public void testIsSpare() {
        // given : un jeu Spare avec un lancé 1 de 5 et un lancé 2 de 5
        Jeu jeu2 = new Jeu(5, 5);
        // when : on demande si le jeu est un spare
        boolean score = jeu2.isSpare();
        // then : c'est un spare
        assertTrue(score);

        // given : un jeu avec un lancé 1 de 3 et un lancé 2 de 4
        Jeu jeu = new Jeu(3, 4);
        // when : on demande si le jeu est un spare
        boolean score1 = jeu.isSpare();
        // then : ce n'est pas un spare
        assertFalse(jeu.isSpare());
    }

}