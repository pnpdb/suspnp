package org.suspnp.web.handler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.suspnp.domain.view.ResponseBundle;

/**
 * Created by lianhai on 2018/6/28.
 */
@RestController
@RequestMapping
public class GenericHandler {

    @GetMapping
    public ResponseBundle index() {
        return new ResponseBundle().success();
    }
}
