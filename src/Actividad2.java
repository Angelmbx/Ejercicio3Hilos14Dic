/* Crea una clase que implemente la interfaz Runnable cuya unica funcionalidad sea visualizar el mensaje
"hola mundo" seguido de una cadena que se recibira en el constructor (es decir al crear un objeto de este tipo
se enviara una cadena) y seguido del identificador del hilo.
Crea un programa Java que visualice el mensaje anterior 5 veces creando para ello 5 hilos diferentes usando la clase
creada anteriormente. Luego haz que antes de visualizar el mensaje el hilo espere un tiempo proporcional
a su identificador usando sleep(). Que diferencias hay entre usar sleep y no?
 */


public class Actividad2 implements Runnable{

    String cadena;

    public Actividad2(String cadena){
        cadena= this.cadena;
    }



    @Override
    public void run() {



        System.out.println("Hola Mundo!!" + cadena + "" + Thread.currentThread().getId());
    }

    public static void main(String[] args) {

        new Thread(new Actividad2("uno")).start();
        new Thread(new Actividad2("dos")).start();
        new Thread(new Actividad2("tres")).start();
        new Thread(new Actividad2("cuatro")).start();
        new Thread(new Actividad2("cinco")).start();
    }


}
