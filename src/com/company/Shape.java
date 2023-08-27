package com.company;
enum Type
{
    HAVE_GOAL,NOT_HAVE_GOAL
}
public class Shape
{
    public Type type;
    public int mark;
    public Shape(){}
    public Shape(Type type,int mark)
    {
        if(type==Type.HAVE_GOAL)
            this.type=Type.HAVE_GOAL;
        else if(type==Type.NOT_HAVE_GOAL)
            this.type=Type.NOT_HAVE_GOAL;
        this.mark=mark;
    }
//______________________________End of constructor_____________________________________


    public void print ()
    {
        if (this.type==Type.HAVE_GOAL)
        {
            System.out.print(this.mark+"* ");
        }
        else
        {
            System.out.printf(this.mark+"  ");
        }
    }

//_____________________________End of print()_______________________________________________
}
