package com.github.bladomo3306;

import java.io.IOException;
import javafx.fxml.FXML;

public class MusicController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
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