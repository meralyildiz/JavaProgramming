package utilities;

import day40_FinalKeyword.ProtectedAccessModifiers;

public class AccessModifiers_Test4 extends ProtectedAccessModifiers {
    public static void main(String[] args) {
        // System.out.println(AccessModifiers_Test4.name1); ///default is not visible outside the package
        System.out.println(AccessModifiers_Test4.name2);

        AccessModifiers_Test4.method2();
        // AccessModifiers_Test4.method1();// default method is not visible outside the package

    }
}
