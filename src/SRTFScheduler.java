import java.util.PriorityQueue;

public class SRTFScheduler extends BasicScheduler {

	public SRTFScheduler()
	{
		//Implemented using a heap with PCB with least lines remaining at top.
		readyQ = new PriorityQueue<BasicPCB>(100, (a,b) -> a.getLinesRemaining() - b.getLinesRemaining() );
	}
	
	//Since SRTF is pre-emptive, call the dispatch after adding a process.
	public void addProcess(BasicPCB p)
	{
		totalProcesses++;
		readyQ.add(p);
		
		if (runningProcess != null)
			readyQ.add(runningProcess);
		
		dispatch();
	}
}
