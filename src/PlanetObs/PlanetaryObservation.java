package PlanetObs;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class PlanetaryObservation extends Application {

    private Scene sun;
    private Scene mercury;
    private Scene venus;
    private Scene earth;
    private Scene mars;
    private Scene jupiter;
    private Scene saturn;
    private Scene uranus;
    private Scene neptune;
    private static Image image;
    private static ImageView imageview;
    private static Scene mainScene;
    private static Exception ex;
    private static final String[] planetStrings = new String[]{"sun", "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
    private static ArrayList<Scene> planetScenes = new ArrayList<>();
    private static VBox actionMenu = new VBox();
    private static TextField tfSearch;
    private static Label lbError;

    @Override
    public void start(Stage primaryStage) {
        HBox basePane = new HBox();

        // pane with solarsystem on left
        BorderPane infoPane = new BorderPane();
        infoPane.setPadding(new Insets(15, 15, 15, 15));
        infoPane.setTop(new ImageView("http://s3.amazonaws.com/kidzworld_photo/images/201562/a9a18f6f-6299-4184-b597-1360552d05b7/planet-names.jpg"));

        // error label on bottom right
        lbError = new Label("Invalid Entry");
        StackPane errorPane = new StackPane();
        errorPane.getChildren().add(lbError);
        infoPane.setCenter(errorPane);
        lbError.setVisible(false);
        basePane.getChildren().add(infoPane);

        // Action menu with navigation on the side
        Label lSolarSystem = new Label("Our Solar System");

        Button btSun = new Button("Sun");
        theSun obSun = new theSun();
        sun = sceneChange(primaryStage, obSun, "https://www.nasa.gov/sites/default/files/styles/800x600_autoletterbox/public/images/469368main_sun_layers_unlabeled_full.jpg?itok=wHpKhSrn");
        btSun.setOnAction(e -> {
            primaryStage.setScene(sun);
        });
        Button btMercury = new Button("Mercury");
        Mercury obMercury = new Mercury();
        mercury = sceneChange(primaryStage, obMercury, "https://www.nasa.gov/images/content/606988main_messenger_orbit_image20111129_1_4by3_800-600.jpg");
        btMercury.setOnAction(e -> {
            primaryStage.setScene(mercury);
        });
        Button btVenus = new Button("Venus");
        Venus obVenus = new Venus();
        venus = sceneChange(primaryStage, obVenus, "http://techcrash.net/wp-content/uploads/2012/12/14181_Venus-a-800x600.jpg");
        btVenus.setOnAction(e -> {
            primaryStage.setScene(venus);
        });
        Button btEarth = new Button("Earth");
        Earth obEarth = new Earth();
        earth = sceneChange(primaryStage, obEarth, "http://www.nannygoatsinpanties.com/wp-content/uploads/2011/04/nasa-earth-800x600.jpg");
        btEarth.setOnAction(e -> {
            primaryStage.setScene(earth);
        });
        Button btMars = new Button("Mars");
        Mars obMars = new Mars();
        mars = sceneChange(primaryStage, obMars, "http://www.sciencekids.co.nz/images/pictures/space/mars.jpg");
        btMars.setOnAction(e -> {
            primaryStage.setScene(mars);
        });
        Button btJupiter = new Button("Jupiter");
        Jupiter obJupiter = new Jupiter();
        jupiter = sceneChange(primaryStage, obJupiter, "https://www.wwu.edu/skywise/wallpaper/jupiter_800x600.jpg");
        btJupiter.setOnAction(e -> {
            primaryStage.setScene(jupiter);
        });
        Button btSaturn = new Button("Saturn");
        Saturn obSaturn = new Saturn();
        saturn = sceneChange(primaryStage, obSaturn, "http://saturnc.com/interactive/media/Saturn-Fleeing-800.jpg");
        btSaturn.setOnAction(e -> {
            primaryStage.setScene(saturn);
        });
        Button btUranus = new Button("Uranus");
        Uranus obUranus = new Uranus();
        uranus = sceneChange(primaryStage, obUranus, "http://www.starstrider.com/img/scr/Uranus.jpg");
        btUranus.setOnAction(e -> {
            primaryStage.setScene(uranus);
        });
        Button btNeptune = new Button("Neptune");
        Neptune obNeptune = new Neptune();
        neptune = sceneChange(primaryStage, obNeptune, "https://www.jpl.nasa.gov/spaceimages/images/wallpaper/PIA02210-800x600.jpg");
        btNeptune.setOnAction(e -> {
            primaryStage.setScene(neptune);
        });

        actionMenu.setSpacing(5);
        actionMenu.setPadding(new Insets(15, 15, 15, 15));
        basePane.getChildren().add(actionMenu);

        // Search box
        planetScenes.add(sun);
        planetScenes.add(mercury);
        planetScenes.add(venus);
        planetScenes.add(earth);
        planetScenes.add(mars);
        planetScenes.add(jupiter);
        planetScenes.add(saturn);
        planetScenes.add(uranus);
        planetScenes.add(neptune);

        tfSearch = new TextField();
        tfSearch.setFocusTraversable(false);
        tfSearch.setPromptText("Search...");
        tfSearch.setOnKeyPressed(e -> {
            lbError.setVisible(false);
            if (e.getCode().equals(KeyCode.ENTER)) { // search algorithm
                try {
                    String enteredText = tfSearch.getText();
                    Boolean exit = false;
                    for (int k = 0; k < 9; k++) {
                        if (enteredText.equalsIgnoreCase(planetStrings[k])) {
                            primaryStage.setScene(planetScenes.get(k));
                            exit = true;
                        }
                        if (exit) {
                            break;
                        }
                    }
                    if (exit == false) {
                        throw ex;
                    }

                } catch (Exception ex) {
                    lbError.setVisible(true);
                }
            }
        });
        

        // buttons and search box added to right pane
        actionMenu.getChildren().add(tfSearch);
        actionMenu.getChildren().addAll(lSolarSystem, btSun, btMercury, btVenus, btEarth, btMars, btJupiter, btSaturn, btUranus, btNeptune);
        // Create a scene and place it in the stage
        basePane.setPrefSize(700, 300);
        mainScene = new Scene(basePane);
        primaryStage.setTitle("Planetary Observation"); // Set the stage title
        primaryStage.setScene(mainScene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }

    public static Scene sceneChange(Stage primaryStage, GravitationalObject planet, String url) {
        // base
        BorderPane basePane = new BorderPane();
        // back button
        Button btBack = new Button("Back");
        btBack.setOnAction(e -> {
            primaryStage.setScene(mainScene);
        });
        basePane.setCenter(btBack);

        // main pane
        HBox planetPane = new HBox(2);

        //placeholder image if no internet
        image = new Image(url);
        if (image.getHeight() == 0.0) {
            image = new Image("error.png");
        }
        
        //planet image
        imageview = new ImageView(image);
        imageview.setFitHeight(200);
        imageview.setFitWidth(250);

        //planet info on right
        TextArea tfInfo = new TextArea(planet.toString());
        
        // adding everything to the scene
        planetPane.getChildren().addAll(imageview, tfInfo);
        basePane.setTop(planetPane);
        Scene scene = new Scene(basePane);
        basePane.setPrefSize(600, 300);

        return scene;
    }

}
