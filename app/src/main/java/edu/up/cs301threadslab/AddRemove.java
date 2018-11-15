package edu.up.cs301threadslab;

public class AddRemove extends Thread {
    private AnimationView aniV;

    public AddRemove(AnimationView a) {

        aniV = a;

    }

    @Override
    public void run() {


        try {

            Thread.sleep(40);

        } catch (Exception e) {

        }
        aniV.postInvalidate();

    }
}
