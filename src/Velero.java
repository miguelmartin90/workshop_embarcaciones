public class Velero {
    private int cantidadMastiles;
    private int precioMastil = 10000;

    public Velero(int cantidadMastiles){

        this.cantidadMastiles = cantidadMastiles;

    }
    public void mostrarInfo(){
        if (cantidadMastiles<=3){
        System.out.println(" la cantidad de mastiles de este pequeño velero es de " + cantidadMastiles + " el precio por cada mastil es de "+ precioMastil +" lo cual daria un precio total de " + calcularPago() + " mas la base");
    } else if (cantidadMastiles>=4) {
            System.out.println("Este es un velero grande la cantidad de mastiles es de " + cantidadMastiles + " el precio por cada mastil es de "+ precioMastil +" lo cual daria un precio total de " + calcularPago() + " mas la base");

        }
    }

    public double calcularPago() {
        return  cantidadMastiles * precioMastil;
    }
}


