import java.util.PriorityQueue;

public class SJFScheduler extends BasicScheduler {

	public SJFScheduler()
	{
		//Implemented using a heap with PCB with least lines at top.
		readyQ = new PriorityQueue<BasicPCB>(100, (a,b) -> a.getTotalLines() - b.getTotalLines());
	}
}