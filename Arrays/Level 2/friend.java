import java.until.scanner
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
FRIENDS = ["Amar", "Akbar", "Anthony"]
NUM_FRIENDS = len(FRIENDS)

# Arrays to store friend data
ages = []
heights = []

# Taking input from the user
for friend in FRIENDS:
    print(f"Enter details for {friend}:")
    age = get_valid_input("Enter age: ", 1)
    height = get_valid_input("Enter height (in cm): ", 1)
    
    ages.append(age)
    heights.append(height)

# Finding the youngest friend
youngest_index = ages.index(min(ages))
youngest_friend = FRIENDS[youngest_index]

# Finding the tallest friend
tallest_index = heights.index(max(heights))
tallest_friend = FRIENDS[tallest_index]

# Displaying results
print("\nResults:")
print(f"The youngest friend is {youngest_friend} with {ages[youngest_index]} years.")
print(f"The tallest friend is {tallest_friend} with {heights[tallest_index]} cm height.")
