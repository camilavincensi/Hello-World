import org.example.Programas;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Teste {

    @Test
    public void TesteProgra(){
        Programas programas = new Programas();
        int[]x = {-3,-2,0,1,4};
        assertEquals(3, programas.oddorpos(x));
    }

}
