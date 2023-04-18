public class SubProtected extends ProtectedModifiers {
        public void protectedMethod() {
        protectedValue = "Protected access!";
        System.out.println("Well! You have access to " + protectedValue);
    }
}
