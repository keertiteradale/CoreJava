package OOPs.Access_Modifier.Police;

import OOPs.Hierarchical.Car;

public class Cop {
    //Police
    public int gun;
    //Syntax - Modifier,return.name_variable

    public Cop(int gun)
    {
        this.gun = gun;
    }

    protected void canIshoot() //If you change it to Private - then it will not allow
            //if you change to protected - it will allow
    {
        System.out.println("Of Course, Shoot");
    }


}
