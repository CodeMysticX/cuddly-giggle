import java.awt.*;
import java.awt.event.*;

public class SimpleGUIWindow extends Frame implements ActionListener {
    private Label namelabel, genderlabel, fatherlabel, motherlabel, courselabel, semesterlabel, sectionlabel, rolllabel;
    private TextField namTextField, fatherTextField, motherTextField, couresTextField, semesterTextField, rolTextField;
    private CheckboxGroup genderCheckboxGroup, sectionCheckboxGroup;
    private Button loginbButton;

    public SimpleGUIWindow() {
        setTitle("Simple GUI Window");
        setSize(500, 1000);
        setResizable(true);
        setLayout(new FlowLayout());

        namelabel = new Label("Name : ");
        add(namelabel);

        namTextField = new TextField(20);
        add(namTextField);

        genderlabel = new Label("Gender : ");
        add(genderlabel);

        genderCheckboxGroup = new CheckboxGroup();
        Checkbox maleCheckbox = new Checkbox("Male", genderCheckboxGroup, false);
        Checkbox femaleCheckbox = new Checkbox("Female", genderCheckboxGroup, false);
        add(maleCheckbox);
        add(femaleCheckbox);

        fatherlabel = new Label("Father Name : ");
        add(fatherlabel);

        fatherTextField = new TextField(20);
        add(fatherTextField);

        motherlabel = new Label("Mother Name : ");
        add(motherlabel);

        motherTextField = new TextField(20);
        add(motherTextField);

        courselabel = new Label("Course : ");
        add(courselabel);

        couresTextField = new TextField(20);
        add(couresTextField);

        semesterlabel = new Label("Semester : ");
        add(semesterlabel);

        semesterTextField = new TextField(20);
        add(semesterTextField);

        sectionlabel = new Label("Section : ");
        add(sectionlabel);

        sectionCheckboxGroup = new CheckboxGroup();
        Checkbox aCheckbox = new Checkbox("A", sectionCheckboxGroup, false);
        Checkbox bCheckbox = new Checkbox("B", sectionCheckboxGroup, false);
        Checkbox cCheckbox = new Checkbox("C", sectionCheckboxGroup, false);
        Checkbox dCheckbox = new Checkbox("D", sectionCheckboxGroup, false);
        Checkbox eCheckbox = new Checkbox("E", sectionCheckboxGroup, false);
        Checkbox fCheckbox = new Checkbox("F", sectionCheckboxGroup, false);
        Checkbox gCheckbox = new Checkbox("G", sectionCheckboxGroup, false);
        Checkbox hCheckbox = new Checkbox("H", sectionCheckboxGroup, false);
        Checkbox iCheckbox = new Checkbox("I", sectionCheckboxGroup, false);
        Checkbox jCheckbox = new Checkbox("J", sectionCheckboxGroup, false);
        Checkbox kCheckbox = new Checkbox("K", sectionCheckboxGroup, false);
        Checkbox lCheckbox = new Checkbox("L", sectionCheckboxGroup, false);
        Checkbox mCheckbox = new Checkbox("M", sectionCheckboxGroup, false);
        Checkbox nCheckbox = new Checkbox("N", sectionCheckboxGroup, false);
        Checkbox oCheckbox = new Checkbox("O", sectionCheckboxGroup, false);
        Checkbox pCheckbox = new Checkbox("P", sectionCheckboxGroup, false);
        Checkbox qCheckbox = new Checkbox("Q", sectionCheckboxGroup, false);
        Checkbox rCheckbox = new Checkbox("R", sectionCheckboxGroup, false);
        Checkbox sCheckbox = new Checkbox("S", sectionCheckboxGroup, false);
        Checkbox tCheckbox = new Checkbox("T", sectionCheckboxGroup, false);
        add(aCheckbox);
        add(bCheckbox);
        add(cCheckbox);
        add(dCheckbox);
        add(eCheckbox);
        add(fCheckbox);
        add(gCheckbox);
        add(hCheckbox);
        add(iCheckbox);
        add(jCheckbox);
        add(kCheckbox);
        add(lCheckbox);
        add(mCheckbox);
        add(nCheckbox);
        add(oCheckbox);
        add(pCheckbox);
        add(qCheckbox);
        add(rCheckbox);
        add(sCheckbox);
        add(tCheckbox);

        rolllabel = new Label("Roll Number : ");
        add(rolllabel);

        rolTextField = new TextField(10);
        add(rolTextField);

        loginbButton = new Button("Login");
        loginbButton.addActionListener(this);
        add(loginbButton);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                dispose();
            }
        });
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        String name = namTextField.getText();
        String gender = "";
        if (genderCheckboxGroup.getSelectedCheckbox() != null) {
            gender = genderCheckboxGroup.getSelectedCheckbox().getLabel();
        }
        String father = fatherTextField.getText();
        String mother = motherTextField.getText();
        String course = couresTextField.getText();
        int semester = 0;
        try {
            semester = Integer.parseInt(semesterTextField.getText());
        } catch (NumberFormatException e) {
            System.out.println("Invalid semester value. Please enter a valid integer.");
            return;
        }
        String section = "";
        if (sectionCheckboxGroup.getSelectedCheckbox() != null) {
            section = sectionCheckboxGroup.getSelectedCheckbox().getLabel();
        }
        int roll = 0;
        try {
            roll = Integer.parseInt(rolTextField.getText());
        } catch (NumberFormatException e) {
            System.out.println("Invalid roll number value. Please enter a valid integer.");
            return;
        }

        String salutation = (gender.equals("Male")) ? "Mr." : "Ms.";

        System.out.println("Valid!");
        System.out.println("Name: " + salutation + " " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Father Name: " + father);
        System.out.println("Mother Name: " + mother);
        System.out.println("Course: " + course);
        System.out.println("Semester: " + semester);
        System.out.println("Section: " + section);
        System.out.println("Roll Number: " + roll);

    }

    public static void main(String[] args) {
        SimpleGUIWindow s = new SimpleGUIWindow();
    }
}
