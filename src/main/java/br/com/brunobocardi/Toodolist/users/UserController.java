package br.com.brunobocardi.Toodolist.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    /**
     * String (texto)
     * Interger (Int)
     * Double  (double)
     * Float  (float)
     * char (Caracteres)
     * Date (data)
     * void (vazio)
     */
    @Autowired
    private IUserRepository useRepository;

    @PostMapping("/")
    public  ResponseEntity   create(@RequestBody  UserModel userModel){
       var user =  this.useRepository.findByUsername(userModel.getUsername());


        if(user != null){
        
            //Mensagem de erro
            //Status code
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuario já existe");
        }


         var  userCreated  =  this.useRepository.save(userModel);
         return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);

    }
    
}
