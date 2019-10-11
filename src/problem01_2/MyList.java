package problem01_2;

import java.util.LinkedList;

public class MyList
{
    // Data Field.
    LinkedList lk;

    // Constructor.
    public MyList(LinkedList lk)
    {
        this.lk = lk;
    }

    // Insert item x on the front end of the MyList.
    public void myPush(int x)  
    {
        lk.push(x);
    }
    
    // Remove the front item from the MyList and return it. 
    public Object myPop()
    {
        return lk.pop();
    }
    
    //  Insert item x on the rear end of the MyList. 
    public void myInject(int x)
    {
        lk.addLast(x);
    }
}