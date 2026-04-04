package com.OOPSDAY4.Objectclass;

public class ObjectDemo {
    String name;

    public ObjectDemo(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.name==((ObjectDemo)obj).name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "ObjectDemo{" +
                "name=" + name +
                '}';
    }






    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


}
