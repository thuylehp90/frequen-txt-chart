package chartprocess;

import java.io.FileInputStream;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

import fileprocess.Textfileprocess;

public class Barchartcreator extends ApplicationFrame {
	int[] bcharr = new int[26];
	Textfileprocess txtfpr;
	public Barchartcreator(String title,String chartTitle,FileInputStream f) {
		super(title);
		// TODO Auto-generated constructor stub
		JFreeChart barTxtChart = ChartFactory.createBarChart(
				chartTitle,
				"","Frequency",
				cDatasetFromResult(),
				PlotOrientation.VERTICAL,
				true,true,false);
		txtfpr = new Textfileprocess(f);
		bcharr = txtfpr.getfpResult();
	}
	private CategoryDataset cDatasetFromResult() {
		final char[] arrCharacter= txtfpr.getArrChar();
		final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		final String ch = "Frequency"; 
		for(int i=0;i<bcharr.length;i++) {
			dataset.addValue((double)bcharr[i],ch,arrCharacter[i]);
		}
		return dataset;
		
	}
	
	
	
}
