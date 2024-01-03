public class KierwonikWycieczki {

    Biletomat biletomat;

    public KierwonikWycieczki(Biletomat biletomat){
        this.biletomat=biletomat;
    }

    public void zalatwBilet(){
        biletomat.wystawBilet();
    }
}
