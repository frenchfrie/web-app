package org.frenchfrie.api.status;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by henri on 28/02/15.
 */
@RestController
@RequestMapping("api")
public class ServerStatus {
    
    @RequestMapping("status")
    public String getStatus(){
        return "OK";
    } 
}
