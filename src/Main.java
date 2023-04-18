public class Main {
    public static void main(String[] args) { // Получаем доступ к разным тягам

        // 1 - Public
        PublicModifiers Modifiers_1 = new PublicModifiers();
        Modifiers_1.publicValue = "Public access!";

        Modifiers_1.publicMethod();

        // 2 - Protected
        ProtectedModifiers Modifiers_2 = new ProtectedModifiers();
        Modifiers_2.protectedValue = "Protected access!";
        Modifiers_2.protectedMethod();

        // 2 - SubProtected
        SubProtected Modifiers_2_1 = new SubProtected();
        Modifiers_2_1.protectedMethod();

        // 3 - Private
        PrivateModifiers Modifiers_3 = new PrivateModifiers();
        Modifiers_3.PrivateMethod();

        // 4 - Default
        DefaultModifiers Modifiers_4 = new DefaultModifiers();
        Modifiers_4.defaultValue = "Default access!";
        Modifiers_4.defaultMethod();

        // 4 - SubDefault
        SubDefault Modifiers_4_1 = new SubDefault();
        Modifiers_4_1.defaultMethod();
    }
}