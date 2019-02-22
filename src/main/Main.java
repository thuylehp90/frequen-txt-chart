package main;

import org.jfree.ui.RefineryUtilities;

import simpleChart.BarChart_AWT;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BarChart_AWT chart = new BarChart_AWT("Car Usage Statistics","Which car do you like?");
		chart.pack();
		RefineryUtilities.centerFrameOnScreen(chart);
		chart.setVisible(true);
	}

}
