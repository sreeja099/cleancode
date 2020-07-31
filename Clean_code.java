import java.util.*;
import java.lang.*;
public class Clean_code{
                public static double Simple(double p,double t,double r){
		return(p*t*r)/100;
	}
              public static double Compound(double p,double t,double r){
		return p*Math.pow(1.0+r/100.0,t)-p;
                     }
              public static void main(String[] args){
		Simple(2000,2,2);
		Compound(3000,3,3);
}
}# PEP-Task4
#PEP-Task4-Cleancode
