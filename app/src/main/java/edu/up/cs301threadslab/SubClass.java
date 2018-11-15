package edu.up.cs301threadslab;

public class SubClass extends Thread {

    private AnimationView aniV;

    public SubClass(AnimationView a) {

        aniV = a;

    }

    @Override
    public void run() {


        try {

            //3 seconds
            //Thread.sleep(3000);

            //1/20th of a second
            Thread.sleep(50);

        } catch (Exception e) {

        }
        aniV.postInvalidate();

    }
}
