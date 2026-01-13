class Demo implements Cloneable
{
    public int i;
    public int j;

    public Demo(int a ,int b)
    {
        this.i=a;
        this.j=b;
    }

    public Object clone()
    {
        return super.clone();
    }
}

class CloneDemo
{
    public static void main(String a[])
    {
        try
        {
        Demo dobj1 = new Demo(11,21);
        Demo dobj2 = (Demo)dobj1.clone();

        System.out.println(dobj2.i);
        System.out.println(dobj2.j);
        }
        catch(CloneNotSupportedException cobj)
        {}

    }
}