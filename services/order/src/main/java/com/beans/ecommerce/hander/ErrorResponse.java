package com.beans.ecommerce.hander;

import java.util.Map;

public record ErrorResponse(
        Map<String, String> errors
) {

}
