public class SubProtected extends ProtectedModifiers {
        public void protectedMethod() {
        protectedValue = "Защищенные тяги в подклассе!";
        System.out.println("Отлично! Ты получил доступ к " + protectedValue);
    }
}
