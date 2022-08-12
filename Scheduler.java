package szakdolgozat.gui;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JRadioButton;




public class Scheduler extends JFrame implements ActionListener{
	
	public static double max_l(double a, double b)
	{
		return a > b ? a : b;
	}
	public static double min_l(double a, double b)
	{
		return a < b ? a : b;
	}
	// ide jönnek z algoritmusok
		// palmer,, johndson, dannebirg
		//hegymszó
		//ebből fogom odaadni a simulátornak
	 protected int NR=0,NJ;
	 protected int mode=0;
	 protected int Tmax;
	 protected int Tsum;
	 protected int Udum;
	 protected int Cmax;
	JLabel IntroLabel;
	JButton BetoltesButton = new JButton();
	
	
	JLabel Munkakszamlabel;
		
	JButton OkButton;
	
	JTextField MunkakSzamaField;
	JTextField MunkaHelyekSzamaField;
	JTextField MegszakithatoField;
	JTextField TmaxField;
	JTextField TsumField;
	JTextField UsumField;
	JTextField CmaxField;
	

	JLabel MunkaHelyekSzamaLabel;
	JLabel MegszakithatoLabel;
	JLabel SzovegLabel;
	JLabel TmaxLabel;
	JLabel TsumLabel;
	JLabel UsumLabel;
	JLabel CmaxLabel;
	
	Scheduler(){

		IntroLabel =new JLabel("Válassza ki a kívánt dokumentomot és nyomja meg az 'OK' gombot!");
		IntroLabel.setBounds(0, 0, 450, 150);
		
		BetoltesButton.setBounds(10, 90, 100, 60);
		BetoltesButton.addActionListener(this);
		BetoltesButton.setText("Betöltés");
		
		Munkakszamlabel = new JLabel("Munkák száma");
		Munkakszamlabel.setBounds(10, 100, 120, 150);
			
		MunkakSzamaField = new JTextField("Munkakszama");
		MunkakSzamaField.setBounds(140, 160, 60, 30);
		
		MunkaHelyekSzamaLabel = new JLabel("Munkahelyek száma");
		MunkaHelyekSzamaLabel.setBounds(10, 140, 120, 150);
		
		MunkaHelyekSzamaField = new JTextField("munkahelyek");
		MunkaHelyekSzamaField.setBounds(140, 200, 60, 30);
			
		MegszakithatoLabel = new JLabel("Munkák megszakíthatóak-e? 0: nem, 1: igen");
		MegszakithatoLabel.setBounds(10, 180, 120, 150);
		
		MegszakithatoField = new JTextField("megszak");
		MegszakithatoField.setBounds(140, 240, 60, 30);
		
		SzovegLabel= new JLabel("Célfüggvények prioritása:");
		SzovegLabel.setBounds(150, 210, 200, 180);
		
		TmaxLabel = new JLabel("Legnagyobb csúszás  Tmax paritása:");
		TmaxLabel.setBounds(10, 270, 250, 150);
		TmaxField = new JTextField("tmax");
		TmaxField.setBounds(400, 330, 60, 30);
			
		TsumLabel = new JLabel("Csúszás összegének Tsum prioritása");
		TsumLabel.setBounds(10, 300, 250, 150);
		TsumField = new JTextField("tsum");
		TsumField.setBounds(400, 360, 60, 30);
			
		UsumLabel = new JLabel("Késő munkák számának Usum prioritása");
		UsumLabel.setBounds(10, 330, 250, 150);
		UsumField = new JTextField("usum");
		UsumField.setBounds(400, 390, 60, 30);
				
		CmaxLabel =new JLabel("Utolsó munkának befejezési időpontjának Cmax prioritása:");
		CmaxLabel.setBounds(10, 360, 360, 150);
		CmaxField = new JTextField("cmax");
		CmaxField.setBounds(400, 420, 60, 30);
		
		
		OkButton = new JButton("OK");
		OkButton.setBounds(10,450, 100, 60);
		OkButton.addActionListener(this);
				
		
		this.add(IntroLabel);
	    this.add(BetoltesButton);

		this.add(Munkakszamlabel);		
		this.add(MunkakSzamaField);
		
		this.add(MunkaHelyekSzamaLabel);
		this.add(MunkaHelyekSzamaField);
		
		this.add(MegszakithatoLabel);
		this.add(MegszakithatoField);
		
		this.add(SzovegLabel);
		
		this.add(TmaxLabel);
		this.add(TmaxField);
			
		this.add(TsumLabel);
		this.add(TsumField);
		
		this.add(UsumLabel);
		this.add(UsumField);
		
		this.add(CmaxLabel);
		this.add(CmaxField);
		
	
		this.add(OkButton);

		
		 this.setTitle("Flow Shop szimulációja"); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,600);
		this.setLayout(null);
		this.setVisible(true);
	
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
 if(e.getSource() == BetoltesButton) { 
			 
	 JFileChooser fileChooser =new JFileChooser();
	 int response = fileChooser.showOpenDialog(null);
	// System.out.println(fileChooser.showOpenDialog(null));
	 
	 if(response ==JFileChooser.APPROVE_OPTION) { 
		 File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
		 System.out.println(file);
		 ArrayList<Job> erforras = new ArrayList<>();
			try 
			{
				System.setProperty("file.encoding", "UTF8");
				FileReader fajl = new FileReader("betoltes.txt");
				BufferedReader br = new BufferedReader(fajl);
				String sor = null;
				
				while((sor=br.readLine()) != null) {
					String[] darabok = sor.split(";");
					String id = darabok[0];
					String NR = darabok[1];
					String NJ = darabok[2];
					String TMax = darabok[3];
					String TSum = darabok[4];
					String USum = darabok[5];
					String CMax = darabok[6];
					
					System.out.println("beolvastam"); 
				//	System.out.println(id);  //működik
				//	System.out.println(ProcT);
				}
				br.close();
			}
					
					catch(IOException e1)
					{	
						System.out.println("Sikertlen beolvasas" + e1);
				}
			 }
			 
		
			 }
			
		
		
	
	
	if(e.getSource() == OkButton) { 
		//public static int parseInt(String NR);  
		//MunkakSzamaField= NR;
	
	
}
}
	private void Evaluate_FS_MOF(Tjob[] job, int NJ, int NR, int[] s, double[] f)
	{ //Flow Shop miatt a Cmax kozvetlenul lekerdezheto
	   int Cmax; //max. befejezesi idopont
	   int Tmax; //max csuszas
	   int Li; //i munka kesese
	   int Ti; //i munka csuszasa
	   int Tsum = 0; //csuszasok osszeg
	   int Usum = 0; //csuszo munkak szama
	   int i; //munka index

	   for (i = 0; i < NJ; i++)
	   {
		   Li = job[i].EndT[NR - 1] - job[i].date;
		   Ti = (int) max_l(0, Li);

		   //max csuszas
		   if (i == 0)
		   {
			   Tmax = Ti;
		   }
			else
			{
		//	   if (Tmax < Ti)
			   {
				   Tmax = Ti;
			   }
			}

		   Tsum += Ti; //sesesek osszege

		   if (Ti > 0)
		   {
			  Usum++; //keso munkak szama
		   }
	   }

	   Cmax = job[s[NJ - 1]].EndT[NR - 1];

	 //  f[0] = Tmax;
	   f[1] = Tsum;
	   f[2] = Usum;
	   f[3] = Cmax;

	}

	private void Printf_MOF(double[] f, int K)
	{
	  System.out.print("\n \n \n Celfuggvenyek ertekei:");
	  System.out.printf("\n Tmax = %lf", f[0]);
	  System.out.printf("\n Tsum = %lf", f[1]);
	  System.out.printf("\n Usum = %lf", f[2]);
	  System.out.printf("\n Cmax = %lf", f[3]);
	  
	}
	private double F(double[] fx, double[] fy, int K, double[] w)
	{
	   int k; //celfuggvenyek indexe
	   double a;
	   double b;
	   double D;
	   double F = 0;

	   for (k = 0; k < K; k++)
	   {
		   a = fx[k];
		   b = fy[k];

		   if (max_l(a,b) == 0)
		   {
			  D = 0;
		   }
		   else
		   {
			  D = (b - a) / max_l(a,b);
		   }

		   F += w[k] * D;
	   }

	  return F;
	}
	//Palmer
	/*System.out.print("\n Palmer-modszer");
	//F_Palmer_alg(job, NJ, NR, s);
	System.out.printf(" \n Cmax = %ld", Evaluate(job, NJ, NR, s));
	Simulate_FS2(job, NJ,res, NR, s, 0,mode);
	  System.out.printf(" \n Eroforrások bõvítése Cmax = %ld", Evaluate(job, NJ, NR, s));
		System.out.print("\n Dannenbring-modszer");
		F_Dannenbring_alg(job, NJ, NR, s);
			System.out.printf(" \n Cmax = %ld", Evaluate(job, NJ, NR, s));
		Simulate_FS2(job, NJ,res, NR, s, 0, mode);
		  System.out.printf(" \n Eroforrások bõvítése Cmax = %ld", Evaluate(job, NJ, NR, s));

		 System.out.print("\n CDS-modszer");
		F_CDS_alg(job, NJ, res,NR, s, mode);
					System.out.printf(" \n Cmax = %ld", Evaluate(job, NJ, NR, s));
		Simulate_FS2(job, NJ,res, NR, s, 0, mode);
		  System.out.printf(" \n Eroforrások bõvítése Cmax = %ld", Evaluate(job, NJ, NR, s));

		  
		  
		  System.out.print("\n Kereso-modszer");
		    STEP = 100;
			LOOP = 50;
			System.out.print("\n STEP = ");
			//   int tempVar8 = ConsoleInput.scanfRead();
			//   if (tempVar8 != null)
			  {
				//   STEP = tempVar8;
			  }

			   System.out.print("\n LOOP = ");
			   String tempVar9 = ConsoleInput.scanfRead();
			   if (tempVar9 != null)
			   {
				   LOOP = tempVar9;
			   }

	//		F_Search_alg(job, NJ,res, NR, s, STEP, LOOP,mode, w, N_OF);
			//System.out.printf(" \n Kereso Cmax = %ld", Evaluate(job, NJ, NR, s));
			Simulate_FS2(job, NJ, res, NR, s, 0,mode);
			System.out.printf(" \n  Eroforrások bõvítése Cmax = %ld", Evaluate(job, NJ, NR, s));
}

}
	
public static void F_CDS_alg(Tjob job, int NJ, Tres res, int NR, RefObject<Integer> s, int mode)
{
	 int i; //job index
	 int r; //gep index
	 int Cmax;
	 int C_best;

	 int s_best; //legjobb megoldas

	 s_best = (int) calloc(NJ, (Integer.SIZE / Byte.SIZE));

	 for (r = 0; r < NR - 1; r++)
	 {
	/* Johnson_alg(job, NJ, r, s.argValue);
	 
	 Simulate_FS2(job, NJ, res, NR, s.argValue, 0, mode);
//	 Cmax = Evaluate(job, NJ, NR, s.argValue);
	   System.out.printf(" \n Cmax = %ld", Cmax);
	   System.out.printf(" \n Cmax = %ld", Cmax);

	  if (r == 0)
	  {
		   copy_s(s_best, s.argValue, NJ); // utemtervet  masol
		   C_best = Cmax; //celfgvmasolas

	  }
	  else
	  {
		   if (C_best > Cmax)
		   {
			   copy_s(s_best, s.argValue, NJ); //utemtervet masol
			   C_best = Cmax; //celfv masolasa

		   }
	  }
	 }

   copy_s(s.argValue, s_best, NJ); //utemtervet masol



}
public static void F_Dannenbring_alg(Tjob[] job, int NJ, int NR, RefObject<Integer> s)
{
 int i; //i -job inex, j-muvelet indexe
 int j;

//virtualis ketgeps modell letrehozasa
 Tjob[] job_virt;
 job_virt = create_and_load_job_data(NJ, 2); //ketgepes F2

 //muveleti idok hangolasa
 for (i = 0; i < NJ; i++)
 {
	  job_virt[i].ProcT[0] = 0;
	  job_virt[i].ProcT[1] = 0;

	  for (j = 0; j < NR; j++)
	  {
		job_virt[i].ProcT[0] += (NR - (j + 1) - 1) * job[i].ProcT[j];
		job_virt[i].ProcT[1] = j * job[i].ProcT[j];
	  }
 }

 //Johnson-alg
 Johnson_alg(job_virt, NJ, 0, s.argValue);
 //elkeszult a sorend: s

 //virtualis kornyezet felszabaditasa
 free_mem(job_virt, NJ);
}


public static void F_Palmer_alg(Tjob[] job, int NJ, int NR, int[] s)
{
int i; //munka index
int k;
int j; //operaciio (egyben a gep) index
double[] I; //Palmer index
int index; //rendezes segedvaltozo
int temp; //csere segédvaltozó

//Palmer index szamitasa
I = new double[NJ]; //tomb
for (i = 0; i < NJ; i++)
{
  I[i] = 0;
  for (j = 0; j < NR; j++)
  {
	I[i] -= job[i].ProcT[j] * (NR - (2 * (j + 1) - 1)) / 2.0;
  }


}

//rendezes
for (i = 0; i < NJ; i++)
{
 s[i] = i; //inicializalas
}

for (i = 0; i < NJ - 1; i++) // i az s tomb indexe
{
  index = i;
  for (j = i + 1; j < NJ; j++)
  {
	 if (I[s[index]] < I[s[j]])
	 {
		index = j;
	 }
  }

  if (index != i)
  { //csere
	 temp = s[index];
	 s[index] = s[i];
	 s[i] = temp;
  }
}

}


public static int Evaluate(Tjob[] job, int NJ, int NR, int[] s)
{ //Cmax a Flow Shop esetben direkt cimmel lekerheto
 return job[s[NJ - 1]].EndT[NR - 1];
}
public static void Johnson_alg(Tjob[] job, int NJ, int r, int[] s)
{
  double i; //indexek
  double j;
  double[] v; //vektor
  int index; //pozico
  int value; //muveleti ido
  int value_at_j;
  int temp;
  int first; //utemtezes szabad pozicioinak indexei
  int last;

  v = new double[NJ];
  for (i = 0; i < NJ; i++)
  {
	v[(int) i] = i;
  }

  //1. fazis: elorendezes
  //milyen sorrendben hozok dontest
  for (i = 0; i < NJ - 1; i++)
  {
	   index = (int) i; //ebben a pozicioba keresem az elemet
	   value = (int) min_l(job[(int) v[(int) i]].ProcT[r], job[(int) v[(int) i]].ProcT[r + 1]);

	   for (j = (int) (i + 1); j < NJ; j++)
	   {
		   value_at_j = (int) min_l(job[(int) v[(int) j]].ProcT[r], job[(int) v[(int) j]].ProcT[r + 1]);
		   if (value_at_j < value)
		   { //jelolt
				 index = (int) j;
				 value = value_at_j;
		   }
	   }

	   if (i != index)
	   { //csere
			temp = (int) v[(int) i];
			v[(int) i] = v[(int) index];
			v[(int) index] = temp;
	   }
  }

  //2. utemezes
	first = 0;
	last = NJ - 1;
	for (i = 0; i < NJ; i++)
	{
	  if (job[(int) v[(int) i]].ProcT[r] < job[(int) v[(int) i]].ProcT[r + 1])
	  { //elore a mar beutemzettek moge
		  s[first] = (int) v[(int) i];
		  first++;
	  }
	  else
	  { //hatra a mar beutemezettek ele
			 s[last] = (int) v[(int) i];
			 last--;
		  }
		}

	  

 
// C_best = Evaluate(job, NJ, NR, s_best);

 /*for (step = 1; step <= STEP; step++) //lepesek
 {
	 for (loop = 1; loop <= LOOP; loop++) //szomszedok
	 {
		 Neighbour(s_0, s_act, NJ); //szomszed elloallitasa
		 Simulate_FS2(job, NJ,res, NR, s_act, 0,mode);
		 C_act = Evaluate(job, NJ, NR, s_act);

		 if (loop == 1)
		 {
			 copy_s(s_ext, s_act, NJ); //utemtervet masol
			 C_ext = C_act; //celfgv masolasa
			  copy_f(f_ext, f_act, K);
		 }
		   else
		   {
			 if (C_ext > C_act)
			 {
			   copy_s(s_ext, s_act, NJ); //utemtervet masol
			   C_ext = C_act; //celfgv masolas
				copy_f(f_ext, f_act, K);
			 }
		   }
	 } //loop
		 copy_s(s_0, s_ext, NJ); //a legjonn szomszed valik az uj bazissa

	   if (C_best > C_ext)
	   {
		   if (F(f_best, f_ext, K, w.argValue) < 0)
		   {
		   copy_s(s_best, s_ext, NJ); //utemtervet masol
		   C_best = C_ext; //celfgv masolasa
	   copy_f(f_best, f_ext, K);
		   }
	   }
 }
 }

public static void create_adhoc_schedule(int[] s, int NJ)
{
int i;

for (i = 0; i < NJ; i++)
{
  s[i] = i;
}
}*/

//Tjob create_and_load_job_data(int NJ, int NR);
/*		public static void generate_res_data(Tjob[][] res, int NR, int NJ)
		{
		  int r; //munkahely index
		  int k;
		  int i; //munka index
		  int j;
		   int c; //muszak (idointervallum) index

		  for (r = 0; r < NR; r++)
		  {
			  res[r].id = r;

			  for (i = 0; i < NJ; i++)
			  {
				for (j = 0; j < NJ; j++)
				{
				  if (i == j)
				  {
					res[r].SetT[i][j] = 0;
				  }
				  else
				  {
					res[r].SetT[i][j] = 1 + RandomNumbers.nextNumber() % 100;
				  }
				}
			  }

			  for (k = 0; k < NR; k++)
			  {
				if (r == k)
				{
				  res[r].TransT[k] = 0;
				}
				else
				{
				  res[r].TransT[k] = 1 + RandomNumbers.nextNumber() % 20;
				}
			  }

				   res[r].NCal = 2 + RandomNumbers.nextNumber() % 10; //intervallumok szama
			  res[r].Cal = Arrays.initializeWithDefaultTtwInstances(res[r].NCal); //strukturatomb

			  for (c = 0; c < res[r].NCal; c++)
			  {
				 if (c == 0)
				 {
					res[r].Cal[c].ST = 10 +RandomNumbers.nextNumber() % 20;
				 }
				 else
				 {
				   res[r].Cal[c].ST = res[r].Cal[c - 1].ET + 2 + RandomNumbers.nextNumber() % 20;
				 }

				 res[r].Cal[c].ET = res[r].Cal[c].ST + 20 +RandomNumbers.nextNumber() % 100;
			  }

		  }
		
	}*/
		/*public static void copy_s(int[] s_t, int[] s_s, int NJ)
		  {
			int i;
			for (i = 0; i < NJ; i++)
			{
			   s_t[i] = s_s[i];
			}
		  }*/
		

//}

	
}