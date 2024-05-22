public class Throws {
    public void method1() {
        int[] array6 = new int[]{1, 2, 3};
        try {
            System.out.println("This is method1");
            System.out.println(array6[5]);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void callMethod1() {
        System.out.println("This is callMethod1");
        method1();
    }

    public void method2() throws Exception{
        int[] array6 = new int[]{1, 2, 3};
        System.out.println("This is method2");
        System.out.println(array6[5]);
    }

    public void callMethod2()  {
        System.out.println("This is callMethod2");
        try {
            method2();
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
    public void method3() throws Exception{
        int[] array6 = new int[]{1, 2, 3};
        System.out.println("This is method3");
        System.out.println(array6[5]);
    }

    public void callMethod3() throws Exception {
        System.out.println("This is callMethod3");
            method3();
    }
public void callCallMethod3(){
        try {
            System.out.println("This is calling the method callMethod3");
            callMethod3();
        }catch (Exception e){
            System.out.println(e.toString());
        }
}
}


