package com.smartlist.module.user.dto.request;

import com.smartlist.utils.RegexPatterns;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserFromInviteReqDTO {

    @Schema(description = "User name", example = "", requiredMode= Schema.RequiredMode.REQUIRED)
    @NotEmpty
    String name;

    @Schema(description = "User email", example = "", requiredMode= Schema.RequiredMode.REQUIRED)
    @Email
    String email;

    @Schema(description = "User password", example = "", requiredMode= Schema.RequiredMode.REQUIRED)
    @Size(min = 6, max = 12)
    @Pattern(message="min 6 upto max 12 characters in length" , regexp= RegexPatterns.PASSWORD)
    String password;

    @Schema(description = "token", example = "", requiredMode= Schema.RequiredMode.REQUIRED)
    @NotEmpty
    String token;


}
