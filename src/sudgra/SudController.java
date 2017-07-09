/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudgra;

import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/**
 * FXML Controller class
 *
 * @author Windows 7
 */
public class SudController extends KTimer implements Initializable {

    /**
     * Initializes the controller class.
     */
    Sudgra main;
    FXMLDocumentController ob1;
     private boolean timerStats;
    private Timer timer;
    private int timersec;
    private int timermin;
    private int timerhr;
    private Button but1;
    public int solveflag=0;
    @FXML
    private AnchorPane secPage;
    @FXML
    private Button r0r0;
    @FXML
    private Button r0r1;
    @FXML
    private Button r0r2;
    @FXML
    private Button r0r3;
    @FXML
    private Button r0r4;
    @FXML
    private Button r0r5;
    @FXML
    private Button r0r6;
    @FXML
    private Button r0r7;
    @FXML
    private Button r0r8;
    @FXML
    private Button r1r0;
    @FXML
    private Button r1r1;
    @FXML
    private Button r1r2;
    @FXML
    private Button r1r3;
    @FXML
    private Button r1r4;
    @FXML
    private Button r1r5;
    @FXML
    private Button r1r6;
    @FXML
    private Button r1r7;
    @FXML
    private Button r1r8;
    @FXML
    private Button r2r0;
    @FXML
    private Button r2r1;
    @FXML
    private Button r2r2;
    @FXML
    private Button r2r3;
    @FXML
    private Button r2r4;
    @FXML
    private Button r2r5;
    @FXML
    private Button r2r6;
    @FXML
    private Button r2r7;
    @FXML
    private Button r2r8;
    @FXML
    private Button r3r0;
    @FXML
    private Button r3r1;
    @FXML
    private Button r3r2;
    @FXML
    private Button r3r3;
    @FXML
    private Button r3r4;
    @FXML
    private Button r3r5;
    @FXML
    private Button r3r6;
    @FXML
    private Button r3r7;
    @FXML
    private Button r3r8;
    @FXML
    private Button r4r0;
    @FXML
    private Button r4r1;
    @FXML
    private Button r4r2;
    @FXML
    private Button r4r3;
    @FXML
    private Button r4r5;
    @FXML
    private Button r4r6;
    @FXML
    private Button r4r7;
    @FXML
    private Button r4r8;
    @FXML
    private Button r5r0;
    @FXML
    private Button r5r1;
    @FXML
    private Button r5r2;
    @FXML
    private Button r5r3;
    @FXML
    private Button r5r4;
    @FXML
    private Button r5r5;
    @FXML
    private Button r5r6;
    @FXML
    private Button r5r7;
    @FXML
    private Button r5r8;
    @FXML
    private Button r6r0;
    @FXML
    private Button r6r1;
    @FXML
    private Button r6r2;
    @FXML
    private Button r6r3;
    @FXML
    private Button r6r4;
    @FXML
    private Button r6r5;
    @FXML
    private Button r6r6;
    @FXML
    private Button r6r7;
    @FXML
    private Button r6r8;
    @FXML
    private Button r7r0;
    @FXML
    private Button r7r1;
    @FXML
    private Button r7r2;
    @FXML
    private Button r7r3;
    @FXML
    private Button r7r4;
    @FXML
    private Button r7r5;
    @FXML
    private Button r7r6;
    @FXML
    private Button r7r7;
    @FXML
    private Button r7r8;
    @FXML
    private Button r8r0;
    @FXML
    private Button r8r1;
    @FXML
    private Button r8r2;
    @FXML
    private Button r8r3;
    @FXML
    private Button r8r4;
    @FXML
    private Button r8r5;
    @FXML
    private Button r8r6;
    @FXML
    private Button r8r7;
    @FXML
    private Button r8r8;
    @FXML
    private Button r4r4;
    @FXML
    private Label name;
    @FXML
    private Button gen;
    @FXML
    private Font x1;
    @FXML
    private Button mainmenu;
    public int [][] flag=new int[9][9];
    @FXML
    private Button solution;
    @FXML
    private Font x2;
    @FXML
    private Button quit2;
    @FXML
    private AnchorPane split;
    public int level; 
    public int levelflag=0;
    @FXML
    private Button check;
    @FXML
    private Label time;
   // @FXML
    //private String s
     
    @FXML
    private Label dificulty;
     
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
        // TODO
    } 
     public void setMain(Sudgra scene){
        main=scene;
        name.setText("Welcome  "+main.a);
        if(main.level==35){
            dificulty.setText("Easy");
        }
        else if(main.level==55){
             dificulty.setText("Medium");
        }
        else if(main.level==75){
            dificulty.setText("Hard");
        }
        
    }
    private void startTime() {
        timersec = 0;
        timermin = 0;
         timerhr=0;
        if (timerStats == false) {
            timerStats = true;
            timer = new Timer();
            
           TimerTask timerTask = new TimerTask() {

                @Override
                public void run() {

                    //System.out.println("working" );

                    timersec++;

                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {

                            if (timersec >= 60) {
                                timersec = 0;
                                timermin++;
                            }
                            if (timermin >= 60) {
                                timermin = 0;
                                timerhr++;
                            }

                            String seconds = Integer.toString(timersec);
                            String minutes = Integer.toString(timermin);
                            String hours = Integer.toString(timerhr);

                            if (timersec <= 9) {
                                seconds = "0" + Integer.toString(timersec);
                            }
                            if (timermin <= 9) {
                                minutes = "0" + Integer.toString(timermin);
                            }
                            if (timerhr <= 9) {
                                hours = "0" + Integer.toString(timerhr);
                            }

                            time.setText("Time :" + hours + ":" + minutes + ":" + seconds.charAt(0)+""+ seconds.charAt(1));
                            //System.out.println(time.getText());
                        }

                    });

                }

            };
            timer.schedule(timerTask, 15, 15); //lastone is time, milli second

        }

    }
     
    
     public int solv[][]=new int[9][9];
     
     
     public int arr[][];
    
   
    
     @FXML
    private void actionbut1(ActionEvent event)throws IOException {
       // r0r0.setText(Integer.toString(5));
       // r0r1.setText(Integer.toString(5));
       if(solveflag==0){
     
          level=main.level;
         
          
          startTime();
        int arr[][]={  {1,5,2,4,8,9,3,7,6},
                       {7,3,9,2,5,6,8,4,1},
                       {4,6,8,3,7,1,2,9,5},
                       {3,8,7,1,2,4,6,5,9},
                       {5,9,1,7,6,3,4,2,8},
                       {2,4,6,8,9,5,7,1,3},
                       {9,1,4,6,3,7,5,8,2},
                       {6,2,5,9,4,8,1,3,7},
                       {8,7,3,5,1,2,9,6,4}};


          Random num=new Random();

          //interchange 1st 3 row
          int rand1;
           rand1=num.nextInt(3);
           for(int j=0;j<9;j++){
                if(rand1==2){
                   rand1=0;
               }
               int temp=arr[rand1][j];

               arr[rand1][j]=arr[rand1+1][j];
               arr[rand1+1][j]=temp;

          }


           //interchange 2nd three row

          int rand2; 
          rand2=num.nextInt(6);
          if(rand2<3){
              rand2=3;
          }
          for(int j=0;j<9;j++){
              if(rand2==5){
                   rand2=4;
               }
               int temp=arr[rand2][j];

               arr[rand2][j]=arr[rand2+1][j];
               arr[rand2+1][j]=temp;

          }

          // interchange 3rd three row
           int rand3; 
          rand3=num.nextInt(9);
          if(rand3<6){
              rand3=6;
          }
          for(int j=0;j<9;j++){
              if(rand3==8){
                   rand3=7;
               }
               int temp=arr[rand3][j];

               arr[rand3][j]=arr[rand3+1][j];
               arr[rand3+1][j]=temp;

          }

          //interchange fist 3 colum;

           int rand4; 
          rand4=num.nextInt(3);

          for(int j=0;j<9;j++){
              if(rand4==2){
                   rand4=0;
               }
               int temp=arr[j][rand4];

               arr[j][rand4]=arr[j][rand4+1];
               arr[j][rand4+1]=temp;

          }

          //interchange 2nd 3 colume;
           int rand5; 
          rand5=num.nextInt(6);
          if(rand5<3){
              rand5=3;
          }

          for(int j=0;j<9;j++){
              if(rand5==5){
                   rand5=4;
               }
               int temp=arr[j][rand5];

               arr[j][rand5]=arr[j][rand5+1];
               arr[j][rand5+1]=temp;

          }
          //interchange 3rd 3 colume

          int rand6; 
          rand6=num.nextInt(9);
          if(rand6<6){
              rand6=6;
          }

          for(int j=0;j<9;j++){
              if(rand6==8){
                   rand6=7;
               }
               int temp=arr[j][rand6];

               arr[j][rand6]=arr[j][rand6+1];
               arr[j][rand6+1]=temp;

          }

          //copy the array as ans in another array

          //int solve[][];
          //solve=new int[9][9];
           for(int i=0;i<9;i++){
               for(int j=0;j<9;j++){
                   solv[i][j]=arr[i][j];
               }
           }


          //randomly giving zero to make sudoko
           int zero1,zero2;
           for(int i=1;i<level;i++){
               zero1=num.nextInt(9);
               zero2=num.nextInt(9);
               arr[zero1][zero2]=0;
           }



          // int [][] flag=new int[9][9];
           for(int i=0;i<9;i++){
               for(int j=0;j<9;j++){
                   if(arr[i][j]==0){
                       flag[i][j]=1;
                   }

               }
           }
           //System.out.println(main.autogenerate);





            r0r0.setText(null);
            r0r1.setText(null);
            r0r2.setText(null);
            r0r3.setText(null);
            r0r4.setText(null);
            r0r5.setText(null);
            r0r6.setText(null);
            r0r7.setText(null);
            r0r8.setText(null);

            r1r0.setText(null);
            r1r1.setText(null);
            r1r2.setText(null);
            r1r3.setText(null);
            r1r4.setText(null);
            r1r5.setText(null);
            r1r6.setText(null);
            r1r7.setText(null);
            r1r8.setText(null);

            r2r0.setText(null);
            r2r1.setText(null);
            r2r2.setText(null);
            r2r3.setText(null);
            r2r4.setText(null);
            r2r5.setText(null);
            r2r6.setText(null);
            r2r7.setText(null);
            r2r8.setText(null);

           r3r0.setText(null);
           r3r1.setText(null);
           r3r2.setText(null);
           r3r3.setText(null);
           r3r4.setText(null);
           r3r5.setText(null);
           r3r6.setText(null);
           r3r7.setText(null);
           r3r8.setText(null);

           r4r0.setText(null);
           r4r1.setText(null);
           r4r2.setText(null);
           r4r3.setText(null);
           r4r4.setText(null);
           r4r5.setText(null);
           r4r6.setText(null);
           r4r7.setText(null);
           r4r8.setText(null);

           r5r0.setText(null);
           r5r1.setText(null);
           r5r2.setText(null);
           r5r3.setText(null);
           r5r4.setText(null);
           r5r5.setText(null);
           r5r6.setText(null);
           r5r7.setText(null);
           r5r8.setText(null);

           r6r0.setText(null);
           r6r1.setText(null);
           r6r2.setText(null);
           r6r3.setText(null);
           r6r4.setText(null);
           r6r5.setText(null);
           r6r6.setText(null);
           r6r7.setText(null);
           r6r8.setText(null);

           r7r0.setText(null);
           r7r1.setText(null);
           r7r2.setText(null);
           r7r3.setText(null);
           r7r4.setText(null);
           r7r5.setText(null);
           r7r6.setText(null);
           r7r7.setText(null);
           r7r8.setText(null);

           r8r0.setText(null);
           r8r1.setText(null);
           r8r2.setText(null);
           r8r3.setText(null);
           r8r4.setText(null);
           r8r5.setText(null);
           r8r6.setText(null);
           r8r7.setText(null);
           r8r8.setText(null);





           for(int i=0;i<9;i++){
               for(int j=0;j<9;j++){
                   if(arr[i][j]!=0){
                     if(i==0 &&j==0){
                         r0r0.setFont(x1);
                         r0r0.setTextFill(Color.BLACK);
                         r0r0.setText(Integer.toString(arr[i][j]));}
                     else  if(i==0 &&j==1){
                         r0r1.setFont(x1);
                         r0r1.setTextFill(Color.BLACK);
                         r0r1.setText(Integer.toString(arr[i][j]));}
                     else  if(i==0 &&j==2){
                         r0r2.setFont(x1);
                         r0r2.setTextFill(Color.BLACK);
                         r0r2.setText(Integer.toString(arr[i][j]));}
                     else  if(i==0 &&j==3){
                         r0r3.setFont(x1);
                         r0r3.setTextFill(Color.BLACK);
                         r0r3.setText(Integer.toString(arr[i][j]));}
                     else  if(i==0 &&j==4){
                         r0r4.setFont(x1);
                         r0r4.setTextFill(Color.BLACK);
                         r0r4.setText(Integer.toString(arr[i][j]));}
                     else  if(i==0 &&j==5){
                         r0r5.setFont(x1);
                         r0r5.setTextFill(Color.BLACK);
                         r0r5.setText(Integer.toString(arr[i][j]));}
                     else  if(i==0 &&j==6){
                         r0r6.setFont(x1);
                         r0r6.setTextFill(Color.BLACK);
                         r0r6.setText(Integer.toString(arr[i][j]));}
                     else  if(i==0 &&j==7){
                         r0r7.setFont(x1);
                         r0r7.setTextFill(Color.BLACK);
                         r0r7.setText(Integer.toString(arr[i][j]));}
                     else  if(i==0 &&j==8){
                         r0r8.setFont(x1);
                         r0r8.setTextFill(Color.BLACK);
                         r0r8.setText(Integer.toString(arr[i][j]));}

                     else  if(i==1 &&j==0){
                         r1r0.setFont(x1);
                         r1r0.setTextFill(Color.BLACK);
                         r1r0.setText(Integer.toString(arr[i][j]));}
                     else  if(i==1 &&j==1){
                         r1r1.setFont(x1);
                         r1r1.setTextFill(Color.BLACK);
                         r1r1.setText(Integer.toString(arr[i][j]));}
                     else  if(i==1 &&j==2){
                         r1r2.setFont(x1);
                         r1r2.setTextFill(Color.BLACK);
                         r1r2.setText(Integer.toString(arr[i][j]));}
                     else  if(i==1 &&j==3){
                         r1r3.setFont(x1);
                         r1r3.setTextFill(Color.BLACK);
                         r1r3.setText(Integer.toString(arr[i][j]));}
                     else  if(i==1 &&j==4){
                         r1r4.setFont(x1);
                         r1r4.setTextFill(Color.BLACK);
                         r1r4.setText(Integer.toString(arr[i][j]));}
                     else  if(i==1 &&j==5){
                         r1r5.setFont(x1);
                         r1r5.setTextFill(Color.BLACK);
                         r1r5.setText(Integer.toString(arr[i][j]));}
                     else  if(i==1 &&j==6){
                         r1r6.setFont(x1);
                         r1r6.setTextFill(Color.BLACK);
                         r1r6.setText(Integer.toString(arr[i][j]));}
                     else  if(i==1 &&j==7){
                         r1r7.setFont(x1);
                         r1r7.setTextFill(Color.BLACK);
                         r1r7.setText(Integer.toString(arr[i][j]));}
                     else  if(i==1 &&j==8){
                         r1r8.setFont(x1);
                         r1r8.setTextFill(Color.BLACK);
                         r1r8.setText(Integer.toString(arr[i][j]));}

                     else  if(i==2 &&j==0){
                         r2r0.setFont(x1);
                         r2r0.setTextFill(Color.BLACK);
                         r2r0.setText(Integer.toString(arr[i][j]));}
                     else  if(i==2 &&j==1){
                         r2r1.setFont(x1);
                         r2r1.setTextFill(Color.BLACK);
                         r2r1.setText(Integer.toString(arr[i][j]));}
                     else  if(i==2 &&j==2){
                         r2r2.setFont(x1);
                         r2r2.setTextFill(Color.BLACK);
                         r2r2.setText(Integer.toString(arr[i][j]));}
                     else  if(i==2 &&j==3){
                         r2r3.setFont(x1);
                         r2r3.setTextFill(Color.BLACK);
                         r2r3.setText(Integer.toString(arr[i][j]));}
                     else  if(i==2 &&j==4){
                         r2r4.setFont(x1);
                         r2r4.setTextFill(Color.BLACK);
                         r2r4.setText(Integer.toString(arr[i][j]));}
                     else  if(i==2 &&j==5){
                         r2r5.setFont(x1);
                         r2r5.setTextFill(Color.BLACK);
                         r2r5.setText(Integer.toString(arr[i][j]));}
                     else  if(i==2 &&j==6){
                         r2r6.setFont(x1);
                         r2r6.setTextFill(Color.BLACK);
                         r2r6.setText(Integer.toString(arr[i][j]));}
                     else  if(i==2 &&j==7){
                         r2r7.setFont(x1);
                         r2r7.setTextFill(Color.BLACK);
                         r2r7.setText(Integer.toString(arr[i][j]));}
                     else  if(i==2 &&j==8){
                         r2r8.setFont(x1);
                         r2r8.setTextFill(Color.BLACK);
                         r2r8.setText(Integer.toString(arr[i][j]));}

                     else  if(i==3 &&j==0){
                         r3r0.setFont(x1);
                         r3r0.setTextFill(Color.BLACK);
                         r3r0.setText(Integer.toString(arr[i][j]));}
                     else  if(i==3 &&j==1){
                         r3r1.setFont(x1);
                         r3r1.setTextFill(Color.BLACK);
                         r3r1.setText(Integer.toString(arr[i][j]));}
                     else  if(i==3 &&j==2){
                         r3r2.setFont(x1);
                         r3r2.setTextFill(Color.BLACK);
                         r3r2.setText(Integer.toString(arr[i][j]));}
                     else  if(i==3 &&j==3){
                         r3r3.setFont(x1);
                         r3r3.setTextFill(Color.BLACK);
                         r3r3.setText(Integer.toString(arr[i][j]));}
                     else  if(i==3 &&j==4){
                         r3r4.setFont(x1);
                         r3r4.setTextFill(Color.BLACK);
                         r3r4.setText(Integer.toString(arr[i][j]));}
                     else  if(i==3 &&j==5){
                         r3r5.setFont(x1);
                         r3r5.setTextFill(Color.BLACK);
                         r3r5.setText(Integer.toString(arr[i][j]));}
                     else  if(i==3 &&j==6){
                         r3r6.setFont(x1);
                         r3r6.setTextFill(Color.BLACK);
                         r3r6.setText(Integer.toString(arr[i][j]));}
                     else  if(i==3 &&j==7){
                         r3r7.setFont(x1);
                         r3r7.setTextFill(Color.BLACK);
                         r3r7.setText(Integer.toString(arr[i][j]));}
                     else  if(i==3 &&j==8){
                         r3r8.setFont(x1);
                         r3r8.setTextFill(Color.BLACK);
                         r3r8.setText(Integer.toString(arr[i][j]));}

                     else  if(i==4 &&j==0){
                         r4r0.setFont(x1);
                         r4r0.setTextFill(Color.BLACK);
                         r4r0.setText(Integer.toString(arr[i][j]));}
                     else  if(i==4 &&j==1){
                         r4r1.setFont(x1);
                         r4r1.setTextFill(Color.BLACK);
                         r4r1.setText(Integer.toString(arr[i][j]));}
                     else  if(i==4 &&j==2){
                         r4r2.setFont(x1);
                         r4r2.setTextFill(Color.BLACK);
                         r4r2.setText(Integer.toString(arr[i][j]));}
                     else  if(i==4 &&j==3){
                         r4r3.setFont(x1);
                         r4r3.setTextFill(Color.BLACK);
                         r4r3.setText(Integer.toString(arr[i][j]));}
                     else  if(i==4 &&j==4){
                         r4r4.setFont(x1);
                         r4r4.setTextFill(Color.BLACK);
                         r4r4.setText(Integer.toString(arr[i][j]));}
                     else  if(i==4 &&j==5){
                         r4r5.setFont(x1);
                         r4r5.setTextFill(Color.BLACK);
                         r4r5.setText(Integer.toString(arr[i][j]));}
                     else  if(i==4 &&j==6){
                         r4r6.setFont(x1);
                         r4r6.setTextFill(Color.BLACK);
                         r4r6.setText(Integer.toString(arr[i][j]));}
                     else  if(i==4 &&j==7){
                         r4r7.setFont(x1);
                         r4r7.setTextFill(Color.BLACK);
                         r4r7.setText(Integer.toString(arr[i][j]));}
                     else  if(i==4 &&j==8){
                         r4r8.setFont(x1);
                         r4r8.setTextFill(Color.BLACK);
                         r4r8.setText(Integer.toString(arr[i][j]));}

                     else  if(i==5 &&j==0){
                         r5r0.setFont(x1);
                         r5r0.setTextFill(Color.BLACK);
                         r5r0.setText(Integer.toString(arr[i][j]));}
                     else  if(i==5 &&j==1){
                         r5r1.setFont(x1);
                         r5r1.setTextFill(Color.BLACK);
                         r5r1.setText(Integer.toString(arr[i][j]));}
                     else  if(i==5 &&j==2){
                         r5r2.setFont(x1);
                         r5r2.setTextFill(Color.BLACK);
                         r5r2.setText(Integer.toString(arr[i][j]));}
                     else  if(i==5 &&j==3){
                         r5r3.setFont(x1);
                         r5r3.setTextFill(Color.BLACK);
                         r5r3.setText(Integer.toString(arr[i][j]));}
                     else  if(i==5 &&j==4){
                         r5r4.setFont(x1);
                         r5r4.setTextFill(Color.BLACK);
                         r5r4.setText(Integer.toString(arr[i][j]));}
                     else  if(i==5 &&j==5){
                         r5r5.setFont(x1);
                         r5r5.setTextFill(Color.BLACK);
                         r5r5.setText(Integer.toString(arr[i][j]));}
                     else  if(i==5 &&j==6){
                         r5r6.setFont(x1);
                         r5r6.setTextFill(Color.BLACK);
                         r5r6.setText(Integer.toString(arr[i][j]));}
                     else  if(i==5 &&j==7){
                         r5r7.setFont(x1);
                         r5r7.setTextFill(Color.BLACK);
                         r5r7.setText(Integer.toString(arr[i][j]));}
                     else  if(i==5 &&j==8){
                         r5r8.setFont(x1);
                         r5r8.setTextFill(Color.BLACK);
                         r5r8.setText(Integer.toString(arr[i][j]));}

                     else  if(i==6 &&j==0){
                         r6r0.setFont(x1);
                         r6r0.setTextFill(Color.BLACK);
                         r6r0.setText(Integer.toString(arr[i][j]));}
                     else  if(i==6 &&j==1){
                          r6r1.setFont(x1);
                          r6r1.setTextFill(Color.BLACK);
                         r6r1.setText(Integer.toString(arr[i][j]));}
                     else  if(i==6 &&j==2){
                          r6r2.setFont(x1);
                          r6r2.setTextFill(Color.BLACK);
                         r6r2.setText(Integer.toString(arr[i][j]));}
                     else  if(i==6 &&j==3){
                          r6r3.setFont(x1);
                          r6r3.setTextFill(Color.BLACK);
                         r6r3.setText(Integer.toString(arr[i][j]));}
                     else  if(i==6 &&j==4){
                          r6r4.setFont(x1);
                          r6r4.setTextFill(Color.BLACK);
                         r6r4.setText(Integer.toString(arr[i][j]));}
                     else  if(i==6 &&j==5){
                          r6r5.setFont(x1);
                          r6r5.setTextFill(Color.BLACK);
                         r6r5.setText(Integer.toString(arr[i][j]));}
                     else  if(i==6 &&j==6){
                          r6r6.setFont(x1);
                          r6r6.setTextFill(Color.BLACK);
                         r6r6.setText(Integer.toString(arr[i][j]));}
                     else  if(i==6 &&j==7){
                          r6r7.setFont(x1);
                          r6r7.setTextFill(Color.BLACK);
                         r6r7.setText(Integer.toString(arr[i][j]));}
                     else  if(i==6 &&j==8){
                          r6r8.setFont(x1);
                          r6r8.setTextFill(Color.BLACK);
                         r6r8.setText(Integer.toString(arr[i][j]));}

                     else  if(i==7 &&j==0){
                          r7r0.setFont(x1);
                          r7r0.setTextFill(Color.BLACK);
                         r7r0.setText(Integer.toString(arr[i][j]));}
                     else  if(i==7 &&j==1){
                         r7r1.setFont(x1);
                         r7r1.setTextFill(Color.BLACK);
                         r7r1.setText(Integer.toString(arr[i][j]));}
                     else  if(i==7 &&j==2){
                         r7r2.setFont(x1);
                         r7r2.setTextFill(Color.BLACK);
                         r7r2.setText(Integer.toString(arr[i][j]));}
                     else  if(i==7 &&j==3){
                         r7r3.setFont(x1);
                         r7r3.setTextFill(Color.BLACK);
                         r7r3.setText(Integer.toString(arr[i][j]));}
                     else  if(i==7 &&j==4){
                         r7r4.setFont(x1);
                         r7r4.setTextFill(Color.BLACK);
                         r7r4.setText(Integer.toString(arr[i][j]));}
                     else  if(i==7 &&j==5){
                         r7r5.setFont(x1);
                         r7r5.setTextFill(Color.BLACK);
                         r7r5.setText(Integer.toString(arr[i][j]));}
                     else  if(i==7 &&j==6){
                         r7r6.setFont(x1);
                         r7r6.setTextFill(Color.BLACK);
                         r7r6.setText(Integer.toString(arr[i][j]));}
                     else  if(i==7 &&j==7){
                         r7r7.setFont(x1);
                         r7r7.setTextFill(Color.BLACK);
                         r7r7.setText(Integer.toString(arr[i][j]));}
                     else  if(i==7 &&j==8){
                         r7r8.setFont(x1);
                         r7r8.setTextFill(Color.BLACK);
                         r7r8.setText(Integer.toString(arr[i][j]));}

                     else  if(i==8 &&j==0){
                         r8r0.setFont(x1);
                         r8r0.setTextFill(Color.BLACK);
                         r8r0.setText(Integer.toString(arr[i][j]));}
                     else  if(i==8 &&j==1){
                          r8r1.setFont(x1);
                          r8r1.setTextFill(Color.BLACK);
                         r8r1.setText(Integer.toString(arr[i][j]));}
                     else  if(i==8 &&j==2){
                          r8r2.setFont(x1);
                          r8r2.setTextFill(Color.BLACK);
                         r8r2.setText(Integer.toString(arr[i][j]));}
                     else  if(i==8 &&j==3){
                          r8r3.setFont(x1);
                          r8r3.setTextFill(Color.BLACK);
                         r8r3.setText(Integer.toString(arr[i][j]));}
                     else  if(i==8 &&j==4){
                          r8r4.setFont(x1);
                          r8r4.setTextFill(Color.BLACK);
                         r8r4.setText(Integer.toString(arr[i][j]));}
                     else  if(i==8 &&j==5){
                          r8r5.setFont(x1);
                          r8r5.setTextFill(Color.BLACK);
                         r8r5.setText(Integer.toString(arr[i][j]));}
                     else  if(i==8 &&j==6){
                          r8r6.setFont(x1);
                          r8r6.setTextFill(Color.BLACK);
                         r8r6.setText(Integer.toString(arr[i][j]));}
                     else  if(i==8 &&j==7){
                          r8r7.setFont(x1);
                          r8r7.setTextFill(Color.BLACK);
                         r8r7.setText(Integer.toString(arr[i][j]));}
                     else  if(i==8 &&j==8){
                          r8r8.setFont(x1);
                          r8r8.setTextFill(Color.BLACK);
                         r8r8.setText(Integer.toString(arr[i][j]));}




                   }

               }
              
            
      }
       }
          
          
    }



    @FXML
    private void r0r4ac(ActionEvent event) {
    }

    @FXML
    private void r0r5ac(ActionEvent event) {
    }

    @FXML
    private void r0r7ac(ActionEvent event) {
    }

    @FXML
    private void r0r8ac(ActionEvent event) {
    }

    @FXML
    private void r1r0ac(ActionEvent event) {
    }

    @FXML
    private void r1r1ac(ActionEvent event) {
    }

    @FXML
    private void r1r2ac(ActionEvent event) {
    }

    @FXML
    private void r1r3ac(ActionEvent event) {
    }

    @FXML
    private void r1r4ac(ActionEvent event) {
    }

    @FXML
    private void r1r5ac(ActionEvent event) {
    }

    @FXML
    private void r1r6ac(ActionEvent event) {
    }

    @FXML
    private void r1r7ac(ActionEvent event) {
    }

    @FXML
    private void r1r8ac(ActionEvent event) {
    }

    @FXML
    private void r2r0ac(ActionEvent event) {
    }

    @FXML
    private void r2r1ac(ActionEvent event) {
    }

    @FXML
    private void r2r2ac(ActionEvent event) {
    }

    @FXML
    private void r2r3ac(ActionEvent event) {
    }

    @FXML
    private void r2r4ac(ActionEvent event) {
    }

    @FXML
    private void r2r5ac(ActionEvent event) {
    }

    @FXML
    private void r2r6ac(ActionEvent event) {
    }

    @FXML
    private void r2r7ac(ActionEvent event) {
    }

    @FXML
    private void r2r8ac(ActionEvent event) {
    }

    @FXML
    private void r3r0ac(ActionEvent event) {
    }

    @FXML
    private void r3r1ac(ActionEvent event) {
    }

    @FXML
    private void r3r2ac(ActionEvent event) {
    }

    @FXML
    private void r3r3ac(ActionEvent event) {
    }

    @FXML
    private void r3r4ac(ActionEvent event) {
    }

    @FXML
    private void r3r5ac(ActionEvent event) {
    }

    @FXML
    private void r3r7ac(ActionEvent event) {
    }

    @FXML
    private void r3r8ac(ActionEvent event) {
    }

    @FXML
    private void r4r0ac(ActionEvent event) {
    }

    @FXML
    private void r4r1ac(ActionEvent event) {
    }

    @FXML
    private void r4r2ac(ActionEvent event) {
    }

    @FXML
    private void r4r3ac(ActionEvent event) {
    }

    @FXML
    private void r4r4ac(ActionEvent event) {
    }

    @FXML
    private void r4r5ac(ActionEvent event) {
    }

    @FXML
    private void r4r6ac(ActionEvent event) {
    }

    @FXML
    private void r4r7ac(ActionEvent event) {
    }

    @FXML
    private void r4r8ac(ActionEvent event) {
    }

    @FXML
    private void r5r0ac(ActionEvent event) {
    }

    @FXML
    private void r5r1ac(ActionEvent event) {
    }

    @FXML
    private void r5r2ac(ActionEvent event) {
    }

    @FXML
    private void r5r3ac(ActionEvent event) {
    }

    @FXML
    private void r5r4ac(ActionEvent event) {
    }

    @FXML
    private void r5r5ac(ActionEvent event) {
    }

    @FXML
    private void r5r6ac(ActionEvent event) {
    }

    @FXML
    private void r5r7ac(ActionEvent event) {
    }

    @FXML
    private void r5r8ac(ActionEvent event) {
    }

    @FXML
    private void r6r0ac(ActionEvent event) {
    }

    @FXML
    private void r6r1ac(ActionEvent event) {
    }

    @FXML
    private void r6r2ac(ActionEvent event) {
    }

    @FXML
    private void r6r3ac(ActionEvent event) {
    }

    @FXML
    private void r6r4ac(ActionEvent event) {
    }

    @FXML
    private void r6r5ac(ActionEvent event) {
    }

    @FXML
    private void r6r6ac(ActionEvent event) {
    }

    @FXML
    private void r6r7ac(ActionEvent event) {
    }

    @FXML
    private void r6r8ac(ActionEvent event) {
    }

    @FXML
    private void r7r0ac(ActionEvent event) {
    }

    @FXML
    private void r7r1ac(ActionEvent event) {
    }

    @FXML
    private void r7r2ac(ActionEvent event) {
    }

    @FXML
    private void r7r3ac(ActionEvent event) {
    }

    @FXML
    private void r7r4ac(ActionEvent event) {
    }

    @FXML
    private void r7r5ac(ActionEvent event) {
    }

    @FXML
    private void r7r6ac(ActionEvent event) {
    }

    @FXML
    private void r7r7ac(ActionEvent event) {
    }

    @FXML
    private void r7r8ac(ActionEvent event) {
    }

    @FXML
    private void r8r0ac(ActionEvent event) {
    }

    @FXML
    private void r8r1ac(ActionEvent event) {
    }

    @FXML
    private void r8r2ac(ActionEvent event) {
    }

    @FXML
    private void r8r3ac(ActionEvent event) {
    }

    @FXML
    private void r8r4ac(ActionEvent event) {
    }
    //@FXML
    
    
    //for(int k=0;i<9;i++){
//        for(int j=0;j<9;j++){
//            
//        }
//    

    

    @FXML
    private void keyaction(KeyEvent event)throws IOException, Exception {
        try{
            String s=event.getText();
            String id=((Button)event.getSource()).getId();
            int asc=Integer.parseInt(s);

            int i=Integer.parseInt(Character.toString(id.charAt(1)));
            int j=Integer.parseInt(Character.toString(id.charAt(3)));
            System.out.print(id);
            if(asc>=1 && asc<=9){
                if((((Button)event.getSource()).getText()==null)||flag[i][j]==1){
                    ((Button)event.getSource()).setFont(Font.font(28));
                    ((Button)event.getSource()).setTextFill(Color.BLACK);
                    ((Button)event.getSource()).setText(s);
                    congo();

                }
            }
        }catch(Exception e){
            System.out.println("not expected input");
        }
        
    }
    

    @FXML
    private void actionmain(ActionEvent mainmenu)throws IOException {
        main.backmenu();
    }

    @FXML
    private void solve(ActionEvent event)throws IOException {
       
        solveflag=1;
        time.setText("Time:00:00:00");
         timer.cancel();
         for(int i=0;i<9;i++){
              for(int j=0;j<9;j++){
                  if(solv[i][j]!=0){
                   if(i==0 &&j==0){
                        r0r0.setFont(x1);
                        r0r0.setTextFill(Color.BLACK);
                        r0r0.setText(Integer.toString(solv[i][j]));}
                    else  if(i==0 &&j==1){
                        r0r1.setFont(x1);
                        r0r1.setTextFill(Color.BLACK);
                        r0r1.setText(Integer.toString(solv[i][j]));}
                    else  if(i==0 &&j==2){
                        r0r2.setFont(x1);
                        r0r2.setTextFill(Color.BLACK);
                        r0r2.setText(Integer.toString(solv[i][j]));}
                    else  if(i==0 &&j==3){
                        r0r3.setFont(x1);
                        r0r3.setTextFill(Color.BLACK);
                        r0r3.setText(Integer.toString(solv[i][j]));}
                    else  if(i==0 &&j==4){
                        r0r4.setFont(x1);
                        r0r4.setTextFill(Color.BLACK);
                        r0r4.setText(Integer.toString(solv[i][j]));}
                    else  if(i==0 &&j==5){
                        r0r5.setFont(x1);
                        r0r5.setTextFill(Color.BLACK);
                        r0r5.setText(Integer.toString(solv[i][j]));}
                    else  if(i==0 &&j==6){
                        r0r6.setFont(x1);
                        r0r6.setTextFill(Color.BLACK);
                        r0r6.setText(Integer.toString(solv[i][j]));}
                    else  if(i==0 &&j==7){
                        r0r7.setFont(x1);
                        r0r7.setTextFill(Color.BLACK);
                        r0r7.setText(Integer.toString(solv[i][j]));}
                    else  if(i==0 &&j==8){
                        r0r8.setFont(x1);
                        r0r8.setTextFill(Color.BLACK);
                        r0r8.setText(Integer.toString(solv[i][j]));}
                   
                    else  if(i==1 &&j==0){
                        r1r0.setFont(x1);
                        r1r0.setTextFill(Color.BLACK);
                        r1r0.setText(Integer.toString(solv[i][j]));}
                    else  if(i==1 &&j==1){
                        r1r1.setFont(x1);
                        r1r1.setTextFill(Color.BLACK);
                        r1r1.setText(Integer.toString(solv[i][j]));}
                    else  if(i==1 &&j==2){
                        r1r2.setFont(x1);
                        r1r2.setTextFill(Color.BLACK);
                        r1r2.setText(Integer.toString(solv[i][j]));}
                    else  if(i==1 &&j==3){
                        r1r3.setFont(x1);
                        r1r3.setTextFill(Color.BLACK);
                        r1r3.setText(Integer.toString(solv[i][j]));}
                    else  if(i==1 &&j==4){
                        r1r4.setFont(x1);
                        r1r4.setTextFill(Color.BLACK);
                        r1r4.setText(Integer.toString(solv[i][j]));}
                    else  if(i==1 &&j==5){
                        r1r5.setFont(x1);
                        r1r5.setTextFill(Color.BLACK);
                        r1r5.setText(Integer.toString(solv[i][j]));}
                    else  if(i==1 &&j==6){
                        r1r6.setFont(x1);
                        r1r6.setTextFill(Color.BLACK);
                        r1r6.setText(Integer.toString(solv[i][j]));}
                    else  if(i==1 &&j==7){
                        r1r7.setFont(x1);
                        r1r7.setTextFill(Color.BLACK);
                        r1r7.setText(Integer.toString(solv[i][j]));}
                    else  if(i==1 &&j==8){
                        r1r8.setFont(x1);
                        r1r8.setTextFill(Color.BLACK);
                        r1r8.setText(Integer.toString(solv[i][j]));}
                    
                    else  if(i==2 &&j==0){
                        r2r0.setFont(x1);
                        r2r0.setTextFill(Color.BLACK);
                        r2r0.setText(Integer.toString(solv[i][j]));}
                    else  if(i==2 &&j==1){
                        r2r1.setFont(x1);
                        r2r1.setTextFill(Color.BLACK);
                        r2r1.setText(Integer.toString(solv[i][j]));}
                    else  if(i==2 &&j==2){
                        r2r2.setFont(x1);
                        r2r2.setTextFill(Color.BLACK);
                        r2r2.setText(Integer.toString(solv[i][j]));}
                    else  if(i==2 &&j==3){
                        r2r3.setFont(x1);
                        r2r3.setTextFill(Color.BLACK);
                        r2r3.setText(Integer.toString(solv[i][j]));}
                    else  if(i==2 &&j==4){
                        r2r4.setFont(x1);
                        r2r4.setTextFill(Color.BLACK);
                        r2r4.setText(Integer.toString(solv[i][j]));}
                    else  if(i==2 &&j==5){
                        r2r5.setFont(x1);
                         r2r5.setTextFill(Color.BLACK);
                        r2r5.setText(Integer.toString(solv[i][j]));}
                    else  if(i==2 &&j==6){
                        r2r6.setFont(x1);
                         r2r6.setTextFill(Color.BLACK);
                        r2r6.setText(Integer.toString(solv[i][j]));}
                    else  if(i==2 &&j==7){
                        r2r7.setFont(x1);
                         r2r7.setTextFill(Color.BLACK);
                        r2r7.setText(Integer.toString(solv[i][j]));}
                    else  if(i==2 &&j==8){
                        r2r8.setFont(x1);
                         r2r8.setTextFill(Color.BLACK);
                        r2r8.setText(Integer.toString(solv[i][j]));}
                    
                    else  if(i==3 &&j==0){
                        r3r0.setFont(x1);
                        r3r0.setTextFill(Color.BLACK);
                        r3r0.setText(Integer.toString(solv[i][j]));}
                    else  if(i==3 &&j==1){
                        r3r1.setFont(x1);
                         r3r1.setTextFill(Color.BLACK);
                        r3r1.setText(Integer.toString(solv[i][j]));}
                    else  if(i==3 &&j==2){
                        r3r2.setFont(x1);
                         r3r2.setTextFill(Color.BLACK);
                        r3r2.setText(Integer.toString(solv[i][j]));}
                    else  if(i==3 &&j==3){
                        r3r3.setFont(x1);
                         r3r3.setTextFill(Color.BLACK);
                        r3r3.setText(Integer.toString(solv[i][j]));}
                    else  if(i==3 &&j==4){
                        r3r4.setFont(x1);
                         r3r4.setTextFill(Color.BLACK);
                        r3r4.setText(Integer.toString(solv[i][j]));}
                    else  if(i==3 &&j==5){
                        r3r5.setFont(x1);
                         r3r5.setTextFill(Color.BLACK);
                        r3r5.setText(Integer.toString(solv[i][j]));}
                    else  if(i==3 &&j==6){
                        r3r6.setFont(x1);
                         r3r6.setTextFill(Color.BLACK);
                        r3r6.setText(Integer.toString(solv[i][j]));}
                    else  if(i==3 &&j==7){
                        r3r7.setFont(x1);
                         r3r7.setTextFill(Color.BLACK);
                        r3r7.setText(Integer.toString(solv[i][j]));}
                    else  if(i==3 &&j==8){
                        r3r8.setFont(x1);
                         r3r8.setTextFill(Color.BLACK);
                        r3r8.setText(Integer.toString(solv[i][j]));}
                    
                    else  if(i==4 &&j==0){
                        r4r0.setFont(x1);
                        r4r0.setTextFill(Color.BLACK);
                        r4r0.setText(Integer.toString(solv[i][j]));}
                    else  if(i==4 &&j==1){
                        r4r1.setFont(x1);
                        r4r1.setTextFill(Color.BLACK);
                        r4r1.setText(Integer.toString(solv[i][j]));}
                    else  if(i==4 &&j==2){
                        r4r2.setFont(x1);
                        r4r2.setTextFill(Color.BLACK);
                        r4r2.setText(Integer.toString(solv[i][j]));}
                    else  if(i==4 &&j==3){
                        r4r3.setFont(x1);
                        r4r3.setTextFill(Color.BLACK);
                        r4r3.setText(Integer.toString(solv[i][j]));}
                    else  if(i==4 &&j==4){
                        r4r4.setFont(x1);
                        r4r4.setTextFill(Color.BLACK);
                        r4r4.setText(Integer.toString(solv[i][j]));}
                    else  if(i==4 &&j==5){
                        r4r5.setFont(x1);
                        r4r5.setTextFill(Color.BLACK);
                        r4r5.setText(Integer.toString(solv[i][j]));}
                    else  if(i==4 &&j==6){
                        r4r6.setFont(x1);
                        r4r6.setTextFill(Color.BLACK);
                        r4r6.setText(Integer.toString(solv[i][j]));}
                    else  if(i==4 &&j==7){
                        r4r7.setFont(x1);
                        r4r7.setTextFill(Color.BLACK);
                        r4r7.setText(Integer.toString(solv[i][j]));}
                    else  if(i==4 &&j==8){
                        r4r8.setFont(x1);
                        r4r8.setTextFill(Color.BLACK);
                        r4r8.setText(Integer.toString(solv[i][j]));}
                    
                    else  if(i==5 &&j==0){
                        r5r0.setFont(x1);
                        r5r0.setTextFill(Color.BLACK);
                        r5r0.setText(Integer.toString(solv[i][j]));}
                    else  if(i==5 &&j==1){
                        r5r1.setFont(x1);
                        r5r1.setTextFill(Color.BLACK);
                        r5r1.setText(Integer.toString(solv[i][j]));}
                    else  if(i==5 &&j==2){
                        r5r2.setFont(x1);
                        r5r2.setTextFill(Color.BLACK);
                        r5r2.setText(Integer.toString(solv[i][j]));}
                    else  if(i==5 &&j==3){
                        r5r3.setFont(x1);
                        r5r3.setTextFill(Color.BLACK);
                        r5r3.setText(Integer.toString(solv[i][j]));}
                    else  if(i==5 &&j==4){
                        r5r4.setFont(x1);
                        r5r4.setTextFill(Color.BLACK);
                        r5r4.setText(Integer.toString(solv[i][j]));}
                    else  if(i==5 &&j==5){
                        r5r5.setFont(x1);
                        r5r5.setTextFill(Color.BLACK);
                        r5r5.setText(Integer.toString(solv[i][j]));}
                    else  if(i==5 &&j==6){
                        r5r6.setFont(x1);
                        r5r6.setTextFill(Color.BLACK);
                        r5r6.setText(Integer.toString(solv[i][j]));}
                    else  if(i==5 &&j==7){
                        r5r7.setFont(x1);
                        r5r7.setTextFill(Color.BLACK);
                        r5r7.setText(Integer.toString(solv[i][j]));}
                    else  if(i==5 &&j==8){
                        r5r8.setFont(x1);
                        r5r8.setTextFill(Color.BLACK);
                        r5r8.setText(Integer.toString(solv[i][j]));}
                    
                    else  if(i==6 &&j==0){
                        r6r0.setFont(x1);
                        r6r0.setTextFill(Color.BLACK);
                        r6r0.setText(Integer.toString(solv[i][j]));}
                    else  if(i==6 &&j==1){
                         r6r1.setFont(x1);
                         r6r1.setTextFill(Color.BLACK);
                        r6r1.setText(Integer.toString(solv[i][j]));}
                    else  if(i==6 &&j==2){
                         r6r2.setFont(x1);
                         r6r2.setTextFill(Color.BLACK);
                        r6r2.setText(Integer.toString(solv[i][j]));}
                    else  if(i==6 &&j==3){
                         r6r3.setFont(x1);
                         r6r3.setTextFill(Color.BLACK);
                        r6r3.setText(Integer.toString(solv[i][j]));}
                    else  if(i==6 &&j==4){
                         r6r4.setFont(x1);
                         r6r4.setTextFill(Color.BLACK);
                        r6r4.setText(Integer.toString(solv[i][j]));}
                    else  if(i==6 &&j==5){
                         r6r5.setFont(x1);
                         r6r5.setTextFill(Color.BLACK);
                        r6r5.setText(Integer.toString(solv[i][j]));}
                    else  if(i==6 &&j==6){
                         r6r6.setFont(x1);
                         r6r6.setTextFill(Color.BLACK);
                        r6r6.setText(Integer.toString(solv[i][j]));}
                    else  if(i==6 &&j==7){
                         r6r7.setFont(x1);
                         r6r7.setTextFill(Color.BLACK);
                        r6r7.setText(Integer.toString(solv[i][j]));}
                    else  if(i==6 &&j==8){
                         r6r8.setFont(x1);
                         r6r8.setTextFill(Color.BLACK);
                        r6r8.setText(Integer.toString(solv[i][j]));}
                   
                    else  if(i==7 &&j==0){
                         r7r0.setFont(x1);
                         r7r0.setTextFill(Color.BLACK);
                        r7r0.setText(Integer.toString(solv[i][j]));}
                    else  if(i==7 &&j==1){
                        r7r1.setFont(x1);
                        r7r1.setTextFill(Color.BLACK);
                        r7r1.setText(Integer.toString(solv[i][j]));}
                    else  if(i==7 &&j==2){
                        r7r2.setFont(x1);
                        r7r2.setTextFill(Color.BLACK);
                        r7r2.setText(Integer.toString(solv[i][j]));}
                    else  if(i==7 &&j==3){
                        r7r3.setFont(x1);
                        r7r3.setTextFill(Color.BLACK);
                        r7r3.setText(Integer.toString(solv[i][j]));}
                    else  if(i==7 &&j==4){
                        r7r4.setFont(x1);
                        r7r4.setTextFill(Color.BLACK);
                        r7r4.setText(Integer.toString(solv[i][j]));}
                    else  if(i==7 &&j==5){
                        r7r5.setFont(x1);
                        r7r5.setTextFill(Color.BLACK);
                        r7r5.setText(Integer.toString(solv[i][j]));}
                    else  if(i==7 &&j==6){
                        r7r6.setFont(x1);
                        r7r6.setTextFill(Color.BLACK);
                        r7r6.setText(Integer.toString(solv[i][j]));}
                    else  if(i==7 &&j==7){
                        r7r7.setFont(x1);
                        r7r7.setTextFill(Color.BLACK);
                        r7r7.setText(Integer.toString(solv[i][j]));}
                    else  if(i==7 &&j==8){
                        r7r8.setFont(x1);
                        r7r8.setTextFill(Color.BLACK);
                        r7r8.setText(Integer.toString(solv[i][j]));}
                    
                    else  if(i==8 &&j==0){
                        r8r0.setFont(x1);
                        r8r0.setTextFill(Color.BLACK);
                        r8r0.setText(Integer.toString(solv[i][j]));}
                    else  if(i==8 &&j==1){
                         r8r1.setFont(x1);
                         r8r1.setTextFill(Color.BLACK);
                        r8r1.setText(Integer.toString(solv[i][j]));}
                    else  if(i==8 &&j==2){
                         r8r2.setFont(x1);
                         r8r2.setTextFill(Color.BLACK);
                        r8r2.setText(Integer.toString(solv[i][j]));}
                    else  if(i==8 &&j==3){
                         r8r3.setFont(x1);
                         r8r3.setTextFill(Color.BLACK);
                        r8r3.setText(Integer.toString(solv[i][j]));}
                    else  if(i==8 &&j==4){
                         r8r4.setFont(x1);
                         r8r4.setTextFill(Color.BLACK);
                        r8r4.setText(Integer.toString(solv[i][j]));}
                    else  if(i==8 &&j==5){
                         r8r5.setFont(x1);
                         r8r5.setTextFill(Color.BLACK);
                        r8r5.setText(Integer.toString(solv[i][j]));}
                    else  if(i==8 &&j==6){
                         r8r6.setFont(x1);
                         r8r6.setTextFill(Color.BLACK);
                        r8r6.setText(Integer.toString(solv[i][j]));}
                    else  if(i==8 &&j==7){
                         r8r7.setFont(x1);
                         r8r7.setTextFill(Color.BLACK);
                        r8r7.setText(Integer.toString(solv[i][j]));}
                    else  if(i==8 &&j==8){
                         r8r8.setFont(x1);
                         r8r8.setTextFill(Color.BLACK);
                        r8r8.setText(Integer.toString(solv[i][j]));}
                    
                    
                    
                  
                  }

              }
         }
    }

    @FXML
    private void actionquit2(ActionEvent event) throws IOException {
        main.quit();
    }

   /* @FXML
    private void actionsubmit(ActionEvent event) {
        int sub[][]=new int[9][9];
        
          for(int i=0;i<9;i++){
              for(int j=0;j<9;j++){
                  if(i==0 &&j==0){
                      sub[i][j]=Integer.parseInt(r0r0.getText());
                      if(sub[i][j]!=solv[i][j]){
                          r0r0.setFont(x1);
                          r0r0.setText(Integer.toString(sub[i][j]));
                      }
                  }
                         
              }
          }
            
    }*/

   

   

   

    @FXML
    private void actioncheck(ActionEvent event) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(i==0 &&j==0){
                    if(r0r0.getText()!=null){
                        int num=Integer.parseInt(r0r0.getText());
                        if(num!=solv[i][j]){
                            r0r0.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==0 &&j==1){
                    if(r0r1.getText()!=null){
                        int num=Integer.parseInt(r0r1.getText());
                        if(num!=solv[i][j]){
                            r0r1.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==0 &&j==2){
                    if(r0r2.getText()!=null){
                        int num=Integer.parseInt(r0r2.getText());
                        if(num!=solv[i][j]){
                            r0r2.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==0 &&j==3){
                    if(r0r3.getText()!=null){
                        int num=Integer.parseInt(r0r3.getText());
                        if(num!=solv[i][j]){
                            r0r3.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==0 &&j==4){
                    if(r0r4.getText()!=null){
                        int num=Integer.parseInt(r0r4.getText());
                        if(num!=solv[i][j]){
                            r0r4.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==0 &&j==5){
                    if(r0r5.getText()!=null){
                        int num=Integer.parseInt(r0r5.getText());
                        if(num!=solv[i][j]){
                            r0r5.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==0 &&j==6){
                    if(r0r6.getText()!=null){
                        int num=Integer.parseInt(r0r6.getText());
                        if(num!=solv[i][j]){
                            r0r6.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==0 &&j==7){
                    if(r0r7.getText()!=null){
                        int num=Integer.parseInt(r0r7.getText());
                        if(num!=solv[i][j]){
                            r0r7.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==0 &&j==8){
                    if(r0r8.getText()!=null){
                        int num=Integer.parseInt(r0r8.getText());
                        if(num!=solv[i][j]){
                            r0r8.setTextFill(Color.RED);
                        }
                    }
                }
                
                
                else if(i==1 &&j==0){
                    if(r1r0.getText()!=null){
                        int num=Integer.parseInt(r1r0.getText());
                        if(num!=solv[i][j]){
                            r1r0.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==1 &&j==1){
                    if(r1r1.getText()!=null){
                        int num=Integer.parseInt(r1r1.getText());
                        if(num!=solv[i][j]){
                            r1r1.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==1 &&j==2){
                    if(r1r2.getText()!=null){
                        int num=Integer.parseInt(r1r2.getText());
                        if(num!=solv[i][j]){
                            r1r2.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==1 &&j==3){
                    if(r1r3.getText()!=null){
                        int num=Integer.parseInt(r1r3.getText());
                        if(num!=solv[i][j]){
                            r1r3.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==1 &&j==4){
                    if(r1r4.getText()!=null){
                        int num=Integer.parseInt(r1r4.getText());
                        if(num!=solv[i][j]){
                            r1r4.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==1 &&j==5){
                    if(r1r5.getText()!=null){
                        int num=Integer.parseInt(r1r5.getText());
                        if(num!=solv[i][j]){
                            r1r5.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==1 &&j==6){
                    if(r1r6.getText()!=null){
                        int num=Integer.parseInt(r1r6.getText());
                        if(num!=solv[i][j]){
                            r1r6.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==1 &&j==7){
                    if(r1r7.getText()!=null){
                        int num=Integer.parseInt(r1r7.getText());
                        if(num!=solv[i][j]){
                            r1r7.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==1 &&j==8){
                    if(r1r8.getText()!=null){
                        int num=Integer.parseInt(r1r8.getText());
                        if(num!=solv[i][j]){
                            r1r8.setTextFill(Color.RED);
                        }
                    }
                }
                
                 else if(i==2 &&j==1){
                    if(r2r1.getText()!=null){
                        int num=Integer.parseInt(r2r1.getText());
                        if(num!=solv[i][j]){
                            r2r1.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==2 &&j==2){
                    if(r2r2.getText()!=null){
                        int num=Integer.parseInt(r2r2.getText());
                        if(num!=solv[i][j]){
                            r2r2.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==2 &&j==3){
                    if(r2r3.getText()!=null){
                        int num=Integer.parseInt(r2r3.getText());
                        if(num!=solv[i][j]){
                            r2r3.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==2 &&j==4){
                    if(r2r4.getText()!=null){
                        int num=Integer.parseInt(r2r4.getText());
                        if(num!=solv[i][j]){
                            r2r4.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==2 &&j==5){
                    if(r2r5.getText()!=null){
                        int num=Integer.parseInt(r2r5.getText());
                        if(num!=solv[i][j]){
                            r2r5.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==2 &&j==6){
                    if(r2r6.getText()!=null){
                        int num=Integer.parseInt(r2r6.getText());
                        if(num!=solv[i][j]){
                            r2r6.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==2 &&j==7){
                    if(r2r7.getText()!=null){
                        int num=Integer.parseInt(r2r7.getText());
                        if(num!=solv[i][j]){
                            r2r7.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==2 &&j==8){
                    if(r2r8.getText()!=null){
                        int num=Integer.parseInt(r2r8.getText());
                        if(num!=solv[i][j]){
                            r2r8.setTextFill(Color.RED);
                        }
                    }
                }
                
                else if(i==3 &&j==0){
                    if(r3r0.getText()!=null){
                        int num=Integer.parseInt(r3r0.getText());
                        if(num!=solv[i][j]){
                            r3r0.setTextFill(Color.RED);
                        }
                    }
                }
                 else if(i==3 &&j==1){
                    if(r3r1.getText()!=null){
                        int num=Integer.parseInt(r3r1.getText());
                        if(num!=solv[i][j]){
                            r3r1.setTextFill(Color.RED);
                        }
                    }
                }
                 else if(i==3 &&j==2){
                    if(r3r2.getText()!=null){
                        int num=Integer.parseInt(r3r2.getText());
                        if(num!=solv[i][j]){
                            r3r2.setTextFill(Color.RED);
                        }
                    }
                }
                 else if(i==3 &&j==3){
                    if(r3r3.getText()!=null){
                        int num=Integer.parseInt(r3r3.getText());
                        if(num!=solv[i][j]){
                            r3r3.setTextFill(Color.RED);
                        }
                    }
                }
                 else if(i==3 &&j==4){
                    if(r3r4.getText()!=null){
                        int num=Integer.parseInt(r3r4.getText());
                        if(num!=solv[i][j]){
                            r3r4.setTextFill(Color.RED);
                        }
                    }
                }
                 else if(i==3 &&j==5){
                    if(r3r5.getText()!=null){
                        int num=Integer.parseInt(r3r5.getText());
                        if(num!=solv[i][j]){
                            r3r5.setTextFill(Color.RED);
                        }
                    }
                }
                 else if(i==3 &&j==6){
                    if(r3r6.getText()!=null){
                        int num=Integer.parseInt(r3r6.getText());
                        if(num!=solv[i][j]){
                            r3r6.setTextFill(Color.RED);
                        }
                    }
                }
                 else if(i==3 &&j==7){
                    if(r3r7.getText()!=null){
                        int num=Integer.parseInt(r3r7.getText());
                        if(num!=solv[i][j]){
                            r3r7.setTextFill(Color.RED);
                        }
                    }
                }
                 else if(i==3 &&j==8){
                    if(r3r8.getText()!=null){
                        int num=Integer.parseInt(r3r8.getText());
                        if(num!=solv[i][j]){
                            r3r8.setTextFill(Color.RED);
                        }
                    }
                }
                
                 else if(i==4 &&j==0){
                    if(r4r0.getText()!=null){
                        int num=Integer.parseInt(r4r0.getText());
                        if(num!=solv[i][j]){
                            r4r0.setTextFill(Color.RED);
                        }
                    }
                }
                 else if(i==4 &&j==1){
                    if(r4r1.getText()!=null){
                        int num=Integer.parseInt(r4r1.getText());
                        if(num!=solv[i][j]){
                            r4r1.setTextFill(Color.RED);
                        }
                    }
                }
                 else if(i==4 &&j==2){
                    if(r4r2.getText()!=null){
                        int num=Integer.parseInt(r4r2.getText());
                        if(num!=solv[i][j]){
                            r4r2.setTextFill(Color.RED);
                        }
                    }
                }
                 else if(i==4 &&j==3){
                    if(r4r3.getText()!=null){
                        int num=Integer.parseInt(r4r3.getText());
                        if(num!=solv[i][j]){
                            r4r3.setTextFill(Color.RED);
                        }
                    }
                }
                 else if(i==4 &&j==4){
                    if(r4r4.getText()!=null){
                        int num=Integer.parseInt(r4r4.getText());
                        if(num!=solv[i][j]){
                            r4r4.setTextFill(Color.RED);
                        }
                    }
                }
                 else if(i==4 &&j==5){
                    if(r4r5.getText()!=null){
                        int num=Integer.parseInt(r4r5.getText());
                        if(num!=solv[i][j]){
                            r4r5.setTextFill(Color.RED);
                        }
                    }
                }
                 else if(i==4 &&j==6){
                    if(r4r6.getText()!=null){
                        int num=Integer.parseInt(r4r6.getText());
                        if(num!=solv[i][j]){
                            r4r6.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==4 &&j==7){
                    if(r4r7.getText()!=null){
                        int num=Integer.parseInt(r4r7.getText());
                        if(num!=solv[i][j]){
                            r4r7.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==4 &&j==8){
                    if(r4r8.getText()!=null){
                        int num=Integer.parseInt(r4r8.getText());
                        if(num!=solv[i][j]){
                            r4r8.setTextFill(Color.RED);
                        }
                    }
                }
                
                else if(i==5 &&j==0){
                    if(r5r0.getText()!=null){
                        int num=Integer.parseInt(r5r0.getText());
                        if(num!=solv[i][j]){
                            r5r0.setTextFill(Color.RED);
                        }
                    }
                }
                 else if(i==5 &&j==1){
                    if(r5r1.getText()!=null){
                        int num=Integer.parseInt(r5r1.getText());
                        if(num!=solv[i][j]){
                            r5r1.setTextFill(Color.RED);
                        }
                    }
                }
                 else if(i==5 &&j==2){
                    if(r5r2.getText()!=null){
                        int num=Integer.parseInt(r5r2.getText());
                        if(num!=solv[i][j]){
                            r5r2.setTextFill(Color.RED);
                        }
                    }
                }
                 else if(i==5 &&j==3){
                    if(r5r3.getText()!=null){
                        int num=Integer.parseInt(r5r3.getText());
                        if(num!=solv[i][j]){
                            r5r3.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==5 &&j==4){
                    if(r5r4.getText()!=null){
                        int num=Integer.parseInt(r5r4.getText());
                        if(num!=solv[i][j]){
                            r5r4.setTextFill(Color.RED);
                        }
                    }
                }
                 else if(i==5 &&j==5){
                    if(r5r5.getText()!=null){
                        int num=Integer.parseInt(r5r5.getText());
                        if(num!=solv[i][j]){
                            r5r5.setTextFill(Color.RED);
                        }
                    }
                }
                 else if(i==5 &&j==6){
                    if(r5r6.getText()!=null){
                        int num=Integer.parseInt(r5r6.getText());
                        if(num!=solv[i][j]){
                            r5r6.setTextFill(Color.RED);
                        }
                    }
                }
                 else if(i==5 &&j==7){
                    if(r5r7.getText()!=null){
                        int num=Integer.parseInt(r5r7.getText());
                        if(num!=solv[i][j]){
                            r5r7.setTextFill(Color.RED);
                        }
                    }
                }
                 else if(i==5 &&j==8){
                    if(r5r8.getText()!=null){
                        int num=Integer.parseInt(r5r8.getText());
                        if(num!=solv[i][j]){
                            r5r8.setTextFill(Color.RED);
                        }
                    }
                }
                
                 else if(i==6 &&j==0){
                    if(r6r0.getText()!=null){
                        int num=Integer.parseInt(r6r0.getText());
                        if(num!=solv[i][j]){
                            r6r0.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==6 &&j==1){
                    if(r6r1.getText()!=null){
                        int num=Integer.parseInt(r6r1.getText());
                        if(num!=solv[i][j]){
                            r6r1.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==6 &&j==2){
                    if(r6r2.getText()!=null){
                        int num=Integer.parseInt(r6r2.getText());
                        if(num!=solv[i][j]){
                            r6r2.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==6 &&j==3){
                    if(r6r3.getText()!=null){
                        int num=Integer.parseInt(r6r3.getText());
                        if(num!=solv[i][j]){
                            r6r3.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==6 &&j==4){
                    if(r6r4.getText()!=null){
                        int num=Integer.parseInt(r6r4.getText());
                        if(num!=solv[i][j]){
                            r6r4.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==6 &&j==5){
                    if(r6r5.getText()!=null){
                        int num=Integer.parseInt(r6r5.getText());
                        if(num!=solv[i][j]){
                            r6r5.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==6 &&j==6){
                    if(r6r6.getText()!=null){
                        int num=Integer.parseInt(r6r6.getText());
                        if(num!=solv[i][j]){
                            r6r6.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==6 &&j==7){
                    if(r6r7.getText()!=null){
                        int num=Integer.parseInt(r6r7.getText());
                        if(num!=solv[i][j]){
                            r6r7.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==6 &&j==8){
                    if(r6r8.getText()!=null){
                        int num=Integer.parseInt(r6r8.getText());
                        if(num!=solv[i][j]){
                            r6r8.setTextFill(Color.RED);
                        }
                    }
                }
                
                else if(i==7 &&j==0){
                    if(r7r0.getText()!=null){
                        int num=Integer.parseInt(r7r0.getText());
                        if(num!=solv[i][j]){
                            r7r0.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==7 &&j==1){
                    if(r7r1.getText()!=null){
                        int num=Integer.parseInt(r7r1.getText());
                        if(num!=solv[i][j]){
                            r7r1.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==7 &&j==2){
                    if(r7r2.getText()!=null){
                        int num=Integer.parseInt(r7r2.getText());
                        if(num!=solv[i][j]){
                            r7r2.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==7 &&j==3){
                    if(r7r3.getText()!=null){
                        int num=Integer.parseInt(r7r3.getText());
                        if(num!=solv[i][j]){
                            r7r3.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==7 &&j==4){
                    if(r7r4.getText()!=null){
                        int num=Integer.parseInt(r7r4.getText());
                        if(num!=solv[i][j]){
                            r7r4.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==7 &&j==5){
                    if(r7r5.getText()!=null){
                        int num=Integer.parseInt(r7r5.getText());
                        if(num!=solv[i][j]){
                            r7r5.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==7 &&j==6){
                    if(r7r6.getText()!=null){
                        int num=Integer.parseInt(r7r6.getText());
                        if(num!=solv[i][j]){
                            r7r6.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==7 &&j==7){
                    if(r7r7.getText()!=null){
                        int num=Integer.parseInt(r7r7.getText());
                        if(num!=solv[i][j]){
                            r7r7.setTextFill(Color.RED);
                        }
                    }
                }
                 else if(i==7 &&j==8){
                    if(r7r8.getText()!=null){
                        int num=Integer.parseInt(r7r8.getText());
                        if(num!=solv[i][j]){
                            r7r8.setTextFill(Color.RED);
                        }
                    }
                }
                 
                 
                 else if(i==8 &&j==0){
                    if(r8r0.getText()!=null){
                        int num=Integer.parseInt(r8r0.getText());
                        if(num!=solv[i][j]){
                            r8r0.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==8 &&j==1){
                    if(r8r1.getText()!=null){
                        int num=Integer.parseInt(r8r1.getText());
                        if(num!=solv[i][j]){
                            r8r1.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==8 &&j==2){
                    if(r8r2.getText()!=null){
                        int num=Integer.parseInt(r8r2.getText());
                        if(num!=solv[i][j]){
                            r8r2.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==8 &&j==3){
                    if(r8r3.getText()!=null){
                        int num=Integer.parseInt(r8r3.getText());
                        if(num!=solv[i][j]){
                            r8r3.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==8 &&j==4){
                    if(r8r4.getText()!=null){
                        int num=Integer.parseInt(r8r4.getText());
                        if(num!=solv[i][j]){
                            r8r4.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==8 &&j==5){
                    if(r8r5.getText()!=null){
                        int num=Integer.parseInt(r8r5.getText());
                        if(num!=solv[i][j]){
                            r8r5.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==8 &&j==6){
                    if(r8r6.getText()!=null){
                        int num=Integer.parseInt(r8r6.getText());
                        if(num!=solv[i][j]){
                            r8r6.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==8 &&j==7){
                    if(r8r7.getText()!=null){
                        int num=Integer.parseInt(r8r7.getText());
                        if(num!=solv[i][j]){
                            r8r7.setTextFill(Color.RED);
                        }
                    }
                }
                else if(i==8 &&j==8){
                    if(r8r8.getText()!=null){
                        int num=Integer.parseInt(r8r8.getText());
                        if(num!=solv[i][j]){
                            r8r8.setTextFill(Color.RED);
                        }
                    }
                }
                         
                   
               
                 
                   
                
            }
        }
    }
    
    public void congo()throws Exception{
        int conflag2=1;
        if(r0r0.getText()==null){conflag2=2;}
        if(r0r1.getText()==null){conflag2=2;}
        if(r0r2.getText()==null){conflag2=2;}
        if(r0r3.getText()==null){conflag2=2;}
        if(r0r4.getText()==null){conflag2=2;}
        if(r0r5.getText()==null){conflag2=2;}
        if(r0r6.getText()==null){conflag2=2;}
        if(r0r7.getText()==null){conflag2=2;}
        if(r0r8.getText()==null){conflag2=2;}
        if(r1r0.getText()==null){conflag2=2;}
        if(r1r1.getText()==null){conflag2=2;}
        if(r1r2.getText()==null){conflag2=2;}
        if(r1r3.getText()==null){conflag2=2;}
        if(r1r4.getText()==null){conflag2=2;}
        if(r1r5.getText()==null){conflag2=2;}
        if(r1r6.getText()==null){conflag2=2;}
        if(r1r7.getText()==null){conflag2=2;}
        if(r1r8.getText()==null){conflag2=2;}
        if(r2r0.getText()==null){conflag2=2;}
        if(r2r1.getText()==null){conflag2=2;}
        if(r2r2.getText()==null){conflag2=2;}
        if(r2r3.getText()==null){conflag2=2;}
        if(r2r4.getText()==null){conflag2=2;}
        if(r2r5.getText()==null){conflag2=2;}
        if(r2r6.getText()==null){conflag2=2;}
        if(r2r7.getText()==null){conflag2=2;}
        if(r2r8.getText()==null){conflag2=2;}
        if(r3r0.getText()==null){conflag2=2;}
        if(r3r1.getText()==null){conflag2=2;}
        if(r3r2.getText()==null){conflag2=2;}
        if(r3r3.getText()==null){conflag2=2;}
        if(r3r4.getText()==null){conflag2=2;}
        if(r3r5.getText()==null){conflag2=2;}
        if(r3r6.getText()==null){conflag2=2;}
        if(r3r7.getText()==null){conflag2=2;}
        if(r3r8.getText()==null){conflag2=2;}
        if(r4r0.getText()==null){conflag2=2;}
        if(r4r1.getText()==null){conflag2=2;}
        if(r4r2.getText()==null){conflag2=2;}
        if(r4r3.getText()==null){conflag2=2;}
        if(r4r4.getText()==null){conflag2=2;}
        if(r4r5.getText()==null){conflag2=2;}
        if(r4r6.getText()==null){conflag2=2;}
        if(r4r7.getText()==null){conflag2=2;}
        if(r4r8.getText()==null){conflag2=2;}
        if(r5r0.getText()==null){conflag2=2;}
        if(r5r1.getText()==null){conflag2=2;}
        if(r5r2.getText()==null){conflag2=2;}
        if(r5r3.getText()==null){conflag2=2;}
        if(r5r4.getText()==null){conflag2=2;}
        if(r5r5.getText()==null){conflag2=2;}
        if(r5r6.getText()==null){conflag2=2;}
        if(r5r7.getText()==null){conflag2=2;}
        if(r5r8.getText()==null){conflag2=2;}
        if(r6r0.getText()==null){conflag2=2;}
        if(r6r1.getText()==null){conflag2=2;}
        if(r6r2.getText()==null){conflag2=2;}
        if(r6r3.getText()==null){conflag2=2;}
        if(r6r4.getText()==null){conflag2=2;}
        if(r6r5.getText()==null){conflag2=2;}
        if(r6r6.getText()==null){conflag2=2;}
        if(r6r7.getText()==null){conflag2=2;}
        if(r6r8.getText()==null){conflag2=2;}
        if(r7r0.getText()==null){conflag2=2;}
        if(r7r1.getText()==null){conflag2=2;}
        if(r7r2.getText()==null){conflag2=2;}
        if(r7r3.getText()==null){conflag2=2;}
        if(r7r4.getText()==null){conflag2=2;}
        if(r7r5.getText()==null){conflag2=2;}
        if(r7r6.getText()==null){conflag2=2;}
        if(r7r7.getText()==null){conflag2=2;}
        if(r7r8.getText()==null){conflag2=2;}
        if(r8r0.getText()==null){conflag2=2;}
        if(r8r1.getText()==null){conflag2=2;}
        if(r8r2.getText()==null){conflag2=2;}
        if(r8r3.getText()==null){conflag2=2;}
        if(r8r4.getText()==null){conflag2=2;}
        if(r8r5.getText()==null){conflag2=2;}
        if(r8r6.getText()==null){conflag2=2;}
        if(r8r7.getText()==null){conflag2=2;}
        if(r8r8.getText()==null){conflag2=2;}
       
        
        
        
        
        int conflag=1;
         System.out.println(conflag2);
            if(conflag2==1) {
            for( int i=0;i<9;i++){
                for( int j=0;j<9;j++){
                     if(i==0 &&j==0){
                        if(r0r0.getText()!=null){
                            int num=Integer.parseInt(r0r0.getText());
                            if(num!=solv[i][j]){
                                //r0r0.setTextFill(Color.RED);
                                conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==0 &&j==1){
                        if(r0r1.getText()!=null){
                            int num=Integer.parseInt(r0r1.getText());
                            if(num!=solv[i][j]){
                                //r0r1.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==0 &&j==2){
                        if(r0r2.getText()!=null){
                            int num=Integer.parseInt(r0r2.getText());
                            if(num!=solv[i][j]){
                               // r0r2.setTextFill(Color.RED);
                                conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==0 &&j==3){
                        if(r0r3.getText()!=null){
                            int num=Integer.parseInt(r0r3.getText());
                            if(num!=solv[i][j]){
                                //r0r3.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==0 &&j==4){
                        if(r0r4.getText()!=null){
                            int num=Integer.parseInt(r0r4.getText());
                            if(num!=solv[i][j]){
                                //r0r4.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==0 &&j==5){
                        if(r0r5.getText()!=null){
                            int num=Integer.parseInt(r0r5.getText());
                            if(num!=solv[i][j]){
                                //r0r5.setTextFill(Color.RED);
                                 conflag=2;
                                break;

                            }
                        }
                    }
                    else if(i==0 &&j==6){
                        if(r0r6.getText()!=null){
                            int num=Integer.parseInt(r0r6.getText());
                            if(num!=solv[i][j]){
                                //r0r6.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==0 &&j==7){
                        if(r0r7.getText()!=null){
                            int num=Integer.parseInt(r0r7.getText());
                            if(num!=solv[i][j]){
                                //r0r7.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==0 &&j==8){
                        if(r0r8.getText()!=null){
                            int num=Integer.parseInt(r0r8.getText());
                            if(num!=solv[i][j]){
                               // r0r8.setTextFill(Color.RED);
                                conflag=2;
                                break;
                            }
                        }
                    }


                    else if(i==1 &&j==0){
                        if(r1r0.getText()!=null){
                            int num=Integer.parseInt(r1r0.getText());
                            if(num!=solv[i][j]){
                                //r1r0.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==1 &&j==1){
                        if(r1r1.getText()!=null){
                            int num=Integer.parseInt(r1r1.getText());
                            if(num!=solv[i][j]){
                                //r1r1.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==1 &&j==2){
                        if(r1r2.getText()!=null){
                            int num=Integer.parseInt(r1r2.getText());
                            if(num!=solv[i][j]){
                                //r1r2.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==1 &&j==3){
                        if(r1r3.getText()!=null){
                            int num=Integer.parseInt(r1r3.getText());
                            if(num!=solv[i][j]){
                                //r1r3.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==1 &&j==4){
                        if(r1r4.getText()!=null){
                            int num=Integer.parseInt(r1r4.getText());
                            if(num!=solv[i][j]){
                                //r1r4.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==1 &&j==5){
                        if(r1r5.getText()!=null){
                            int num=Integer.parseInt(r1r5.getText());
                            if(num!=solv[i][j]){
                                //r1r5.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==1 &&j==6){
                        if(r1r6.getText()!=null){
                            int num=Integer.parseInt(r1r6.getText());
                            if(num!=solv[i][j]){
                                //r1r6.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==1 &&j==7){
                        if(r1r7.getText()!=null){
                            int num=Integer.parseInt(r1r7.getText());
                            if(num!=solv[i][j]){
                                //r1r7.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==1 &&j==8){
                        if(r1r8.getText()!=null){
                            int num=Integer.parseInt(r1r8.getText());
                            if(num!=solv[i][j]){
                                //r1r8.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }

                     else if(i==2 &&j==1){
                        if(r2r1.getText()!=null){
                            int num=Integer.parseInt(r2r1.getText());
                            if(num!=solv[i][j]){
                                //r2r1.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==2 &&j==2){
                        if(r2r2.getText()!=null){
                            int num=Integer.parseInt(r2r2.getText());
                            if(num!=solv[i][j]){
                                //r2r2.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==2 &&j==3){
                        if(r2r3.getText()!=null){
                            int num=Integer.parseInt(r2r3.getText());
                            if(num!=solv[i][j]){
                                //r2r3.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==2 &&j==4){
                        if(r2r4.getText()!=null){
                            int num=Integer.parseInt(r2r4.getText());
                            if(num!=solv[i][j]){
                                //r2r4.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==2 &&j==5){
                        if(r2r5.getText()!=null){
                            int num=Integer.parseInt(r2r5.getText());
                            if(num!=solv[i][j]){
                                //r2r5.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==2 &&j==6){
                        if(r2r6.getText()!=null){
                            int num=Integer.parseInt(r2r6.getText());
                            if(num!=solv[i][j]){
                                //r2r6.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==2 &&j==7){
                        if(r2r7.getText()!=null){
                            int num=Integer.parseInt(r2r7.getText());
                            if(num!=solv[i][j]){
                               // r2r7.setTextFill(Color.RED);
                                conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==2 &&j==8){
                        if(r2r8.getText()!=null){
                            int num=Integer.parseInt(r2r8.getText());
                            if(num!=solv[i][j]){
                                //r2r8.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }

                    else if(i==3 &&j==0){
                        if(r3r0.getText()!=null){
                            int num=Integer.parseInt(r3r0.getText());
                            if(num!=solv[i][j]){
                                //r3r0.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                     else if(i==3 &&j==1){
                        if(r3r1.getText()!=null){
                            int num=Integer.parseInt(r3r1.getText());
                            if(num!=solv[i][j]){
                                //r3r1.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                     else if(i==3 &&j==2){
                        if(r3r2.getText()!=null){
                            int num=Integer.parseInt(r3r2.getText());
                            if(num!=solv[i][j]){
                                //r3r2.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                     else if(i==3 &&j==3){
                        if(r3r3.getText()!=null){
                            int num=Integer.parseInt(r3r3.getText());
                            if(num!=solv[i][j]){
                                //r3r3.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                     else if(i==3 &&j==4){
                        if(r3r4.getText()!=null){
                            int num=Integer.parseInt(r3r4.getText());
                            if(num!=solv[i][j]){
                                //r3r4.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                     else if(i==3 &&j==5){
                        if(r3r5.getText()!=null){
                            int num=Integer.parseInt(r3r5.getText());
                            if(num!=solv[i][j]){
                                //r3r5.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                     else if(i==3 &&j==6){
                        if(r3r6.getText()!=null){
                            int num=Integer.parseInt(r3r6.getText());
                            if(num!=solv[i][j]){
                                //r3r6.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                     else if(i==3 &&j==7){
                        if(r3r7.getText()!=null){
                            int num=Integer.parseInt(r3r7.getText());
                            if(num!=solv[i][j]){
                                //r3r7.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                     else if(i==3 &&j==8){
                        if(r3r8.getText()!=null){
                            int num=Integer.parseInt(r3r8.getText());
                            if(num!=solv[i][j]){
                                //r3r8.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }

                     else if(i==4 &&j==0){
                        if(r4r0.getText()!=null){
                            int num=Integer.parseInt(r4r0.getText());
                            if(num!=solv[i][j]){
                                //r4r0.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                     else if(i==4 &&j==1){
                        if(r4r1.getText()!=null){
                            int num=Integer.parseInt(r4r1.getText());
                            if(num!=solv[i][j]){
                                //r4r1.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                     else if(i==4 &&j==2){
                        if(r4r2.getText()!=null){
                            int num=Integer.parseInt(r4r2.getText());
                            if(num!=solv[i][j]){
                                //r4r2.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                     else if(i==4 &&j==3){
                        if(r4r3.getText()!=null){
                            int num=Integer.parseInt(r4r3.getText());
                            if(num!=solv[i][j]){
                                //r4r3.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                     else if(i==4 &&j==4){
                        if(r4r4.getText()!=null){
                            int num=Integer.parseInt(r4r4.getText());
                            if(num!=solv[i][j]){
                               // r4r4.setTextFill(Color.RED);
                                conflag=2;
                                break;
                            }
                        }
                    }
                     else if(i==4 &&j==5){
                        if(r4r5.getText()!=null){
                            int num=Integer.parseInt(r4r5.getText());
                            if(num!=solv[i][j]){
                                //r4r5.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                     else if(i==4 &&j==6){
                        if(r4r6.getText()!=null){
                            int num=Integer.parseInt(r4r6.getText());
                            if(num!=solv[i][j]){
                                //r4r6.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==4 &&j==7){
                        if(r4r7.getText()!=null){
                            int num=Integer.parseInt(r4r7.getText());
                            if(num!=solv[i][j]){
                                //r4r7.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==4 &&j==8){
                        if(r4r8.getText()!=null){
                            int num=Integer.parseInt(r4r8.getText());
                            if(num!=solv[i][j]){
                                //r4r8.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }

                    else if(i==5 &&j==0){
                        if(r5r0.getText()!=null){
                            int num=Integer.parseInt(r5r0.getText());
                            if(num!=solv[i][j]){
                                //r5r0.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                     else if(i==5 &&j==1){
                        if(r5r1.getText()!=null){
                            int num=Integer.parseInt(r5r1.getText());
                            if(num!=solv[i][j]){
                               // r5r1.setTextFill(Color.RED);
                                conflag=2;
                                break;
                            }
                        }
                    }
                     else if(i==5 &&j==2){
                        if(r5r2.getText()!=null){
                            int num=Integer.parseInt(r5r2.getText());
                            if(num!=solv[i][j]){
                                //r5r2.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                     else if(i==5 &&j==3){
                        if(r5r3.getText()!=null){
                            int num=Integer.parseInt(r5r3.getText());
                            if(num!=solv[i][j]){
                               // r5r3.setTextFill(Color.RED);
                                conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==5 &&j==4){
                        if(r5r4.getText()!=null){
                            int num=Integer.parseInt(r5r4.getText());
                            if(num!=solv[i][j]){
                                //r5r4.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                     else if(i==5 &&j==5){
                        if(r5r5.getText()!=null){
                            int num=Integer.parseInt(r5r5.getText());
                            if(num!=solv[i][j]){
                                //r5r5.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                     else if(i==5 &&j==6){
                        if(r5r6.getText()!=null){
                            int num=Integer.parseInt(r5r6.getText());
                            if(num!=solv[i][j]){
                                //r5r6.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                     else if(i==5 &&j==7){
                        if(r5r7.getText()!=null){
                            int num=Integer.parseInt(r5r7.getText());
                            if(num!=solv[i][j]){
                                //r5r7.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                     else if(i==5 &&j==8){
                        if(r5r8.getText()!=null){
                            int num=Integer.parseInt(r5r8.getText());
                            if(num!=solv[i][j]){
                                //r5r8.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }

                     else if(i==6 &&j==0){
                        if(r6r0.getText()!=null){
                            int num=Integer.parseInt(r6r0.getText());
                            if(num!=solv[i][j]){
                                //r6r0.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==6 &&j==1){
                        if(r6r1.getText()!=null){
                            int num=Integer.parseInt(r6r1.getText());
                            if(num!=solv[i][j]){
                                //r6r1.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==6 &&j==2){
                        if(r6r2.getText()!=null){
                            int num=Integer.parseInt(r6r2.getText());
                            if(num!=solv[i][j]){
                                //r6r2.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==6 &&j==3){
                        if(r6r3.getText()!=null){
                            int num=Integer.parseInt(r6r3.getText());
                            if(num!=solv[i][j]){
                                //r6r3.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==6 &&j==4){
                        if(r6r4.getText()!=null){
                            int num=Integer.parseInt(r6r4.getText());
                            if(num!=solv[i][j]){
                                //r6r4.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==6 &&j==5){
                        if(r6r5.getText()!=null){
                            int num=Integer.parseInt(r6r5.getText());
                            if(num!=solv[i][j]){
                                //r6r5.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==6 &&j==6){
                        if(r6r6.getText()!=null){
                            int num=Integer.parseInt(r6r6.getText());
                            if(num!=solv[i][j]){
                                //r6r6.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==6 &&j==7){
                        if(r6r7.getText()!=null){
                            int num=Integer.parseInt(r6r7.getText());
                            if(num!=solv[i][j]){
                                //r6r7.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==6 &&j==8){
                        if(r6r8.getText()!=null){
                            int num=Integer.parseInt(r6r8.getText());
                            if(num!=solv[i][j]){
                                //r6r8.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }

                    else if(i==7 &&j==0){
                        if(r7r0.getText()!=null){
                            int num=Integer.parseInt(r7r0.getText());
                            if(num!=solv[i][j]){
                               // r7r0.setTextFill(Color.RED);
                                conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==7 &&j==1){
                        if(r7r1.getText()!=null){
                            int num=Integer.parseInt(r7r1.getText());
                            if(num!=solv[i][j]){
                               // r7r1.setTextFill(Color.RED);
                                conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==7 &&j==2){
                        if(r7r2.getText()!=null){
                            int num=Integer.parseInt(r7r2.getText());
                            if(num!=solv[i][j]){
                                //r7r2.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==7 &&j==3){
                        if(r7r3.getText()!=null){
                            int num=Integer.parseInt(r7r3.getText());
                            if(num!=solv[i][j]){
                                //r7r3.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==7 &&j==4){
                        if(r7r4.getText()!=null){
                            int num=Integer.parseInt(r7r4.getText());
                            if(num!=solv[i][j]){
                               // r7r4.setTextFill(Color.RED);
                                conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==7 &&j==5){
                        if(r7r5.getText()!=null){
                            int num=Integer.parseInt(r7r5.getText());
                            if(num!=solv[i][j]){
                                //r7r5.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==7 &&j==6){
                        if(r7r6.getText()!=null){
                            int num=Integer.parseInt(r7r6.getText());
                            if(num!=solv[i][j]){
                                //r7r6.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==7 &&j==7){
                        if(r7r7.getText()!=null){
                            int num=Integer.parseInt(r7r7.getText());
                            if(num!=solv[i][j]){
                                //r7r7.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                     else if(i==7 &&j==8){
                        if(r7r8.getText()!=null){
                            int num=Integer.parseInt(r7r8.getText());
                            if(num!=solv[i][j]){
                                //r7r8.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }


                     else if(i==8 &&j==0){
                        if(r8r0.getText()!=null){
                            int num=Integer.parseInt(r8r0.getText());
                            if(num!=solv[i][j]){
                               // r8r0.setTextFill(Color.RED);
                                conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==8 &&j==1){
                        if(r8r1.getText()!=null){
                            int num=Integer.parseInt(r8r1.getText());
                            if(num!=solv[i][j]){
                                //r8r1.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==8 &&j==2){
                        if(r8r2.getText()!=null){
                            int num=Integer.parseInt(r8r2.getText());
                            if(num!=solv[i][j]){
                                //r8r2.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==8 &&j==3){
                        if(r8r3.getText()!=null){
                            int num=Integer.parseInt(r8r3.getText());
                            if(num!=solv[i][j]){
                                //r8r3.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==8 &&j==4){
                        if(r8r4.getText()!=null){
                            int num=Integer.parseInt(r8r4.getText());
                            if(num!=solv[i][j]){
                                //r8r4.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==8 &&j==5){
                        if(r8r5.getText()!=null){
                            int num=Integer.parseInt(r8r5.getText());
                            if(num!=solv[i][j]){
                                //r8r5.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==8 &&j==6){
                        if(r8r6.getText()!=null){
                            int num=Integer.parseInt(r8r6.getText());
                            if(num!=solv[i][j]){
                                //r8r6.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==8 &&j==7){
                        if(r8r7.getText()!=null){
                            int num=Integer.parseInt(r8r7.getText());
                            if(num!=solv[i][j]){
                                //r8r7.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }
                    else if(i==8 &&j==8){
                        if(r8r8.getText()!=null){
                            int num=Integer.parseInt(r8r8.getText());
                            if(num!=solv[i][j]){
                                //r8r8.setTextFill(Color.RED);
                                 conflag=2;
                                break;
                            }
                        }
                    }






                }
            }
            
           
            if(conflag==1){
                
                 main.getString1(time.getText());
                 
                 System.out.println(time.getText());
                 //System.out.println(main.timep);
                 timer.cancel();
                  main.congrat(); 
                 
            }
            }
            
    }
            
        }



   

    
    

