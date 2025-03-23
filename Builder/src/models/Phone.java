package models;

import builders.PhoneBuilder;

public class Phone {

    private String name;

    private String model;

    public Phone(PhoneBuilder builder) {

        this.name = builder.getName();
        this.model = builder.getModel();
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
