package com.github.bladomo3306;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToMusic() throws IOException {
        App.setRoot("music");
    }

    @FXML
    private void switchToGame() throws IOException {
        App.setRoot("game");
    }

    @FXML
    private void switchToWatchLater() throws IOException {
        App.setRoot("watchLater");
    }
}
