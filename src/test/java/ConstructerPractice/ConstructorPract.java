package ConstructerPractice;

class Numbers{
    int unitDigit;
    int tensDigit;
    int hundredsDigit;

    public void display(){
           System.out.println("Unit digit:"+unitDigit);
            System.out.println("Tens digit:"+tensDigit );
            System.out.println("Hundreds digit:"+hundredsDigit);

    }
    public Numbers(){

        System.out.println("This is default constructor");
         unitDigit =1;
        tensDigit=2;
        hundredsDigit=3;
    }

//    public Numbers( int uDigit,int tDigit,int hDigit){
//        unitDigit=uDigit;
//        tensDigit=tDigit;
//        hundredsDigit=hDigit;
//        System.out.println("this is parameterized constrcutor");
//
//    }

    public Numbers(int unitDigit,int tensDigit,int hundredsDigit){
        this.unitDigit=unitDigit;
        this.tensDigit=tensDigit;
        this.hundredsDigit=hundredsDigit;
        System.out.println("2nd parameterized construtor");
    }
    public static void displayStatic(){
        System.out.println("rthos is ");
    }
}

public class ConstructorPract {
    public static void main(String[] args) {
        Numbers n1=new Numbers();
        n1.display();
        Numbers n2=new Numbers(2,2,2);
        n2.display();

        //Numbers n3=new Numbers(9,9,9);
Numbers.displayStatic();

       //Numbers n2=new Numbers(uDigit:1,tDigit:2,hDigit:2);



    }
}
