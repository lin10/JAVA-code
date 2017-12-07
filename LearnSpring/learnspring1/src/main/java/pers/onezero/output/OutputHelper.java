package pers.onezero.output;

import pers.onezero.output.OutputInter;

public class OutputHelper {
    OutputInter outputGenerator;
    
    public void setOutputGenerator(OutputInter outputGenerator){
    	this.outputGenerator = outputGenerator;
    }
    
    public void generateOutput(){
    	outputGenerator.generateOutput();
    }
	
    
}
