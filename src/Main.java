
public class Main {
    public static void main(String[] args) {


        Capitan cap1 = new Capitan("manuel","rodriguez","A945B");
        Embarcaciones barco1 = new Embarcaciones("velero",100000,15000,2015,20);
        Velero mastil = new Velero(3);

        Capitan cap2 = new Capitan("juan","roa","A238C");
        Embarcaciones barco2 = new Embarcaciones("yate",200000,2500,2017,26);
        Yate camarote = new Yate(4);

        Capitan cap3 = new Capitan("andres","mora","A543B");
        Embarcaciones barco3 = new Embarcaciones("velero",1000000,15000,2020,60);
        Velero mastil1 = new Velero(8);

        Capitan cap4 = new Capitan("martin","andrade","A501C");
        Embarcaciones barco4 = new Embarcaciones("yate",2000000,25000,2022,56);
        Yate camarote1 = new Yate(9);

        cap1.mostrarInfo();
        barco1.mostrarInfo();
        mastil.mostrarInfo();

        cap2.mostrarInfo();
        barco2.mostrarInfo();
        camarote.mostrarInfo();

        cap3.mostrarInfo();
        barco3.mostrarInfo();
        mastil1.mostrarInfo();

        cap4.mostrarInfo();
        barco4.mostrarInfo();
        camarote1.mostrarInfo();






    }
}