// "單純測試用java檔"
package ui_item ;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class test extends Application {

    @Override
    public void start(Stage primaryStage) {
        // 建立數字標籤
        Label numberLabel = new Label("0");
        numberLabel.setStyle("-fx-font-family: Impact; -fx-font-size: 48px;");

        // 建立StackPane佈局容器
        StackPane root = new StackPane();
        root.getChildren().add(numberLabel);

        // 建立時間軸動畫
        Timeline timeline = new Timeline();
        for (int i = 0; i <= 10; i++) {
            KeyFrame keyFrame = new KeyFrame(Duration.seconds(i), new KeyValue(numberLabel.textProperty(), String.valueOf(i)));
            timeline.getKeyFrames().add(keyFrame);
        }

        // 播放時間軸動畫
        timeline.play();

        // 建立場景並顯示舞台
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

