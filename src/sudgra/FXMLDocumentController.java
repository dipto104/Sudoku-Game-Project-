/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudgra;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;

/**
 *
 * @author Windows 7
 */
public class FXMLDocumentController implements Initializable {
    Sudgra main;
    public int flag =1;
    public int flag2=1;
    
    
    @FXML
    private Label label;
    @FXML
    private ImageView sud1;
    @FXML
    private Button play;
    @FXML
    private Font x1;
    @FXML
    private Button quit;
    @FXML
    private TextField text;
    @FXML
    private Button sub;
    @FXML
    private MenuItem easy;
    @FXML
    private MenuItem med;
    @FXML
    private MenuItem hard;
   
    
    
    @FXML
    
    private void handleButtonAction(ActionEvent play)  throws IOException{
       if(flag==0 &&flag2==0){
        
         main.showHomePage();
        // main.autogenerate=1;
       }
    }
    @FXML
    private void handlebuttonAction(ActionEvent quit)throws IOException{
       main.quit();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    public void setMain(Sudgra scene){
        main=scene;
        
    } 

    @FXML
    private void actiontext(ActionEvent event) {
        //String s=text.getText();
        //main.getString(s);
    }

    @FXML
    private void actionsub(ActionEvent event) {
         String s=text.getText();
        main.getString(s);
       
        
        if(s!=null){
            flag=0;
        }
        
    }

    @FXML
    private void actioneasy(ActionEvent event) {
        int num=2;
        main.getlevel(num);
        flag2=0;
    }

    @FXML
    private void actionmed(ActionEvent event) {
        int num=55;
        main.getlevel(num);
        flag2=0;
    }

    @FXML
    private void actionhard(ActionEvent event) {
         int num=75;
        main.getlevel(num);
        flag2=0;
    }

   
    
    
    
    
    
}
