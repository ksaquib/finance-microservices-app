package com.saquib.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name="Customer Details",
        description="Schema to hold Customer and Account, Cards and Loans information"
)
public class CustomerDetailsDto {
    @Schema(description = "Name of the customer", example = "Saquib Khan")
    @NotEmpty(message="Name cannot be a null or empty")
    @Size(min=5, max=30, message="The length of the customer name should be between 5 and 30")
    private String name;

    @Schema(description = "Email of the customer", example = "saquib@rit.edu")
    @NotEmpty(message = "Email cannot be a null or empty")
    @Email(message="Email address should be a valid value")
    private String email;

    @Schema(description = "Mobile number of the customer", example = "7894899898")
    @Pattern(regexp="(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
    private String mobileNumber;

    @Schema(description = "Account details of the customer" )
    private AccountsDto accountsDto;

    @Schema(description = "Loans details of the customer" )
    private LoansDto loansDto;

    @Schema(description = "Cards details of the customer" )
    private CardsDto cardsDto;
}
