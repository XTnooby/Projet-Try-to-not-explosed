package Labyrinthe;

public  class  PaternLaby {
    ////JUSTE LE VISU getpartn etc.....

        //Cree methode pour chaque patern

    //Identification du tableau

    //Getter plateau -> jeuLabi = paternlabi.jeuplateau


    public static CelluleLaby[][] getPatern1 (){

        CelluleLaby [][] plateau = new CelluleLaby[6][6];

        //Cellule L1
        //Joueur
        plateau [0][0] = new CelluleLaby( true ,false , false , true ,true , "cell");
        plateau [0][1] = new CelluleLaby(true ,true , false , false ,false ,  "ID"); //Trou1
        plateau [0][2] = new CelluleLaby(true ,false , true , false ,false,"cell");
        plateau [0][3] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [0][4] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [0][5] = new CelluleLaby(true ,false , true , false ,false,"cell");

        //CelluleL2
        plateau [1][0] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [1][1] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [1][2] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [1][3] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [1][4] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [1][5] = new CelluleLaby(true ,false , true , false ,false,"cell");

        //Cellule L3
        plateau [2][0] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [2][1] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [2][2] = new CelluleLaby(true ,false , true , false ,false,"cell");
        plateau [2][3] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [2][4] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [2][5] = new CelluleLaby(false ,false , true , false ,false,"cell"); //a fixer

        //Cellule L4
        plateau [3][0] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [3][1] = new CelluleLaby(true ,true , false , true ,false,"cell");
        plateau [3][2] = new CelluleLaby(false ,true , false , false ,false,"cell");
        plateau [3][3] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [3][4] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [3][5] = new CelluleLaby(false ,false , true , false ,false,"cell");

        //Cellule L5
        plateau [4][0] = new CelluleLaby(false ,false , false , true ,false,"cell");
        plateau [4][1] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [4][2] = new CelluleLaby(true ,false , true , false ,false,"cell");
        plateau [4][3] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [4][4] = new CelluleLaby(true ,true , true , false ,false,"cell");
        plateau [4][5] = new CelluleLaby(false ,false , true , true ,false,"cell");

        //Cellule L6
        plateau [5][0] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [5][1] = new CelluleLaby(true ,true , true , false ,false,"cell");
        plateau [5][2] = new CelluleLaby(false ,true , false , true ,false ,"ID2"); //Troue2
        plateau [5][3] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [5][4] = new CelluleLaby(true ,true , false , true ,false,"sortie");
        plateau [5][5] = new CelluleLaby(false ,true , true , false ,false,"cell");
        //Sortie

        return plateau;

    } //Fait

    public static CelluleLaby[][] getPatern2() {
        CelluleLaby [][] plateau = new CelluleLaby[6][6];

        plateau [0][0] = new CelluleLaby( true ,true , false , true ,false , "cell");
        plateau [0][1] = new CelluleLaby( true ,false , false , false ,true , "cell");
        plateau [0][2] = new CelluleLaby( true ,true , true , false ,false , "cell");
        plateau [0][3] = new CelluleLaby( true ,false , false , true ,false , "cell");
        plateau [0][4] = new CelluleLaby( true ,false , false , false ,false , "cell");
        plateau [0][5] = new CelluleLaby( true ,true , false , false ,false , "cell");

        //CelluleL2
        plateau [1][0] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [1][1] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [1][2] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [1][3] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [1][4] = new CelluleLaby(false ,true , false , true ,false,"ID");//Troue
        plateau [1][5] = new CelluleLaby(true ,false , false , true ,false,"cell");

        //Cellule L3
        plateau [2][0] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [2][1] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [2][2] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [2][3] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [2][4] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [2][5] = new CelluleLaby(false ,false , true , false ,false,"cell");

        //Cellule L4
        plateau [3][0] = new CelluleLaby(false ,false , false , true ,false,"cell");
        plateau [3][1] = new CelluleLaby(false ,true , true , false ,false,"ID2");//Troue2
        plateau [3][2] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [3][3] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [3][4] = new CelluleLaby(true ,false , true , true ,false,"sortie");
        plateau [3][5] = new CelluleLaby(false ,false , true , true ,false,"cell");

        //Cellule L5
        plateau [4][0] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [4][1] = new CelluleLaby(true ,false , true , true ,false,"cell");
        plateau [4][2] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [4][3] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [4][4] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [4][5] = new CelluleLaby(false ,false , true , true ,false,"cell");
        //Cellule L6
        plateau [5][0] = new CelluleLaby(false ,true , true , true ,false,"cell");
        plateau [5][1] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [5][2] = new CelluleLaby(false ,true , true , false ,false ,"cell");
        plateau [5][3] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [5][4] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [5][5] = new CelluleLaby(false ,true , false , true ,false,"cell");

        return plateau;
    } //Fait

    public static CelluleLaby[][] getPatern3() {
        CelluleLaby [][] plateau = new CelluleLaby[6][6];
        plateau [0][0] = new CelluleLaby( true ,false , false , true ,false , "cell");
        plateau [0][1] = new CelluleLaby(true ,true , false , false ,false ,"cell");
        plateau [0][2] = new CelluleLaby(true ,false , true , false ,false,"cell");
        plateau [0][3] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [0][4] = new CelluleLaby(true ,false , false , false ,false,"cell");
        plateau [0][5] = new CelluleLaby(true ,false , true , false ,false,"cell");

        //CelluleL2
        plateau [1][0] = new CelluleLaby(false ,true , true , true ,true,"cell");
        plateau [1][1] = new CelluleLaby(true ,false , true , true ,false,"cell");
        plateau [1][2] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [1][3] = new CelluleLaby(false ,true , false , true ,false,"sortie");
        plateau [1][4] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [1][5] = new CelluleLaby(false ,false , true , true ,false,"cell");

        //Cellule L3
        plateau [2][0] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [2][1] = new CelluleLaby(false ,false , true , false ,false,"cell");
        plateau [2][2] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [2][3] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [2][4] = new CelluleLaby(true ,false , true , false ,false,"cell");
        plateau [2][5] = new CelluleLaby(false ,false , true , true ,false,"cell");

        //Cellule L4
        plateau [3][0] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [3][1] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [3][2] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [3][3] = new CelluleLaby(false ,false , true , true ,false,"ID");
        plateau [3][4] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [3][5] = new CelluleLaby(false ,false , true , true ,false,"ID2");

        //Cellule L5
        plateau [4][0] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [4][1] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [4][2] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [4][3] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [4][4] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [4][5] = new CelluleLaby(false ,false , true , true ,false,"cell");

        //Cellule L6
        plateau [5][0] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [5][1] = new CelluleLaby(false ,true , false , false ,false,"cell");
        plateau [5][2] = new CelluleLaby(false ,true , false , false ,false ,"cell"); //Troue2
        plateau [5][3] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [5][4] = new CelluleLaby(false ,true , false , false ,false,"cell");
        plateau [5][5] = new CelluleLaby(false ,true , true , false ,false,"cell");
        return plateau;
    } //Fait

    public static CelluleLaby[][] getPatern4() {
        CelluleLaby [][] plateau = new CelluleLaby[6][6];
        plateau [0][0] = new CelluleLaby( true ,false , false , true ,false , "ID");
        plateau [0][1] = new CelluleLaby(true ,false , true , false ,false ,"cell"); //Trou1
        plateau [0][2] = new CelluleLaby(true ,true , false , true ,false,"sortie");
        plateau [0][3] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [0][4] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [0][5] = new CelluleLaby(true ,false , true , false ,false,"cell");

        //CelluleL2
        plateau [1][0] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [1][1] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [1][2] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [1][3] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [1][4] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [1][5] = new CelluleLaby(false ,false , true , false ,false,"cell");

        //Cellule L3
        plateau [2][0] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [2][1] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [2][2] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [2][3] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [2][4] = new CelluleLaby(true ,true , true , false ,false,"cell");
        plateau [2][5] = new CelluleLaby(false ,false , true , true ,false,"cell"); //a fixer

        //Cellule L4
        plateau [3][0] = new CelluleLaby(false ,false , true , true ,false,"ID2");
        plateau [3][1] = new CelluleLaby(true ,true , false , true ,false,"cell");
        plateau [3][2] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [3][3] = new CelluleLaby(false ,true , false , false ,false,"cell");
        plateau [3][4] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [3][5] = new CelluleLaby(false ,false , true , false ,false,"cell");

        //Cellule L5
        plateau [4][0] = new CelluleLaby(false ,false , false , true ,false,"cell");
        plateau [4][1] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [4][2] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [4][3] = new CelluleLaby(true ,true , true , false ,false,"cell");
        plateau [4][4] = new CelluleLaby(true ,false , true , false ,false,"cell");
        plateau [4][5] = new CelluleLaby(false ,false , true , true ,false,"cell");

        //Cellule L6
        plateau [5][0] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [5][1] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [5][2] = new CelluleLaby(true ,true , true , false ,false ,"cell"); //Troue2
        plateau [5][3] = new CelluleLaby(true ,true , false , true ,true,"cell");
        plateau [5][4] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [5][5] = new CelluleLaby(false ,true , true , true ,false,"cell");
        return plateau;
    } //Fait

    public static CelluleLaby[][] getPatern5() {
        CelluleLaby [][] plateau = new CelluleLaby[6][6];
        plateau [0][0] = new CelluleLaby( true ,true , false , false ,false , "cell");
        plateau [0][1] = new CelluleLaby(true ,true , false , false ,false ,"cell");
        plateau [0][2] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [0][3] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [0][4] = new CelluleLaby(true ,false , false , false ,false,"cell");
        plateau [0][5] = new CelluleLaby(true ,false , false , true ,false,"sortie");

        //CelluleL2
        plateau [1][0] = new CelluleLaby(true ,false , false , false ,false,"cell");
        plateau [1][1] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [1][2] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [1][3] = new CelluleLaby(true ,false , false , false ,false,"cell");
        plateau [1][4] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [1][5] = new CelluleLaby(false ,true , true , true ,false,"cell");

        //Cellule L3
        plateau [2][0] = new CelluleLaby(false ,false , false , true ,false,"cell");
        plateau [2][1] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [2][2] = new CelluleLaby(true ,true , true , false ,false,"cell");
        plateau [2][3] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [2][4] = new CelluleLaby(true ,false , true , false ,false,"ID");
        plateau [2][5] = new CelluleLaby(true ,false , true , true ,false,"cell");

        //Cellule L4
        plateau [3][0] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [3][1] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [3][2] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [3][3] = new CelluleLaby(true ,false , true , false ,false,"cell");
        plateau [3][4] = new CelluleLaby(false ,true , true , true ,false,"cell");
        plateau [3][5] = new CelluleLaby(false ,false , true , true ,false,"cell");

        //Cellule L5
        plateau [4][0] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [4][1] = new CelluleLaby(true ,false , true , false ,false,"cell");
        plateau [4][2] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [4][3] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [4][4] = new CelluleLaby(true ,true , true , false ,false,"cell");
        plateau [4][5] = new CelluleLaby(false ,false , true , true ,false,"cell");

        //Cellule L6
        plateau [5][0] = new CelluleLaby(false ,true , true , true ,true,"cell");
        plateau [5][1] = new CelluleLaby(false ,true , false , false ,false,"cell");
        plateau [5][2] = new CelluleLaby(true ,true , false , false ,false ,"cell");
        plateau [5][3] = new CelluleLaby(true ,true , false , false ,false,"ID2");
        plateau [5][4] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [5][5] = new CelluleLaby(false ,true , true , false ,false,"cell");
        return plateau;
    } //Fait

    public static CelluleLaby[][] getPatern6() {
        CelluleLaby [][] plateau = new CelluleLaby[6][6];
        plateau [0][0] = new CelluleLaby( true ,false , true , true ,true , "cell");
        plateau [0][1] = new CelluleLaby(true ,false , false , true ,false ,"cell"); //Trou1
        plateau [0][2] = new CelluleLaby(true ,false , true , false ,false,"cell");
        plateau [0][3] = new CelluleLaby(true ,true , false , true ,false,"cell");
        plateau [0][4] = new CelluleLaby(true ,false , false , false ,false,"ID");
        plateau [0][5] = new CelluleLaby(true ,false , true , false ,false,"cell");

        //CelluleL2
        plateau [1][0] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [1][1] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [1][2] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [1][3] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [1][4] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [1][5] = new CelluleLaby(false ,false , true , true ,false,"cell");

        //Cellule L3
        plateau [2][0] = new CelluleLaby(false ,false , false , true ,false,"cell");
        plateau [2][1] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [2][2] = new CelluleLaby(false ,true , true , true ,false,"cell");
        plateau [2][3] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [2][4] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [2][5] = new CelluleLaby(false ,true , true , false ,false,"cell"); //a fixer

        //Cellule L4
        plateau [3][0] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [3][1] = new CelluleLaby(true ,false , true , false ,false,"cell");
        plateau [3][2] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [3][3] = new CelluleLaby(false ,false , true , false ,false,"cell");
        plateau [3][4] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [3][5] = new CelluleLaby(true ,false , false , true ,false,"cell");

        //Cellule L5
        plateau [4][0] = new CelluleLaby(true ,false , false , false ,false,"cell");
        plateau [4][1] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [4][2] = new CelluleLaby(false ,true , true , true ,false,"ID2");
        plateau [4][3] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [4][4] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [4][5] = new CelluleLaby(false ,false , false , true ,false,"cell");

        //Cellule L6
        plateau [5][0] = new CelluleLaby(false ,true , false , false ,false,"cell");
        plateau [5][1] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [5][2] = new CelluleLaby(true ,true , false , false ,false ,"cell"); //Troue2
        plateau [5][3] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [5][4] = new CelluleLaby(true ,true , false , true ,false,"cell");
        plateau [5][5] = new CelluleLaby(false ,true , true , false ,false,"sortie");
        return plateau;
    } //Fait

    public static CelluleLaby[][] getPatern7() {
        CelluleLaby [][] plateau = new CelluleLaby[6][6];
        plateau [0][0] = new CelluleLaby( true ,false , false , true ,false , "cell");
        plateau [0][1] = new CelluleLaby(true ,false , false , false ,false ,"ID");
        plateau [0][2] = new CelluleLaby(true ,false , false , false ,false,"cell");
        plateau [0][3] = new CelluleLaby(true ,false , true , false ,false,"cell");
        plateau [0][4] = new CelluleLaby(true ,false , false , false ,false,"cell");
        plateau [0][5] = new CelluleLaby(true ,false , false , false ,false,"cell");

        //CelluleL2
        plateau [1][0] = new CelluleLaby(false  ,false , true , true ,false,"cell");
        plateau [1][1] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [1][2] = new CelluleLaby(true ,true , true , false ,true,"cell");
        plateau [1][3] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [1][4] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [1][5] = new CelluleLaby(false ,false , true , true ,false,"cell");

        //Cellule L3
        plateau [2][0] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [2][1] = new CelluleLaby(false ,true , false , false ,false,"cell");
        plateau [2][2] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [2][3] = new CelluleLaby(true ,true , true , false ,false,"cell");
        plateau [2][4] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [2][5] = new CelluleLaby(false ,true , true , false ,false,"cell");

        //Cellule L4
        plateau [3][0] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [3][1] = new CelluleLaby(true ,false , true , true ,false,"cell");
        plateau [3][2] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [3][3] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [3][4] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [3][5] = new CelluleLaby(true ,false , true , true ,false,"cell");

        //Cellule L5
        plateau [4][0] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [4][1] = new CelluleLaby(false ,true , true , true ,false,"sortie");
        plateau [4][2] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [4][3] = new CelluleLaby(true ,true , false , true ,false,"cell");
        plateau [4][4] = new CelluleLaby(true ,false , true , false ,false,"cell");
        plateau [4][5] = new CelluleLaby(false ,false , true , true ,false,"cell");

        //Cellule L6
        plateau [5][0] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [5][1] = new CelluleLaby(true ,true , false , false ,false,"ID2");
        plateau [5][2] = new CelluleLaby(true ,true , false , false ,false ,"cell");
        plateau [5][3] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [5][4] = new CelluleLaby(false ,true , false , false ,false,"cell");
        plateau [5][5] = new CelluleLaby(false ,true , true , false ,false,"cell");
        return plateau;
    } //Fait

    public static CelluleLaby[][] getPatern8() {
        CelluleLaby [][] plateau = new CelluleLaby[6][6];
        plateau [0][0] = new CelluleLaby(true ,false , true , true ,false , "cell");
        plateau [0][1] = new CelluleLaby(true ,false , false , true ,false ,"cell"); //Trou1
        plateau [0][2] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [0][3] = new CelluleLaby(true ,false , true , false ,false,"ID");
        plateau [0][4] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [0][5] = new CelluleLaby(true ,false , true , false ,false,"cell");

        //CelluleL2
        plateau [1][0] = new CelluleLaby(false ,false , false , true ,false,"cell");
        plateau [1][1] = new CelluleLaby(false ,true , false , false ,false,"cell");
        plateau [1][2] = new CelluleLaby(true ,true , true , false ,false,"cell");
        plateau [1][3] = new CelluleLaby(false ,true , false , false ,false,"cell");
        plateau [1][4] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [1][5] = new CelluleLaby(false ,false , true , true ,false,"cell");

        //Cellule L3
        plateau [2][0] = new CelluleLaby(false ,false , true , false ,false,"cell");
        plateau [2][1] = new CelluleLaby(true ,false , false , false ,false,"cell");
        plateau [2][2] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [2][3] = new CelluleLaby(true ,false , false , false ,false,"cell");
        plateau [2][4] = new CelluleLaby(true ,false , true , false ,false,"cell");
        plateau [2][5] = new CelluleLaby(false ,false , true , true ,false,"cell"); //a fixer

        //Cellule L4
        plateau [3][0] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [3][1] = new CelluleLaby(false ,false , false , true ,false,"cell");
        plateau [3][2] = new CelluleLaby(true ,false , true , false ,false,"ID2");
        plateau [3][3] = new CelluleLaby(false ,true , false , false ,false,"cell");
        plateau [3][4] = new CelluleLaby(false ,true , false , false ,false,"cell");
        plateau [3][5] = new CelluleLaby(false ,true , true , false ,false,"cell");

        //Cellule L5
        plateau [4][0] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [4][1] = new CelluleLaby(true ,false , true , true ,false,"cell");
        plateau [4][2] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [4][3] = new CelluleLaby(true ,true , false , true ,false,"cell");
        plateau [4][4] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [4][5] = new CelluleLaby(true ,true , true , false ,false,"sortie");

        //Cellule L6
        plateau [5][0] = new CelluleLaby(false ,true , false , false ,false,"cell");
        plateau [5][1] = new CelluleLaby(false ,true , false , false ,false,"cell");
        plateau [5][2] = new CelluleLaby(false ,true , false , false ,false ,"cell"); //Troue2
        plateau [5][3] = new CelluleLaby(false ,true , false , false ,false,"cell");
        plateau [5][4] = new CelluleLaby(false ,true , false , false ,false,"cell");
        plateau [5][5] = new CelluleLaby(false ,true , true , false ,true,"cell");
        return plateau;
    } //Fait

    public static CelluleLaby[][] getPatern9() {
        CelluleLaby [][] plateau = new CelluleLaby[6][6];
        plateau [0][0] = new CelluleLaby(true ,false , true , true ,false , "cell");
        plateau [0][1] = new CelluleLaby(true ,false , false , false ,false ,"cell"); //Trou1
        plateau [0][2] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [0][3] = new CelluleLaby(true ,true , false , false ,false,"cell");
        plateau [0][4] = new CelluleLaby(true ,false , false , false ,false,"cell");
        plateau [0][5] = new CelluleLaby(true ,false , true , false ,false,"cell");

        //CelluleL2
        plateau [1][0] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [1][1] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [1][2] = new CelluleLaby(true ,false , false , true ,false,"ID");
        plateau [1][3] = new CelluleLaby(true ,false , true , false ,false,"cell");
        plateau [1][4] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [1][5] = new CelluleLaby(false ,false , true , true ,false,"cell");

        //Cellule L3
        plateau [2][0] = new CelluleLaby(false ,false , false , true ,false,"cell");
        plateau [2][1] = new CelluleLaby(false ,true , false , false ,false,"cell");
        plateau [2][2] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [2][3] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [2][4] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [2][5] = new CelluleLaby(false ,false , true , true ,false,"cell"); //a fixer

        //Cellule L4
        plateau [3][0] = new CelluleLaby(false ,false , true , true ,false,"ID2");
        plateau [3][1] = new CelluleLaby(true ,false , true , true ,false,"cell");
        plateau [3][2] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [3][3] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [3][4] = new CelluleLaby(true ,true , false , true ,true,"cell");
        plateau [3][5] = new CelluleLaby(false ,false , false , true ,false,"cell");

        //Cellule L5
        plateau [4][0] = new CelluleLaby(false ,false , false , true ,false,"cell");
        plateau [4][1] = new CelluleLaby(false ,false , true , false ,false,"cell");
        plateau [4][2] = new CelluleLaby(false ,false , true , true ,false,"cell");
        plateau [4][3] = new CelluleLaby(true ,false , false , true ,false,"cell");
        plateau [4][4] = new CelluleLaby(true ,false , true , false ,false,"cell");
        plateau [4][5] = new CelluleLaby(false ,true , false , true ,false,"cell");

        //Cellule L6
        plateau [5][0] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [5][1] = new CelluleLaby(false ,true , true , false ,false,"sortie");
        plateau [5][2] = new CelluleLaby(false ,true , false , true ,false ,"cell"); //Troue2
        plateau [5][3] = new CelluleLaby(false ,true , true , false ,false,"cell");
        plateau [5][4] = new CelluleLaby(false ,true , false , true ,false,"cell");
        plateau [5][5] = new CelluleLaby(false ,true , true , false ,false,"cell");
        return plateau;
    }
}
