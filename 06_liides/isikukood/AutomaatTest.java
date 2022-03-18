package isikukood;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AutomaatTest {
//alt + enter --> classpath 4 / 5.8

    @Test
    public void kontrolli_kas_on_naisterahvas_kui_isikukoodi_alguses_on_4(){
        isikukoodEE ee= new isikukoodEE("45111267894");
        assertEquals(false,ee.isMale());

    }

    /*@Test
    public void kontrolli_kas_on_synniaasta_kui_1951_isikukoodi_keskel_on_51(){
        isikukoodLV lv= new isikukoodLV("120388-51237")
        assertEquals(1951,lv.getBirthYear());

    }*/

    /*@Test
    public void kontrolli_kas_kujunid_pindala_arvutatakse_korrektselt() {
        Kolmnurk kolmnurk = new Kolmnurk(5.0, 6.0, 7.0);
        assertEquals(565.0, kolmnurk.arvutaYmbermoot(), 0.1);
    }*/
    }
