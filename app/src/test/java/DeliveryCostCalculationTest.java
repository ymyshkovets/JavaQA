
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertThrows;

public class DeliveryCostCalculationTest {

    @Test
    @Tag("Smoke")
    void testCheapestOrder() {
        Delivery delivery = new Delivery(1, CargoDimension.SMALL, false, ServiceWorkload.NORMAL);
        assertEquals(400, delivery.calculateDeliveryCost());
    }

}
