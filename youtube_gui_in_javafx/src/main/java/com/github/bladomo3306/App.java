package com.github.bladomo3306;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class App extends Application 
{ 
    private static Scene scene;

  @Override
  public void start(Stage primaryStage) {
    
    TextField tf;
    TextField searchBar;
    Button button;
    BorderPane borderPane = new BorderPane();
    VBox leftBox = new VBox();
    Label label = new Label("this is VBox example");
    Label label2 = new Label("this is a new VBox example");
    Label label3 = new Label("this is anotherVBox example");
    Label label4 = new Label("this is a final VBox example");


    
    tf = new TextField("Text Field!");
    tf.setMaxWidth(200);
    searchBar = new TextField("Search");
    searchBar.setMaxWidth(200);
    BorderPane.setAlignment(searchBar, Pos.CENTER);
    leftBox.getChildren().add(label);
    leftBox.getChildren().add(label2);
    leftBox.getChildren().add(label3);
    leftBox.getChildren().add(label4);




    
    button = new Button("Click"); 

    button.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent e) {
       
      }
    });

    borderPane.setTop(searchBar); 
    borderPane.setLeft(leftBox); 
    borderPane.setCenter(new TextField("Center")); 
    scene = new Scene(borderPane, 560, 315);
    primaryStage.setTitle("A Simple Scene!");
    primaryStage.setScene(scene);
    primaryStage.show();
  } 
    
  static void setRoot(String fxml) throws IOException {
    scene.setRoot(loadFXML(fxml));
}

private static Parent loadFXML(String fxml) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
    return fxmlLoader.load();
}
  public static void main(String[] args) {
    launch(args);
  }
} 
