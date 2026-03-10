
/**@author Ewan Lefort */

package abstraction.eq4Transformateur1;

import abstraction.eq4Transformateur1.Transformateur1Stock;
import abstraction.eqXRomu.bourseCacao.IAcheteurBourse;
import abstraction.eqXRomu.produits.Feve;
import abstraction.eqXRomu.produits.Gamme;

public class Transformateur1AcheteurBourse extends Transformateur1Acteur implements IAcheteurBourse {
    public void notificationBlackList(int dureeEnStep){

    }
    public void notificationAchat(Feve f, double quantiteEnT, double coursEnEuroParT){
        this.getStock().setStockFeves(f, this.getStock().getStockFeve(f)+quantiteEnT);
    }
    /**@author Safta Yassine */ 
    public double demande(Feve f, double cours){
        if (this.getStock().getStockFeve(f)<20000) {
			return Math.max(20000-this.getStock().getStockFeve(f),  10); // on n'achete jamais moins de 10T
		}
		else{
            return 0;
        }
    }
}
