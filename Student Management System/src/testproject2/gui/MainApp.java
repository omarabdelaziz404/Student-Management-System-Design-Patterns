package testproject2.gui;

import testproject2.factory.*;
import testproject2.singleton.*;
import testproject2.strategy.*;
import testproject2.observer.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainApp extends JFrame {

    private JTextArea outputArea;

    public MainApp() {
        setTitle("Student Management System");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JTabbedPane tabbedPane = new JTabbedPane();

        tabbedPane.add("Students", createStudentPanel());
        tabbedPane.add("Courses", createCoursePanel());
        tabbedPane.add("Grades", createGradesPanel());
        tabbedPane.add("Timetables", createTimetablePanel());

        add(tabbedPane);
    }

    private JPanel createStudentPanel() {
        JPanel panel = new JPanel(new BorderLayout());

        JTextField idField = new JTextField(10);
        JTextField nameField = new JTextField(10);
        JButton addButton = new JButton("Add Student");
        JTextArea studentOutput = new JTextArea(10, 40);
        studentOutput.setEditable(false);

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("ID:"));
        inputPanel.add(idField);
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(addButton);

        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(new JScrollPane(studentOutput), BorderLayout.CENTER);

        addButton.addActionListener(e -> {
            String id = idField.getText();
            String name = nameField.getText();
            Student student = StudentFactory.createStudent("undergraduate", id, name);
            studentOutput.append("Added Student: " + student.getName() + " (ID: " + student.getId() + ")\n");
        });

        return panel;
    }

    private JPanel createCoursePanel() {
        JPanel panel = new JPanel(new BorderLayout());

        JTextField codeField = new JTextField(10);
        JTextField titleField = new JTextField(10);
        JButton addButton = new JButton("Add Course");
        JTextArea courseOutput = new JTextArea(10, 40);
        courseOutput.setEditable(false);

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Code:"));
        inputPanel.add(codeField);
        inputPanel.add(new JLabel("Title:"));
        inputPanel.add(titleField);
        inputPanel.add(addButton);

        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(new JScrollPane(courseOutput), BorderLayout.CENTER);

        addButton.addActionListener(e -> {
            String code = codeField.getText();
            String title = titleField.getText();
            Course course = CourseFactory.createCourse("core", code, title);
            CourseRegistrationManager.getInstance().registerCourse(title);
            courseOutput.append("Registered Course: " + course.getTitle() + " (Code: " + course.getCode() + ")\n");
        });

        return panel;
    }

    private JPanel createGradesPanel() {
        JPanel panel = new JPanel(new BorderLayout());

        JTextField nameField = new JTextField(10);
        JTextField scoreField = new JTextField(5);
        JButton submitButton = new JButton("Submit Grade");
        JTextArea gradeOutput = new JTextArea(10, 40);
        gradeOutput.setEditable(false);

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Student Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Score:"));
        inputPanel.add(scoreField);
        inputPanel.add(submitButton);

        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(new JScrollPane(gradeOutput), BorderLayout.CENTER);

        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            int score = Integer.parseInt(scoreField.getText());

            StudentObserver observer = new StudentObserver(name);
            GradeNotifier notifier = new GradeNotifier();
            notifier.registerObserver(observer);
            notifier.gradeUpdated(name, score);

            GradeContext context = new GradeContext(new GpaStrategy());
            String gpaGrade = context.executeStrategy(score);
            context.setStrategy(new PassFailStrategy());
            String passFail = context.executeStrategy(score);

            gradeOutput.append("Grades for " + name + ": GPA=" + gpaGrade + ", Pass/Fail=" + passFail + "\n");
        });

        return panel;
    }

    private JPanel createTimetablePanel() {
        JPanel panel = new JPanel(new BorderLayout());

        JTextArea timetableArea = new JTextArea(15, 50);
        timetableArea.setText("Sample Timetable:\n\nMonday: Java Programming\nTuesday: Data Structures\nWednesday: Algorithms\nThursday: DBMS\nFriday: Software Engineering");
        timetableArea.setEditable(false);

        panel.add(new JScrollPane(timetableArea), BorderLayout.CENTER);

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainApp().setVisible(true));
    }
}
