public class PrivateModifiers {
    private String privateValue;

    private void privateMethod() {
            System.out.println("Отлично! Ты получил доступ к " + privateValue);
        }

        public void PrivateMethod() {
            privateValue = "Приватные тяги!";
            privateMethod();
        }
}
