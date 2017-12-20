package pers.onezero.el.comel;

import org.springframework.stereotype.Component;

@Component("salaryBean")
public class SalaryBean {
        public double getSpecialSalary(){
        	return new Double(100.12);
        }
}
