
package lamdaexpressiontwo;
interface Message
{
    void disp();
}
class Test {
    
    
    void m1(Message message)
    {
        message.disp();
    }
    
    public static void main(String[] args) {
        
        //First Approuch - Normal
        Test t1 = new Test();
        MyImplementationClass obj = new MyImplementationClass();
        t1.m1(obj);
        //OR
       // t1.m1(new MyImplementationClass());
        
        
        //Second Approuch anonymous Inner Class Implementation
        t1.m1(new Message() 
        {

            @Override
            public void disp() 
            {
                System.out.println("Good Morning - 2nd Approuch Anonymous Inner Class");         
            }
        });
        
        //Third approuch using Lamda Expression
        t1.m1(()->System.out.println("Good Morning - 3rd Approuch Lamda Expression"));
        
       //Lamda Expresssion using multiple statements 
        t1.m1(()->
        {
            System.out.println("Good Morning - 3rd Approuch Lamda Expression");
            System.out.println("Good Night - 3rd Approuch Lamda Expression");
            
        });
        
        }
}

class MyImplementationClass implements Message
{

    @Override
    public void disp() {
        System.out.println("Message Good Morning - 1st Approuch Normal Approuch");
    }
    
}


