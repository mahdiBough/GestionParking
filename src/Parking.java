public class Parking{
    private Emplacement[] park;
    private int max ;
    private int nl;
    private int[] recettes;
    public Parking(int max,int nl){
        this.max = max;
        this.nl = nl;
        park = new Emplacement[max];
        recettes = new int[max];
        for (int l = 0; l < park.length; l++) {
                   Emplacement e = new Emplacement() ;
            park[l] = e;
        }
    }
    public int rechercheLibre(){
        for (int j = 0; j < park.length; j++) {
            if (park[j].getEta()==true) return j;
        }
        return -1;
    }
    public void accederParking(Vehicule v, Horaire acc){
if (nl <= max){

    park[rechercheLibre()].setDeb(acc);
    park[rechercheLibre()].setVeh(v);
    park[rechercheLibre()].setEta(false);
    nl --;
}

    }
    public void quitterParking(Vehicule v, Horaire fin){
        for (int h = 0; h < park.length; h++) {
           if (park[h].getVeh() == v ){
               recettes[h]+=park[h].fraisStationnement(fin);
               park[h].setVeh(null);
               park[h].setDeb(null);
               park[h].setEta(true);
               nl++;
           }
        }

    }
    public void afficher(){
        for (int k = 0; k < park.length; k++) {
           if (park[k].getEta() != true){
               String ch = park[k].getVeh().toString();
               System.out.println(ch);
           }
        }
    }

    public int calculRecettes(){
        int c = 0;
        for (int i = 0; i < recettes.length; i++) {
           c+= recettes[i];
        }
       return c;
    }




}
