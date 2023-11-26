package org.example.exeption;

public class SignedUp extends Exception {
    public SignedUp() {
        super("StudentAlreadyEnrolledException");
    }
}
