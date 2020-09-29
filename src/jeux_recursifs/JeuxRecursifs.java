package jeux_recursifs;



public class JeuxRecursifs {

    public void resoudre(int n){

    }

    // à reprendre
    public void resoudreAux(int n, int i, int j){
        if (n==1){
            System.out.println(i+"->"+j);
        }else {
            int k = 6-i-j;
            resoudreAux(n-1, i,k);
            System.out.println(i+"->"+j);
            resoudreAux(n-1,k,j);
        }
    }

    public int nbCoups(int n){
        if (n==1){
            return 1;
        }else {
            return 2*nbCoups(n-1)+1;
        }
    }

    public void resoudreAux14 (int n, int i, int j){
        if (n>1){
            int k= 6-i-j;
            resoudreAux14(n-1,i,k);
            System.out.println(i+"->"+j);
            resoudreAux14(n-1,k,j);

        }
    }
    public void remplir(int n){

        //initialisaoitn
        if(n==4){
        }
        else {
                remplir(n - 1);
                vider(n - 2);
                System.out.println(n-1+" ");
            }
        remplir(n-2);
        }
    public void vider(int n){
        //initialision

    }


    public static void main(String[] args) {


    }
}
