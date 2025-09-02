def get_valid_input(prompt, min_value=0):
    while True:
        try:
            value = float(input(prompt))
            if value < min_value:
                print(f"Invalid input! Please enter a value greater than or equal to {min_value}.")
            else:
                return value
        except ValueError:
            print("Invalid input! Please enter a valid number.")

# Constants
NUM_EMPLOYEES = 10
BONUS_THRESHOLD = 5  # Years of service for higher bonus
HIGH_BONUS_RATE = 0.05
LOW_BONUS_RATE = 0.02

# Arrays to store employee data
salaries = []
years_of_service = []
bonuses = []
new_salaries = []

# Variables to store total amounts
total_old_salary = 0
total_bonus = 0
total_new_salary = 0

# Taking input from the user
for i in range(NUM_EMPLOYEES):
    print(f"Enter details for Employee {i+1}:")
    salary = get_valid_input("Enter salary: ", 1)
    years = get_valid_input("Enter years of service: ", 0)
    
    salaries.append(salary)
    years_of_service.append(years)

# Calculating bonuses and new salaries
for i in range(NUM_EMPLOYEES):
    bonus_rate = HIGH_BONUS_RATE if years_of_service[i] > BONUS_THRESHOLD else LOW_BONUS_RATE
    bonus = salaries[i] * bonus_rate
    new_salary = salaries[i] + bonus
    
    bonuses.append(bonus)
    new_salaries.append(new_salary)
    
    total_old_salary += salaries[i]
    total_bonus += bonus
    total_new_salary += new_salary

# Displaying results
print("\nSalary Details:")
print("Employee | Old Salary | Years of Service | Bonus | New Salary")
for i in range(NUM_EMPLOYEES):
    print(f"{i+1:<8} | {salaries[i]:<10.2f} | {years_of_service[i]:<15} | {bonuses[i]:<6.2f} | {new_salaries[i]:<10.2f}")

print("\nTotal Old Salary: ", total_old_salary)
print("Total Bonus Payout: ", total_bonus)
print("Total New Salary: ", total_new_salary)
