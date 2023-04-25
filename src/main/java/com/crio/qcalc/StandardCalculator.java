package com.crio.qcalc;

public class StandardCalculator {


    protected double result;

    public static void getVersion(){
       System.out.println("Standard Calculator 1.0");
    }
    final public void add(int  n1, int n2){
        result =n1+n2;
    }     
   final public void add(double num1, double num2){
      double result = num1 + num2;
     if((result == Double.MAX_VALUE) || (result == Double.POSITIVE_INFINITY)){
         throw new ArithmeticException("Double overflow");
     }
      this.result = result;
    }

    final public void subtract(int  n1, int n2){
         result = n1-n2;
     }
    
    final public void subtract(double num1, double num2){
     double result = num1 - num2;
    if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){
        throw new ArithmeticException("Double overflow");
    }
    this.result = result;
   } 


     final public void multiply(int  n1, int n2){
         result =  n1*n2;
     }
     final public void multiply(double num1, double num2){
        double result = num1 * num2;
    if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY) || (result == Double.POSITIVE_INFINITY)){
        throw new ArithmeticException("Double overflow");
    }
    this.result = result;
     }
 
     
     final public void divide(int  n1, int n2){
         result = n1/n2;
     }
 
    
    public final void divide(double num1, double num2){
       if(num2 == 0.0){
          throw new ArithmeticException("Divide By Zero");
       }
       result = num1 / num2;
    }


  
     public double getResult() {
       return result;
    }

  
     public void setResult(int value) {
      if (value != 0)
          return;    
      this.result = value;
    }

  
     public void clearResult() {
      result = 0;
    }
    
    public void printResult(){
        System.out.println("Standard Calculator Result:"+ result);
    }
   
}
