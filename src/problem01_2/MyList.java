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

    // Push Method.
    public void myPush(int x) // Anytype 
    {
        lk.push(x);
    }
    
    public Object myPop()
    {
        return lk.pop();
    }
    
    public void myInject(int x)
    {
        lk.addLast(x);
    }
}
