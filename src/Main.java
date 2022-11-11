import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenu");
        Parking p = new Parking(5,5);

        Vehicule v1 = new Vehicule("aa22bbb", "dacia", "auto");
        Vehicule v2 = new Vehicule("hh22yyy", "bmw", "moto");
        Vehicule v3 = new Vehicule("kk22ggg", "ducati", "moto");
        Vehicule v4 = new Vehicule("bb22sss", "tesla", "auto");
        Vehicule v5 = new Vehicule("yy22bbb", "dacia", "auto");

        Horaire acc1 = new Horaire(18, 30);
        Horaire acc2 = new Horaire(18, 35);
        Horaire acc3 = new Horaire(19, 30);
        Horaire acc4 = new Horaire(22, 50);
        Horaire acc5 = new Horaire(18, 40);

        Horaire fin1 = new Horaire(19, 30);
        Horaire fin2 = new Horaire(22, 35);
        Horaire fin3 = new Horaire(23, 35);
        Horaire fin4 = new Horaire(23, 53);
        //Horaire fin5 = new Horaire(19, 44);

        p.accederParking(v1, acc1);
        p.accederParking(v2, acc2);
        p.accederParking(v3, acc3);
        p.accederParking(v4, acc4);
        //p.accederParking(v5, acc5);
        p.afficher();
        System.out.println("+------------+"); // just pour afficher N'EST PAS important
        System.out.println("num  Type  price"); // just pour afficher N'EST PAS important
        //p.quitterParking(v1, fin1);
        p.quitterParking(v2, fin2);
        p.quitterParking(v3, fin3);
        p.quitterParking(v4, fin4);
        //p.quitterParking(v5, fin5);
        System.out.println("+------------+"); // just pour afficher pas important

        System.out.println("la recette totale du jour est :");

        System.out.println(p.calculRecettes()+"dh");
        // v1 =

    }
}




