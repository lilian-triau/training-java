package catandmouse.services;

import static org.junit.Assert.*;

import org.junit.Test;

public class CatAndMouseServiceTest {
    MoveCatService moveCatService = new MoveCatService();

    @Test
    public void noDotCaught() {
        String result = this.moveCatService.attack("Cm");
        assertEquals("Caught!", result);
    }

    @Test
    public void OneDotCaught() {
        String result = this.moveCatService.attack("C.m");
        assertEquals("Caught!", result);
    }

    @Test
    public void TwoDotCaught() {
        String result = this.moveCatService.attack("C..m");
        assertEquals("Caught!", result);
    }

    @Test
    public void threeDotCaught() {
        String result = this.moveCatService.attack("C...m");
        assertEquals("Caught!", result);
    }

    @Test
    public void fourDotEscaped() {
        String result = this.moveCatService.attack("C....m");
        assertEquals("Escaped!", result);
    }

    @Test
    public void thenDotEscaped() {
        String result = this.moveCatService.attack("C..........m");
        assertEquals("Escaped!", result);
    }
}