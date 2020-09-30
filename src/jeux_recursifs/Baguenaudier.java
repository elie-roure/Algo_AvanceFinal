package jeux_recursifs;

public class Baguenaudier {
    int nbCases;
    int[] tab;

    public Baguenaudier(int nbCases) {
        this.nbCases = nbCases;
        this.tab = new int[nbCases];
    }

    public void remplirAux(int n){
        /** pré-requis : 1 <= n <= this.nbCases,
         * les n premières cases de this, c’est-à-dire d’indices 0 à n-1, sont vides.
         * action : exécute une partie du jeu de baguenaudier sur this
         * permettant d’en remplir les n premières cases sans changer l’état
         * des cases suivantes, en affichant le déroulement du jeu (sauf l’état
         * initial, c’est-à-dire en affichant pour chaque coup joué le coup et
         * le nouvel état de this)*/


    }

    public void remplir(){
        /** pré-requis : this est vide
         * action : exécute une partie du jeu de baguenaudier sur this
         permettant de le remplir, en affichant le déroulement du jeu
         (c’est-à-dire en affichant l’état initial, puis pour chaque coup joué
         le coup et le nouvel état de this)
         * Par exemple, si nbCases = 1, la méthode affiche :
         * le baguenaudier à une case vide,
         * le coup "remplir la case 0"
         * le baguenaudier à une case plein
         * à la fin de l’exécution, this est plein*/
    }

}
