
public class BasicPCB implements Comparable<BasicPCB> {
	
	private int ID, ProgramCounter, TotalLines, Priority, ArrivalTick, CompletionTick;
	
	public BasicPCB(int id, int totalLines, int arrivalTick) {
		ID = id;
		TotalLines = totalLines;
		ArrivalTick = arrivalTick;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public int getProgramCounter() {
		return ProgramCounter;
	}

	public void setProgramCounter(int programCounter) {
		ProgramCounter = programCounter;
	}

	public int getTotalLines() {
		return TotalLines;
	}

	public void setTotalLines(int totalLines) {
		TotalLines = totalLines;
	}

	public int getPriority() {
		return Priority;
	}

	public void setPriority(int priority) {
		Priority = priority;
	}

	public int getArrivalTick() {
		return ArrivalTick;
	}

	public void setArrivalTick(int arrivalTick) {
		ArrivalTick = arrivalTick;
	}

	public int getCompletionTick() {
		return CompletionTick;
	}

	public void setCompletionTick(int completionTick) {
		CompletionTick = completionTick;
	}
	
	public int getLinesRemaining() {
		return TotalLines - ProgramCounter;
	}
	
	public void nextLine() {
		ProgramCounter++;
	}
	
	public int compareTo(BasicPCB o) {
		return this.Priority - o.Priority;
	}
	
	public String toString() {
		return "Process ID: " + ID +
				" Program Counter: " + ProgramCounter +
				" Total Lines: " + TotalLines;
	}

	public boolean hasCompleted() {
		return ProgramCounter > TotalLines;
	}
	
	
}
