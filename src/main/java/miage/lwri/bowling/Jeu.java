package miage.lwri.bowling;

public class Jeu {

    private Integer lance1;
    private Integer lance2;

    public Jeu(Integer l1, Integer l2){
        this.lance1 = l1;
        this.lance2 = l2;
    }

    public Integer getLance1() {
        return this.lance1;
    }

    public Integer getLance2() {
        return this.lance2;
    }

    public Integer getScore() {
        return this.lance1 + this.lance2;
    }

    public boolean isStrike() {
        Boolean rep = false;
        if (this.lance1 == 10) {
            rep = true;
        }
        return rep;
    }

    public boolean isSpare() {
        Boolean rep = false;
        if (this.lance1 + this.lance2 == 10 && this.lance1 != null) {
            rep = true;
        }
        return rep;
    }
}
