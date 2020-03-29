package Labyrinthe;

public class CelluleLaby {

    //attribut de la classe
    Boolean murtop;
    Boolean murbot;
    Boolean murright;
    Boolean murleft;
    Boolean posjoueur; //true = joueur
    String typecel; //repérage interface graphique

    public CelluleLaby(Boolean murtop, Boolean murbot, Boolean murright, Boolean murleft, Boolean posjoueur, String typecel) {
        this.murtop = murtop;
        this.murbot = murbot;
        this.murright = murright;
        this.murleft = murleft;
        this.posjoueur = posjoueur;
        this.typecel = typecel;

    }

    public Boolean getMurtop() {
        return murtop;
    }


    public void setMurtop(Boolean murtop) {
        this.murtop = murtop;
    }

    public Boolean getPosjoueur() {
        return posjoueur;
    }

    public void setPosjoueur(Boolean posjoueur) {
        this.posjoueur = posjoueur;
    }

    public Boolean getMurbot() {
        return murbot;
    }

    public void setMurbot(Boolean murbot) {
        this.murbot = murbot;
    }

    public Boolean getMurright() {
        return murright;
    }

    public void setMurright(Boolean murright) {
        this.murright = murright;
    }

    public Boolean getMurleft() {
        return murleft;
    }

    public void setMurleft(Boolean murleft) {
        this.murleft = murleft;
    }


    public String getTypecel() {
        return typecel;
    }

    public void setTypecel(String typecel) {
        this.typecel = typecel;
    }
}

