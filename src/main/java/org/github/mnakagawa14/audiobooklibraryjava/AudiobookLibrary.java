package org.github.mnakagawa14.audiobooklibraryjava;

import javafx.application.Application;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class AudiobookLibrary extends Application {

    /**
     * start() JavaFx Method to start the application
     *
     * @param primaryStage The primary stage
     */
    @Override
    public void start(Stage primaryStage) {
    // Determine screen dimensions
    double screenWidth = Screen.getPrimary().getBounds().getWidth();
    double screenHeight = Screen.getPrimary().getBounds().getHeight();

    // Compute appropriate window dimensions
    int width = (int) (0.9 * screenWidth);
    int height = (int) (0.9 * screenHeight);

    // Pop up the main window
    new MainWindow(primaryStage, width, height);
    }
}