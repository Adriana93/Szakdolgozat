package szakdolgozat.gui;

public class Operation {
	public int jobID;
	public double procTime;
	protected double startTime;
	protected double endTime;
	protected int machineID;
	
	
	 public static double finalCmax = 0, finalCsum = 0, finalWL = 0 ;
	 protected double[] machineProcessTime;
	 protected int sequence;

		protected String label;
	 
	 public Operation(int Machine) {
	        machineProcessTime = new double[Machine];
	    }
		
		public Operation clone(int Machine)
		{
			Operation newOperation = new Operation(Machine);
			
			newOperation.jobID = this.jobID;
			newOperation.sequence = this.sequence;
			newOperation.label = this.label;
			
			for(int i = 0; i< Machine; i++)
			{
				newOperation.machineProcessTime[i] = this.machineProcessTime[i];		
			}
			
			return newOperation;
		} 
	 
	 
	 
	public int getJobID() {
		return jobID;
	}
	public void setJobID(int jobID) {
		this.jobID = jobID;
	}
	public double getProcTime() {
		return procTime;
	}
	public void setProcTime(double procTime) {
		this.procTime = procTime;
	}
	public double getStartTime() {
		return startTime;
	}
	public void setStartTime(double startTime) {
		this.startTime = startTime;
	}
	public double getEndTime() {
		return endTime;
	}
	public void setEndTime(double endTime) {
		this.endTime = endTime;
	}
	public int getMachineID() {
		return machineID;
	}
	public void setMachineID(int machineID) {
		this.machineID = machineID;
	}
	
	public void createTable(int[][] processTimeArray) {
		
	}

}
