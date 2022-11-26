public class Tp_btm {
    
    public Tp_btm() {

    }
    public static boolean premier(int val){
        int i,cpt=0;
        for (i= 1;i<=val ;i++){
            if(val%i==0)
                cpt+=1;
        }if (cpt==2) {
            return true;
        }else 
            return false;
    }
    public static int nbPresencePremiers(int T []){
        int i,nombre=0;
        for(i=0;i<T.length;i++){
           if(premier(T[i]))
                nombre+=1;
        }
        if(nombre != 0)
            return nombre;
        else
            return -1;
    }
    public static boolean parfait(int val){
        int i,cpt=0;
        for (i= 1;i<val ;i++){
            if(val%i==0)
                cpt+=i;
        }
        return cpt==val;
    }
    public static int nbPresenceParfaits(int T []){
        int i,j,cpt=0,nombre=0;
        for(i=0;i<T.length;i++){
            if(parfait(T[i]))
                nombre+=1;
        }
        if(nombre != 0)
            return nombre;
        else
            return -1;
    }
    public static void triCroissant(int T []) {
        int i,j,svg=0;
        System.out.println("Avant");
        for(i=0;i<T.length;i++)
            System.out.println(T[i]+" ");
        for(i=0;i<T.length;i++){
            for(j=0;j<T.length;j++){
                if(T[j]>T[i])
                    svg = T[i];
                    T[i] = T[j];
                    T[j] = svg;
            }
        }
        System.out.println("Apres");
        for(i=0;i<T.length;i++)
            System.out.println(T[i]+" ");
    }
    public static void triDecroissant(int T []) {
        int i,j,svg=0;
        System.out.println("Avant");
        for(i=0;i<T.length;i++)
            System.out.println(T[i]+" ");
        for(i=0;i<T.length;i++){
            for(j=0;j<T.length;j++){
                if(T[j]<T[i])
                    svg = T[i];
                    T[i] = T[j];
                    T[j] = svg;
            }
        }
        System.out.println("Apres");
        for(i=0;i<T.length;i++)
            System.out.print(T[i]+" ");
    }
    public static int nombreDePresenceValeur(int T [],int val) {
        int i,nbre=0;
        for(i=0;i<T.length;i++){
            if(T[i]==val)
                nbre+=1;
        }
        if(nbre!=0)
            return nbre;
        else
            return 0;
    }
    public static void matPrenoms(String mat[][]) {
        int i,j;
        String str;
        for(i=0;i<2;i++){
            for(j=0;j<2;j++){
                str = mat[i][j];
                System.out.print(" "+mat[i][j]+" "+str.length()+"");
            }
        }
    }

    public static void main(String[] args) {
    boolean ok = premier(8);
    System.out.println(ok);
    int[] t = {1,2,4,6,8,28,0};
    int Taille = t.length;
    int c1 = nbPresencePremiers(t);
    System.out.println(c1);
    int c2=nbPresenceParfaits(t);
    System.out.println(c2);
    int c3 = nombreDePresenceValeur(t, 2);
    System.out.println(c3);
    String m[][] = {{"hjdfgh","gghgvh"},
                    {"jhbes","ehfhe"}};
    matPrenoms(m);
  
    }
}