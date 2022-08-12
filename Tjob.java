package szakdolgozat.gui;

import java.awt.Container;
import java.util.Arrays;

import javax.swing.JTextField;

import ProjektPlanning.RandomNumbers;

public class Tjob { //flow shop

	
	public int id; //azonosito flowshop
	public int[] ProcT; //pointer, dinamikus vektor flowshop
    public int[] StartT; //inditasi idoflowshop
    public int[]  EndT; //befejezesi ido
    public int date; //hatarido
    
    public int sequnce;
    public boolean mode =false; //munkamegszakithato e
    public long TimeWindowST;
    public long TimeWindowET;
    public int workId;
    public long TransT;
    public long SetT;
    public int NCal;
    
    public double[] machineProcessTime;
    public Tjob preJob;
    public Tjob nextJob;
    public Tjob nextMachine;
    public Tjob preOp;
    public Tjob nextOp;
    public static double[][] ProcessTable;
    
    public static int machines=1, jobs =3, operations =0;
    public static double Cmax =0, Csum =0, Tsum=0, Tmax=0, r_value=0;
    public int STEP;
    public int LOOP;
    public static int NJ=4; //Munkak szama
    public static int  NR =5; //Munkahelyek szama
    
   /* public void setNR(JTextField nR) {
		NR = nR;
	}*/
	public int schedule;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int[] getProcT() {
		return ProcT;
	}
	public void setProcT(int[] procT) {
		ProcT = procT;
	}
	public int[] getStartT() {
		return StartT;
	}
	public void setStartT(int[] startT) {
		StartT = startT;
	}
	public int[] getEndT() {
		return EndT;
	}
	public void setEndT(int[] endT) {
		EndT = endT;
	}
	public int getNR() {
		return NR;
	}
	public void setNR(int nR) {
		NR = nR;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getSequnce() {
		return sequnce;
	}
	public void setSequnce(int sequnce) {
		this.sequnce = sequnce;
	}
	public boolean isMode() {
		return mode;
	}
	public void setMode(boolean mode) {
		this.mode = mode;
	}
	public long getTimeWindowST() {
		return TimeWindowST;
	}
	public void setTimeWindowST(long timeWindowST) {
		TimeWindowST = timeWindowST;
	}
	public long getTimeWindowET() {
		return TimeWindowET;
	}
	public void setTimeWindowET(long timeWindowET) {
		TimeWindowET = timeWindowET;
	}
	public int getWorkId() {
		return workId;
	}
	public void setWorkId(int workId) {
		this.workId = workId;
	}
	public long getTransT() {
		return TransT;
	}
	public void setTransT(long transT) {
		TransT = transT;
	}
	public long getSetT() {
		return SetT;
	}
	public void setSetT(long setT) {
		SetT = setT;
	}
	public int getNCal() {
		return NCal;
	}
	public void setNCal(int nCal) {
		NCal = nCal;
	}
	public double[] getMachineProcessTime() {
		return machineProcessTime;
	}
	public void setMachineProcessTime(double[] machineProcessTime) {
		this.machineProcessTime = machineProcessTime;
	}
	public Tjob getPreJob() {
		return preJob;
	}
	public void setPreJob(Tjob preJob) {
		this.preJob = preJob;
	}
	public Tjob getNextJob() {
		return nextJob;
	}
	public void setNextJob(Tjob nextJob) {
		this.nextJob = nextJob;
	}
	public Tjob getNextMachine() {
		return nextMachine;
	}
	public void setNextMachine(Tjob nextMachine) {
		this.nextMachine = nextMachine;
	}
	public Tjob getPreOp() {
		return preOp;
	}
	public void setPreOp(Tjob preOp) {
		this.preOp = preOp;
	}
	public Tjob getNextOp() {
		return nextOp;
	}
	public void setNextOp(Tjob nextOp) {
		this.nextOp = nextOp;
	}
	public static double[][] getProcessTable() {
		return ProcessTable;
	}
	public static void setProcessTable(double[][] processTable) {
		ProcessTable = processTable;
	}
	public static int getMachines() {
		return machines;
	}
	public static void setMachines(int machines) {
		Tjob.machines = machines;
	}
	public static int getJobs() {
		return jobs;
	}
	public static void setJobs(int jobs) {
		Tjob.jobs = jobs;
	}
	public static int getOperations() {
		return operations;
	}
	public static void setOperations(int operations) {
		Tjob.operations = operations;
	}
	public static double getCmax() {
		return Cmax;
	}
	public static void setCmax(double cmax) {
		Cmax = cmax;
	}
	public static double getCsum() {
		return Csum;
	}
	public static void setCsum(double csum) {
		Csum = csum;
	}
	public static double getTsum() {
		return Tsum;
	}
	public static void setTsum(double tsum) {
		Tsum = tsum;
	}
	public static double getTmax() {
		return Tmax;
	}
	public static void setTmax(double tmax) {
		Tmax = tmax;
	}
	public static double getR_value() {
		return r_value;
	}
	public static void setR_value(double r_value) {
		Tjob.r_value = r_value;
	}
	public int getSTEP() {
		return STEP;
	}
	public void setSTEP(int sTEP) {
		STEP = sTEP;
	}
	public int getLOOP() {
		return LOOP;
	}
	public void setLOOP(int lOOP) {
		LOOP = lOOP;
	}
	public int getNJ() {
		return NJ;
	}
	public void setNJ(int nJ) {
		NJ = nJ;
	}
	public int getSchedule() {
		return schedule;
	}
	public void setSchedule(int schedule) {
		this.schedule = schedule;
	}
	
	 
	

	
	 

}
