package dkovalenko.test.chainofresponsibility.handler;

import dkovalenko.test.chainofresponsibility.response.SomeResponse;

public interface Handler {

    SomeResponse execute(SomeRequest someRequest);

    void setNext(Handler handler);
}
