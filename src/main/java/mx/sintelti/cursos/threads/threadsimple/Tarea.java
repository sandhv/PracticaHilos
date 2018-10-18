package mx.sintelti.cursos.threads.threadsimple;

public class Tarea implements Runnable {

    @Override
    public void run(){
        System.out.println("Una tarea muy importante se esta efectuando... - " + Thread.currentThread().getName());
    }
}
