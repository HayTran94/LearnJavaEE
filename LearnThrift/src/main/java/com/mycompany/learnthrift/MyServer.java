/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.learnthrift;
import org.apache.thrift.server.*;
import org.apache.thrift.transport.*;
/**
 *
 * @author Hay&Nhung
 */
public class MyServer {
    public static void StartSimpleServer(AdditionService.Processor<AdditionServiceHandler> processor ) {
        try {
            TServerTransport serverTranspor = new TServerSocket(9090);
            TServer server = new TSimpleServer(new TServer.Args(serverTranspor).processor(processor));
            System.out.println("Starting the simple server ...");
            server.serve();
        } catch( Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        StartSimpleServer(new AdditionService.Processor<AdditionServiceHandler>(new AdditionServiceHandler()));
    }
}
