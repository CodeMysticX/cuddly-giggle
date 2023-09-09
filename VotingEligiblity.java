import java.awt.*;
import java.awt.event.*;

import javax.swing.plaf.basic.BasicScrollBarUI;

public class VotingEligiblity extends Frame implements ActionListener{
    private Label namelabel, agelabel, genderlabel;
    private TextField nameTextField, ageTextField;
    private CheckboxGroup genderCheckboxGroup;
    private Button checkbutton;
    public VotingEligiblity(){
        setTitle("Eligible for voting");
        setSize(500,500);
        setResizable(true);
        setLayout(new FlowLayout(){
            
        } );
        
        namelabel = new Label("Name:");
        add(namelabel);

        nameTextField = new TextField(20);
        add(nameTextField);

        genderlabel = new Label("Gender:");
        add(genderlabel);

        genderCheckboxGroup = new CheckboxGroup();
        Checkbox maleCheckbox = new Checkbox("Male",genderCheckboxGroup,false);
        Checkbox femaleCheckbox = new Checkbox("Female", genderCheckboxGroup, false);
        add(maleCheckbox);
        add(femaleCheckbox);

        agelabel = new Label("Age:");
        add(agelabel);

        ageTextField = new TextField(5 );
        add(ageTextField);

        checkbutton = new Button("Check Eligibility");
        checkbutton.addActionListener(this);
        add(checkbutton);

        addWindowListener(new WindowAdapter(){
         public void windowClosing(WindowEvent event){
             dispose();
         }
        });
        setVisible(true);
    }
    public void actionPerformed(ActionEvent event){
       String name = nameTextField.getText();
       String gender = genderCheckboxGroup.getSelectedCheckbox().getLabel();
       int age = Integer.parseInt(ageTextField.getText());

       String salutations = (gender.equals("Male"))? "Mr." : "Ms.";

       if (age >= 18) {
        System.out.println("Valid!");
        System.out.println("Name: " + salutations + " " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    } else {
        System.out.println("Not eligible to vote!");
    }
    } 
    public static void main(String[] args) {
        VotingEligiblity eligibilityChecker = new VotingEligiblity();
    }
}