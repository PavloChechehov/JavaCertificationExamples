package ocp.chapter3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class A{}
class B extends A{}
class C extends B {}
public class GenericsTest {
    public static void main(String[] args) {
        //1
        List<?> list1 = new ArrayList<A>();

        //2
        List<? extends A> list2 = new ArrayList<A>();
//        tries to store a list in a variable declaration with an upper-bounded wildcard.
//        This is OK. You can have ArrayList<A>, ArrayList<B>, or ArrayList<C> stored in that
//        reference.
//        List<? extends A> list2 = new ArrayList<B>();
//        List<? extends A> list2 = new ArrayList<C>();

        //3
        List<? super A> list3 = new ArrayList<A>();
//        Can be A, and Object in the right side
//        List<? super A> list3 = new ArrayList<Object>();

        //4
//        List<? extends B> list4 = new ArrayList<A>(); // DOES NOT COMPILE

        //5
        List<? super B> list5 = new ArrayList<A>();

        //6
//        List<?> list6 = new ArrayList<? extends A>(); // DOES NOT COMPILE


        //next exercise
        Generic<String> stringGeneric = new Generic<>();
        String s = Generic.method1(Arrays.asList("asda", "asd", "asda"));
        System.out.println("s = " + s);

    }
}

class Generic<T> {
    //1
    static <T> T method1(List<? extends T> list) {
        return list.get(0);
    }

    //2 DOES NOT COMPILE
    /*
    <T> <? extends T> method2(List<? extends T> list) {
        return list.get(0);
    }*/

    //3 DOES NOT COMPILE
    /*<B extends A> B method3(List<B> list) {
        return new B();
    }*/


//    <X> void method5(List<X super B> list) { // DOES NOT COMPILE
//    }
}
