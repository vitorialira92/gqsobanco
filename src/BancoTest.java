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
    }

    @Test
    void saldo() {
    }
}