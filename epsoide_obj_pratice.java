public class epsoide_obj_pratice {
    int seriseNumber;
    int epsoidNumber;

    //intlizer of the class wich sets up the values
    public epsoide_obj_pratice(int serise_num, int epsoie_num){
        seriseNumber = serise_num;
        epsoidNumber = epsoie_num;
    }

    public void skipIntro(){
        System.out.println("Skip Intor");
    }

    public void nextEpsoid(){
        System.out.println("Loding Next Epsoid");
    }

    public static void main(String[] args) {
        epsoide_obj_pratice epsoide = new epsoide_obj_pratice(2,1);
        epsoide.nextEpsoid();
        epsoide.skipIntro();
    }
}