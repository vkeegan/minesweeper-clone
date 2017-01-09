package csc4380.vkeegan1.Project1;

import javax.swing.*;

public class Minesweeper {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Model model = new Model();
                View view = new View();
                Presenter presenter = new Presenter(model, view);
                presenter.start();
            }
        });
    }
}
