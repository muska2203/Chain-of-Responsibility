package dkovalenko.test.chainofresponsibility.handler;

import dkovalenko.test.chainofresponsibility.response.ErrorResponse;
import dkovalenko.test.chainofresponsibility.response.SomeResponse;

public class DefaultHandler implements Handler{

    private Handler handler;

    @Override
    public SomeResponse execute(SomeRequest someRequest) {
        if (handler != null) {
            return handler.execute(someRequest);
        }
        return new ErrorResponse("Handler not found");
    }

    @Override
    public void setNext(Handler handler) {
        this.handler = handler;
    }
}
