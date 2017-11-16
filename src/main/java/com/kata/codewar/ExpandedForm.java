package com.kata.codewar;

public class ExpandedForm {

	public String expandedForm(int num) {
		String numStr = String.valueOf(num); 
		int numLenth = numStr.length() ;
		char[] numChars = numStr.toCharArray(); 
		int cpt = numLenth; 
		StringBuilder returnValue = new StringBuilder();  
		while (cpt>0) {
			String car = ""+ numChars[numLenth-cpt]; 
			if(!"0".equals(String.valueOf(car))){
				String expandedValue =""; 
				if(cpt<numLenth){
					returnValue.append(" + ");
				}
				expandedValue = "" + Double.valueOf(Integer.valueOf(car)*Math.pow(10, cpt-1)).intValue(); 
				returnValue.append(expandedValue);
			}
			cpt--; 
		}
		return returnValue.toString();
	}

}
