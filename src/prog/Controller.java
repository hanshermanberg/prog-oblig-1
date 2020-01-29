package prog;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;



public class Controller {


    @FXML
    private TextField txtalder;

    @FXML
    private TextField txtnavn;

    @FXML
    private TextField txtDag;

    @FXML
    private TextField txtMåned;

    @FXML
    private TextField txtÅr;

    @FXML
    private Button registrerButton;

    @FXML
    private Label lblFeilmelding;

    @FXML
    private TextArea registerFelt;


    @FXML
    void leggTil(ActionEvent event) {
       Personregister personregister=new Personregister();
        int alder=0;
        int dag=0;
        int år=0;
        int måned=0;
        String navn=txtnavn.getText();
        try{
            alder=Integer.parseInt(txtalder.getText());
        } catch(InvalidAgeException e){
            System.err.println("Ugyldig alder");
        }
        try{
            dag=Integer.parseInt(txtDag.getText());
        }
        catch (InvalidDateException e){
            System.err.println("Ugyldig dag i måned");
        }
        try{
            år=Integer.parseInt(txtÅr.getText());
        } catch (InvalidDateException e){
            System.err.println("Ugyldig år");
        }
        try{
            måned=Integer.parseInt(txtMåned.getText());
        } catch (InvalidDateException e){
            System.err.println("Ugyldig måned");
        }
        Dato fødselsdato=new Dato(dag,måned,år);
        Person enPerson=new Person(navn,alder,fødselsdato);
        personregister.leggTil(enPerson);
        registerFelt.setText(personregister.toString());




        }
    }