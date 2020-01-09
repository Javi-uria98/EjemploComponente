package com.javier.ut5.prueba;

import com.javier.ut5.ComponenteHolaMundo;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PantallaPrueba extends Application {

    public static void main (String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        VBox vBox=new VBox();

        ComponenteHolaMundo comp=new ComponenteHolaMundo();
        TextField textField=new TextField();
        Button button=new Button("Saludar");

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                comp.setNombre(textField.getText());
                comp.saluda();
            }
        });

        vBox.getChildren().addAll(textField,button,comp);

        Scene scene=new Scene(vBox);
        stage.setScene(scene);
        stage.show();

    }
}
