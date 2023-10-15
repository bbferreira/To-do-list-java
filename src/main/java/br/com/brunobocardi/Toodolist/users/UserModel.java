package br.com.brunobocardi.Toodolist.users;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Importando o Lombook 
 * Ao usar a anotação @Data do Lombok, ele automaticamente gera getters, setters, métodos equals, 
 * hashCode, toString e muito mais, com base nos campos da classe. 
 * Isso simplifica o desenvolvimento,
 *  pois você não precisa escrever esses métodos manualmente.
 */

@Data   /*@Data define tanto os getters quanto os setters */
@Entity(name="tb_users")

public class UserModel {


@Id
@GeneratedValue(generator = "UUID")
private  UUID  id;

@Column(unique = true)
private  String username;
    private String name;
    private  String password;


/**
 * Usar o modificador private :sem a biblioteca Lombook
 * Inserir o valor => set 
 *  public void setUsername(String username) {
    this.username = username;
    }
 */
   

    /**
     * 
     *  Buscar o valor => Get
     *     public String getUsername() {
    return username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

     */


@CreationTimestamp
private LocalDateTime createAt;



}
