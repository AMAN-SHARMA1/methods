public class MethodDemo {
    public static void main(String[] args) {
        System.out.println("method demo");
        /*
        creating object to call method , as display is in this class but
        it is non satic method so will be called by object
         */
        MethodDemo object = new MethodDemo();
        //calling a method
        object.display();
        System.out.println("exiting...");

    }

    /*
    declaring and defining out method display
     */
    public void display() {
        System.out.println("hello world");
    }
}
