package com.github.bladomo3306;

import java.io.IOException;
import javafx.fxml.FXML;

public class GameController
 {

    @FXML
    private void switchToMusic() throws IOException {
        App.setRoot("music");
    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void switchToWatchLater() throws IOException {
        App.setRoot("watchLater");
    }
}
