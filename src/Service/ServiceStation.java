package Service;

import transport.*;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    static Queue<Transport> transportQueue = new LinkedList<>();
    public static void addTransportInQueue(Transport transport) {
        if (transport.getClass() != Bus.class) {
            transportQueue.offer(transport);
            System.out.println("Транспортное средство " + transport.getBrand() + " " + transport.getModel() + " встало в очередь");
        } else {
            try {
                throw new IncorrectTransportType("Автобусы не нуждаются в ТО перед заездом");
            } catch (IncorrectTransportType a) {
                System.err.println(a.getMessage());
            }
        }
    }

    public static void getTechnicalInspection() {
        if (transportQueue.peek() != null) {
            System.out.println("Автомобиль "+transportQueue.peek().getBrand()+" "
                    +transportQueue.peek().getModel()+" прошел ТО и готов к заезду");
            transportQueue.poll();
        } else {
            System.out.println("Очередь пуста");
        }
    }
}
