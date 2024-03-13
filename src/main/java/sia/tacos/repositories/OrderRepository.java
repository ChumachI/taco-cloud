package sia.tacos.repositories;

import sia.tacos.entities.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder  order);    
}
