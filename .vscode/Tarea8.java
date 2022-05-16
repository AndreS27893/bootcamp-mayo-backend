public class Persona{
    private String nombre;
    private double edad;
    private long telefono;

    public void setNombre(String nombre ) {
        this.nombre=nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(double edad){
        this.edad=edad;
    }
    public double getEdad(){
        return this.edad;
    }
    public void setTelefono(long telefono){
        this.telefono=telefono
    }
    public long getTelefono(){
        return this.telefono;
    }
}

Persona persona1= new Persona();
persona1.setNombre=("David");
persona1.setEdad=(27);
persona1.setTelefono=(3513926572);

System.out.println(persona1.getNombre());
System.out.println(persona1.getEdad());
System.out.println(persona1.(getTelefono()));