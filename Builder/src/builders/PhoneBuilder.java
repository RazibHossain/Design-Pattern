package builders;

import models.Phone;

public class PhoneBuilder {

    private String name;
    private String model;

    public PhoneBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PhoneBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public Phone build(){
        return new Phone(this);
    }
}
