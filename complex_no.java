//Static method can call only static members. It cannot call non-static members.Non static method can call both members.
//static variable is a class variable it kis not stored in objevt memory area rather it is stored outside the object memory area it is commom 
public class complex_no {
    class complex{
        int r;
        int i;

        void set(int x,int y){
            r=x;
            i=y;
        }

        void add(complex ob1,complex ob2){
            int p = ob1.r + ob2.r;
            int q = ob1.i + ob2.i;
            System.out.println(p+ "+i" +q);
        }
    }
            
        public static void main(String[] args) {
            complex_no cq = new complex_no();
            complex c1 = cq.new complex();
            complex c2 = cq.new complex();
            complex c3 = cq.new complex();

            c1.set(5,6);
            c2.set(10,15);
            c3.add(c1,c2);
            
        }
    
    
}
