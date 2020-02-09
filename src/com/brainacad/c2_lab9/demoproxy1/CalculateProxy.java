package com.brainacad.c2_lab9.demoproxy1;

import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by SHARK on 03.06.2017.
 */
public class CalculateProxy implements InvocationHandler{
    private Object objCalc;
    public CalculateProxy(Object objCalc){
        this.objCalc = objCalc;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        return null;
    }
}
