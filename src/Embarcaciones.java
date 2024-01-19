public class Embarcaciones extends principal {
    int nuevoPrecio;
    public Embarcaciones(String tipoEmbarcacion, int precioBase, int valorAdicional, int fabricacion, int longitudEslora) {
        super(tipoEmbarcacion, precioBase,valorAdicional, fabricacion,longitudEslora);
    }

    @Override

    public void mostrarInfo() {
        if (getFabricacion() >= 2020) {
            nuevoPrecio = (precioBase + 20000);
            System.out.println("el tipo de embarcacion es " + getTipoEmbarcacion() + " con un precio base de " + getPrecioBase() + " con un valor adicional de 20.000 si su año de fabricacion supera el " + getFabricacion() + " y con una longitud de " + getLongitudEslora() + " esloras");
        } else if (getFabricacion() < 2020) {
            System.out.println("el tipo de embarcacion es " + getTipoEmbarcacion() + " con un precio base de " + getPrecioBase() + " con una año de fabricacion de " + getFabricacion() + " y con una longitud de " + getLongitudEslora() + " esloras");

        }
    }}




