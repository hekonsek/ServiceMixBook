package com.mycompany;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.main.Main;

public class MyIntegrationSolutionRunner {

    public static void main(String[] args) throws Exception {
        Main camel = new Main();
        camel.addRouteBuilder(new MyRouting());
        camel.run();
    }

}

class MyRouting extends RouteBuilder {

    public void configure() throws Exception {
        from("file:/home/myapp/inbox").to("jms:messageQueue");
    }

}
