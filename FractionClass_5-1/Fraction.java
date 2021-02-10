class Fraction {
    
    private int Denominator, Numerator;

    public Fraction(){// No Return Type
        Numerator = 400;
        Denominator = 500;
    }
    
    public Fraction(int InputNumerator, int InputDenominator){
        this.Numerator = InputNumerator;
        this.Denominator = InputDenominator;

        if (this.Numerator < 0 && this.Denominator < 0){
            this.Numerator = this.Numerator * -1;
            this.Denominator = this.Denominator * -1;
        }
    }
    
    public Fraction(String num){
       this.Numerator = Integer.parseInt(num.substring(0,num.indexOf("/")));
       this.Denominator = Integer.parseInt(num.substring(num.indexOf("/")+1, num.length()));

       if (this.Numerator < 0 && this.Denominator < 0){
            this.Numerator = this.Numerator * -1;
            this.Denominator = this.Denominator * -1;
        }
    }

    public Fraction(Fraction Input){
        this.Numerator = Input.Numerator;
        this.Denominator = Input.Denominator;
        
        if (this.Numerator < 0 && this.Denominator < 0){
            this.Numerator = this.Numerator * -1;
            this.Denominator = this.Denominator * -1;
        }
    }

    // Accessor Method
    
    public int getNum(){
        return this.Numerator;
    }
    
    public int getDenom(){
        return this.Denominator;
    }
    
    public String toString(){
        int StringNumerator = this.Numerator;
        int StringDenominator = this.Denominator;
        
        if (this.Numerator < 0 && this.Denominator < 0){
            this.Numerator = this.Numerator * -1;
            this.Denominator = this.Denominator * -1;
        }
        return StringNumerator + "/" + StringDenominator;        
    }
    
    public double toDouble(){
        double DoubleNumerator = this.Numerator;
        double DoubleDenominator = this.Denominator;
        
        return DoubleNumerator / DoubleDenominator;
    }
    
    // Mutator Method
    
    public void reduce(){
        if (this.Numerator < 0 && this.Denominator < 0){
            this.Numerator = this.Numerator * -1;
            this.Denominator = this.Denominator * -1;
        }
        
        int Limit = Math.max(Math.abs(this.Numerator), Math.abs(this.Denominator));
        for (int i = 2; i < Limit; i++){
            if (Numerator % i == 0 && Denominator % i == 0){
                Numerator = Numerator / i;
                Denominator = Denominator / i;
                i = 1;
            }
        }
    }
    
    public void setNum(int InputNumerator){
        this.Numerator = InputNumerator;
    }
    
    public void setDenom(int Denomiantor){
        this.Denominator = Denomiantor;
    }
    
    // Static, cant use this.
    
    public static Fraction Multiply(Fraction a, Fraction b){
        if (a.Denominator == 0 && b.Denominator == 0){
            a.Numerator = 0;
            a.Denominator = 1;
            b.Numerator = 0;
            b.Denominator = 1;    
            System.out.println("Fraction A and Fraction B have 0 denominators");
        }
        else if (a.Denominator == 0){
            a.Numerator = 0;
            a.Denominator = 1;
            System.out.println("Fraction A has a 0 denominator");
        }
        else if (b.Denominator == 0){
            b.Numerator = 0;
            b.Denominator = 1;  
            System.out.println("Fraction B has a 0 denominator");
        }
        
        int NewNumerator = a.Numerator * b.Numerator;
        int NewDenominator = a.Denominator * b.Denominator;
        
        Fraction NewFraction = new Fraction(NewNumerator, NewDenominator);
        NewFraction.reduce();
        return NewFraction;
    }
    
    public static Fraction Divide(Fraction a, Fraction b){
        if (a.Denominator == 0){
            System.out.println("Fraction A has a 0 denominator");
        }
        
        if (b.Numerator == 0 || b.Denominator == 0){
            Fraction DefaultFraction = new Fraction();
            System.out.println("Dividing by 0, return Default Fraction");
            return DefaultFraction;   
        }
        

        int NewNumerator = a.Numerator * b.Denominator;
        int NewDenominator = a.Denominator * b.Numerator;
        
        Fraction NewFraction = new Fraction(NewNumerator, NewDenominator);
        NewFraction.reduce();
        return NewFraction;
    }
    
    public static Fraction Add(Fraction a, Fraction b){
        if (a.Denominator == 0 && b.Denominator == 0){
            a.Numerator = 0;
            a.Denominator = 1;
            b.Numerator = 0;
            b.Denominator = 1;    
            System.out.println("Fraction A and Fraction B have 0 denominators");
        }
        else if (a.Denominator == 0){
            a.Numerator = 0;
            a.Denominator = 1;
            System.out.println("Fraction A has a 0 denominator");
        }
        else if (b.Denominator == 0){
            b.Numerator = 0;
            b.Denominator = 1;  
            System.out.println("Fraction B has a 0 denominator");
        }
        
        
        int NewNumerator = (a.Numerator * b.Denominator) + (b.Numerator * a.Denominator);
        int NewDenominator = a.Denominator * b.Denominator;
        
        Fraction NewFraction = new Fraction(NewNumerator, NewDenominator);
        NewFraction.reduce();
        return NewFraction;
    }
    
    public static Fraction Subtract(Fraction a, Fraction b){
        if (a.Denominator == 0 && b.Denominator == 0){
            a.Numerator = 0;
            a.Denominator = 1;
            b.Numerator = 0;
            b.Denominator = 1;    
            System.out.println("Fraction A and Fraction B have 0 denominators");
        }
        else if (a.Denominator == 0){
            a.Numerator = 0;
            a.Denominator = 1;
            System.out.println("Fraction A has a 0 denominator");
        }
        else if (b.Denominator == 0){
            b.Numerator = 0;
            b.Denominator = 1;  
            System.out.println("Fraction B has a 0 denominator");
        }
        
        
        int NewNumerator = (a.Numerator * b.Denominator) - (b.Numerator * a.Denominator);
        int NewDenominator = a.Denominator * b.Denominator;
        
        Fraction NewFraction = new Fraction(NewNumerator, NewDenominator);
        NewFraction.reduce();
        return NewFraction;
    }

    //================================================================
    
    public  int GCF(int A, int B){
        int Answer = 0;
        int LeftNumber = Math.abs(A);
        int RightNumber = Math.abs(B);
        
        if (LeftNumber == 0 && RightNumber == 0){
            System.out.println("A and B are both 0");
        }
        else if (LeftNumber == 0){
            System.out.println("A is 0");
        }
        else if (RightNumber == 0){
            System.out.println("B is 0");
        }
        else { 
            while(LeftNumber != RightNumber){
                if (LeftNumber > RightNumber){
                    LeftNumber = LeftNumber - RightNumber;
                }
                else {
                    RightNumber = RightNumber - LeftNumber;
                }
            } 
            Answer = RightNumber;
        }
        
        //System.out.println(LeftNumber);
        //System.out.println(RightNumber);
        return Answer;
    }
    
    
    
    //public void pAdd(Fraction Input){
        
    //    int NewNumerator = (this.Numerator * Input.Denominator) + (Input.Numerator * this.Denominator);
    //    int NewDenominator = this.Denominator * Input.Denominator;
        
    //    Fraction NewFraction = new Fraction(NewNumerator, NewDenominator);
    //    NewFraction.reduce();

    //}
    
    
    
    // toString() to return the values otherwise return stored ram hex
    //            return Fraction as a String
    // Integer.parseInt(n);
}
