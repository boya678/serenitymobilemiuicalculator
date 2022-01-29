package com.tevolvers.models;

public class Operation {
    private String number1;
    private String number2;
    private String operand;

    public Operation(String number1, String number2, String operand) {
        this.number1 = number1;
        this.number2 = number2;
        this.operand = operand;
    }

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    public String getOperand() {
        return operand;
    }

    public void setOperand(String operand) {
        this.operand = operand;
    }
}
