#define in2 8
#define vcc 9
void setup() {
  pinMode(in2, OUTPUT);
  pinMode(vcc, OUTPUT);
}
void loop() {
  digitalWrite(vcc, HIGH);
  digitalWrite(in2, LOW);
  delay(1000);
  digitalWrite(in2, HIGH);
  delay(100);
}
