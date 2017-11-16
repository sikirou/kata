package com.kata.codewar;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class SerieSum {
	public String evaluate(int n) {
		Locale locale  = new Locale("en", "UK");
		String pattern = "###.##";

		DecimalFormat df = (DecimalFormat)NumberFormat.getNumberInstance(locale);
		df.applyPattern(pattern);

		double dividend =  1 ;
		double sum = (double) 0;
		int cpt =1;
		while (cpt <=n) {
			double divide = 1/dividend;
			sum = sum + divide; 
			dividend+=3; 
			cpt+=1;	
		}
		return df.format(sum);
	}

}
