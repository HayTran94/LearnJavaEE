/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.learnmaven;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.HttpResponse;

/**
 *
 * @author haytran
 */
public class JettyServerTest {
    JettyServer server;
    public JettyServerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {
        server = new JettyServer();
        server.start();
    }
    
    @After
    public void tearDown() throws Exception {
        server.stop();
    }

    @Test
    public void test1() throws IOException {
        String url = "http://localhost:8090/status";
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet httpGet = new HttpGet(url);
        HttpResponse res = client.execute(httpGet);
        
        assertEquals(res.getStatusLine().getStatusCode(), 200);
    }
    
}
