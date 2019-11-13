import java.util.LinkedList;
import java.util.concurrent.Semaphore;

public abstract class Protocol extends Thread {

	public abstract void configuration();
	public abstract void run();

	Semaphore miSemaforo=new Semaphore(1); //Only one access per element.
	public boolean endTime;
	
	LinkedList <CustomPacket> misPaquetes=new LinkedList<CustomPacket>();
}
