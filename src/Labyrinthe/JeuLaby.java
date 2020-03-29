package Labyrinthe;

import java.util.Random;

public class JeuLaby {
    //deplacement on test si y'a un mur ou pas
    //Renvoie les coords

    int PositionJoueurX;
    int PositionJoueurY;
    int PositionSortieX;
    int PositionSortieY;
    int PositionIdentifiantX;
    int PositionIdentifiantY;
    int PositionIdentifiantX2;
    int PositionIdentifiantY2;
    int ValeurPatern ;

    //Garder une memoire de la pos du joueur

    CelluleLaby [][] Labyrinthe;

    public JeuLaby(Integer taille) {
        this.Labyrinthe = new CelluleLaby[taille][taille];
        initpatern();
        getposjoueur();
        placementsortie();
        identifianttab();


    }
    public void placementsortie() {
        for(int i = 0; i<Labyrinthe.length ; i++){
            for (int j = 0; j<Labyrinthe[i].length ; j++){
                if(Labyrinthe[i][j].getTypecel().equals("sortie")){
                    this.PositionSortieX = i;
                    this.PositionSortieY = j;

                }
            }
        }
    }

    public void identifianttab()  {
        for(int i = 0; i<Labyrinthe.length ; i++){
            for (int j = 0; j<Labyrinthe[i].length ; j++){
                if(Labyrinthe[i][j].getTypecel().equals("ID")){
                    this.PositionIdentifiantX = j;
                    this.PositionIdentifiantY = i;
                }
            }
        }
        for(int i = 0; i<Labyrinthe.length ; i++){
            for (int j = 0; j<Labyrinthe[i].length ; j++){
                if(Labyrinthe[i][j].getTypecel().equals("ID2")){
                    this.PositionIdentifiantY2 = i;
                    this.PositionIdentifiantX2 = j;
                }
            }
        }

    }

    public void getposjoueur(){
        for(int i = 0; i<Labyrinthe.length ; i++){
            for (int j = 0; j<Labyrinthe[i].length ; j++){
                if(Labyrinthe[i][j].getPosjoueur()){
                    this.PositionJoueurX =i;
                    this.PositionJoueurY =j;
                }
            }
        }

    }

    public void initpatern(){

        Random obj = new Random();
        int rdmB = obj.nextInt(1);

        rdmB = 6;
        switch (rdmB) {
            case 0:
                this.Labyrinthe = PaternLaby.getPatern1();
                ValeurPatern = 1;
                break;
            case 1:
                this.Labyrinthe = PaternLaby.getPatern2();
                ValeurPatern = 2;
                break;
            case 2:
                this.Labyrinthe = PaternLaby.getPatern3();
                ValeurPatern = 3;
                break;
            case 3:
                this.Labyrinthe = PaternLaby.getPatern4();
                ValeurPatern = 4;
                break;
            case 4:
                this.Labyrinthe = PaternLaby.getPatern5();
                ValeurPatern = 5;
                break;
            case 5:
                this.Labyrinthe = PaternLaby.getPatern6();
                ValeurPatern = 6;
                break;
            case 6:
                this.Labyrinthe = PaternLaby.getPatern7();
                ValeurPatern = 7;
                break;
            case 7:
                this.Labyrinthe = PaternLaby.getPatern8();
                ValeurPatern = 8;
                break;
            case 8:
                this.Labyrinthe = PaternLaby.getPatern9();
                ValeurPatern = 9;
                break;
        }


    }

    //cree 4 deplacement
    public void deplacementhaut(){
        if(!Labyrinthe[PositionJoueurX][PositionJoueurY].getMurtop()){
            PositionJoueurX = PositionJoueurX - 1 ;
            System.out.println(PositionJoueurX + ":" + PositionJoueurY);
        } else{
            System.out.println("Erreur");
        }


    }

    public void deplacementbas(){
        if(!Labyrinthe[PositionJoueurX][PositionJoueurY].getMurbot()){
            PositionJoueurX = PositionJoueurX + 1 ;
            System.out.println(PositionJoueurX + ":" + PositionJoueurY);
        } else{
            System.out.println("Erreur");
        }


    }

    public void deplacementgauche(){
        if(!Labyrinthe[PositionJoueurX][PositionJoueurY].getMurleft()){
            PositionJoueurY = PositionJoueurY - 1 ;
            System.out.println(PositionJoueurX + ":" + PositionJoueurY);
        } else {
            System.out.println("Erreur");
        }


    }

    public void deplacementdroite(){
        if (!Labyrinthe[PositionJoueurX][PositionJoueurY].getMurright() ){
            PositionJoueurY = PositionJoueurY +1 ;
            System.out.println(PositionJoueurX + ":" + PositionJoueurY);
        } else {
            System.out.println("Erreur");
        }
    }
}
