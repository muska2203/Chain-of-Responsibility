package dkovalenko.test.chainofresponsibility.response;

public class ErrorResponse implements SomeResponse {

    private String message;

    public ErrorResponse(String message) {
        this.message = message;
    }

    @Override
    public boolean isSuccess() {
        return false;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
