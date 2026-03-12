package com.OOPSDAY2.Singleton;

public class Singletonexample {
    private Singletonexample() {
    }

    public static Singletonexample instance;

    public static Singletonexample getInstance(){
        if(instance==null){
            instance=new Singletonexample();
        }

        return instance;
    }
}
