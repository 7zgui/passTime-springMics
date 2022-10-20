package com.rect.usermanagement.payload.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Mohamed ouokki on 10/18/22
 * @project user-management
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MessageResponse {
    private String message;

}
