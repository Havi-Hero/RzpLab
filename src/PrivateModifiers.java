public class PrivateModifiers {
    private String privateValue;

    private void privateMethod() {
            System.out.println("Well! You have access to " + privateValue);
        }

        public void PrivateMethod() {
            privateValue = "Private access!";
            privateMethod();
        }
}
