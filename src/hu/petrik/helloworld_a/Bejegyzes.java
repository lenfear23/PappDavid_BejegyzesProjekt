package hu.petrik.helloworld_a;

import java.time.LocalDateTime;

public class Bejegyzes {

    private String szerzo;
    private String tartalom;
    private int likeok;
    private LocalDateTime letrejott;
    private LocalDateTime szerkesztve;

    public Bejegyzes(String szerzo, String tartalom, int likeok, LocalDateTime letrejott, LocalDateTime szerkesztve) {
        this.szerzo = szerzo;
        this.tartalom = tartalom;
        this.likeok = 0;
        this.letrejott = LocalDateTime.now();
        this.szerkesztve = LocalDateTime.now();
    }

    public Bejegyzes(String row){
        var sor = row.split(";");
        this.szerzo = sor[0];
        this.tartalom = sor[1];
    }

    Bejegyzes(String szerzo, String tartalom){
        //todo:valami
    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getTartalom() {
        return tartalom;
    }

    public void setTartalom(String tartalom) {
        if (tartalom.length()>getTartalom().length()){
            this.szerkesztve = LocalDateTime.now();
        }

        this.tartalom = tartalom;
    }

    public int getLikeok() {
        return likeok;
    }

    public LocalDateTime getLetrejott() {
        return letrejott;
    }

    public LocalDateTime getSzerkesztve() {
        return szerkesztve;
    }

    public void like(){
        likeok++;
    }

    @Override
    public String toString() {
        return  szerzo +
                likeok +
                letrejott + '\n'+
                ", szerkesztve:" + szerkesztve + '\n' +
                  tartalom ;
    }
}
