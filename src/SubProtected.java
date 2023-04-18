public class SubProtected extends ProtectedModifiers {
        public void protectedMethod() {
        protectedValue = "SubProtected!";
        System.out.println("Well! You have access to " + protectedValue);
    }
}
