package dkovalenko.test.chainofresponsibility.response;

public class SuccessResponse implements SomeResponse{

    private String message;

    public SuccessResponse(String message) {
        this.message = message;
    }

    @Override
    public boolean isSuccess() {
        return true;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
