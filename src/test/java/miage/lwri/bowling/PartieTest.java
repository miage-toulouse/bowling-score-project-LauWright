package miage.lwri.bowling;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PartieTest {

    @Test
    public void testCalculeScorePartieSansStrikeSansSpare(){
        // given: Une partie de 10 jeu avec 6 quilles tombées dans chaque jeu
        List<Jeu> jeux = new ArrayList<>();
        for (int i = 0; i<10; i++) {
            jeux.add(new Jeu(3,3));
        }
        Partie lapartie = new Partie(jeux);
        // when : On calcule le score
        int score = lapartie.getScore();
        // then : On obtient 60
        assertEquals(60, score);
    }

    @Test
    public void testCalculeScorePartieAvecUniquementDesSpares(){
        // given: Une partie de 10 jeu avec Spare pour tous les jeux
        List<Jeu> jeux = new ArrayList<>();
        for (int i = 0; i<11; i++) {
            jeux.add(new Jeu(5, 5));
        }
        Partie lapartie = new Partie(jeux);
        // when : On calcule le score
        int score = lapartie.getScore();
        // then : On obtient 150
        assertEquals(150, score);
    }

    @Test
    public void testCalculeScorePartieAvecUniquementDesStrikes(){
        // given: Une partie de 10 jeu avec Strike pour tous les jeux
        List<Jeu> jeux = new ArrayList<>();
        for (int i = 0; i<12; i++) {
            jeux.add(new Jeu(10, null));
        }
        Partie lapartie = new Partie(jeux);
        // when : On calcule le score
        int score = lapartie.getScore();
        // then : On obtient 300
        assertEquals(300, score);
    }

    @Test
    public void testCalculeScorePartieRandom(){
        // given: Une partie de 10 des jeux random
        List<Jeu> jeux = new ArrayList<>();
        jeux.add(new Jeu(10, null));
        jeux.add(new Jeu(5, 3));
        jeux.add(new Jeu(6, 3));
        jeux.add(new Jeu(5, 5));
        jeux.add(new Jeu(7, 0));
        jeux.add(new Jeu(8, 2));
        jeux.add(new Jeu(10, null));
        jeux.add(new Jeu(8, 0));
        jeux.add(new Jeu(7, 0));
        jeux.add(new Jeu(9, 0));
        Partie lapartie = new Partie(jeux);
        // when : On calcule le score
        int score = lapartie.getScore();
        // then : On obtient 121
        assertEquals(121, score);
    }
}