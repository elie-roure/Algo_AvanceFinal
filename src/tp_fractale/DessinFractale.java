package tp_fractale;

class DessinFractale{
    private final Turtle bob;
    
    private final static int LARGEUR = 800;
    private final static int HAUTEUR = 600;
    //taille de la fenetre graphique

    public DessinFractale(){
	bob  = new Turtle();
	Turtle.setCanvasSize(LARGEUR,HAUTEUR);//à appeler APRES création de la tortue
    }

    public DessinFractale(int v){
	//attention, plus v est grand, plus bob va lentement !
	this();
	bob.speed(100);
    }


    public void reset(){
	bob.clear();
	bob.up();
	bob.setPosition(0,0);
	bob.setDirection(0);
	bob.down();

    }

    public void close(){
	bob.exit();
    }


    public void carre(double l) {
		for (int i = 0; i < 4; i++){
			bob.forward(l);
			bob.right(90);
		}
    }
	public void vonKoch(double l, int n){
		if (n == 0){
			bob.forward(l);
		}else{
			vonKoch(l/3,n-1);
			bob.left(60);
			vonKoch(l/3,n-1);
			bob.right(120);
			vonKoch(l/3,n-1);
			bob.left(60);
			vonKoch(l/3,n-1);
		}
	}

	public void arbre(double l, int n){
    	if (n==0){
			bob.forward(2*l/3);
			bob.right(180);
			bob.forward(2*l/3);
		}
    	else {
			bob.forward(2*l/3);
			bob.left(60);
			arbre(l/3, n-1);
			bob.left(120);
			arbre(l/3, n-1);
			bob.left(120);
			arbre(l/3, n-1);
			bob.left(60);
			bob.forward(2*l/3);
		}
	}

	public void triforce(double l, int n) {
    	if (n==0){
			bob.forward(l);
			bob.left(120);
			bob.forward(l);
			bob.left(120);
			bob.forward(l);
			bob.left(120);
		}else {
			triforce(l / 2, n - 1);
			bob.forward(l);
			bob.left(120);
			triforce(l / 2, n - 1);
			bob.forward(l);
			bob.left(120);
			triforce(l / 2, n - 1);
			bob.forward(l);
			bob.left(120);

		}
	}

	public void dragon (double l, int n){
    	if(n==0){
    		bob.forward(l);
		}else if (n==1){
    		dragon(l,n-1);
    		bob.left(90);
    		dragon(l,n-1);
		}else {
			dragon(l,n-1);
			bob.left(90);
			dragonInverse(l,n-1);
		}
	}

	public void dragonInverse (double l, int n){
    	if (n==0){
    		bob.forward(l);
		}else if (n==1){
			dragon(l,n-1);
			bob.right(90);
			dragon(l,n-1);
		}else{
			dragon(l,n-1);
			bob.right(90);
			dragonInverse(l, n-1);
		}
	}
	public void sierpiński(double l, int n){

    	if(n==0){
    		return;
		}
		bob.up();
		bob.forward(l/3);
		bob.left(90);
		bob.forward(l/3);
		bob.down();
		//le carré
		leCarré(l);
		//fin carré
		bob.up();
		bob.forward(l/3);
		bob.right(90);
		bob.forward(l/3);
		bob.right(180);

		tapis(l, n);

		sierpiński(l/3,n-1);
		bob.up();
		bob.forward(l/3);
		//-----------------------
		bob.left(90);
		bob.forward(l/3);

		tapis(l, n);
		//------------------------------
		bob.left(90);
		bob.forward(l/3);

		tapis(l, n);
		//-------------------------------
		bob.left(90);
		bob.forward(l/3);
		sierpiński(l/3,n-1);
		bob.forward(2*l/3);
		bob.left(90);

	}

	private void tapis(double l, int n) {
		sierpiński(l/3,n-1);
		bob.up();
		bob.forward(l/3);

		sierpiński(l/3,n-1);
		bob.up();
		bob.forward(l/3);
	}

	private void leCarré(double l) {
		bob.forward(l/3);
		bob.right(90);
		bob.forward(l/3);
		bob.right(90);
		bob.forward(l/3);
		bob.right(90);
		bob.forward(l/3);
		bob.left(90);
	}

	public static void main(String[] args) {
		DessinFractale d = new DessinFractale(500);
		/*d.carre(90);
		d.reset();*/
		//d.carre(600);


		//d.vonKoch(120, 1);
		/*d.arbre(1200,5);
		d.reset();
		d.close();*/
		//d.triforce(500,5);
		//d.dragon(120,4);
		d.sierpiński(1500,3);
	}
}