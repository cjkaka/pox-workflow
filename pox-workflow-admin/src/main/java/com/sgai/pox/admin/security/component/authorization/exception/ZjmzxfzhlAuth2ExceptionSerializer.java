package com.sgai.pox.admin.security.component.authorization.exception;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import lombok.SneakyThrows;

/**
 * @author 庄金明
 */
public class ZjmzxfzhlAuth2ExceptionSerializer extends StdSerializer<ZjmzxfzhlAuth2Exception> {
    private static final long serialVersionUID = 1L;

    public ZjmzxfzhlAuth2ExceptionSerializer() {
        super(ZjmzxfzhlAuth2Exception.class);
    }

    @Override
    @SneakyThrows
    public void serialize(ZjmzxfzhlAuth2Exception value, JsonGenerator gen, SerializerProvider provider) {
        gen.writeStartObject();
        gen.writeObjectField("code", "500");
        gen.writeStringField("msg", value.getMessage());
        gen.writeStringField("data", value.getOAuth2ErrorCode());
        gen.writeEndObject();
    }
}
