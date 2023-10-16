package com.dompet.tontineonline.exception.message;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
public class SuccessMessage {
    String message;
    Integer code;
}
