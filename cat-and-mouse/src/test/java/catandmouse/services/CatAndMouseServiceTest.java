package catandmouse.services;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CatAndMouseServiceTest {
    MoveCatService moveCatService = new MoveCatService();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void noDotCaught() throws Exception{
        String result = this.moveCatService.attack("Cm");
        assertEquals("Caught!", result);
    }

    @Test
    public void OneDotCaught() throws Exception{
        String result = this.moveCatService.attack("C.m");
        assertEquals("Caught!", result);
    }

    @Test
    public void TwoDotCaught() throws Exception{
        String result = this.moveCatService.attack("C..m");
        assertEquals("Caught!", result);
    }

    @Test
    public void threeDotCaught() throws Exception{
        String result = this.moveCatService.attack("C...m");
        assertEquals("Caught!", result);
    }

    @Test
    public void fourDotEscaped() throws Exception{
        String result = this.moveCatService.attack("C....m");
        assertEquals("Escaped!", result);
    }

    @Test()
    public void thenDotEscaped() throws Exception{
        String result = this.moveCatService.attack("C..........m");
        assertEquals("Escaped!", result);
    }

    @Test
    public void NoMouse() throws Exception{
        thrown.expect(Exception.class);
        this.moveCatService.attack("C..........");
    }

    @Test
    public void NoCat() throws Exception{
        thrown.expect(Exception.class);
        this.moveCatService.attack("..........m");
    }
}