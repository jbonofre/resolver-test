package net.nanthrax.test.client;

import net.nanthrax.test.sample.SimpleBean;

public class ClientBean {

    private SimpleBean simpleBean;

    public ClientBean(String message) {
        this.simpleBean = new SimpleBean(message);
    }

    public String greeting() {
        return simpleBean.getMessage();
    }

}
