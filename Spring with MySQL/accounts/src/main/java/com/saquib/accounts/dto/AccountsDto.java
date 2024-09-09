package com.saquib.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name="Accounts",
        description="Schema to hold Account information"
)
public class AccountsDto {
    @Pattern(regexp="(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    @NotEmpty(message = "AccountNumber cannot be a null or empty")
    @Schema(
            description = "Account Number of Bank Account", example = "1234567897"
    )
    private Long accountNumber;

    @Schema(
            description = "Account Type of Bank Account", example="Savings"
    )
    @NotEmpty(message = "AccountType can not be a null or empty")
    private String accountType;

    @Schema(
            description = "Bank Branch Address", example = "123 New york"
    )
    @NotEmpty(message = "BranchAddress cannot be a null or empty")
    private String branchAddress;
}
