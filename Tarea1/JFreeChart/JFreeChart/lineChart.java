import java.io.*;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartFactory; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.ChartUtilities; 
import java.lang.Math;
public class lineChart {  
      public static void main(String[] args){
         try {
                
                java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0.0");
                /* Step - 1: Define the data for the line chart  */
                
                DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
                for (float i = 0; i < 2.1; i += 0.1) {
                    line_chart_dataset.addValue(Math.pow(i-1, 2), "f(x) = (x-1)^2", decimalFormat.format(i));               
                }
                /* Step -2:Define the JFreeChart object to create line chart */
                JFreeChart lineChartObject=ChartFactory.createLineChart(
				  "PARABOLA","x","f(x)",
				  line_chart_dataset,PlotOrientation.VERTICAL,true,true,false);                
                          
                /* Step -3 : Write line chart to a file */               
                 int width=640; /* Width of the image */
                 int height=480; /* Height of the image */                
                 File lineChart=new File("line_Chart_example2.png");              
                 ChartUtilities.saveChartAsPNG(lineChart,lineChartObject,width,height); 
         }
         catch (Exception i)
         {
             System.out.println(i);
         }
     }
 }

