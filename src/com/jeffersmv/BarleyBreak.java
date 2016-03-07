package com.jeffersmv;

/**
 * Created by Jeff on 05.03.2016.
 */
public class BarleyBreak {

    public static void main(String[] args) {
        View view = new View();
        view.setPresenter(new Presenter(view));
    }
}



