// Setup function runs once
void setup() {
  // Start serial communication at 9600 baud rate
  Serial.begin(9600);

  // Wait for serial monitor to open (optional but useful)
  while (!Serial) {
    ; // wait for serial port to connect
  }

  // Print welcome message
  Serial.println("Enter something:");
}

// Loop function runs continuously
void loop() {
  // Check if data is available to read
  if (Serial.available() > 0) {
    // Read the incoming string until newline
    String input = Serial.readStringUntil('\n');

    // Print the received input
    Serial.print("You entered: ");
    Serial.println(input);
  }
}
