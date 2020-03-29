package Clavier;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.scene.control.Button;


public class ClavierControleur implements Initializable {

    @FXML
    Button Button00;
    @FXML
    Button Button10;
    @FXML
    Button Button01;
    @FXML
    Button Button11;

    //Crée une liste de symbole *6
    ArrayList<String> Colonne1= new ArrayList<>();
    ArrayList<String> Colonne2= new ArrayList<>();
    ArrayList<String> Colonne3= new ArrayList<>();
    ArrayList<String> Colonne4= new ArrayList<>();
    ArrayList<String> Colonne5= new ArrayList<>();
    ArrayList<String> Colonne6 = new ArrayList<>();
    ArrayList<ArrayList> ColonneChoix = new ArrayList<>();
    ArrayList<String> Victoire = new ArrayList<>();

    Random rand = new Random();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        LstCol();
        choisirCol();
        symbAlea();
    }

    private void choisirCol(){
        Random obj = new Random();
        int rdmB = obj.nextInt(5);

        ColonneChoix.add( Colonne1);
        ColonneChoix.add( Colonne2);
        ColonneChoix.add( Colonne3);
        ColonneChoix.add( Colonne4);
        ColonneChoix.add( Colonne5);
        ColonneChoix.add( Colonne6);
        switch (rdmB){
            case 0:
                ColonneChoix.get(0); //colonneChoix.get[0]
                RemplirClavier(Colonne1);
                break;
            case 1:
                ColonneChoix.get(1);
                RemplirClavier(Colonne2);

                break;
            case 2:
                ColonneChoix.get(2);
                RemplirClavier(Colonne3);

                break;
            case 3:
                ColonneChoix.get(3);
                RemplirClavier(Colonne4);

                break;
            case 4:
                ColonneChoix.get(4);
                RemplirClavier(Colonne5);

                break;
            case 5:
                ColonneChoix.get(5);
                RemplirClavier(Colonne6);

                break;
        }

    }


    private void RemplirClavier(ArrayList<String> Colonne) {

        Random obj = new Random();

        int rdmB = obj.nextInt(Colonne.size());
        Button00.setText(Colonne.get(rdmB));
        String Symbole1 = Colonne.get(rdmB);
        Colonne.remove(rdmB);

        rdmB = obj.nextInt(Colonne.size());
        Button01.setText(Colonne.get(rdmB));
        String Symbole2 = Colonne.get(rdmB);
        Colonne.remove(rdmB);

        rdmB = obj.nextInt(Colonne.size());
        Button10.setText(Colonne.get(rdmB));
        String Symbole3 = Colonne.get(rdmB);
        Colonne.remove(rdmB);

        rdmB = obj.nextInt(Colonne.size());
        Button11.setText(Colonne.get(rdmB));
        String Symbole4 = Colonne.get(rdmB);
        Colonne.remove(rdmB);



    }

    private void LstCol() { //ICI on pioche 4 symbole dans la liste


        Colonne1.add("\u03DF");//\u03DF Ϟ
        Colonne1.add("\u04A8");//\u04A8 Ҩ
        Colonne1.add("\u03FF");//\u03FF Ͽ
        Colonne1.add("\u03FE");//\u03FE Ͼ
        Colonne1.add("\u00a7");//\u00a7 §
        Colonne1.add("\u03D5");//\u03D5 φ
        Colonne1.add("\u03C2");//\u03C2 ς

        Colonne2.add("\u03A9");//\u03A9 Ω
        Colonne2.add("\u03B4");//\u03B4 δ
        Colonne2.add("\u019b");//\u019b ƛ
        Colonne2.add("\u2606");//\u2606 ☆
        Colonne2.add("\u2605");//\u2605 ★
        Colonne2.add("\u00b6");//\u00b6 ¶
        Colonne2.add("\u00a4");//\u00a4 ¤

        Colonne3.add("\u00f0");//\u00f0 ð
        Colonne3.add("\u0416");//\u0416 Ж
        Colonne3.add("\u0466");//\u0466 Ѧ
        Colonne3.add("\u0462");//\u0462 Ѣ
        Colonne3.add("\u046e");//\u046e Ѯ
        Colonne3.add("\u04ec");//\u04ec Ӭ
        Colonne3.add("\u01e4");//\u01e4 Ǥ

        Colonne4.add("\u1d79");//\u1d79 ᵹ
        Colonne4.add("\u054a");//\u054a Պ
        Colonne4.add("\u2207");//\u2207 ∇
        Colonne4.add("\u022b");//\u022b ȫ
        Colonne4.add("\u00e6");//\u00e6 æ
        Colonne4.add("\u019b");//\u019b ƛ
        Colonne4.add("\u00f0");//\u00f0 ð

        Colonne5.add("\u03A9");//\u03A9 Ω
        Colonne5.add("\u0466");//\u0466 Ѧ
        Colonne5.add("\u00a4");//\u00a4 ¤
        Colonne5.add("\u03DF");//\u03DF Ϟ
        Colonne5.add("\u046e");//\u046e Ѯ
        Colonne5.add("\u00b6");//\u00b6 ¶
        Colonne5.add("\u0462");//\u0462 Ѣ

        Colonne6.add("\u03D5");//\u03D5 φ
        Colonne6.add("\u03FE");//\u03FE Ͼ
        Colonne6.add("\u019b");//\u019b ƛ
        Colonne6.add("\u0416");//\u0416 Ж
        Colonne6.add("\u04ec");//\u04ec Ӭ
        Colonne6.add("\u04A8");//\u04A8 Ҩ
        Colonne6.add("\u2606");//\u2606 ☆

    }

    private void symbAlea(){
        int nbrelement = 3;
        for (int i = 0; i < nbrelement; i++) {
            int randomIndex = rand.nextInt(ColonneChoix.size());
            ArrayList randomElement = ColonneChoix.get(randomIndex);
            ColonneChoix.remove(randomIndex);
        }
        System.out.println(ColonneChoix);
    }


}




//1
//      \u03DF Ϟ
//  	\u04A8 Ҩ
//      \u03FF Ͽ
//     	\u03FE Ͼ
//      \u00a7 §
//      \u03D5 φ
//      \u03C2 ς

//2
//      \u03A9 Ω
//      \u03B4 δ
//      \u019b ƛ
//      \u2606 ☆
//      \u2605 ★
//      \u00b6 ¶
//      \u00a4 ¤

//3
//      \u00f0 ð
//      \u0416 Ж
//      \u0466 Ѧ
//      \u0462 Ѣ
//      \u046e Ѯ
//      \u04ec Ӭ
//      \u01e4 Ǥ

//4
//      \u1d79 ᵹ
//      \u054a Պ
//      \u2207 ∇
//      \u022b ȫ
//      \u00e6 æ
//      \u019b ƛ
//      \u00f0 ð

//5
//      \u03A9 Ω
//      \u0466 Ѧ
//      \u00a4 ¤
//      \u03DF Ϟ
//      \u046e Ѯ
//      \u00b6 ¶
//      \u0462 Ѣ

//6
//      \u03D5 φ
//     	\u03FE Ͼ
//      \u019b ƛ
//      \u0416 Ж
//      \u04ec Ӭ
//  	\u04A8 Ҩ
//      \u2606 ☆