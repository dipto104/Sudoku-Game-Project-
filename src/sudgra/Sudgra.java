/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudgra;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Windows 7
 */
public class Sudgra extends Application {
    
    /*@Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }*/
    public String a,a1,timep;
    Stage mainStage;
    Scene scene1,scene2,scene3;
    public int autogenerate=1;
    public int deficult;
    public int level;
    
    
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("FXMLDocument.fxml"));
        Parent root = loader.load();
        
        FXMLDocumentController controller=loader.getController();
        controller.setMain(this);
        mainStage=stage;
        
        
         scene1 = new Scene(root);
        stage.setScene(scene1);
        stage.show();
    }
    
     public void showHomePage() throws IOException{
        
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("Sud.fxml"));
        Parent root = loader.load();
        
        SudController controller=loader.getController();
        controller.setMain(this);
      
        
        
         scene2 = new Scene(root);
        mainStage.setTitle("WELCOME "+a);
        mainStage.setScene(scene2);
        
        mainStage.show();
    } 
    
    public void backmenu() throws IOException{
         FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("FXMLDocument.fxml"));
        Parent root = loader.load();
        
        FXMLDocumentController controller=loader.getController();
        controller.setMain(this);
        
        scene1 = new Scene(root);
        mainStage.setScene(scene1);
        
        mainStage.show();
    }
    public void congrat()throws IOException{
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("Congrats.fxml"));
        Parent root=loader.load();
        CongratsController controller=loader.getController();
        controller.setMain(this);
        scene3=new Scene(root);
        mainStage.setScene(scene3);
        mainStage.show();
        
    }
     
     public void quit()throws IOException {
         mainStage.close();
     }
     public void getString(String b){
         a=b;
         System.out.println(a);
     }
    public void getlevel(int b){
        level=b;
    }
    public void getString1(String b){
        timep=b;
    }
    
             
     
     
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
