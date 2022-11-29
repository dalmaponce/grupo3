public class Main {
    public static void main(String[] args) {

        Persona juan = new Persona("Juan");
        juan.saludar();
        juan.mostrarMensaje();
        juan.mostrarMensaje2();
    }

    static class Persona{
        private final String nombre;
        public Persona(String nombre){
            this.nombre = nombre;
        }
        public void saludar(){
            System.out.print("Hola mi nombre es " + nombre);
        }

        public void mostrarMensaje(){
            System.out.println(" y estoy aprendiendo a hacer un pull request.");
        }

        public void mostrarMensaje2(){
            System.out.println("Con practica mejoraré");
        }

    }

}