package com.globallogic.java_patterns.builder;

public class Pizza {

    private String dough;

    private String sauce;

    private String topping;

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return String.format("Pizza with %s, %s and %s", dough, sauce, topping);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pizza pizza = (Pizza) o;

        if (dough != null ? !dough.equals(pizza.dough) : pizza.dough != null) return false;
        if (sauce != null ? !sauce.equals(pizza.sauce) : pizza.sauce != null) return false;

        return topping != null ? topping.equals(pizza.topping) : pizza.topping == null;
    }

    @Override
    public int hashCode() {
        int result = dough != null ? dough.hashCode() : 0;

        result = 31 * result + (sauce != null ? sauce.hashCode() : 0);
        result = 31 * result + (topping != null ? topping.hashCode() : 0);

        return result;
    }
}
