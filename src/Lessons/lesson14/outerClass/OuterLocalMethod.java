package Lessons.lesson14.outerClass;

public class OuterLocalMethod {

    void my_Method(){
        int num = 888;

        class MethodInner_Demo {
            //локальный метод внутреннего класса
            void print(){
                System.out.println("Это метод внутреннего класса " + num);
            }
        }
        MethodInner_Demo methodInner_demo = new MethodInner_Demo();
        methodInner_demo.print();
    }
}
