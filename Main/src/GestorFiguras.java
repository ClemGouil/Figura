import java.util.Arrays;
import java.util.stream.Stream;

public class GestorFiguras {

    public static final double suma(Figura[] l){
        double sum=0;
        for(Figura f: l){
            sum=sum + f.area();
        }
       return sum;
    }

    public static final void sort(Figura[] l){
        Arrays.sort(l);
    }

    public static final void print(Figura[] l){
        int Id=0;
        for(Figura f: l){
            System.out.println(f.toString() + "  Area = " + f.area());
        }
        System.out.println("\n");
    }


    public static void main(String[] args) {
        Figura[] v = new Figura[4];

        v[0] = new Rectangle(5,3);
        v[1] = new Cercle(5);
        v[2] = new Quadrat(5);
        v[3] = new Cercle(12);

        double res = suma(v);

        System.out.println("suma: "+res);

        print(v);

        sort(v);

        print(v);

    }
}
