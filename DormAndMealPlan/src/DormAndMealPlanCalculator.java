package dormandmealplan;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DormAndMealPlanCalculator extends JFrame {
	// ComboBox to hold the names of the dormitories
	private JComboBox<String> comboBoxDorms;

	// ComboBox to hold the names of the meal plans
	private JComboBox<String> comboBoxMeals;

	// Button to calculate the total cost
	private JButton buttonCalculate;

	// Label to display the total cost
	private JLabel labelTotalCost;

	// The cost of the selected dormitory
	private int dormCost;

	// The cost of the selected meal plan
	private int mealCost;

	public DormAndMealPlanCalculator() {
		// Set the title and layout of the JFrame
		setTitle("Dorm and Meal Plan Calculator");
		setLayout(new FlowLayout());

		// Create the ComboBoxes and add them to the JFrame
		comboBoxDorms = new JComboBox<>();
		comboBoxDorms.addItem("Allen Hall: $1,800 per semester");
		comboBoxDorms.addItem("Pike Hall: $2,200 per semester");
		comboBoxDorms.addItem("Farthing Hall: $2,800 per semester");
		comboBoxDorms.addItem("University Suites: $3,000 per semester");
		add(comboBoxDorms);

		comboBoxMeals = new JComboBox<>();
		comboBoxMeals.addItem("7 meals per week: $600 per semester");
		comboBoxMeals.addItem("14 meals per week: $1,100 per semester");
		comboBoxMeals.addItem("Unlimited meals: $1,800 per semester");
		add(comboBoxMeals);

		// Create the Calculate button and add it to the JFrame
		buttonCalculate = new JButton("Calculate");
		add(buttonCalculate);

		// Create the label to display the total cost and add it to the JFrame
		labelTotalCost = new JLabel("Total cost for the semester: ");
		add(labelTotalCost);

		// Add an action listener to the Calculate button
		buttonCalculate.addActionListener(new CalculateButtonListener());

		// Set the size and visibility of the JFrame
		setSize(400, 150);
		setVisible(true);
	}

	// This class represents the action listener for the Calculate button
	class CalculateButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// Get the selected dormitory and meal plan
			String selectedDorm = comboBoxDorms.getSelectedItem().toString();
			String selectedMealPlan = comboBoxMeals.getSelectedItem().toString();

			// Extract the cost of the dormitory and meal plan from the strings
			dormCost = Integer.parseInt(selectedDorm.split(":")[1].replaceAll("[^0-9]", ""));
			mealCost = Integer.parseInt(selectedMealPlan.split(":")[1].replaceAll("[^0-9]", ""));
			// Calculate the total cost
			int totalCost = dormCost + mealCost;

			// Update the total cost label with the calculated total cost
			labelTotalCost.setText("Total cost for the semester: $" + totalCost);
		}
	}

	public static void main(String[] args) {
		// Create a new instance of the DormAndMealPlanCalculator class
		new DormAndMealPlanCalculator();
	}
}
