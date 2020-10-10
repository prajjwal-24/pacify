package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.File;
import java.util.ResourceBundle;
import java.net.URL;

public class LoginController implements Initializable {

    @FXML
    private Button cancelButton;
    @FXML
    private Label loginMessageLabel;
    @FXML
    private ImageView brandingImageView;
    @FXML
    private ImageView lockImageView;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField enterPasswordField;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File brandingFile=new File("images/myPoster.png");
        Image brandingImage=new Image(brandingFile.toURI().toString());
        brandingImageView.setImage(brandingImage);

        File lockFile=new File("images/Capture.PNG");
        Image lockImage=new Image(lockFile.toURI().toString());
        lockImageView.setImage(lockImage);

    }
    public void loginButtonOnAction(ActionEvent event){
if(usernameTextField.getText().isBlank()==false && enterPasswordField.getText().isBlank()==false){
  validateLogin();
}
else
{
    loginMessageLabel.setText("Please enter both Username and Password");

}
    }

     public void cancelButtonOnAction(ActionEvent event){
         Stage stage=(Stage) cancelButton.getScene().getWindow();
                 stage.close();
     }
     public void validateLogin(){
         loginMessageLabel.setText("Pleas");

     }
}
