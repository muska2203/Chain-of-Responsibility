package dkovalenko.test.chainofresponsibility.handler;

import dkovalenko.test.chainofresponsibility.response.ErrorResponse;
import dkovalenko.test.chainofresponsibility.response.SomeResponse;

public class AccessHandler extends DefaultHandler {

    @Override
    public SomeResponse execute(SomeRequest someRequest) {
        if (someRequest.getEmail().equals("admin") && someRequest.getPassword().equals("admin")) {
            return super.execute(someRequest);
        } else {
            return new ErrorResponse("Login error");
        }
    }
}
