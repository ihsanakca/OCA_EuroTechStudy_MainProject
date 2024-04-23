package ch5.casting;

public class Otherclass {
    public static void main(String[] args) {
        String str = "Ali";
        System.out.println(str.substring(0, 2));

        Object strObject = str;
        System.out.println(strObject);
     //   strObject.substring(0, 1);   //compile error
//        // Bu durumda sub classın özelliklerine (field ve method) erişim yapamayız.
//
        String str2 = (String) strObject;
       System.out.println(str2.substring(0, 2));

        /**
            We can summarize this principle with the following two rules:
         1. The type of the object determines which properties exist within the object in memory.
         2. The type of the reference to the object determines which methods and variables are
         accessible to the Java program.
            It therefore follows that successfully changing a reference of an object to a new reference
         type may give you access to new properties of the object, but those properties existed before
         the reference change occurred.

         Here are some basic rules to keep in mind when casting variables:
         1. Casting an object from a subclass to a superclass doesn’t require an explicit cast.
         2. Casting an object from a superclass to a subclass requires an explicit cast.
         3. The compiler will not allow casts to unrelated types.
         4. Even when the code compiles without issue, an exception may be thrown at runtime if
         the object being cast is not actually an instance of that class.
         */


    }
}
