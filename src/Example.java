package src;

public class Example {
    interface Example2
    {
        void display();
    }
    public class Test3 {
        public static void main(String[] args) {

            Example2 ex=new Example2()
            {
                @Override
                public void display() {
                    System.out.println("Overrided");
                }
            };
            ex.display();
        }
    }

}
