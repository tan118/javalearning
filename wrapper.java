// primitive to wrapper class
public class wrapper {
    public static void main(String[] args){

        Integer a=10;
        Double b=5.66;
        Integer c=Integer.valueOf(a);
        Double d=Double.valueOf(a);
        if(c instanceof Integer && d instanceof Double){
            System.out.println("an object of instance class is created");
    
        }
    }
    
    
    
}
// wrapper to primittive
class wrapper1{
    public static void main(String[] args){
        double d=56.32;
        double d1=37.29;
        double d3=Math.toRadians(d1);
        System.out.println("max no of d and d1 is"+Math.max(d,d1));
        System.out.println("max no of d and d1 is"+Math.sqrt(d1));
        System.out.println("max no of d and d1 is"+Math.pow(d,d1));
        System.out.println("max no of d and d1 is"+Math.log(d));
        System.out.println("max no of d and d1 is"+Math.log10(d));
        System.out.println("max no of d and d1 is"+Math.exp(d1));
        System.out.println("max no of d and d1 is"+Math.sin(d3));
        System.out.println("max no of d and d1 is"+Math.cos(d3));

    }
}
