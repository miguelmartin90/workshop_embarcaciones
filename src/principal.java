public abstract class principal {
    private String nombre;
    private String apellido;
    private String matriculaNav;
    private String tipoEmbarcacion;
    int precioBase;
    private int valorAdicional;
    private int fabricacion;
    private int longitudEslora;

    public principal(String nombre, String apellido,String matriculaNav) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaNav = matriculaNav;
    }

    public principal(String tipoEmbarcacion, int precioBase, int valorAdicional, int fabricacion, int longitudEslora) {
        this.tipoEmbarcacion = tipoEmbarcacion;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.fabricacion = fabricacion;
        this.longitudEslora = longitudEslora;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMatriculaNav() {
        return matriculaNav;
    }
    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }
    public int getPrecioBase() {
        return precioBase;
    }
    public int getValorAdicional() {
        return valorAdicional;
    }
    public int getFabricacion() {
        return fabricacion;
    }
    public int getLongitudEslora() {
        return longitudEslora;
    }

    public abstract void mostrarInfo();


}

