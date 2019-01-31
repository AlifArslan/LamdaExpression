
package lamdaexpressiontwo;
interface it1
{
    void disp();
    
    public static void staticMethod(){
        System.out.println("interface static method..");
    }
}

interface it2
{
    String m1();
}

interface it3
{
    void add(int a, int b);
}
public class LamdaExpressionTwo {

   public static void main(String[] args) {

        /*
       //implementation with anonymous class
        it1 i = new it1()
                {
                    @Override
                    public void disp()
                    {
                        System.out.println("anonymous inner class implementation!");
                    }
                    
                    
                };
        i.disp();
       
        
        //implementation with Lamda expression 
        it1 i2 = ()-> System.out.println("lamda expression implementation!");
        i2.disp();
        
        //implementation with Lamda expression
        it1 i3 = ()->
        {
            System.out.println("Lamda Expression ... i3");  
            System.out.println("Lamda Expression ... i3"); 
            System.out.println("Lamda Expression ... i3"); 
        };
        
        i3.disp();    
        
        //call static method
        it1.staticMethod();
       */
       
       /*
       it2 i4 = ()-> { 
           System.out.println("Good Morning...");
           return "Arslan";
       };
       
       String result = i4.m1();
       System.out.println("Method Return : "+result);
       */
          
       
       it3 i5 = (int x, int y)->System.out.println(x+y);
       i5.add(10, 20);
       
       it3 i6 = (x, y)->
       {
           System.out.println(x+y);
       };
       
       i6.add(50, 50);
   
    }
}
