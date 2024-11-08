package ConstructerPractice;

class Names
{
    //Attributes
    String fName;
    String lName;
    String mNames;
//Behaviour
    public void displayNames()
    {
        System.out.println("First Name: "+fName);
        System.out.println("Last Name: "+lName);
        System.out.println("Middle Name: "+mNames);

    }
}

public class ObjectCreations {
    public static void main(String[] args) {
        //create obj
        //Syntax : ClassName objectname =new ClassName();
        Names n1=new Names();
        Names n2=new Names();
        n1.fName="Pooja";
        n1.lName="Gowda";
        n1.mNames="K";
        n1.displayNames();
        System.out.println("***********************************");
        n2.fName="abc";
        n2.displayNames();
    }

}
