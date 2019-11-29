import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HotelFX extends Application {
    
   
    @Override
        public void start(Stage stage) {
GridPane gridPane = new GridPane();
  gridPane.setMinSize(600,400);
    gridPane.setPadding(new Insets(10,10,10,10));
      gridPane.setVgap(10);
  gridPane.setHgap(10);
    gridPane.setAlignment(Pos.CENTER);

 Text nameTxt=new Text("Name");
   TextField textField1 = new TextField();
   TextField occupantsField = new TextField();
   Text roomTxt=new Text("Rooms");
   Text suiteTxt=new Text("Suite");
   Text occupantsTxt=new Text("occupants");
      ComboBox comboBox = new ComboBox();
      ComboBox suiteBox = new ComboBox();
        Button saveBtn = new Button("save");
           Button RegisterBtn = new Button ("Register");

  gridPane.add(nameTxt,0,0);
  gridPane.add(textField1,1,0);
  gridPane.add(occupantsField,1,5);
  gridPane.add(roomTxt,0,2);
  gridPane.add(suiteTxt,0,4);
  gridPane.add(occupantsTxt,0,5);
  gridPane.add(suiteBox,1,4);
  gridPane.add(comboBox,1,2);
  gridPane.add(RegisterBtn,1,6);
  
  
  
    nameTxt.setStyle("    -fx-font: 30px Tahoma;\n" +
"    -fx-fill: linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 100%, red 100%);\n" +
"    -fx-stroke: black;\n" +
"    -fx-stroke-width: 1;");
  
    roomTxt.setStyle("    -fx-font: 30px Tahoma;\n" +
"    -fx-fill: linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 100%, red 100%);\n" +
"    -fx-stroke: black;\n" +
"    -fx-stroke-width: 1;");
    suiteTxt.setStyle("    -fx-font: 30px Tahoma;\n" +
"    -fx-fill: linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 100%, red 100%);\n" +
"    -fx-stroke: black;\n" +
"    -fx-stroke-width: 1;");
    occupantsTxt.setStyle("    -fx-font: 30px Tahoma;\n" +
"    -fx-fill: linear-gradient(from 0% 0% to 100% 200%, repeat, aqua 100%, red 100%);\n" +
"    -fx-stroke: black;\n" +
"    -fx-stroke-width: 1;");
    
      RegisterBtn.setStyle("     -fx-background-color: linear-gradient(#ff5400, #be1d00);\n" +
"    -fx-background-radius: 30;\n" +
"    -fx-background-insets: 0;\n" +
"    -fx-text-fill: white;");
  
      
gridPane.setStyle("-fx-background-image:url('https://img2.goodfon.com/wallpaper/nbig/7/3a/oranzhevyy-cvet-gradient.jpg'); ");  

        comboBox.setStyle("-fx-padding:4 10 0 200");
        suiteBox.setStyle("-fx-padding:4 10 0 200");

  Scene scene = new Scene(gridPane);
        stage.setTitle("hotel system");
        stage.setScene(scene);
        stage.show();}


    /**
     *
     */
    public void animation() {
        launch();
    }
    }

