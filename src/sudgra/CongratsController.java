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
import javafx.scene.text.Font;
import java.io.*;
import javafx.scene.paint.Color;

/**
 * FXML Controller class
 *
 * @author Windows 7
 */
public class CongratsController implements Initializable {

    /**
     * Initializes the controller class.
     */
    Sudgra main;
    @FXML
    private Font x1;
    @FXML
    private Font x2;
    @FXML
    private Label player;
    @FXML
    private Label time;
    @FXML
    private Button back;
    @FXML
    private Font x3;
    @FXML
    private Button quit;
    @FXML
    private Color x4;
    @FXML
    private Label highscore;
    public String score;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         
    } 
     public void setMain(Sudgra scene) throws FileNotFoundException, IOException{
        main=scene;
        player.setText(main.a+":->");
        time.setText(main.timep);
        String s=null;
        if(main.level==2){
            s=main.a+":->"+main.timep+"(EASY)"+"\n";
        }
        else if(main.level==55){
            s=main.a+":->"+main.timep+"(MEDIUM)"+"\n";
        }
         else if(main.level==75){
            s=main.a+":->"+main.timep+"(HARD)"+"\n";
        }
        
        try {
         BufferedWriter out = new BufferedWriter(new FileWriter("file1.txt",true));
         
          
         out.write(s);      
   
         out.close();
         out = new BufferedWriter(new FileWriter ("file1.txt",true));
        
        
         //out.newLine();
         out.flush();
         out.close();
         BufferedReader in = new BufferedReader(new FileReader("file1.txt"));
         
         String str;
         score=in.readLine();
         while ((str = in.readLine()) != null) {
            System.out.println(str);
            score=score+"\n"+str;
         }
          System.out.println(score);
         highscore.setText(score);
         in.close();
      }
      
      catch (IOException e) {
         System.out.println("exception occoured"+ e);
      }
     } 

    @FXML
    private void actionback(ActionEvent event) throws IOException {
         main.backmenu();
    }

    @FXML
    private void actionquit(ActionEvent event) throws IOException {
         main.quit();
    }
        
    
    
}
