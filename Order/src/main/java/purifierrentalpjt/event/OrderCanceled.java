package purifierrentalpjt.event;

import lombok.Getter;
import lombok.Setter;
import purifierrentalpjt.AbstractEvent;

@Getter
@Setter
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String status;
    private Long productId;
    private String productName;
    private String installationAddress;
    private Long customerId;
    private String orderDate;

}
