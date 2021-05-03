package com.examen.full.stack.examenfullstack.util;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.PARAMETER})
public @interface HttpHeadersMapping {
}
