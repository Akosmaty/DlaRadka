package Cars.com;

public class Main {
    public static void main(String[] args) {

        Car Cars = new AlfaRomeo();
        System.out.println("Nazwa | Color | silnik");
        System.out.println(Cars.getName()+"|"+Cars.getColor()+"|"+Cars.getEnginge());

        Car Cars2 = new AlfaRed();
        System.out.println(Cars2.getName()+"| "+Cars2.getColor()+"|"+Cars2.getEnginge());



    }
}



