class FractionDriver {
    // contains a static method
    public static void main(String[] args){    
        Fraction DefaultFraction = new Fraction();
        Fraction InputFraction = new Fraction(-7,0);
        Fraction StringFraction = new Fraction(38,0);
        Fraction fractionFraction = new Fraction(StringFraction);
        
        
        System.out.println("Default Fraction: " + DefaultFraction);   
        System.out.println(InputFraction);   
        System.out.println(StringFraction);
        System.out.println(fractionFraction);
        
        
        System.out.println("");
        
        Fraction AnswerMultiply = Fraction.Multiply(StringFraction,InputFraction);
        System.out.println("Draction Multiply: " + AnswerMultiply);
        
        Fraction AnswerDivide = Fraction.Divide(StringFraction,InputFraction);
        System.out.println("Draction Divide: " + AnswerDivide);
        
        Fraction AnswerAdd = Fraction.Add(StringFraction,InputFraction);
        System.out.println("Draction Add: " + AnswerAdd);
        
        Fraction AnswerSubtract = Fraction.Subtract(StringFraction,InputFraction);
        System.out.println("Draction Subtract: " + AnswerSubtract);

        
        //System.out.println("Greatest Common Denominator is: " + StringFraction.GCF(252,105));

        //StringFraction.pAdd(InputFraction);
        
    }
}