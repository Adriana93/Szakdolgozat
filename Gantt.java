/*package szakdolgozat.gui;
import java.time.LocalDate;  
import java.time.ZoneOffset;  
import java.util.Date;  
import javax.swing.JFrame;  
import javax.swing.SwingUtilities;  
import javax.swing.WindowConstants;  
import org.jfree.chart.ChartFactory;  
import org.jfree.chart.ChartPanel;  
import org.jfree.chart.JFreeChart;  
import org.jfree.data.category.IntervalCategoryDataset;  
import org.jfree.data.gantt.Task;  
import org.jfree.data.gantt.TaskSeries;  
import org.jfree.data.gantt.TaskSeriesCollection;  

public class Gantt extends JFrame{
	
	private static  final long serialVersionUID = 1L;
	
	public Gantt(String title) {
		super(title);
		
		//create dataset
		IntervalCategoryDataset dataset = getCategoryDataset();
		
		//create chart
		
		JFreeChart chart = ChatFactory.createGanttChart(
			"Gantt n�v",
				"X tengely",
				"y tengely",
				
				dataset);
		  ChartPanel panel = new ChartPanel(chart);  
	      setContentPane(panel); 
	}
	
	 private IntervalCategoryDataset getCategoryDataset() {  
		  
		 TaskSeries series1 = new TaskSeries("Estimated Date"); series1.add(new Task("Requirement",  
		 Date.from(LocalDate.of(2017,7,3).atStartOfDay().toInstant(ZoneOffset.UTC)),  
		 Date.from(LocalDate.of(2017, 7,7).atStartOfDay().toInstant(ZoneOffset.UTC))  
		          ));  
		 
		 series1.add(new Task("Design",Date.from(LocalDate.of(2017, 7,10).atStartOfDay().toInstant(ZoneOffset.UTC)),  
				 Date.from(LocalDate.of(2017, 7, 14).atStartOfDay().toInstant(ZoneOffset.UTC))  
				         ));  
				        
				 series1.add(new Task("Coding",Date.from(LocalDate.of(2017, 7,17).atStartOfDay().toInstant(ZoneOffset.UTC)),  
				 Date.from(LocalDate.of(2017, 7, 21).atStartOfDay().toInstant(ZoneOffset.UTC))  
				         ));  
				        
				 series1.add(new Task("Testing", Date.from(LocalDate.of(2017, 7,24).atStartOfDay().toInstant(ZoneOffset.UTC)),  
				 Date.from(LocalDate.of(2017, 7, 28).atStartOfDay().toInstant(ZoneOffset.UTC))  
				         ));  
				        
				 series1.add(new Task("Deployment", Date.from(LocalDate.of(2017, 07,31).atStartOfDay().toInstant(ZoneOffset.UTC)),  
				 Date.from(LocalDate.of(2017, 8, 4).atStartOfDay().toInstant(ZoneOffset.UTC))  
				         ));  
				        
				        
				TaskSeries series2 = new TaskSeries("Actual Date");  
				series2.add(new Task("Requirement",Date.from(LocalDate.of(2017, 7,3).atStartOfDay().toInstant(ZoneOffset.UTC)),  
				Date.from(LocalDate.of(2017, 7, 05).atStartOfDay().toInstant(ZoneOffset.UTC))  
				         ));  
				        
				 series2.add(new Task("Design",  
				 Date.from(LocalDate.of(2017, 7, 6).atStartOfDay().toInstant(ZoneOffset.UTC)),  
				 Date.from(LocalDate.of(2017, 7, 17).atStartOfDay().toInstant(ZoneOffset.UTC))  
				         ));  
				        
				 series2.add(new Task("Coding",  
				 Date.from(LocalDate.of(2017, 7, 18).atStartOfDay().toInstant(ZoneOffset.UTC)),  
				 Date.from(LocalDate.of(2017, 7, 27).atStartOfDay().toInstant(ZoneOffset.UTC))  
				         ));  
				        
				 series2.add(new Task("Testing",  
				 Date.from(LocalDate.of(2017, 7, 28).atStartOfDay().toInstant(ZoneOffset.UTC)),  
				 Date.from(LocalDate.of(2017, 8, 1).atStartOfDay().toInstant(ZoneOffset.UTC))  
				         ));  
				        
				 series2.add(new Task("Deployment",  
				 Date.from(LocalDate.of(2017, 8, 2).atStartOfDay().toInstant(ZoneOffset.UTC)),  
				 Date.from(LocalDate.of(2017, 8, 4).atStartOfDay().toInstant(ZoneOffset.UTC))  
				         ));  
				  
				 TaskSeriesCollection dataset = new TaskSeriesCollection();  
				 dataset.add(series1);dataset.add(series2);  
				 return dataset;  
				   }  
				  
				 public static void main(String[] args) {  
				 SwingUtilities.invokeLater(() -> {  
				 GanttChartExample example = new GanttChartExample("Gantt Chart Example");  
				         example.setSize(800, 400);  
				         example.setLocationRelativeTo(null);  
				         example.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);  
				         example.setVisible(true);  
				      });  
				   }  

}*/
