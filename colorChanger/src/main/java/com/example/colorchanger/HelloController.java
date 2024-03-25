package com.example.colorchanger;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import java.util.Random;

public class HelloController {
    @FXML
    private Circle circle;
    @FXML
    private Ellipse ellipse;
    @FXML
    private Rectangle rectangle;
    @FXML
    private ColorPicker colorPicker;
    @FXML
    private Circle circle2;
    @FXML
    private Slider scaleXSlider;
    @FXML
    private Slider scaleYSlider;
    @FXML
    private Rectangle rectangle2;
    @FXML
    private ImageView viccesmajmosgif;
    @FXML
    private Color generateRandomColor() {
        Random rand = new Random();
        return Color.rgb(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256));
    }

    @FXML
    private void changeCircleColor() {
        circle.setFill(generateRandomColor());
    }

    @FXML
    private void changeRectangleColor() {
        rectangle.setFill(generateRandomColor());
    }

    @FXML
    private void changeEllipseStroke() {
        Random rand = new Random();
        ellipse.setStrokeWidth(rand.nextInt(20));
    }

    @FXML
    private void changeCircle2Color() {
        circle2.setFill(colorPicker.getValue());
    }

    @FXML
    private void changeRectangle2Scale() {
        rectangle2.setHeight(scaleYSlider.getValue());
        rectangle2.setWidth(scaleXSlider.getValue());
    }

    @FXML
    private void changeGif() {
        Image img = new Image("https://i.makeagif.com/media/6-10-2021/qEYeN3.gif");
        viccesmajmosgif.setImage(img);
    }
}