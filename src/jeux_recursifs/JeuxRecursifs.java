package jeux_recursifs;
public class JeuxRecursifs {

    public void resoudre(int n){

    }

    // à reprendre
    public void resoudreAux(int n, int i, int j){
        if (n==1){
            System.out.println(i+"->"+j);
        }else {
            int k = 6-(i+j);
            resoudreAux(n-1, i,k);
            System.out.println(i+"->"+j);
            resoudreAux(n-1,k,j);
        }
    }

}