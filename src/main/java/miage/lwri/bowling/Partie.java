package miage.lwri.bowling;

import java.util.List;

public class Partie {

    private List<Jeu> jeux;

    public Partie(List<Jeu> jeux){
        this.jeux = jeux;
    }

    public int getScore() {
        int score = 0;
        for (int i = 0; i < 9; i++) {
            if (this.jeux.get(i).isStrike()) {
                score += 10 + this.jeux.get(i + 1).getLance1();
                if (this.jeux.get(i + 1).isStrike()) {
                    score += 10;
                } else {
                    score += this.jeux.get(i + 1).getLance2();
                }
            } else if (this.jeux.get(i).isSpare()) {
                score += 10 + this.jeux.get(i + 1).getLance1();
            } else {
                score += this.jeux.get(i).getScore();
            }
        }

        // gérer les points supplémentaires
        if (this.jeux.get(9).isStrike()) {
                score += 10;
                if (this.jeux.get(9).isStrike()) {
                    score += this.jeux.get(10).getLance1();
                    if (this.jeux.get(10).isStrike()) {
                        score += this.jeux.get(11).getLance1();
                    } else {
                        score += this.jeux.get(10).getLance2();
                    }
                }
                else {
                    score += this.jeux.get(10).getScore();
                }
        } else if (this.jeux.get(9).isSpare()) {
            score += 10 + this.jeux.get(10).getLance1();
        } else {
            score += this.jeux.get(9).getScore();
        }
        return score;
    }
}
