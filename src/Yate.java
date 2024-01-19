public class Yate {
    private int cantidadCamarotes;
    private int precioCamarote = 5000;
    private int precioYate = 100000;

    public Yate(int cantidadCamarotes){
        this.cantidadCamarotes = cantidadCamarotes;
    }
    public void mostrarInfo(){
        if (cantidadCamarotes>=7){
        System.out.println("cantidad de camarotes es de " + cantidadCamarotes+ " un yate de gran lujo, el precio de alquiler por camarote es de " + precioCamarote +" dando un total de "+ calcularPago()+ " y el precio de venta es "+ calcularPago1() );
    }else if(cantidadCamarotes<7){
            System.out.println("cantidad de camarotes es de " + cantidadCamarotes+ " el precio de alquiler por camarote es de " + precioCamarote +" dando un total de "+ calcularPago()+ " y el precio de venta es "+ calcularPago1() );
        }}
    public double calcularPago() {
        return cantidadCamarotes * precioCamarote;
    }
    public double calcularPago1() {
        return cantidadCamarotes * precioYate;
    }
}
