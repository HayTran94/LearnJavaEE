/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.learnthrift;

import org.apache.thrift.TException;

/**
 *
 * @author Hay&Nhung
 */
public class AdditionServiceHandler implements AdditionService.Iface {

    @Override
    public int add(int n1, int n2) throws TException {
        System.out.println("add n1= " + n1 + ",n2= " + n2 );
        return n1 + n2;
    }
    
}
