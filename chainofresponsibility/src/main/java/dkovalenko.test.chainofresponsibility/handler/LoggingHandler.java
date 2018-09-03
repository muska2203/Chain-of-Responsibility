package dkovalenko.test.chainofresponsibility.handler;

import dkovalenko.test.chainofresponsibility.response.SomeResponse;

public class LoggingHandler extends DefaultHandler {

    @Override
    public SomeResponse execute(SomeRequest someRequest) {
        System.out.println("Request - email = " + someRequest.getEmail() + ", password = " + someRequest.getPassword());
        return super.execute(someRequest);
    }
}
