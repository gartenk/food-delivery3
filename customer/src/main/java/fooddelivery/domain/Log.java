package fooddelivery.domain;

import fooddelivery.CustomerApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Log_table")
@Data

public class Log  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String customerId;
    
    
    
    
    
    private String message;


    public static LogRepository repository(){
        LogRepository logRepository = CustomerApplication.applicationContext.getBean(LogRepository.class);
        return logRepository;
    }




    public static void alertUser(Accepted accepted){

        /** Example 1:  new item 
        Log log = new Log();
        repository().save(log);

        */

        /** Example 2:  finding and process
        
        repository().findById(accepted.get???()).ifPresent(log->{
            
            log // do something
            repository().save(log);


         });
        */

        
    }
    public static void alertUser(Rejected rejected){

        /** Example 1:  new item 
        Log log = new Log();
        repository().save(log);

        */

        /** Example 2:  finding and process
        
        repository().findById(rejected.get???()).ifPresent(log->{
            
            log // do something
            repository().save(log);


         });
        */

        
    }
    public static void alertUser(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        Log log = new Log();
        repository().save(log);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(log->{
            
            log // do something
            repository().save(log);


         });
        */

        
    }
    public static void alertUser(DeliveryStarted deliveryStarted){

        /** Example 1:  new item 
        Log log = new Log();
        repository().save(log);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryStarted.get???()).ifPresent(log->{
            
            log // do something
            repository().save(log);


         });
        */

        
    }


}
