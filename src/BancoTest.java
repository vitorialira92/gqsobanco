import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BancoTest {

    Banco bd = new Banco();

    @Test
    void deposito() {
        assertEquals(true, bd.deposito(100));
        assertEquals(false, bd.deposito(-100));
        assertEquals(false, bd.deposito(0));
        assertEquals(true, bd.deposito(1));
    }

    @Test
    void saque() {
        assertEquals(true, bd.deposito(500));
        assertEquals(true, bd.saque(10));
        assertEquals(false, bd.saque(-60));
        assertEquals(false, bd.saque(0));
        assertEquals(false, bd.saque(600));
    }

    @Test
    void saldo() {
        bd.deposito(500);
        assertEquals(500, bd.saldo());
        bd.saque(50);
        assertEquals(450, bd.saldo());
        bd.deposito(20);
        assertEquals(470, bd.saldo());
    }
}