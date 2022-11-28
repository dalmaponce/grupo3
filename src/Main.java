public class Main {
    public static void main(String[] args) {

        Persona juan = new Persona("Juan");
        juan.saludar();
    }

    static class Persona{
        private final String nombre;
        public Persona(String nombre){
            this.nombre = nombre;
        }
        public void saludar(){
            System.out.println("Hola mi nombre es " + nombre);
        }
    }

}