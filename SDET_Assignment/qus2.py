import math

class CircleComp:
    def __init__(self, radius):
        self.radius = radius
        self.diameter = 0.0
        self.circumference = 0.0
        self.area = 0.0

    def calculate_properties(self):
        # Calculate diameter, circumference, and area
        self.diameter = 2.0 * self.radius
        self.circumference = 2.0 * math.pi * self.radius
        self.area = math.pi * self.radius * self.diameter

    def display_results(self):
        # Display results
        print(f"Diameter: {self.diameter}")
        print(f"Circumference: {self.circumference}")
        print(f"Area: {self.area}")

if __name__ == "__main__":
    # Read radius from the user
    radius = float(input("Enter the radius of the circle: "))

    # Create CircleComp object
    circle = CircleComp(radius)

    # Calculate properties of the circle
    circle.calculate_properties()

    # Display results
    circle.display_results()
