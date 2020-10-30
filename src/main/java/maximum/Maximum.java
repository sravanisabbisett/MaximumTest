package maximum;


import java.util.Arrays;

public class Maximum<E extends Comparable<E>>{
    E element1,element2,element3;
    public Maximum(E element1,E element2,E element3){
        this.element1=element1;
        this.element2=element2;
        this.element3=element3;
    }

    public E maximum(){
        return Maximum.checkMaximum(element1,element2,element3);
    }

    public static <E extends Comparable<E>> E checkMaximum(E element1,E element2,E element3){
       E maximum=element1;
       if(element2.compareTo(maximum)>0){
           maximum=element2;
       }
       if(element3.compareTo(maximum)>0){
           maximum=element3;
       }
       printMaximum(element1,element2,element3,maximum);
       return maximum;
    }

    public static <E extends Comparable> E moreThan_ThreeParameters(E ...elements){
        Arrays.sort(elements);
        return elements[elements.length-1];
    }

    public static <T> void printMaximum(T element1,T element2 ,T element3,T maximum){
        System.out.printf("Maximum of %s ,%s and %s is %s\n",element1,element2,element3,maximum);
    }

}
