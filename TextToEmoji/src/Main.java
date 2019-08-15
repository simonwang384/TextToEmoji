import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

public class Main extends Application {
    private Text title;
    private BorderPane pane;
    private VBox vBox;
    private VBox emojiVBox;
    private HBox hBox;
    private TextField userEntry;
    private Button convertBtn;
    private Emoji emoji;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.pane = new BorderPane();
        this.vBox = new VBox();
        this.userEntry = new TextField();
        this.convertBtn = new Button("Convert");

        convertBtn.setOnAction(event -> convert());
        convertBtn.setDefaultButton(true);

        this.emoji = new Emoji();
        this.title = new Text("Text to Emoji");
        title.setFont(Font.font(20));

        this.userEntry.setMaxWidth(250);

        this.hBox = new HBox();
        this.emojiVBox = new VBox();
        emojiVBox.getChildren().add(hBox);

        vBox.getChildren().addAll(title,userEntry,emojiVBox);


        vBox.setSpacing(20);
        vBox.getChildren().addAll(convertBtn);
        vBox.setAlignment(Pos.CENTER);
        hBox.setAlignment(Pos.CENTER);
        pane.setCenter(vBox);

        Scene scene = new Scene(pane,500,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void convert(){
        reset();
        String text = userEntry.getText();
        text = text.toLowerCase();
        hBox = new HBox();
        emojiVBox.getChildren().add(hBox);

        for(int i = 0; i < text.length(); i++) {
            String imageLocation = emoji.getImage(text.charAt(i));
            Image image;
            ImageView imageView = new ImageView();

            try {
                image = new Image(new FileInputStream(imageLocation));
                imageView = new ImageView(image);
                imageView.setFitWidth(32);
                imageView.setFitHeight(32);
            } catch (IOException e) {
                System.out.println(e);
            }

            hBox.setAlignment(Pos.CENTER);
            if (text.charAt(i) == ' ') {
                hBox = new HBox();
                hBox.getChildren().add(new Text(""));
                emojiVBox.getChildren().add(hBox);
            } else {
                hBox.getChildren().addAll(imageView);
            }

        }
    }

    public void reset() {
        int size = emojiVBox.getChildren().size();
        for(int i = 0; i < size; i++)
            emojiVBox.getChildren().remove(0);
    }


}
