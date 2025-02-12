package com.multi.d_app3;

public class Woman extends Human{

    private String food;

    public Woman(int age, String name, String food) {
        super(age, name);
        this.food = food;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "food='" + food + '\'' +
                "} " + super.toString();
    }

}
