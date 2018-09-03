package dkovalenko.test.chainofresponsibility;

import dkovalenko.test.chainofresponsibility.handler.AccessHandler;
import dkovalenko.test.chainofresponsibility.handler.Handler;
import dkovalenko.test.chainofresponsibility.handler.ItemHandler;
import dkovalenko.test.chainofresponsibility.handler.LoggingHandler;

public class HandlerManager {

    public static Handler createChainOfHandlers() {

        Handler itemHandler = new ItemHandler();
        Handler accessHandler = new AccessHandler();
        Handler loggingHandler = new LoggingHandler();

        loggingHandler.setNext(accessHandler);
        accessHandler.setNext(itemHandler);

        return loggingHandler;
    }
}
