package dkovalenko.test.chainofresponsibility.handler;

import dkovalenko.test.chainofresponsibility.response.SomeResponse;
import dkovalenko.test.chainofresponsibility.response.SuccessResponse;

public class ItemHandler extends DefaultHandler{

    @Override
    public SomeResponse execute(SomeRequest someRequest) {
        return new SuccessResponse("Item");
    }
}
