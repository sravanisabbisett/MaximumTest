package maximum;


public class Maximum<T extends Comparable<T>>{
    T x,y,z;
    public Maximum(T x,T y,T z){
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public T maximum(){
        return Maximum.checkMaximum(x,y,z);
    }

    public static <T extends Comparable<T>> T checkMaximum(T x,T y,T z){
       T maximum=x;
       if(y.compareTo(maximum)>0){
           maximum=y;
       }
       if(z.compareTo(maximum)>0){
           maximum=z;
       }
       return maximum;
    }

}
