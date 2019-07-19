import java.util.LinkedList;

public class RRScheduler extends BasicScheduler {

	private int Quantum, CurrCounter;
	
	public RRScheduler(int quantum) {
		//Implemented with a queue, just like FCFS.
		readyQ = new LinkedList<BasicPCB>();
		CurrCounter = Quantum = quantum;
	}
	
	public void tick()
	{
		tickCount++;
		updateRunningProcess();
		
		CurrCounter--;
		if (CurrCounter < 0) {
			readyQ.add(runningProcess);
			CurrCounter = Quantum;
			dispatch();
		}
		
	}
	
}
