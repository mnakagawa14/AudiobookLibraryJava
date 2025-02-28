package org.github.mnakagawa14.audiobooklibraryjava;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainWindow {

    private final Stage primaryStage;

    /**
     * Constructor
     */
    MainWindow(Stage primaryStage, int windowWidth, int windowHeight) {

        // Set up the primaryStage
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Audiobook Library");

        //Construct layout
        VBox layout = new VBox();

        HBox row1 = new HBox();
        layout.getChildren().add(row1);

        Scene scene = new Scene(layout, windowWidth, windowHeight);
        this.primaryStage.setScene(scene);
        this.primaryStage.setResizable(false);

        // Show it on screen
        this.primaryStage.show();
    }
}
