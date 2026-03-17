package com.example.b_fx;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UnitConverter extends Application {
    @Override
    public void start(Stage stage) {
        TextField input = new TextField();
        input.setPrefWidth(100);
        ComboBox<String> from = new ComboBox<>();
        from.getItems().addAll("Celsius","Fahrenheit");
        from.setValue("Celsius");
        ComboBox<String> to = new ComboBox<>();
        to.getItems().addAll("Celsius","Fahrenheit");
        to.setValue("Celsius");
        TextField result = new TextField();
        result.setEditable(false);
        Button convert = new Button("Convert");
        convert.setOnAction(e -> {
            double value = Double.parseDouble(input.getText());
            String f = from.getValue();
            String t = to.getValue();
            double r = value;
            if(f.equals("Celsius") && t.equals("Fahrenheit"))
                r = (value * 9/5) + 32;
            else if(f.equals("Fahrenheit") && t.equals("Celsius"))
                r = (value - 32) * 5/9;
            result.setText(String.valueOf(r));
        });
        HBox row1 = new HBox(10,
                new Label("Enter value:"), input,
                new Label("From:"), from,
                new Label("To:"), to);
        HBox row2 = new HBox(10,
                convert,
                new Label("Converted Value:"),
                new Label("Result:"),
                result);
        row1.setAlignment(Pos.CENTER);
        row2.setAlignment(Pos.CENTER);
        VBox root = new VBox(15,row1,row2);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root,650,300);
        stage.setTitle("Unit Converter");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
