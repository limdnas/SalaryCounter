package com.snake.salarycounter.utils;

import com.activeandroid.serializer.TypeSerializer;

import org.joda.time.DateTime;

public class JodaDateTimeSerializer extends TypeSerializer {
    public Class<?> getDeserializedType() {
        return DateTime.class;
    }

    public Class<?> getSerializedType() {
        return long.class;
    }

    public Long serialize(Object data) {
        if (data == null) {
            return null;
        }

        return ((DateTime) data).getMillis();
    }

    public DateTime deserialize(Object data) {
        if (data == null) {
            return null;
        }

        return new DateTime().withMillis((Long)data);
    }
}
