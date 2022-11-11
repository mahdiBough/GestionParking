import java.util.Scanner;

public class Emplacement{
    private static int count;
    private boolean eta;
    private Vehicule veh ;
    private Horaire deb;
    private int num;
    public Emplacement(){
        this.veh = null;
        this.deb = null;
        this.eta = true;
        int num = count;
        count++;
    }
    public int getNum(){
        return num;
    }
    public boolean getEta(){
        return eta;
    }
    public Vehicule getVeh(){
        return this.veh;
    }
    Horaire getDeb(){
        return deb;
    }
    public static String clavier(){
        Scanner in = new Scanner(System.in);
        String i = in.nextLine();
        return i;
    }

    public void setEta(boolean eta){
        this.eta = eta;
    }
    public void setVeh(Vehicule veh){
        this.veh = veh;
    }
    public void setDeb(Horaire deb){
        this.deb = deb ;
    }
    public void stationner(){
     // je n'est sait pas le role de cette fonction mais ...
    }
    public Horaire dureeStationnement(Horaire fin){
        int debHour = this.getDeb().getHeur();
        int debHourToMinus = debHour*60;
        int debMinus = this.getDeb().getMinu();
        int finHourToMinus = fin.getHeur()*60;
        int finMinus = fin.getMinu();
        int d = finHourToMinus+finMinus-(debHourToMinus+debMinus);

        int h = d/60;
        int m = d%60;
        Horaire duree = new Horaire(h, m);
        return duree;
    }
    public int fraisStationnement(Horaire fin){

        Horaire dureeSta = dureeStationnement(fin) ;
        int dm = dureeSta.getHeur()*60+dureeSta.getMinu(); // 130   //30
        int dh = 0;

        int price = 0;



        if(dm <= 60){
            if (getVeh().getType() == "moto") price = 10;
            else  price = 15;
        } else if (dm <= 120) {

            if (getVeh().getType() == "moto") price = 15;
            else  price = 25;
        }
        else {
            dm -= 120;
            dh = dm/60;
            dm = dm%60;
            if (getVeh().getType() == "moto") price = (dm != 0)? 17+2*dh: 15+2*dh;
            else  price = (dm != 0)? 25+5*dh+5: 25+5*dh;
        }

        System.out.println("  "+getNum()+"  " +getVeh().getType() +"  "+ price);
        return price;
    }



}
