package org.suspnp.domain.view;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by lianhai on 2018/6/28.
 */
@Getter
@Setter
@ToString
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class ResponseBundle {
    private Meta meta;
    private Object data;

    public ResponseBundle success() {
        this.meta = new Meta(ResponseMeta.SUCCESS);
        return this;
    }

    public ResponseBundle success(Object data) {
        this.meta = new Meta(ResponseMeta.SUCCESS);
        this.data = data;
        return this;
    }

    public ResponseBundle failure(ResponseMeta meta) {
        this.meta = new Meta(meta);
        return this;
    }

    public ResponseBundle failure(ResponseMeta meta, Object data) {
        this.meta = new Meta(meta);
        this.data = data;
        return this;
    }

    @Getter
    @Setter
    public class Meta {
        private Integer code;
        private String message;

        Meta(ResponseMeta meta) {
            this.code = meta.code();
            this.message = meta.message();
        }
    }
}
