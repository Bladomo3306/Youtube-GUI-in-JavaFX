package com.github.bladomo3306;

import java.io.IOException;
import javafx.fxml.FXML;

public class WatchLaterController
 {

    @FXML
    private void switchToMusic() throws IOException {
        App.setRoot("music");
    }

    @FXML
    private void switchToGame() throws IOException {
        App.setRoot("game");
    }

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}
