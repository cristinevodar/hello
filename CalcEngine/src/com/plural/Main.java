package com.plural;

public class Main {

    public static void main(String[] args) {
/*        double[] rightVals = {50.0d, 95.0d, 17.0d, 3.0d};
        char[] opCodes={'d','a','s','m'};
        double[] results= new double[opCodes.length];/*
	    double val1=100.0d;
	    double val2=50.0d;
	    double result;
	    char opCode='d';*/
	    /*if(opCode == 'a')
	        result= val1+val2;
	    else if(opCode =='m')
            result= val1*val2;
        else if(opCode=='s')
            result= val1-val2;
        else if(opCode=='d')
            result= val2!=0.0d ? val1/val2 : 0.1d;

        else {
            result = 0.0d;
            System.out.println("Invalide opCode");
        }
        System.out.println(result);*/

	    MathEquation[] equations=new MathEquation[4];
	    equations[0]=new MathEquation('d', 50.0d, 100.0d);
        equations[1]=new MathEquation('a', 92.0d, 25.0d);
        equations[2]=new MathEquation('s', 17.0d, 225.0d);
        equations[3]=new MathEquation('m', 3.0d, 11.0d);

	    for(MathEquation equation : equations){
            equation.execute();
            System.out.println("result=");
            System.out.println(equation.getResult());
        }
        MathEquation equationOverload= new MathEquation('d');
        double leftDouble=9.0d;
        double rightDouble=4.0d;

        equationOverload.execute(leftDouble,rightDouble);
        System.out.println("result=");
        System.out.println(equationOverload.getResult());
        System.out.println("Inheritance=");
        CalculateBase[] calculators ={
                new Adder(25.0d, 92.0d),
                new Substracter(225.0d, 17.0d)
        };

        for(CalculateBase calculator:calculators){
            calculator.calculate();
            System.out.println("result=");
            System.out.println(calculator.getResult());

        }


    }




}
