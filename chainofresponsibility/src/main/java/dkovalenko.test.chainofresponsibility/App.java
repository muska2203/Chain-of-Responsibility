package dkovalenko.test.chainofresponsibility;

import dkovalenko.test.chainofresponsibility.handler.Handler;
import dkovalenko.test.chainofresponsibility.handler.SomeRequest;
import dkovalenko.test.chainofresponsibility.response.SomeResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            SomeRequestImpl someRequest = new SomeRequestImpl();
            System.out.print("Enter login - ");
            someRequest.setEmail(reader.readLine());
            System.out.print("Enter password - ");
            someRequest.setPassword(reader.readLine());

            Handler handler = HandlerManager.createChainOfHandlers();

            SomeResponse response = handler.execute(someRequest);

            if (response.isSuccess()) {
                System.out.println("Here is your item - " + response.getMessage());
            } else {
                System.out.println("Error, details - " + response.getMessage());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static class SomeRequestImpl implements SomeRequest {

        private String email;

        private String password;

        public void setEmail(String email) {
            this.email = email;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        @Override
        public String getEmail() {
            return email;
        }

        @Override
        public String getPassword() {
            return password;
        }
    }
}
