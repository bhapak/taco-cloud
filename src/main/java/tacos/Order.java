package tacos;
import javax.validation.constraints.*;


import lombok.Data;
@Data
public class Order {
    @NotNull
    private String name;
    @NotNull
    private String street;
    @NotNull
    private String city;
    @NotNull
    private String state;
    @NotNull
    private String zip;
    @NotNull(message="Podanie ccNumber jest obowiązkowe.")
    private String ccNumber;
    @NotNull
    private String ccExpiration;
    @NotNull
    private String ccCVV;
}