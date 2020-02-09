package com.brainacad.practice35;

/**
 * Created by SHARK on 18.06.2017.
 */
public class MyObj {
    long someInfo;
    public MyObj(long someInfo){
        this.someInfo=someInfo;
    }
    @Override
    public String toString(){
        return "MyObj, value:" + someInfo;
    }
    protected void finalize(){
        System.out.println("finalize invoked");
        Main.objRef = this;
    }
}
