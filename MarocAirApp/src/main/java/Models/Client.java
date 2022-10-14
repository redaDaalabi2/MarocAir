package Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
    private String email;
    private String password;
    private String nom;
    private String prenom;
    private String phone;
}
