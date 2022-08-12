package szakdolgozat.gui;

import java.util.Random;

import ProjektPlanning.RandomNumbers;


public class Simulation {
	public static double max_l(double a, double b)
	{
		return a > b ? a : b;
	}
	public static double min_l(double a, double b)
	{
		return a < b ? a : b;
	}
	
	public static ManufactoringSystem[] create_and_load_job_data(int NJ, int NR)
	{
	ManufactoringSystem[] job = null ;
	  int i;
	  int r;

	 // job = (NJ);
	  Random createjob = new Random();  


	 for (i = 0; i < NJ; i++)
	  {
		  job[i].id = i;
		  job[i].ProcT = new int[NR];
		  for (r = 0; r < NR; r++)
		  {
			  job[i].ProcT[r] = 1 + RandomNumbers.nextNumber() % 100; //muv.ido
		  }

		  job[i].SartT = new int[NR];
		  job[i].EndT = new int[NR];
		
	  }
	  return job;
	}
	
	
	private static void Simulate_FS2(Tjob job, int nJ, Workstation work, int nR, Integer argValue, int i, int mode) {
		// TODO Auto-generated method stub
		
	}
	private static int calloc(int nJ, int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
			public static void Simulate_FS2(Tjob[] job, int NJ, Workstation[] work, int NR, int[] s, int t0, int mode)
		{
		   int i;
		   int r;

		   for (i = 0; i < NJ; i++)
		   { //i az inditasi sorrend indexe
			 for (r = 0; r < NR; r++)
			 {
				if (i == 0)
				{ //kezdo munka
				   if (r == 0)
				   { //kezdo munkahely
					   job[s[i]].StartT[r] = t0; //ref. idoben indul
				   }
					else
					{ //nem kezdo munkahely
					   job[s[i]].StartT[r] = job[s[i]].EndT[r - 1] + work[r].TransT[r - 1]; //+ anyagmoygatasi ido
					}
				   //bef. idopont = kezd. idopont + atallasi ido + muveleti ido
				   job[s[i]].EndT[r] = job[s[i]].StartT[r] + work[r].SetT[0][s[i]] + job[s[i]].ProcT[r];

				}
				else
				{ //nem kezdo munka
				   if (r == 0)
				   { //kezdo munkahely
					   job[s[i]].StartT[r] = job[s[i - 1]].EndT[r]; //elozo munka bef.

				   }
					else
					{ //nem kezdo munkahely
					   job[s[i]].StartT[r] = (int) max_l(job[s[i]].EndT[r - 1] + work[r].TransT[r - 1], job[s[i - 1]].EndT[r]); //elozo munka bef.

					}
				   //bef. idopont = kezd. idopont + atallasi ido + muveleti ido
				   job[s[i]].EndT[r] = job[s[i]].StartT[r] + work[r].SetT[s[i - 1]][s[i]] + job[s[i]].ProcT[r];


				}
				 //muszakokhoz illesztes
				   Load_STET_to_Cal_by_mode(job[s[i]].StartT, job[s[i]].EndT, work, r, mode);
			 }

		   }
	
	}
			private static void Load_STET_to_Cal_by_mode(int[] startT, int[] endT, Workstation[] work, int r,
					int mode) {
			
				int new_st;
				int new_et;
				int size;
				
				int c; //muszak index
			  int found = -1; //a kivalasztott muszak sorszama

			//	 new_st = ;
				// new_et = et.argValue;
				 //size = et.argValue - st.argValue;
				  c = 0;
			}
	/*		private int Load_STET_to_Cal(RefObject<Integer> st, RefObject<Integer> et, Workstation[] work, int r)
			{
				int new_st;
				int new_et;
				int size;
				
				int c; //muszak index
			  int found = -1; //a kivalasztott muszak sorszama 

			  new_st = st.argValue;
			  new_et = et.argValue;
			  size = et.argValue - st.argValue;
			  c = 0;

		/*	  while (c < res[r].NCal)
			  {
				 if (new_st < res[r].Cal[c].ET)
				 { //jeloltek
					new_st = (int) max_l(new_st, res[r].Cal[c].ST); //illesztem
					new_et = new_st + size;

					if (new_et <= res[r].Cal[c].ET)
					{ //kesz
						found = c;
						break;
					}
					else
					{
						c++;
						if (c >= res[r].NCal)
						{
						   new_st = res[r].Cal[c - 1].ET;
						   new_et = new_st + size;
						   break;
						}
						else
						{
						 continue;
						}
					}

				 }

				  c++;
			  }*/

			 //  st.argValue = new_st;
			   //et.argValue = new_et;


			//}
			
			
}
