public class Capitan extends principal {



    public Capitan(String nombre, String apellido, String matriculaNav) {
        super(nombre, apellido, matriculaNav);

    }

    @Override

    public void mostrarInfo(){
        System.out.println("El capitan de embarcacion " + getNombre()+" " + getApellido()+ ", cuenta con la matricula "+ getMatriculaNav()+ " para poder navegar.");
    }
}

