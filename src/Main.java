import java.util.*;

class Vehicule{
    private String mat;
    private String marq;
    private String typ;
    Vehicule(String mt, String mr, String tp){
        mat = mt;
        marq = mr;
        typ = tp;
    }
    public String toString(){
        String ch="Matricule:"+mat+"Marque"+marq+"Type"+typ;
        return ch;
    }
    String getType(){
        return typ;
    }
    String getMarq(){
        return marq;
    }
    String getMat(){
        return mat;
    }
}
class Horaire{
    private int heur;
    private int minu;
    Horaire(int h, int m){
        heur = h;
        minu = m;
    }
    public String toString(){
        String ch = " "+heur+"heures"+minu+"Minutes";
        return ch;
    }
    int getHeur(){
        return heur;
    }
    int getMinu(){
        return minu;
    }
}
class Emplacement{
    private static int num;
    private boolean eta = true;
    private Vehicule veh ;
    private Horaire deb;

    public Emplacement(int num, boolean eta, Vehicule veh, Horaire deb){
        num++;
        this.eta = eta;
        this.veh = veh;
        this.deb = deb;
    }
    int getNum(){
        return num;
    }
    boolean getEta(){
        return eta;
    }
    Vehicule getVeh(){
        return veh;
    }
    Horaire getDeb(){
        return deb;
    }
    public static String clavier(){
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    public void stationner(){
        System.out.println("enter num :");


        System.out.println("enter eta :");
    }
    int fraisStationnement(Horaire fin){
        Horaire h =fin ;
        int finM = h.getHeur()+h.getMinu();
        int finH = 0;

        if (finM >= 60){
           finM = finM-60;
           if (finM < 120) return 15;
           else {
               finH = finM/60;
               finM = finM % 60;
               return (finM != 0) ? finH*2 +15 +1: finH*2 +15;

           }
        }
        else return 10;
    }


}



