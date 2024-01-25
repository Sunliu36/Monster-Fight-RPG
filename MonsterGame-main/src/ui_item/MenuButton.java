package ui_item;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;

public class MenuButton extends Button{
	
	private final String FONT_PATH = "src/resource/Ui/font.ttf";
	private final String BUTTON_PRESSED_STYLE = "-fx-background-color: transparent; -fx-background-image: url('resource/Ui/buttonLong_brown_pressed.png');";
	private final String BUTTON_RELEASED_STYLE = "-fx-background-color: transparent; -fx-background-image: url('resource/Ui/buttonLong_brown.png');";
	private String path;
	public MenuButton(String buttonName) {
		setText(buttonName);
		setButtonFont();
		setPrefWidth(190);
		setPrefHeight(49);
		setStyle(BUTTON_RELEASED_STYLE);
		buttonListeners();
	}
	
	private void setButtonFont() {
		try {
			setFont(Font.loadFont(new FileInputStream(FONT_PATH), 23));
		} catch (FileNotFoundException e) {
			setFont(Font.font("Verdana", 23));
		}
		
	}
	
	private void setButtonPressedStyle() {
		
		setStyle(BUTTON_PRESSED_STYLE);
		setPrefHeight(45);
		setLayoutY(getLayoutY() + 4);
	}
	
	private void setButtonReleasedStyle() {
		
		setStyle(BUTTON_RELEASED_STYLE);
		setPrefHeight(49);
		setLayoutY(getLayoutY() - 4);
	}
	
	private void buttonListeners() {
		setOnMousePressed(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if(event.getButton().equals(MouseButton.PRIMARY)) {
					setButtonPressedStyle();
					path = "src/resource/Music/Click.mp3";
					createSound(path);
				}
			}
		});
		
		setOnMouseReleased(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if(event.getButton().equals(MouseButton.PRIMARY)) {
					setButtonReleasedStyle();
				}
			}
		});
		
		setOnMouseEntered(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				setEffect(new DropShadow());
				path = "src/resource/Music/Switch.mp3";
				createSound(path);
			}
			
		});
		
		setOnMouseExited(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				setEffect(null);
			}
			
		});
	}
	
	private void createSound(String path) {
		Media media = new Media(new File(path).toURI().toString());
		MediaPlayer player = new MediaPlayer(media);
		player.play();
		player.setCycleCount(1);
	}

	
}
